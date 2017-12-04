package com.example.in2dm3_14.ejemplomenu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Opcion4 extends AppCompatActivity {
    //private static String OPCION1="datos";
    TextView textoOpcion4=null;
    String texto4=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opcion4);

        textoOpcion4=findViewById(R.id.textViewOpcion4);
        texto4=textoOpcion4.getText().toString();

    }
    @Override
    public void onBackPressed() {
        //super.onBackPressed();

        Bundle baul=new Bundle();
        baul.putString("textoOpcion4",texto4);
        //Intent i=new Intent(this,MainActivity.class);
        Intent i =new Intent();
        i.putExtra("baul",baul);
        setResult(RESULT_OK,i);
        finish();
    }
}
