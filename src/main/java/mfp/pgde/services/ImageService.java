package mfp.pgde.services;

import mfp.pgde.entities.Image;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ImageService {
    
    Image uploadImage(MultipartFile file) throws IOException;
    Image uploadImageDemandeur(MultipartFile file, Long id) throws IOException;
    List<Image> getImagedemandeur(Long id);
    Image getImageDetails(Long id) throws IOException;
    Image save(Image image);
    void deleteImage(Long id);
    Image getById(Long id);
}
