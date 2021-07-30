package sg.edu.rp.c346.id20018354.practical2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Animals> animalList;

    public CustomAdapter(Context context, int resource, ArrayList<Animals> objects){
        super(context, resource, objects);
        parent_context=context;
        layout_id=resource;
        animalList=objects;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater)
                parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView Names=rowView.findViewById(R.id.tvAnimalName);
        TextView Diets=rowView.findViewById(R.id.tvDiet);
        TextView CName=rowView.findViewById(R.id.tvCommonName);
        TextView Characteristic=rowView.findViewById(R.id.textViewPhysicalCharacteristic);
        TextView SkinType=rowView.findViewById(R.id.tvSkinType);
        TextView LifeSpan=rowView.findViewById(R.id.tvLifespan);
        TextView Weights=rowView.findViewById(R.id.tvWeight);
        TextView Link=rowView.findViewById(R.id.tvLink);


        // Obtain the Android Version information based on the position
        Animals currentAnimal = animalList.get(position);

        // Set values to the TextView to display the corresponding information
        Names.setText(currentAnimal.getNames());
        Diets.setText(currentAnimal.getDiets());
        CName.setText(currentAnimal.getCName());
        Characteristic.setText("PhysicalCharacteristic");
        SkinType.setText(currentAnimal.getSkinType());
        LifeSpan.setText(currentAnimal.getLifeSpan());
        Weights.setText(currentAnimal.getWeights());
        Link.setText(currentAnimal.getLink());

        return rowView;
    }

}