package com.example.ccsd.WebsiteImages;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "WebsiteImages")

public class WebsiteImages {

    // Define the variables
    @Id
    private String id;
    private String imageUrl;
    private int width;
    private int height;
    private String imageType;

    // Constructors
    public WebsiteImages() {}

    public WebsiteImages(String imageUrl, int width, int height, String imageType) {
        this.imageUrl = imageUrl;
        this.width = width;
        this.height = height;
        this.imageType = imageType;
    }

    // Getter methods (to access private fields)
    public String getImageUrl() {
        return imageUrl;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getImageType() {
        return imageType;
    }

    // Setter methods (to modify private fields)
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

}