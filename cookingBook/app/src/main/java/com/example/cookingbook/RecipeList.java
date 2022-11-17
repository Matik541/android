package com.example.cookingbook;

import java.util.ArrayList;

public class RecipeList {
    public static ArrayList<Recipe> recipes = new ArrayList<>();
    public static ArrayList<Recipe> getRecipesByCategory(int category) {
        ArrayList<Recipe> recipesByCategory = new ArrayList<>();
        for (Recipe recipe : recipes) {
            if (recipe.getCategory() == category) {
                recipesByCategory.add(recipe);
            }
        }
        return recipesByCategory;
    }

    public RecipeList() {
        recipes.add(new Recipe("płatki", 0, "płatki, mleko", R.drawable.platki1));
        recipes.add(new Recipe("tosty", 0, "chleb, masło", R.drawable.tosty1));
        recipes.add(new Recipe("pierogi", 1, "mąka, jajka", R.drawable.pierogi1));
        recipes.add(new Recipe("pizza", 1, "ciasto, ser", R.drawable.pizza1));
        recipes.add(new Recipe("tort czekoladowy", 2, "mąka, jajka, chekolada", R.drawable.tort1));
        recipes.add(new Recipe("herbata", 3, "woda, torebka herbaty", R.drawable.herbata1));
    }

    public static void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    public static void removeRecipe(Recipe recipe) {
        recipes.remove(recipe);
    }
}