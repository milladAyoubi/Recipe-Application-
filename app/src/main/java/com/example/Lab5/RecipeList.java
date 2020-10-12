package com.example.Lab5;

public class RecipeList {
    private String RecipeTitle;
    private String RecipeInfo;
    private String RecipeIngredients;
    private String Recipe;
    private int Image;



    public RecipeList(String title, String info, String recipeIngredients, String recipe, int image){
        RecipeTitle = title;
        RecipeInfo = info;
        RecipeIngredients = recipeIngredients;
        Recipe = recipe;
        Image = image;


    }

    public String getRecipeTitle() {return RecipeTitle; }
    public  String getRecipeInfo(){ return RecipeInfo; }
    public String getRecipeIngredients(){
        return RecipeIngredients;
    }
    public String getRecipe(){
        return Recipe;
    }
    public int getImage(){
        return Image;
    }

}
