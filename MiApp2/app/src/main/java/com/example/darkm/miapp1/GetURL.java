package com.example.darkm.miapp1;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class GetURL extends AppCompatActivity implements View.OnClickListener{

    Button conectar;

    //String urlconexion = "http://www.elpais.com/rss/feed.html?feedId=1022";
    String urlconexion = "http://www.utp.ac.pa/calendario-academico";

    TextView textView;

    Conexion hiloconexion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_url);

        conectar = (Button)findViewById(R.id.conectar);
        conectar.setOnClickListener(this);
        textView = (TextView)findViewById(R.id.textView);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.conectar:

                textView.setText("");
                hiloconexion = new Conexion();
                hiloconexion.execute();

                break;

            default:

                break;


        }
    }

    public class Conexion extends AsyncTask<Void,Integer,String> {
        @Override
        protected String doInBackground(Void... params) {

            String salida="";
            int i=0, j=0;
            StringBuilder sb = new StringBuilder();
            try {

                URL url = new URL(urlconexion); // Url de donde queremos obtener información
                HttpURLConnection connection = (HttpURLConnection) url.openConnection(); //Abrir la conexión
                //Añadimos una cabecera HTTP para que identificarnos y evitar obtener un error de aquellos
                //servidores que prohiben la respuesta a aquellos clientes que no se identifican.
                connection.setRequestProperty("User-Agent", "Mozilla/5.0" +
                        " (Linux; Android 1.5; es-ES) Ejemplo HTTP");

                int respuesta = connection.getResponseCode();

                if (respuesta==HttpURLConnection.HTTP_OK){

                    BufferedReader lector = new BufferedReader (
                            new InputStreamReader(connection.getInputStream()));
                    String linea = lector.readLine();

                    while (linea != null) {
                        //Si encontramos la etiqueta <title> podemos recuperar la noticia
                        /*if (linea.indexOf("<title><![CDATA") >= 0) {
                            i = linea.indexOf("<title>")+16;
                            j = linea.indexOf("</title>")-3;
                            salida += linea.substring(i,j);
                            salida += "\n----------------\n";
                        }*/
                        /*if (linea.indexOf("<a ")>= -1) {
                            i = linea.indexOf("<a ")+1;
                            j = linea.indexOf("</a>")-5;
                            salida += linea.substring(i,j);
                            salida += "\n----------------\n";
                        }
                        //Leemos la siguiente línea
                        linea = lector.readLine();*/

                        /*if(linea.contains("<a href=...")){
                            salida+=linea;
                            salida += "\n----------------\n";
                        }*/
                        sb.append(linea + "\n");
                        //Log.d("MENSAJIN",salida);
                        //return salida;
                    }
                    lector.close();
                } else {
                    salida = "No encontrado";
                }
                connection.disconnect();

                //return salida;
                return sb.toString();

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onCancelled(String aVoid) {
            super.onCancelled(aVoid);
        }

        @Override
        protected void onPostExecute(String resultado) {

            textView.append(resultado);

            //super.onPostExecute(resultado);
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
        }


    }


}
