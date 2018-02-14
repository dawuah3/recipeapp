package com.awuah.recipe.services;

import com.awuah.recipe.commands.RecipeCommand;
import com.awuah.recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    RecipeCommand findCommandById(long l);

    void deleteById(Long idToDelete);
}
