package com.example.multiscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText name;
    public static final String EXTRA_NAME="com.example.multiscreen.extra.NAME";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void openActivity(View v){
        Toast.makeText(this, "This is working", Toast.LENGTH_SHORT).show();
        Intent intent= new Intent(this,MainActivity2.class);
        name=findViewById(R.id.name);
        String nameText= name.getText().toString();
        intent.putExtra(EXTRA_NAME,nameText);

        startActivity(intent);
    }
}