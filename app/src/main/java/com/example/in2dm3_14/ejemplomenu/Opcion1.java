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

        TextView textoOpcion1=(TextView)findViewById(R.id.textViewOpcion1);
        texto=textoOpcion1.getText().toString();

        //registerForContextMenu(textoOpcion1);


    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Bundle baul=new Bundle();
        baul.putString("textoOpcion1",texto);
        Intent i=new Intent(this,MainActivity.class);

    }
}
