package com.example.ccsd.Gallery;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "gallery")
public class gallery{
    @Id
    private String id;
    private String galleryTitle;
    private String gallerySlug;
    private Date galleryDate;
    private String galleryStatus;
    private List<String> galleryTags;
    private String galleryDescription;
    private String galleryImage;

    //Constructors
    public gallery() {}

    public gallery(String galleryTitle, String gallerySlug, Date galleryDate, String galleryStatus, 
    List<String> galleryTags, String galleryDescription, String galleryImage) {
        this.galleryTitle = galleryTitle;
        this.gallerySlug = gallerySlug;
        this.galleryDate = galleryDate;
        this.galleryStatus = galleryStatus;
        this.galleryTags = galleryTags;
        this.galleryDescription = galleryDescription;
        this.galleryImage = galleryImage;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getgalleryTitle() {
        return galleryTitle;
    }

    public void setgalleryTitle(String galleryTitle) {
        this.galleryTitle = galleryTitle;
    }

    public String getgallerySlug() {
        return gallerySlug;
    }

    public void setgallerySlug(String gallerySlug) {
        this.gallerySlug = gallerySlug;
    }

    public Date getgalleryDate() {
        return galleryDate;
    }

    public void setgalleryDate(Date galleryDate) {
        this.galleryDate = galleryDate;
    }

    public String getgalleryStatus() {
        return galleryStatus;
    }

    public void setgalleryStatus(String galleryStatus) {
        this.galleryStatus = galleryStatus;
    }

    public List<String> getgalleryTags() {
        return galleryTags;
    }

    public void setgalleryTags(List<String> galleryTags) {
        this.galleryTags = galleryTags;
    }

    public String getgalleryDescription() {
        return galleryDescription;
    }

    public void setgalleryDescription(String galleryDescription) {
        this.galleryDescription = galleryDescription;
    }

    public String getgalleryImage() {
        return galleryImage;
    }

    public void setgalleryImage(String galleryImage) {
        this.galleryImage = galleryImage;
    }

}
