package ariessolutionit.proyecto3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class principal1 extends AppCompatActivity implements View.OnClickListener {

    TextView tv1;

    Button btm1;
    Button btm_1;
    Button btm_2;

    EditText edt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal1);
        tv1 = (TextView) findViewById(R.id.txt_cambiar);
        tv1.setText("He Cambiado el Texto");
        btm1 = (Button)findViewById(R.id.btm_aceptar);

        btm_1 = (Button)findViewById(R.id.btm_1);
        btm_1.setOnClickListener(this);

        btm_2 = (Button)findViewById(R.id.btm_2);
        btm_2.setOnClickListener(this);

        edt1= (EditText) findViewById(R.id.idescribir);

        btm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(edt1.getText().toString());
            }
        });
    }


    public void onClick(View v) {
        if (v == btm_1)
            tv1.setText("Haz Pulsado el botton 1");
        if (v==btm_2)
            tv1.setText("Haz Pulsado el botton 2");
    }
}
