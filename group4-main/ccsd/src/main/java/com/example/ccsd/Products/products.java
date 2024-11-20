package com.example.ccsd.products;
import java.util.Date;
import java.util.List;

public class products {

    private String productTitle;
    private String productsSlug;
    private Date productDate;
    private String productStatus;
    private String productsPlace;
    private List<String> productTags;
    private String productDescription;
    private String productImage;
    private String productsLongDescription;

    public products(String productTitle, String productSlug, Date productDate, String productStatus, String productPlace, 
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

    public void setTags(List<String> productTags) {
        this.productTags = productTags;
    }

    public String getproductDescription() {
        return productDescription;
    }

    public void setDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getproductImage() {
        return productImage;
    }

    public void setImage(String productImage) {
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

