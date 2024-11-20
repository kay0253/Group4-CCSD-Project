package com.example.ccsd.gallery;

import java.util.Date;
import java.util.List;

public class gallery{

    private String title;
    private Date date;
    private String status;
    private String productsPlace;
    private List<String> tags;
    private String description;
    private String image;
    private String productsLongDescription;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getproductsSlug() {
        return productsSlug;
    }

    public void setproductsSlug(String productsSlug) {
        this.productsSlug = productsSlug;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getproductsPlace() {
        return productsPlace;
    }

    public void setproductsPlace(String productsPlace) {
        this.productsPlace = productsPlace;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getproductsLongDescription() {
        return productsLongDescription;
    }

    public void setproductsLongDescription(String productsLongDescription) {
        this.productsLongDescription = productsLongDescription;
    }
}
