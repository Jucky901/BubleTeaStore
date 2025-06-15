package com.bubletea.store.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Recipes")
public class Recipe {

    @Id
    @Column(name = "recipe_id")
    private Integer recipeId;

    @Column(name = "item_id")
    private Integer itemId;

    @Column(name = "number_used")
    private Integer numberUsed;

    @Column(name = "description")
    private String description;

    @Column(name = "time_taken")
    private Integer timeTaken;

    @Column(name = "product_quantity")
    private Integer productQuantity;

    @Column(name = "product_id")
    private Integer productId;

    // Getters and Setters

    public Integer getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(Integer recipeId) {
        this.recipeId = recipeId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getNumberUsed() {
        return numberUsed;
    }

    public void setNumberUsed(Integer numberUsed) {
        this.numberUsed = numberUsed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getTimeTaken() {
        return timeTaken;
    }

    public void setTimeTaken(Integer timeTaken) {
        this.timeTaken = timeTaken;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
}
