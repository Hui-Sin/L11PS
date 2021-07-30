package sg.edu.rp.c346.id20018354.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class AnimalActivity extends AppCompatActivity {

    TextView Names;
    TextView Diets;
    TextView CName;
    TextView Characteristic;
    TextView SkinType;
    TextView LifeSpan;
    TextView Weights;
    TextView Link;
    private float ourFontsize = 14f;
    private float ourFontsize1 = 14f;
    Animals animal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);

        Names=findViewById(R.id.textViewAnimalName);
        Diets=findViewById(R.id.textViewDiet);
        CName=findViewById(R.id.textViewCommonName);
        Characteristic=findViewById(R.id.textViewPhysicalCharacteristic);
        SkinType=findViewById(R.id.textViewSkinType);
        LifeSpan=findViewById(R.id.textViewLifespan);
        Weights=findViewById(R.id.textViewWeight);
        Link=findViewById(R.id.textViewLink);
        Names.setText(animal.getNames());
        Diets.setText(animal.getDiets());
        CName.setText(animal.getCName());
        Characteristic.setText(animal.getNames() +" Physical Characteristic");
        SkinType.setText(animal.getSkinType());
        LifeSpan.setText(animal.getLifeSpan());
        Weights.setText(animal.getWeights());
        Link.setText(animal.getLink());

        Intent i =getIntent();
        animal = (Animals) i.getSerializableExtra("animals");
        Link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentView = new Intent(Intent.ACTION_VIEW, Uri.parse(animal.getLink()));
                startActivity(intentView);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        int id = item.getItemId();

        if (id == R.id.increase) {
            ourFontsize += 2f;
            ourFontsize1 += 2f;
            Names.setTextSize(TypedValue.COMPLEX_UNIT_SP, ourFontsize1);
            Characteristic.setTextSize(TypedValue.COMPLEX_UNIT_SP, ourFontsize1);
            Diets.setTextSize(TypedValue.COMPLEX_UNIT_SP, ourFontsize);
            CName.setTextSize(TypedValue.COMPLEX_UNIT_SP, ourFontsize);
            Weights.setTextSize(TypedValue.COMPLEX_UNIT_SP, ourFontsize);
            Link.setTextSize(TypedValue.COMPLEX_UNIT_SP, ourFontsize);
            LifeSpan.setTextSize(TypedValue.COMPLEX_UNIT_SP, ourFontsize);
            SkinType.setTextSize(TypedValue.COMPLEX_UNIT_SP, ourFontsize);

            return true;
        } else if (id == R.id.decrease) {
            ourFontsize -= 2f;
            ourFontsize1 -= 2f;
            Names.setTextSize(TypedValue.COMPLEX_UNIT_SP, ourFontsize1);
            Characteristic.setTextSize(TypedValue.COMPLEX_UNIT_SP, ourFontsize1);
            Diets.setTextSize(TypedValue.COMPLEX_UNIT_SP, ourFontsize);
            CName.setTextSize(TypedValue.COMPLEX_UNIT_SP, ourFontsize);
            Weights.setTextSize(TypedValue.COMPLEX_UNIT_SP, ourFontsize);
            Link.setTextSize(TypedValue.COMPLEX_UNIT_SP, ourFontsize);
            LifeSpan.setTextSize(TypedValue.COMPLEX_UNIT_SP, ourFontsize);
            SkinType.setTextSize(TypedValue.COMPLEX_UNIT_SP, ourFontsize);


            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}