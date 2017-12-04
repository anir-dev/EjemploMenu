package com.example.in2dm3_14.ejemplomenu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Opcion6 extends AppCompatActivity {
    //private static String OPCION1="datos";
    TextView textoOpcion6=null;
    String texto6=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opcion6);

        textoOpcion6=findViewById(R.id.textViewOpcion6);
        texto6=textoOpcion6.getText().toString();

    }
    @Override
    public void onBackPressed() {
        //super.onBackPressed();

        Bundle baul=new Bundle();
        baul.putString("textoOpcion6",texto6);
        //Intent i=new Intent(this,MainActivity.class);
        Intent i =new Intent();
        i.putExtra("baul",baul);
        setResult(RESULT_OK,i);
        finish();
    }
}
