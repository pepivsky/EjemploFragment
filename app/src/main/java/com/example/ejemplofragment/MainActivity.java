package com.example.ejemplofragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//Fragment con código
        CodeFragment codeFragment = new CodeFragment();
//Adiminstrador de fragment
        FragmentManager fragmentManager = getSupportFragmentManager();
        //Transaccion con frgament
        FragmentTransaction fragmentTransaction =  fragmentManager.beginTransaction();
        //Agregar el fragment
        fragmentTransaction.add(R.id.container,codeFragment);
        //Commit para que se ejecute el cambio
        fragmentTransaction.commit();

    }
}
