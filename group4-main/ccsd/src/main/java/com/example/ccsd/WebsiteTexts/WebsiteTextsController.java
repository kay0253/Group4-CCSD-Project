package com.example.ccsd.WebsiteTexts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/WebsiteTexts")
public class WebsiteTextsController {
    
    @Autowired
    private WebsiteTextsService websiteTextsService;

    @GetMapping
    public List<WebsiteTexts> getAllWebsiteTexts() {
        return websiteTextsService.getAllWebsiteTexts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<WebsiteTexts> getWebsiteTextsById(@PathVariable String id) {
        return websiteTextsService.getWebsiteTextsById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public WebsiteTexts addBook(@RequestBody WebsiteTexts websiteTexts) {
        return websiteTextsService.addWebsiteTexts(websiteTexts);
    }

   /*  @PutMapping("/{id}")
    public ResponseEntity<WebsiteTexts> updateBook(@PathVariable String id, @RequestBody WebsiteTexts websiteTextsDetails) {
        WebsiteTexts updatedWebsiteTexts = websiteTextsService.updateWebsiteTexts(id, websiteTextsDetails);
        if (updatedWebsiteTexts != null) {
            return ResponseEntity.ok(updatedWebsiteTexts);
        }
        return ResponseEntity.notFound().build();
    }*/

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWebsiteTexts(@PathVariable String id) {
        websiteTextsService.deleteWebsiteTexts(id);
        return ResponseEntity.noContent().build();
    }
}
