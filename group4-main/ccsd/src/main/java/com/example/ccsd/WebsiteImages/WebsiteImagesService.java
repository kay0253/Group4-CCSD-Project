package com.example.ccsd.WebsiteImages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WebsiteImagesService {

    @Autowired
    private WebsiteImagesRepository websiteImagesRepository;

    // Getting all books
    public List<WebsiteImages> getAllImages() {
        return websiteImagesRepository.findAll();
    }

    // Getting single boks
    public Optional<WebsiteImages> getImageById(String id) {
        return websiteImagesRepository.findById(id);
    }

    // Creating new data in repository

    public WebsiteImages addImage(WebsiteImages image) {
        return websiteImagesRepository.save(image);
    }

    // Updating the book

    public WebsiteImages updateImage(String id, WebsiteImages imageDetails) {
        Optional<WebsiteImages> imageOpt = websiteImagesRepository.findById(id);
        if (imageOpt.isPresent()) {

            // Get from database

            WebsiteImages image = imageOpt.get();
            image.setImageUrl(imageDetails.getImageUrl());
            image.setImageType(imageDetails.getImageType());
            image.setWidth(imageDetails.getWidth());
            image.setHeight(imageDetails.getHeight());
            return websiteImagesRepository.save(image);
        }
        return null;
    }

    // Deleting
    
    public void deleteImage(String id) {
        websiteImagesRepository.deleteById(id);
    }


    
}
