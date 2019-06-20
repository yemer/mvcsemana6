package com.example.alumno.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.alumno.myapplication.helper.monitorObser;
import com.example.alumno.myapplication.helper.obServerBind;
import com.example.alumno.myapplication.models.client;

public class MainActivity extends AppCompatActivity {
    Button btnEdad;
    monitorObser monitorObservable;
    obServerBind observerBind;
    client clientObject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnEdad = (Button)findViewById(R.id.btnEdad);
        btnEdad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });
     monitorObservable.addObserver(obServerBind);
     btnEdad=(button)findViewById(R.id)

    }
}
