package com.taweesak.fragmentdatatofragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class BFragment extends Fragment {

    TextView textView_fmB;

    public BFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        textView_fmB = view.findViewById(R.id.textView_fmB);

        Bundle bundle = this.getArguments();

        if (bundle != null){
            String str = getArguments().getString("text");
            textView_fmB.setText(str);
        }

        return view;
    }

}
