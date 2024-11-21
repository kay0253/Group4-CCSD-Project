package com.example.ccsd.Products;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsService {
    @Autowired
    private ProductsRepository productsRepository;

    // Getting all Productss
    public List<products> getAllProducts() {
        return productsRepository.findAll();
    }

    // Getting single boks
    public Optional<products> getProductsById(String id) {
        return productsRepository.findById(id);
    }

    // Creating new data in repository

    public products addProducts(products products) {
        return productsRepository.save(products);
    }

    // Updating the Products

    public products updateProducts(String id, products productsDetails) {
        Optional<products> productsOpt = productsRepository.findById(id);
        if (productsOpt.isPresent()) {

            // Get from database

            products products = productsOpt.get();
            products.setproductTitle(productsDetails.getproductTitle());
            products.setproductsSlug(productsDetails.getproductsSlug());
            products.setproductDate(productsDetails.getproductDate());
            products.setproductStatus(productsDetails.getproductStatus());
            products.setproductsPlace(productsDetails.getproductsPlace());
            products.setproductTags(productsDetails.getproductTags());
            products.setproductDescription(productsDetails.getproductDescription());
            products.setproductImage(productsDetails.getproductImage());
            products.setproductsLongDescription(productsDetails.getproductsLongDescription());
            return productsRepository.save(products);
        }
        return null;
    }

    // Deleting
    
    public void deleteProducts(String id) {
        productsRepository.deleteById(id);
    }
}
