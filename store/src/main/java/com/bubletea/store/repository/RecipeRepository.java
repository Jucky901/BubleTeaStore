package com.bubletea.store.repository;

import com.bubletea.store.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Integer>{
    List <Recipe> findAll();
}