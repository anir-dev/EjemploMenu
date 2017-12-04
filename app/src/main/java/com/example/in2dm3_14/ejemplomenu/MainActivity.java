package com.example.in2dm3_14.ejemplomenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textoOpcion1=null;
    String texto1=null;

    TextView textoOpcion2=null;
    String texto2=null;

    TextView textoOpcion3=null;
    String texto3=null;

    TextView textoOpcion4=null;
    String texto4=null;

    TextView textoOpcion5=null;
    String texto5=null;

    TextView textoOpcion6=null;
    String texto6=null;

    Bundle parametros=new Bundle();
    private static int REQUEST_CODE1=1;
    private static int REQUEST_CODE2=2;
    private static int REQUEST_CODE3=3;
    private static int REQUEST_CODE4=4;
    private static int REQUEST_CODE5=5;
    private static int REQUEST_CODE6=6;

    /*public static final int OPCION_1 = 0;
    public static final int OPCION_2 = 1;
    public static final int OPCION_3 = 2;
    public static final int OPCION_4 = 3;
    public static final int OPCION_5 = 4;
    public static final int OPCION_6 = 5;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textoOpcion1=findViewById(R.id.textView1);
        textoOpcion2=findViewById(R.id.textView2);
        textoOpcion3=findViewById(R.id.textView3);
        textoOpcion4=findViewById(R.id.textView4);
        textoOpcion5=findViewById(R.id.textView5);
        textoOpcion6=findViewById(R.id.textView6);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //super.onCreateOptionsMenu(menu);
        //crearMenu(menu);

        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    /*private void crearMenu(Menu menu) {
        MenuItem item1=menu.add(Menu.NONE, OPCION_1,Menu.NONE,"Opcion 1"); //none equilave a 0
        MenuItem item2=menu.add(Menu.NONE, OPCION_2,Menu.NONE,"Opcion 2");
        MenuItem item3=menu.add(Menu.NONE, OPCION_3,Menu.NONE,"Opcion 3");
        MenuItem item4=menu.add(Menu.NONE, OPCION_4,Menu.NONE,"Opcion 4");
        MenuItem item5=menu.add(Menu.NONE, OPCION_5,Menu.NONE,"Opcion 5");
        MenuItem item6=menu.add(Menu.NONE, OPCION_6,Menu.NONE,"Opcion 6");
    }*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        super.onOptionsItemSelected(item);
        seleccionarOpcion(item);
        return true;
    }

    private void seleccionarOpcion(MenuItem item) {
        int id=item.getItemId();
        switch (id){
            case R.id.Opcion1:
                //Toast.makeText(this,"Opcion 1 elegida",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(this,Opcion1.class);
                //startActivity(i);
                startActivityForResult(i,REQUEST_CODE1);
                break;
            case R.id.Opcion2:
                //Toast.makeText(this,"Opcion 2 elegida",Toast.LENGTH_SHORT).show();
                Intent i2 = new Intent(this,Opcion2.class);
                startActivityForResult(i2,REQUEST_CODE2);
                break;
            case R.id.Opcion3:
                //Toast.makeText(this,"Opcion 3 elegida",Toast.LENGTH_SHORT).show();
                Intent i3 = new Intent(this,Opcion3.class);
                startActivityForResult(i3,REQUEST_CODE3);
                break;
            case R.id.Opcion4:
                //Toast.makeText(this,"Opcion 3 elegida",Toast.LENGTH_SHORT).show();
                Intent i4 = new Intent(this,Opcion4.class);
                startActivityForResult(i4,REQUEST_CODE4);
                break;
            case R.id.Opcion5:
                //Toast.makeText(this,"Opcion 3 elegida",Toast.LENGTH_SHORT).show();
                Intent i5 = new Intent(this,Opcion5.class);
                startActivityForResult(i5,REQUEST_CODE5);
                break;
            case R.id.Opcion6:
                //Toast.makeText(this,"Opcion 3 elegida",Toast.LENGTH_SHORT).show();
                Intent i6 = new Intent(this,Opcion6.class);
                startActivityForResult(i6,REQUEST_CODE6);
                break;

        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //super.onActivityResult(requestCode, resultCode, data);
        parametros = this.getIntent().getExtras();
        if (requestCode==REQUEST_CODE1) {
            if (resultCode == RESULT_OK) {
                parametros = data.getBundleExtra("baul");
                if (parametros != null) {
                    texto1=parametros.getString("textoOpcion1");
                    //texto2=parametros.getString("textoOpcion2");
                    textoOpcion1.setText(texto1);
                    //textoOpcion2.setText(texto2);
                }
            }
        }else if(requestCode==REQUEST_CODE2){
            if(resultCode==RESULT_OK){
                parametros = data.getBundleExtra("baul");
                if(parametros!=null){
                    texto2=parametros.getString("textoOpcion2");
                    textoOpcion2.setText(texto2);
                }
            }
        }else if(requestCode==REQUEST_CODE3){
            if(resultCode==RESULT_OK){
                parametros = data.getBundleExtra("baul");
                if(parametros!=null){
                    texto3=parametros.getString("textoOpcion3");
                    textoOpcion3.setText(texto3);
                }
            }
        }else if(requestCode==REQUEST_CODE4){
            if(resultCode==RESULT_OK){
                parametros = data.getBundleExtra("baul");
                if(parametros!=null){
                    texto4=parametros.getString("textoOpcion4");
                    textoOpcion4.setText(texto4);
                }
            }
        }else if(requestCode==REQUEST_CODE5){
            if(resultCode==RESULT_OK){
                parametros = data.getBundleExtra("baul");
                if(parametros!=null){
                    texto5=parametros.getString("textoOpcion5");
                    textoOpcion5.setText(texto5);
                }
            }
        }else if(requestCode==REQUEST_CODE6){
            if(resultCode==RESULT_OK){
                parametros = data.getBundleExtra("baul");
                if(parametros!=null){
                    texto6=parametros.getString("textoOpcion6");
                    textoOpcion6.setText(texto6);
                }
            }
        }

    }
}
