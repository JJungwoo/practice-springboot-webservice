package com.practice.springinaction.data.jdbctemplate;

import com.practice.springinaction.domain.Ingredient;

public interface IngredientRepository {
    Iterable<Ingredient> findAll();
    Ingredient findById(String id);
    Ingredient save(Ingredient ingredient);
}
