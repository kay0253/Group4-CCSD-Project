package com.example.ccsd.Products;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Products")
// ERROR HERE PLS CHECK!!!
//problem solved


//new change
public class Products {
    @Id
    private String id;
    private String productTitle;
    private String productsSlug;
    private Date productDate;
    private String productStatus;
    private String productsPlace;
    private List<String> productTags;
    private String productDescription;
    private String productImage;
    private String productsLongDescription;

    // Constructor
    public Products() {}

    public Products(String productTitle, String productSlug, Date productDate, String productStatus, String productPlace, 
    List<String> productTags, String productDescription, String productImage, String productsLongDescription) {
        this.productTitle = productTitle;
        this.productsSlug = productSlug;
        this.productDate = productDate;
        this.productStatus = productStatus;
        this.productsPlace = productPlace;
        this.productTags = productTags;
        this.productDescription = productDescription;
        this.productImage = productImage;
        this.productsLongDescription = productsLongDescription;
    }

    //Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getproductTitle() {
        return productTitle;
    }

    public void setproductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getproductsSlug() {
        return productsSlug;
    }

    public void setproductsSlug(String productsSlug) {
        this.productsSlug = productsSlug;
    }

    public Date getproductDate() {
        return productDate;
    }

    public void setproductDate(Date productDate) {
        this.productDate = productDate;
    }

    public String getproductStatus() {
        return productStatus;
    }

    public void setproductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public String getproductsPlace() {
        return productsPlace;
    }

    public void setproductsPlace(String productsPlace) {
        this.productsPlace = productsPlace;
    }

    public List<String> getproductTags() {
        return productTags;
    }

    public void setproductTags(List<String> productTags) {
        this.productTags = productTags;
    }

    public String getproductDescription() {
        return productDescription;
    }

    public void setproductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getproductImage() {
        return productImage;
    }

    public void setproductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getproductsLongDescription() {
        return productsLongDescription;
    }

    public void setproductsLongDescription(String productsLongDescription) {
        this.productsLongDescription = productsLongDescription;
    }

    public static void main(String[] args) { 

    }


}

