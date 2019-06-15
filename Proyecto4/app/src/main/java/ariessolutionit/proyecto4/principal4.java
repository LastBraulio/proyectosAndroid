package ariessolutionit.proyecto4;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class principal4 extends AppCompatActivity {

    TextView tv1;
    CheckBox chk1;

    RadioGroup rggroup1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal4);

        tv1 = (TextView) findViewById(R.id.id_text1);
        chk1 = (CheckBox) findViewById(R.id.id_chk1);
        rggroup1 = (RadioGroup) findViewById(R.id.id_grupo1);




        chk1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (chk1.isChecked())
                    tv1.setText(tv1.getText().toString().toUpperCase());
                else
                    tv1.setText(tv1.getText().toString().toLowerCase());
            }
        });

        rggroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.id_rb1)
                    tv1.setTextColor(Color.BLUE);
                if (checkedId == R.id.id_rd2)
                    tv1.setTextColor(Color.RED);
                if (checkedId == R.id.id_rd3)
                    tv1.setTextColor(Color.GREEN);
            }
        });
    }
}
