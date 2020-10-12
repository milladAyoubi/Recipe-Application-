package com.example.Lab5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.Lab5.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerViewAdapter myAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<RecipeList> recipes1 = new ArrayList<>();

        recipes1.add(new RecipeList("Kale Sandwiches",

                "This sandwichg is stunningly delcious and tastes as good as it is healthy",
                "4 medium kale leaves, stems removed" +
                        " 2 teaspoons canola oil 2 medium red onions, cut into 1/2-inch-thick slices " +
                        "1/4 teaspoon freshly ground black pepper " +
                        "1/8 teaspoon kosher salt " +
                        "1 teaspoon red wine vinegar" +
                        " 8 (1-ounce) slices multigrain bread " +
                        "Cooking spray " +
                        "1 ounce finely grated Parmesan cheese, divided (about 1/4 cup)" +
                        " 3.5 ounces shredded raclette cheese (about 7/8 cup)",
                "Step 1\n" +
                        "Preheat oven to 300°.\n" +
                        "\n" +
                        "Step 2\n" +
                        "Bring a small pot of water to a boil; add kale. Remove from heat; let stand 4 minutes or until kale is bright green. Drain; rinse kale under cold water until cool. Pat leaves dry.\n" +
                        "\n" +
                        "\n" +
                        "Step 3\n" +
                        "Heat a skillet over medium-high heat. Add oil; swirl to coat. Add onion, pepper, and salt. Cook 10 minutes or until onion is tender and browned, stirring frequently. Remove from heat; stir in vinegar, tossing to coat. Coarsely chop onion.\n" +
                        "\n" +
                        "Step 4\n" +
                        "Heat a large nonstick skillet over medium heat. Lightly coat 1 side of each bread slice with cooking spray. Working with 2 slices at a time, arrange bread in pan, sprayed side down. Cook 1 1/2 minutes or until bread begins to brown. Sprinkle 1 tablespoon Parmesan on 1 bread slice in pan. Top with 1 kale leaf, one-fourth of onion mixture, and about 1/4 cup raclette. Top with other toasted bread slice. Transfer sandwich to a baking sheet. Repeat procedure with remaining 6 bread slices, Parmesan, 3 kale leaves, onion mixture, and raclette. Bake sandwiches at 300° for 5 minutes or until cheese melts."
        , R.drawable.sandwhich));

        recipes1.add(new RecipeList("Mango Salad","Everyone Loves this, So double or even triple the recipe!","3 mangoes (ripe, Alphonso recommended, peeled and thinly sliced)\n" +
                "1 red bell pepper (thinly sliced)\n" +
                "1/4 red onion (thinly sliced)\n" +
                "1/4 cup fresh basil (thinly sliced)\n" +
                "1/4 cup fresh cilantro (roughly chopped)","Combine all the ingredients for the Mango Salad in a large bowl. Toss to combine. *If making ahead, cover and refrigerate at this point, before adding the salad dressing.\n" +
                "Prepare the Mango Salad Dressing by combining all the ingredients in a small bowl and whisking well to combine. Cover and refrigerate if making ahead or use immediately by drizzling over the salad and tossing to combine.", R.drawable.mango));
        recipes1.add(new RecipeList("Sweet Potato","Very easy to make! If someone is hesitant about plant based food, this has to be a convincer"
               ,"4 sweet potatoes, scrubbed clean\n" +
                "4 tbsp. butter\n" +
                "Kosher salt\n" +
                "Freshly ground black pepper",
                "Preheat oven to 425º. On a baking sheet, prick sweet potatoes all over with a fork.\n" +
                        "Bake until tender, 45 to 50 minutes.\n" +
                        "Let cool, then split the tops open with a knife and top with a pat of butter.\n" +
                        "Season with salt and pepper before serving.", R.drawable.potato));
        recipes1.add(new RecipeList("Lime Mousse","This is FABULOUS alone, topped with fruit of any kind or as a frosting on cake"
                ,"1 cup heavy whipping cream\n" +
                "1/4 cup sugar\n" +
                "2 tablespoons lime juice\n" +
                "1 tablespoon grated lime zest\n" +
                "1 teaspoon vanilla extract\n" +
                "Lime slices and fresh mint, optional",
                "In a large bowl, beat cream until it begins to thicken. Add the sugar, lime juice, zest and vanilla;" +
                        " beat until stiff peaks form. Spoon into dessert dishes. Garnish with lime and mint if desired.", R.drawable.mousse));
        recipes1.add(new RecipeList("Broiled Tilapia Parmasen","Flavorful recipe for this farm raised fish that is easy and done in minutes! The fish is broiled with a creamy cheese coating for an impressive flavor and texture.",
                "½ cup Parmesan cheese\n" +
                        "¼ cup butter, softened\n" +
                        "3 tablespoons mayonnaise\n" +
                        "2 tablespoons fresh lemon juice\n" +
                        "¼ teaspoon dried basil\n" +
                        "¼ teaspoon ground black pepper\n" +
                        "⅛ teaspoon onion powder\n" +
                        "⅛ teaspoon celery salt\n" +
                        "2 pounds tilapia fillets",
                "Step 1\n" +
                        "Preheat your oven's broiler. Grease a broiling pan or line pan with aluminum foil.\n" +
                        "\n" +
                        " Step 2\n" +
                        "In a small bowl, mix together the Parmesan cheese, butter, mayonnaise and lemon juice. Season with dried basil, pepper, onion powder and celery salt. Mix well and set aside.\n" +
                        "\n" +
                        " Step 3\n" +
                        "Arrange fillets in a single layer on the prepared pan. Broil a few inches from the heat for 2 to 3 minutes." +
                        "Flip the fillets over and broil for a couple more minutes. Remove the fillets from the oven and cover them with" +
                        " the Parmesan cheese mixture on the top side. Broil for 2 more minutes or " +
                        "until the topping is browned and fish flakes easily with a fork. Be careful not to over cook the fish.", R.drawable.tilapia));



        recyclerView = (RecyclerView)findViewById(R.id.recyclerView_id);
        myAdapter = new RecyclerViewAdapter(this,recipes1);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));
        recyclerView.setAdapter(myAdapter);



    }

}
