package com.example.ccsd.Gallery;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class galleryService {
    
    @Autowired
    private GalleryRepository galleryRepository;

    // Getting all Gallery
    public List<gallery> getAllGallery() {
        return galleryRepository.findAll();
    }

    // Getting single boks
    public Optional<gallery> getGalleryById(String id) {
        return galleryRepository.findById(id);
    }

    // Creating new data in repository

    public gallery addGallery(gallery gallery) {
        return galleryRepository.save(gallery);
    }

    // Updating the Gallery

    public gallery updateGallery(String id, gallery galleryDetails) {
        Optional<gallery> galleryOpt = galleryRepository.findById(id);
        if (galleryOpt.isPresent()) {

            // Get from database

            gallery gallery = galleryOpt.get();
            gallery.setgalleryTitle(galleryDetails.getgalleryTitle());
            gallery.setgallerySlug(galleryDetails.getgallerySlug());
            gallery.setgalleryDate(galleryDetails.getgalleryDate());
            gallery.setgalleryStatus(galleryDetails.getgalleryStatus());
            gallery.setgalleryTags(galleryDetails.getgalleryTags());
            gallery.setgalleryDescription(galleryDetails.getgalleryDescription());
            gallery.setgalleryImage(galleryDetails.getgalleryImage());
            return galleryRepository.save(gallery);
        }
        return null;
    }

    // Deleting
    
    public void deleteGallery(String id) {
        galleryRepository.deleteById(id);
    }
}
