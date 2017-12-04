package com.example.in2dm3_14.ejemplomenu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Opcion5 extends AppCompatActivity {
    //private static String OPCION1="datos";
    TextView textoOpcion5=null;
    String texto5=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opcion5);

        textoOpcion5=findViewById(R.id.textViewOpcion5);
        texto5=textoOpcion5.getText().toString();

    }
    @Override
    public void onBackPressed() {
        //super.onBackPressed();

        Bundle baul=new Bundle();
        baul.putString("textoOpcion5",texto5);
        //Intent i=new Intent(this,MainActivity.class);
        Intent i =new Intent();
        i.putExtra("baul",baul);
        setResult(RESULT_OK,i);
        finish();
    }
}
