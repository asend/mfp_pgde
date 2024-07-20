package mfp.pgde.services;

import mfp.pgde.entities.Demandeur;
import mfp.pgde.entities.Image;
import mfp.pgde.repositories.DemandeurRepository;
import mfp.pgde.repositories.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.List;

@Service
public class ImageServiceImpl implements ImageService {
    @Autowired
    ImageRepository imageRepository;

    @Autowired
    DemandeurRepository demandeurRepository;

    @Override
    public Image uploadImage(MultipartFile file) throws IOException {
        return null;
    }

    @Override
    public Image uploadImageDemandeur(MultipartFile file, Long id) throws IOException {
        Demandeur d = new Demandeur();
        d.setId(id);
        Calendar c = Calendar.getInstance();
        String ext = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        Files.write(Paths.get(System.getProperty("user.home")+"/images/"+id+""+c.getTime().getTime()+""+ext) , file.getBytes());
        //System.out.println("resultat"+Files.write(Paths.get(System.getProperty("user.home")+"/images/"+file.getOriginalFilename()) , file.getBytes()));

        return imageRepository.save(
                Image.builder()
                        .demandeur(d)
                        .type(file.getContentType())
                        .nom(id+""+c.getTime().getTime()+""+ext).build()
        );
    }

    @Override
    public List<Image> getImagedemandeur(Long id) {
        Demandeur d = demandeurRepository.findById(id).get();
        return d.getImages();
    }

    @Override
    public Image getImageDetails(Long id) throws IOException {
        return null;
    }

    @Override
    public Image save(Image image) {
        return imageRepository.save(image);
    }

    @Override
    public void deleteImage(Long id) {
        Image img = imageRepository.findById(id).orElse(null);
        try {
            Files.delete(Paths.get(System.getProperty("user.home")+"/images/"+img.getNom()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        imageRepository.delete(img);
    }

    @Override
    public Image getById(Long id) {
        return imageRepository.findById(id).orElse(null);
    }
}
