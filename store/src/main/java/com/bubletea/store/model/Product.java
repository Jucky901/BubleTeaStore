package com.bubletea.store.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Recipes")
public class Recipe {

    @Id
    @Column(name = "recipe_id")
    private Integer recipeId;

    @ManyToOne
    @JoinColumn(name = "item_id", referencedColumnName = "item_id")
    private Storage item;

    @Column(name = "number_used")
    private Integer numberUsed;

    @Column(name = "description")
    private String description;

    @Column(name = "time_taken")
    private Integer timeTaken;

    @Column(name = "product_quantity")
    private Integer productQuantity;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
    private Product product;

    public Integer getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(Integer recipeId) {
        this.recipeId = recipeId;
    }

    public Storage getItem() {
        return item;
    }

    public void setItem(Storage item) {
        this.item = item;
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
