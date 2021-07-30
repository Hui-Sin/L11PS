package sg.edu.rp.c346.id20018354.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    ListView lvAnimal;
    ArrayList<Animals>alAnimalList;
    ArrayAdapter aaAnimalList;
    ArrayList<Animals> alAnimalDetailList;
    CustomAdapter caAnimalDetailList;
    Animals animals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        lvAnimal=findViewById(R.id.lvAnimals);
        alAnimalList = new ArrayList<>();
        Animals animal1= new Animals("Eagle");
        Animals animal2 = new Animals("Emperor Penguin");
        Animals animal3 = new Animals("Elephant Seal");
        Animals animal4 = new Animals("Eastern Bluebird");
        Animals animal5 = new Animals("English Cream Golden Retriever");
        Animals animal6 = new Animals("Fallow Deer");
        Animals animal7 = new Animals("Fur Seal");
        Animals animal8 = new Animals("Fishing Cat");
        Animals animal9 = new Animals("Fennec Fox");
        Animals animal10 = new Animals("Flat-Coated Retrievers");
        alAnimalList.add(animal1);
        alAnimalList.add(animal2);
        alAnimalList.add(animal3);
        alAnimalList.add(animal4);
        alAnimalList.add(animal5);
        alAnimalList.add(animal6);
        alAnimalList.add(animal7);
        alAnimalList.add(animal8);
        alAnimalList.add(animal9);
        alAnimalList.add(animal10);
        aaAnimalList = new ArrayAdapter(this, android.R.layout.simple_list_item_1,alAnimalList);
        lvAnimal.setAdapter(aaAnimalList);
        alAnimalDetailList= new ArrayList<>();
        Animals animald1 = new Animals( "Eagle","Diet: Carnivore","Common Name: Eagle","Skin Type: Feathers","Lifespan: 15 - 30 years","Weight: 0.5kg - 7kg (1.1lbs - 15.4lbs)","https://a-z-animals.com/animals/eagle/");
        Animals animald2 = new Animals("Emperor Penguin", "Diet: Carnivore", "Common Name: Emperor Penguin", "Skin Type: Feathers", "Lifespan: 15 - 50 years", "Weight: 22kg - 45kg (49lbs - 99lbs)","https://a-z-animals.com/animals/emperor-penguin/");
        Animals animald3 = new Animals("Elephant Seal", "Diet: Carnivore", "Common Name: Elephant Seal", "Skin Type: Fur","Lifespan: 18 - 22 years", "Weight: 900kg - 3,000kg (2,000lbs - 6,000lbs)","https://a-z-animals.com/animals/elephant-seal/");
        Animals animald4 = new Animals("Eastern Bluebird", "Diet: Omnivore","Common Name: Bluebird ","Skin Type: Feathers ","Lifespan: Six to 10 years","Weight: 0.95 to 1.2 ounces","https://a-z-animals.com/animals/eastern-bluebird/");
        Animals animald5 = new Animals("English Cream Golden Retriever","Diet:Omnivore","Common Name: Golden Retriever","Skin Type: Hair","Lifespan: 10-12 years","Weight: 75 lbs", "https://a-z-animals.com/animals/english-cream-golden-retriever/");
        Animals animald6 = new Animals("Fallow Deer","Diet: Herbivore","Common Name: Deer","Skin Type: Hair","Lifespan: 20 to 25 years","Weight: 66 to 176 pounds","https://a-z-animals.com/animals/fallow-deer/");
        Animals animald7 = new Animals("Fur Seal","Diet:Carnivore","Common Name: Fur Seal","Skin Type: Fur","Lifespan: 12 - 18 years","Weight: 105kg - 300kg (230lbs - 661lbs)","https://a-z-animals.com/animals/fur-seal/");
        Animals animald8 = new Animals("Fishing Cat","Diet: Carnivore","Common Name: Fishing Cat","Skin Type: Fur","Lifespan: 10 - 12 years","Weight: 1kg - 1.5kg (2.2lbs - 3.3lbs)","https://a-z-animals.com/animals/fishing-cat/");
        Animals animald9 = new Animals("Fennec Fox","Diet: Omnivore","Common Name: Fennec Fox","Skin Type: Fur","Lifespan: 10 - 14 years","Weight: 1kg - 1.5kg (2.2lbs - 3.3lbs)","https://a-z-animals.com/animals/fennec-fox/");
        Animals animald10 = new Animals("Flat-Coated Retrievers","Diet: Omnivore","Flat-Coated Retrievers","Skin Type: Hair","Lifespan: 12 years","Weight: 32kg (70lbs)","https://a-z-animals.com/animals/flat-coated-retriever/");
        alAnimalDetailList.add(animald1);
        alAnimalDetailList.add(animald2);
        alAnimalDetailList.add(animald3);
        alAnimalDetailList.add(animald4);
        alAnimalDetailList.add(animald5);
        alAnimalDetailList.add(animald6);
        alAnimalDetailList.add(animald7);
        alAnimalDetailList.add(animald8);
        alAnimalDetailList.add(animald9);
        alAnimalDetailList.add(animald10);
        caAnimalDetailList= new CustomAdapter(this,R.layout.row,alAnimalDetailList);
        lvAnimal.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity2.this, AnimalActivity.class);
                if (alAnimalDetailList.contains(alAnimalList.contains(animals.getNames()))) {
                    Animals animal = alAnimalDetailList.get(position);
                    intent.putExtra("animals", animal);
                    startActivity(intent);
                }
            }
        });

    }
}