package com.awuah.recipe.services;

import com.awuah.recipe.commands.IngredientCommand;

public interface IngredientService {
    IngredientCommand findByRecipeIdAndIngredientId(long recipeId, long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);
}
