package com.luiszambrano.backend.cartapp.spring_1_cartapp.services;

import java.util.List;

import com.luiszambrano.backend.cartapp.spring_1_cartapp.models.entities.Product;

public interface ProductService {

    List<Product> findAll();

}
