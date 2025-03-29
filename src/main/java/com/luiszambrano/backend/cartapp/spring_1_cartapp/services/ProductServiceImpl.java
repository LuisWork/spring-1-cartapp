package com.luiszambrano.backend.cartapp.spring_1_cartapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luiszambrano.backend.cartapp.spring_1_cartapp.models.entities.Product;
import com.luiszambrano.backend.cartapp.spring_1_cartapp.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll() {
       return (List<Product>) repository.findAll();
    }

}
