package assignment.ideasuggest2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton drinkbtn;
    ImageButton dessertbtn;
    ImageButton foodbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drinkbtn = (ImageButton) findViewById(R.id.drinkbut);
        drinkbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent drinkui = new Intent(MainActivity.this,drink.class);
                startActivity(drinkui);
            }
        });

        dessertbtn = (ImageButton) findViewById(R.id.dessertbut);
        dessertbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dessertui = new Intent(MainActivity.this,dessert.class);
                startActivity(dessertui);
            }
        });

        foodbtn = (ImageButton)findViewById(R.id.foodbut);
        foodbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent foodui = new Intent(MainActivity.this,foodselection.class);
                startActivity(foodui);
            }
        });


    }
}
