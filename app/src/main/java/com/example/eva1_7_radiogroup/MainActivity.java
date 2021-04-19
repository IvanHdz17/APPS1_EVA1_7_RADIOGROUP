package com.example.eva1_7_radiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rdGrpComida;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdGrpComida = findViewById(R.id.rdGrpComida);
        //ASIGNAR EL LISTENER
        rdGrpComida.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override                //rdGrp  que genera el evento, ID del radiobutton seleccionado
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                //TOAST INDICANDO CUAL RADIOBUTTON FUE SELECCIONADO
                /*switch (checkedId){
                    case R.id.radioButton:
                        Toast.makeText(MainActivity.this,"Tacos",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton2:
                        Toast.makeText(MainActivity.this,"Montados",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton3:
                        Toast.makeText(MainActivity.this,"Burritos",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton4:
                        Toast.makeText(MainActivity.this,"Tortas",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton5:
                        Toast.makeText(MainActivity.this,"Alitas",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton6:
                        Toast.makeText(MainActivity.this,"Enchiladas",Toast.LENGTH_SHORT).show();
                        break;
                }*/
                RadioButton rdBtnSel;
                rdBtnSel = findViewById(checkedId); //RadioButton seleccionado
                Toast.makeText(getApplicationContext(),rdBtnSel.getText(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}