package com.example.daniel.battletechcharactercreator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Daniel on 4/11/2017.
 */

public class ProfileFragment extends android.support.v4.app.Fragment {

    Profile profile1 = new Profile();
    TextView charName;
    TextView eyeColor;
    TextView pName;
    TextView hairColor;
    TextView height;
    TextView weight;
    EditText editCharName;
    EditText editEyeColor;
    EditText editPName;
    EditText editHairColor;
    EditText editHeight;
    EditText editWeight;
    Button update;

    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater , @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View rootView = inflater.inflate(R.layout.fragment_profile, container, false);

        profile1.setpName("Player");
        profile1.setCharName("Character");
        profile1.setEyeColor("EyeColor");
        profile1.setHairColor("HairColor");
        profile1.setHeight(6);
        profile1.setWeight(100);

        pName = (TextView) rootView.findViewById(R.id.profile_p_name);
        charName = (TextView) rootView.findViewById(R.id.profile_char_name);
        eyeColor = (TextView) rootView.findViewById(R.id.profile_eye_color);
        hairColor = (TextView) rootView.findViewById(R.id.profile_hair_color);
        height = (TextView) rootView.findViewById(R.id.profile_height);
        weight = (TextView) rootView.findViewById(R.id.profile_weight);

        editPName = (EditText) rootView.findViewById(R.id.profile_edit_p_name);
        editCharName = (EditText) rootView.findViewById(R.id.profile_edit_char_name);
        editEyeColor = (EditText) rootView.findViewById(R.id.profile_edit_eye_color);
        editHairColor = (EditText) rootView.findViewById(R.id.profile_edit_hair_color);
        editHeight = (EditText) rootView.findViewById(R.id.profile_edit_height);
        editWeight = (EditText) rootView.findViewById(R.id.profile_edit_weight);

        update = (Button) rootView.findViewById(R.id.update_button);

        pName.setText("Player Name: " + profile1.getpName());
        charName.setText("Character Name: " + profile1.getCharName());
        eyeColor.setText("Eye Color: " + profile1.getEyeColor());
        hairColor.setText("Hair Color: " + profile1.getHairColor());
        height.setText("Height in kg: " + profile1.getHeight() + "kg");
        weight.setText("Weight in cm: " + profile1.getWeight() + "cm");

    return rootView;
    }

}
