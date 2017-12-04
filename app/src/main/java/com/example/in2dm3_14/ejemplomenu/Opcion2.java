package com.example.in2dm3_14.ejemplomenu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Opcion2 extends AppCompatActivity {
    //private static String OPCION1="datos";
    TextView textoOpcion2=null;
    String texto2=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opcion2);

        textoOpcion2=findViewById(R.id.textViewOpcion2);
        texto2=textoOpcion2.getText().toString();

    }
    @Override
    public void onBackPressed() {
        //super.onBackPressed();

        Bundle baul=new Bundle();
        baul.putString("textoOpcion2",texto2);
        //Intent i=new Intent(this,MainActivity.class);
        Intent i =new Intent();
        i.putExtra("baul",baul);
        setResult(RESULT_OK,i);
        finish();
    }
}
