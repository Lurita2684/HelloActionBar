package com.example.helloactionbar;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class NewFragment extends Fragment {


    public NewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_new, container, false);
        TextView newfragment = view.findViewById(R.id.tvNew_Fragment);
        newfragment.setText("Hola Soy NEW Fragment!!!!!!");
        newfragment.setTextSize(30);
        //devuelve la view
        return view;
    }

}
