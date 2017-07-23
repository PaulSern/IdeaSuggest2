package assignment.ideasuggest2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class foodselection extends AppCompatActivity {

    ImageButton hawkercentrebtn;
    ImageButton sushibtn;
    ImageButton fastfoodbtn;
    ImageButton nasikandarbtn;
    ImageButton internationalfoodbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodselection);

        hawkercentrebtn = (ImageButton) findViewById(R.id.hawkercentrebut);
        hawkercentrebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hawkercentreui = new Intent(foodselection.this,hawkercentre.class);
                startActivity(hawkercentreui);
            }
        });

        sushibtn = (ImageButton) findViewById(R.id.sushibut);
        sushibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sushiui = new Intent(foodselection.this,sushi.class);
                startActivity(sushiui);
            }
        });

        fastfoodbtn = (ImageButton) findViewById(R.id.fastfoodbut);
        fastfoodbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fastfoodui = new Intent(foodselection.this,fastfood.class);
                startActivity(fastfoodui);
            }
        });

        nasikandarbtn = (ImageButton) findViewById(R.id.nasikandarbut);
        nasikandarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nasikandarui = new Intent(foodselection.this,nasikandar.class);
                startActivity(nasikandarui);
            }
        });

        internationalfoodbtn = (ImageButton) findViewById(R.id.internationalfoodbut);
        internationalfoodbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent internationalfoodui = new Intent(foodselection.this,internationalfood.class);
                startActivity(internationalfoodui);
            }
        });
    }
}
