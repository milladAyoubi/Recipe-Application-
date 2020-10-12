package com.example.Lab5;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.Lab5.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyHolder> {

    private Context Context;
    private List<RecipeList> Data;

    public RecyclerViewAdapter(Context Context, List<RecipeList> Data){
        this.Context = Context;
        this.Data = Data;
    }



    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view ;
        LayoutInflater layoutInflater = LayoutInflater.from(Context);
        view = layoutInflater.inflate(R.layout.cardview_recipe,viewGroup,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyHolder myHolder, @SuppressLint("RecyclerView") final int i) {

        myHolder.recipeTitle.setText(Data.get(i).getRecipeTitle());
        myHolder.recipeInfo.setText(Data.get(i).getRecipeInfo());

        myHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Context, rActivity.class);

                intent.putExtra("RecipeTitle", Data.get(i).getRecipeTitle());
                intent.putExtra("RecipeInfo",Data.get(i).getRecipeInfo());
                intent.putExtra("RecipeIngredients",Data.get(i).getRecipeIngredients());
                intent.putExtra("Recipe",Data.get(i).getRecipe());



                Context.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return Data.size();
    }

    public static class MyHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView recipeTitle;
        TextView recipeInfo;
        CardView cardView;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            recipeInfo = itemView.findViewById(R.id.recipe_Info);
            recipeTitle =itemView.findViewById(R.id.recipe_Title);
            image = (ImageView)itemView.findViewById(R.id.recipe_Image);
            cardView = itemView.findViewById(R.id.cardview_id);


        }
    }
}
