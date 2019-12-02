package com.taweesak.fragmentdatatofragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AFragment extends Fragment {

    EditText editText_fmA;
    Button button_fmA;
    String str;
    AndroidViewModel androidViewModel;

    public AFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        editText_fmA = view.findViewById(R.id.editText_fmA);
        button_fmA = view.findViewById(R.id.button_fmA);

        androidViewModel = ViewModelProviders.of(getActivity()).get(AndroidViewModel.class);

        button_fmA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                str = editText_fmA.getText().toString();

                Bundle bundle = new Bundle();
                bundle.putString("text",str);

                BFragment bFragment = new BFragment();
                bFragment.setArguments(bundle);

                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.My_Container_B,bFragment)
                        .commit();
            }
        });

        return view;
    }
}
