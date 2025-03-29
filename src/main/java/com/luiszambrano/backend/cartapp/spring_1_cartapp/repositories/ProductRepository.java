package com.luiszambrano.backend.cartapp.spring_1_cartapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.luiszambrano.backend.cartapp.spring_1_cartapp.models.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
