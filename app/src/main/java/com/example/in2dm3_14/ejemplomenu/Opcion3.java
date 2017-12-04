package com.example.in2dm3_14.ejemplomenu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Opcion3 extends AppCompatActivity {
    //private static String OPCION1="datos";
    TextView textoOpcion3=null;
    String texto3=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opcion3);

        textoOpcion3=findViewById(R.id.textViewOpcion3);
        texto3=textoOpcion3.getText().toString();

    }
    @Override
    public void onBackPressed() {
        //super.onBackPressed();

        Bundle baul=new Bundle();
        baul.putString("textoOpcion3",texto3);
        //Intent i=new Intent(this,MainActivity.class);
        Intent i =new Intent();
        i.putExtra("baul",baul);
        setResult(RESULT_OK,i);
        finish();
    }
}
