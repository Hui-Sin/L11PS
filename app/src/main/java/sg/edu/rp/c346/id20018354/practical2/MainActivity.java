package sg.edu.rp.c346.id20018354.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView animal1;
    TextView animal2;
    TextView animal3;
    TextView animal4;
    TextView animal5;
    TextView animal6;
    TextView animal7;
    TextView animal8;
    TextView animal9;
    TextView animal10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animal1=findViewById(R.id.textViewAnimal1);
        animal2=findViewById(R.id.textViewAnimal2);
        animal3=findViewById(R.id.textViewAnimal3);
        animal4=findViewById(R.id.textViewAnimal4);
        animal5=findViewById(R.id.textViewAnimal5);
        animal6=findViewById(R.id.textViewAnimal6);
        animal7=findViewById(R.id.textViewAnimal7);
        animal8=findViewById(R.id.textViewAnimal8);
        animal9=findViewById(R.id.textViewAnimal9);
        animal10=findViewById(R.id.textViewAnimal10);
        animal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,AnimalsDetailsActivity.class);
                intent.putExtra("name", "Eagle");
                intent.putExtra("diet", "Diet: Carnivore");
                intent.putExtra("Name", "Common Name: Eagle");
                intent.putExtra("skin", "Skin Type: Feathers");
                intent.putExtra("lifespan", "Lifespan: 15 - 30 years");
                intent.putExtra("weight", "Weight: 0.5kg - 7kg (1.1lbs - 15.4lbs)");
                intent.putExtra("website","https://a-z-animals.com/animals/eagle/");
                startActivity(intent);
            }
        });
        animal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,AnimalsDetailsActivity.class);
                intent.putExtra("name", "Emperor Penguin");
                intent.putExtra("diet", "Diet: Carnivore");
                intent.putExtra("Name", "Common Name: Emperor Penguin");
                intent.putExtra("skin", "Skin Type: Feathers");
                intent.putExtra("lifespan", "Lifespan: 15 - 50 years");
                intent.putExtra("weight", "Weight: 22kg - 45kg (49lbs - 99lbs)");
                intent.putExtra("website","https://a-z-animals.com/animals/emperor-penguin/");
                startActivity(intent);
            }
        });
        animal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,AnimalsDetailsActivity.class);
                intent.putExtra("name", "Elephant Seal");
                intent.putExtra("diet", "Diet: Carnivore");
                intent.putExtra("Name", "Common Name: Elephant Seal");
                intent.putExtra("skin", "Skin Type: Fur");
                intent.putExtra("lifespan", "Lifespan: 18 - 22 years");
                intent.putExtra("weight", "Weight: 900kg - 3,000kg (2,000lbs - 6,000lbs)");
                intent.putExtra("website","https://a-z-animals.com/animals/elephant-seal/");
                startActivity(intent);
            }
        });
        animal4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,AnimalsDetailsActivity.class);
                intent.putExtra("name", "Eastern Bluebird");
                intent.putExtra("diet", "Diet: Omnivore");
                intent.putExtra("Name", "Common Name: Eastern Bluebird");
                intent.putExtra("skin", "Skin Type: Feathers");
                intent.putExtra("lifespan", "Lifespan: 6 - 10 years");
                intent.putExtra("weight", "Weight: 0.95 to 1.2 ounces");
                intent.putExtra("website","https://a-z-animals.com/animals/eastern-bluebird/");
                startActivity(intent);
            }
        });
        animal5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,AnimalsDetailsActivity.class);
                intent.putExtra("name", "English Cream Golden Retriever");
                intent.putExtra("diet", "Diet: Omnivore");
                intent.putExtra("Name", "Common Name: English Cream Golden Retriever");
                intent.putExtra("skin", "Skin Type: Hair");
                intent.putExtra("lifespan", "Lifespan: 10-12 years");
                intent.putExtra("weight", "Weight: 66 to 176 pounds");
                intent.putExtra("website","https://a-z-animals.com/animals/english-cream-golden-retriever/");
                startActivity(intent);
            }
        });
        animal6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,AnimalsDetailsActivity.class);
                intent.putExtra("name", "Fallow Deer");
                intent.putExtra("diet", "Diet: Herbivore");
                intent.putExtra("Name", "Common Name: Fallow Deer");
                intent.putExtra("skin", "Skin Type: Hair");
                intent.putExtra("lifespan", "Lifespan: 20 to 25 years");
                intent.putExtra("weight", "Weight: 66 to 176 pounds");
                intent.putExtra("website","https://a-z-animals.com/animals/fallow-deer/");
                startActivity(intent);
            }
        });
        animal7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,AnimalsDetailsActivity.class);
                intent.putExtra("name", "Fur Seal");
                intent.putExtra("diet", "Diet: Carnivore");
                intent.putExtra("Name", "Common Name: Fur Seal");
                intent.putExtra("skin", "Skin Type: Fur");
                intent.putExtra("lifespan", "Lifespan: 12 - 18 years");
                intent.putExtra("weight", "Weight: 105kg - 300kg (230lbs - 661lbs)");
                intent.putExtra("website","https://a-z-animals.com/animals/fur-seal/");
                startActivity(intent);
            }
        });
        animal8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,AnimalsDetailsActivity.class);
                intent.putExtra("name", "Fishing Cat");
                intent.putExtra("diet", "Diet: Carnivore");
                intent.putExtra("Name", "Common Name: Fishing Cat");
                intent.putExtra("skin", "Skin Type: Fur");
                intent.putExtra("lifespan", "Lifespan: 10 - 12 years");
                intent.putExtra("weight", "Weight: 1kg - 1.5kg (2.2lbs - 3.3lbs)");
                intent.putExtra("website","https://a-z-animals.com/animals/fishing-cat/");
                startActivity(intent);
            }
        });
        animal9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,AnimalsDetailsActivity.class);
                intent.putExtra("name", "Fennec Fox");
                intent.putExtra("diet", "Diet: Omnivore");
                intent.putExtra("Name", "Common Name: Fennec Fox");
                intent.putExtra("skin", "Skin Type: Fur");
                intent.putExtra("lifespan", "Lifespan: 10 - 14 years");
                intent.putExtra("weight", "Weight: 1kg - 1.5kg (2.2lbs - 3.3lbs)");
                intent.putExtra("website","https://a-z-animals.com/animals/fennec-fox/");
                startActivity(intent);
            }
        });
        animal10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,AnimalsDetailsActivity.class);
                intent.putExtra("name", "Flat-Coated Retrievers");
                intent.putExtra("diet", "Diet: Omnivore");
                intent.putExtra("Name", "Common Name: Flat-Coated Retrievers");
                intent.putExtra("skin", "Skin Type: Hair");
                intent.putExtra("lifespan", "Lifespan: 12 years");
                intent.putExtra("weight", "Weight: 32kg (70lbs)");
                intent.putExtra("website","https://a-z-animals.com/animals/flat-coated-retriever/");
                startActivity(intent);
            }
        });

    }
}