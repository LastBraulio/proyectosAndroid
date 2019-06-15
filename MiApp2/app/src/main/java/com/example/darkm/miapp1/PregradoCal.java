package com.example.darkm.miapp1;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.Toast;

public class PregradoCal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregrado_cal);
        Button boton = (Button) findViewById(R.id.button1);

        /*Resources res = getResources();

        TabHost tabs = (TabHost) findViewById(android.R.id.tabhost);
        tabs.setup();

        TabHost.TabSpec spec = tabs.newTabSpec("mitab1");
        spec.setContent(R.id.tab1);
        //spec.setIndicator("Calendario Academico", res.getDrawable(android.R.drawable.ic_btn_speak_now));
        //spec.setIndicator("1", res.getDrawable(android.R.drawable.ic_btn_speak_now));
        spec.setIndicator("Link 1");
        tabs.addTab(spec);

        spec = tabs.newTabSpec("mitab2");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Link 2");
        tabs.addTab(spec);*

        //spec=tabs.newTabSpec("mitab3");
        //spec.setContent(R.id.tab3);
        //spec.setIndicator("TAB3",
        //       res.getDrawable(android.R.drawable.ic_dialog_map));
        //tabs.addTab(spec);

        tabs.setCurrentTab(0);*/
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.idlistarpre) {
            Toast.makeText(this, "Listar Calendario Pregrado", Toast.LENGTH_SHORT).show();
            llamaract1();
            return true;
        }
        if (id == R.id.idmsn) {
            Toast.makeText(this, "Mensajeria", Toast.LENGTH_LONG).show();
        }
        /*if (id == R.id.tab2) {
            Toast.makeText(this, "nueva difusión", Toast.LENGTH_LONG).show();
        }
        else if(id==R.id.tab1 ){
            Toast.makeText(this,"nueva difusión",Toast.LENGTH_LONG).show();
        }

        else if(id==R.id.tab2){
            Toast.makeText(this,"lupa",Toast.LENGTH_LONG).show();
        }
        else if(id==R.id.tab3){
            //Toast.makeText(this,"lupa",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(MainActivity.this,CalendarioPregrado.class);
            startActivity(intent);
        }*/

        return super.onOptionsItemSelected(item);
    }
    public void llamaract1() {
        Intent i = new Intent(this,CalendarioPregrado.class);
        startActivityForResult(i,0) ;
    }
}
