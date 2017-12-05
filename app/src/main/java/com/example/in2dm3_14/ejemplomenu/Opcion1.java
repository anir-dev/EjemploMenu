package com.example.in2dm3_14.ejemplomenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Opcion1 extends AppCompatActivity {
    TextView textoOpcion1=null;
    String texto=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opcion1);

        textoOpcion1=findViewById(R.id.textViewOpcion1);
        texto=textoOpcion1.getText().toString();

        //registerForContextMenu(textoOpcion1);


    }
    @Override
    public void onBackPressed() {
        //super.onBackPressed();

        Bundle baul=new Bundle();
        baul.putString("textoOpcion1",texto);
        //Intent i=new Intent(this,MainActivity.class);
        Intent i =new Intent();
        i.putExtra("baul",baul);
        setResult(RESULT_OK,i);
        finish();

    }
}
