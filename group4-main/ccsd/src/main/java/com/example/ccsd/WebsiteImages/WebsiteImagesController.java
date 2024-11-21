package com.example.ccsd.WebsiteImages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/WebsiteImages")
public class WebsiteImagesController {
    
    @Autowired
    private WebsiteImagesService websiteImagesService;

    @GetMapping
    public List<WebsiteImages> getAllImages() {
        return websiteImagesService.getAllImages();
    }

    @GetMapping("/{id}")
    public ResponseEntity<WebsiteImages> getimageById(@PathVariable String id) {
        return websiteImagesService.getImageById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public WebsiteImages addImage(@RequestBody WebsiteImages image) {
        return websiteImagesService.addImage(image);
    }

    @PutMapping("/{id}")
    public ResponseEntity<WebsiteImages> updateImage(@PathVariable String id, @RequestBody WebsiteImages imageDetails) {
        WebsiteImages updatedImage = websiteImagesService.updateImage(id, imageDetails);
        if (updatedImage != null) {
            return ResponseEntity.ok(updatedImage);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteImage(@PathVariable String id) {
        websiteImagesService.deleteImage(id);
        return ResponseEntity.noContent().build();
    }
}
