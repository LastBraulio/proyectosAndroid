package ariessolutionit.ciclovida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class principal5 extends AppCompatActivity {
    String etiqueta = "Evento ==>   ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal5);
        Log.d(etiqueta,"Estoy pasando por OnCreate");
    }


}
