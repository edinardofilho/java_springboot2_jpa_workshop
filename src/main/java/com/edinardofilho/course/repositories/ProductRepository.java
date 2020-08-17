package com.edinardofilho.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edinardofilho.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
