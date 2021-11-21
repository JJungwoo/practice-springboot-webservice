package com.practice.springinaction.data.jpa;

import com.practice.springinaction.domain.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
