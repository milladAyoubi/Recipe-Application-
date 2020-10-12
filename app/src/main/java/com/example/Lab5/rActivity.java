package com.example.Lab5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.Lab5.R;

public class rActivity extends AppCompatActivity {

    private TextView RecipeTitle;
    private TextView RecipeIngredients;
    private TextView Recipes;
    private ImageView RecipeImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        RecipeImage = (ImageView) findViewById(R.id.recipe_Image);
        RecipeTitle = (TextView)findViewById(R.id.title_recipe);
        RecipeIngredients = (TextView)findViewById(R.id.ingredients);
        Recipes = (TextView)findViewById(R.id.recipe);

        Intent intent = getIntent();


        String Title = intent.getExtras().getString("RecipeTitle");
        String Ingredients = intent.getExtras().getString("RecipeIngredients");
        String Recipe = intent.getExtras().getString("Recipe");
        Integer Image = intent.getExtras().getInt("1");

        RecipeTitle.setText(Title);

        RecipeIngredients.setText(Ingredients);
        Recipes.setText(Recipe);
        RecipeImage.setImageResource(Image);


    }
}
