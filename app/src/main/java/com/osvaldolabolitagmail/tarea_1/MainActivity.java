package com.osvaldolabolitagmail.tarea_1;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup1;
    RadioButton radioButtonCuadrado, radioButtonCirculo, radioButtonTriangulo,radioButtonCubo;
    TextView textviewLado, textviewBase, textviewRadio;;
    EditText editTextLado, edittextBase,edittextAltura, edittextRadio;;
    TextView textviewAltura, AreaResultado3, AreaResultado2, AreaResultado1;

    ImageView imagenfigura;
    Button bnt_calcular;

    private LinearLayout perimetroLayout,  arealayout, volumenlayout;
    int FLAG = 0;
    double LADO, RADIO, PERIMETRO, ALTURA, AREA, VOLUMEN, BASE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioButtonCuadrado = (RadioButton) findViewById(R.id.radioButtonCuadrado);
        radioButtonCirculo = (RadioButton) findViewById(R.id.radioButtonCirculo);
        radioButtonTriangulo = (RadioButton) findViewById(R.id.radioButtonTriangulo);
        radioButtonCubo = (RadioButton) findViewById(R.id.radioButtonCubo);
        textviewLado = (TextView) findViewById(R.id.textviewLado);
        textviewBase = (TextView) findViewById(R.id.textviewBase);
        textviewAltura = (TextView) findViewById(R.id.textviewAltura);
        textviewRadio = (TextView) findViewById(R.id.textviewRadio);
        editTextLado = (EditText) findViewById(R.id.edittextLado);
        edittextBase = (EditText) findViewById(R.id.edittextBase);
        edittextAltura = (EditText) findViewById(R.id.edittextAltura);
        edittextRadio = (EditText) findViewById(R.id.edittextRadio);
        imagenfigura = (ImageView) findViewById(R.id.ImageViewImagen);
        bnt_calcular = (Button) findViewById(R.id.ButtonCalcular);
        AreaResultado1 =  (TextView) findViewById(R.id.resultadoPerimetro);
        AreaResultado2 = (TextView) findViewById(R.id.resultadoArea);
        AreaResultado3 = (TextView) findViewById(R.id.resultadoVolumen);
        perimetroLayout = (LinearLayout) findViewById(R.id.layoutPerimetro);
        arealayout = (LinearLayout) findViewById(R.id.layoutArea);
        volumenlayout = (LinearLayout) findViewById(R.id.layoutVolumen);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.radioButtonCuadrado:
                editTextLado.setVisibility(View.VISIBLE);
                textviewLado.setVisibility(View.VISIBLE);
                edittextAltura.setVisibility(View.INVISIBLE);
                textviewAltura.setVisibility(View.INVISIBLE);
                edittextRadio.setVisibility(View.INVISIBLE);
                textviewRadio.setVisibility(View.INVISIBLE);
                edittextBase.setVisibility(View.INVISIBLE);
                textviewBase.setVisibility(View.INVISIBLE);
                imagenfigura.setImageResource(R.drawable.cuadrado);
                FLAG = 1;
                break;
            case R.id.radioButtonCirculo:
                editTextLado.setVisibility(View.INVISIBLE);
                textviewLado.setVisibility(View.INVISIBLE);
                edittextAltura.setVisibility(View.INVISIBLE);
                textviewAltura.setVisibility(View.INVISIBLE);
                edittextRadio.setVisibility(View.VISIBLE);
                textviewRadio.setVisibility(View.VISIBLE);
                edittextBase.setVisibility(View.INVISIBLE);
                textviewBase.setVisibility(View.INVISIBLE);
                imagenfigura.setImageResource(R.drawable.circulo);
                FLAG = 2;
                break;
            case R.id.radioButtonTriangulo:
                editTextLado.setVisibility(View.INVISIBLE);
                textviewLado.setVisibility(View.INVISIBLE);
                edittextAltura.setVisibility(View.VISIBLE);
                textviewAltura.setVisibility(View.VISIBLE);
                edittextRadio.setVisibility(View.INVISIBLE);
                textviewRadio.setVisibility(View.INVISIBLE);
                edittextBase.setVisibility(View.VISIBLE);
                textviewBase.setVisibility(View.VISIBLE);
                imagenfigura.setImageResource(R.drawable.triangulo);
                FLAG = 3;
                break;
            case R.id.radioButtonCubo:
                editTextLado.setVisibility(View.VISIBLE);
                textviewLado.setVisibility(View.VISIBLE);
                edittextAltura.setVisibility(View.INVISIBLE);
                textviewAltura.setVisibility(View.INVISIBLE);
                edittextRadio.setVisibility(View.INVISIBLE);
                textviewRadio.setVisibility(View.INVISIBLE);
                edittextBase.setVisibility(View.INVISIBLE);
                textviewBase.setVisibility(View.INVISIBLE);
                imagenfigura.setImageResource(R.drawable.cubo);
                FLAG = 4;
                break;
        }
    }//onradiobuttonclicked

    public void btn_calcular(View view){
        switch (FLAG){
            case 1:
                //FLAG = 0;
                if (!editTextLado.getText().toString().isEmpty()){
                    LADO = Double.parseDouble(editTextLado.getText().toString());
                    PERIMETRO = 4 * LADO;
                    AREA = LADO * LADO;
                    AreaResultado1.setText(Double.toString(PERIMETRO));
                    AreaResultado2.setText(Double.toString(AREA));
                    perimetroLayout.setVisibility(View.VISIBLE);
                    arealayout.setVisibility(View.VISIBLE);
                    volumenlayout.setVisibility(View.INVISIBLE);
                }
                break;
            case 2:
                //FLAG = 0;
                if (!edittextRadio.getText().toString().isEmpty()){
                    RADIO = Double.parseDouble(edittextRadio.getText().toString());
                    PERIMETRO = 2 *Math.PI*RADIO;
                    AREA = Math.PI*RADIO*RADIO;
                    AreaResultado1.setText(Double.toString(PERIMETRO));
                    AreaResultado2.setText(Double.toString(AREA));
                    perimetroLayout.setVisibility(View.VISIBLE);
                    arealayout.setVisibility(View.VISIBLE);
                    volumenlayout.setVisibility(View.INVISIBLE);
                }
                break;
            case 3:
                //FLAG = 0;
                if (!edittextBase.getText().toString().isEmpty() && !edittextAltura.getText().toString().isEmpty()){
                    BASE = Double.parseDouble(edittextBase.getText().toString());
                    ALTURA = Double.parseDouble(edittextAltura.getText().toString());
                    PERIMETRO = 3 * BASE;
                    AREA = (BASE*ALTURA)/2;
                    AreaResultado1.setText(Double.toString(PERIMETRO));
                    AreaResultado2.setText(Double.toString(AREA));
                    perimetroLayout.setVisibility(View.VISIBLE);
                    arealayout.setVisibility(View.VISIBLE);
                    volumenlayout.setVisibility(View.INVISIBLE);
                }
                break;
            case 4:
                //FLAG = 0;
                if (!editTextLado.getText().toString().isEmpty()){
                    LADO = Double.parseDouble(editTextLado.getText().toString());
                    VOLUMEN = LADO*LADO*LADO;
                    AreaResultado3.setText(Double.toString(VOLUMEN));
                    volumenlayout.setVisibility(View.VISIBLE);
                    perimetroLayout.setVisibility(View.INVISIBLE);
                    arealayout.setVisibility(View.INVISIBLE);
                }

                break;
            default:
                Toast.makeText(this, "Ninguno Seleccionado", Toast.LENGTH_SHORT).show();
        }

    }


}
