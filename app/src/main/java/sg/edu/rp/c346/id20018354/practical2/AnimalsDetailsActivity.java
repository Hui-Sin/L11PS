package sg.edu.rp.c346.id20018354.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AnimalsDetailsActivity extends AppCompatActivity {
    TextView Names;
    TextView Diets;
    TextView CName;
    TextView SkinType;
    TextView LifeSpan;
    TextView Weights;
    TextView Link;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals_details);
        Names=findViewById(R.id.textViewAnimalName);
        Diets=findViewById(R.id.textViewDiet);
        CName=findViewById(R.id.textViewCommonName);
        SkinType=findViewById(R.id.textViewSkinType);
        LifeSpan=findViewById(R.id.textViewLifespan);
        Weights=findViewById(R.id.textViewWeight);
        Link=findViewById(R.id.textViewLink);

        String Name=getIntent().getStringExtra("name");
        String Diet = getIntent().getStringExtra("diet");
        String CommonName = getIntent().getStringExtra("Name");
        String Skintypes = getIntent().getStringExtra("skin");
        String Lifespan = getIntent().getStringExtra("lifespan");
        String Weight = getIntent().getStringExtra("weight");
        String Website = getIntent().getStringExtra("website");
        Names.setText(Name);
        Diets.setText(Diet);
        CName.setText(CommonName);
        SkinType.setText(Skintypes);
        LifeSpan.setText(Lifespan);
        Weights.setText(Weight);
        Link.setText(Website);
        Link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentView = new Intent(Intent.ACTION_VIEW, Uri.parse(Website));
                startActivity(intentView);
            }
        });
    }
}