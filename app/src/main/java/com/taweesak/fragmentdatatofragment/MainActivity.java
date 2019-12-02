package com.taweesak.fragmentdatatofragment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    AFragment aFragment = new AFragment();
    BFragment bFragment = new BFragment();
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.My_Container_A, new AFragment())
                .add(R.id.My_Container_B, new BFragment())
                .commit();
    }
}
