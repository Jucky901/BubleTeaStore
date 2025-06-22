package com.bubletea.store.repository;

import com.bubletea.store.model.Product;
import com.bubletea.store.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
    List <Product> findAll();
    List<Product> findByCategory_CategoryId(Integer categoryId);
    List<Product> findByCategory(Category category); //testing
}