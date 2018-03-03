package d.osvaldo.myresistor;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner Banda1, Banda2, Banda3, tolerancia;
    TextView Resultado, colorBanda1, colorBanda2, colorBanda3,colorBanda4;
    String[]  datosBanda1 ={"Banda1", "Negro", "Cafe", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Violeta", "Gris", "Blanco"};
    String[]  datosBanda2 ={"Banda2", "Negro", "Cafe", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Violeta", "Gris", "Blanco"};
    String[]  datosBanda3 ={"Banda3", "Negro", "Cafe", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Violeta", "Gris", "Blanco"};
    String[] datosTolerancia = {"TOL", "rojo", "dorado", "plata"};
    int valorBanda1=0, valorBanda2=0, valorbanda3=0,resultado=0, toler=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Banda1 = (Spinner) findViewById(R.id.SpinBanda1);
        Banda2 = (Spinner) findViewById(R.id.SpinBanda2);
        Banda3 = (Spinner) findViewById(R.id.SpinBanda3);
        tolerancia = (Spinner) findViewById(R.id.SpinBanda4);
        colorBanda1 = (TextView) findViewById(R.id.banda_1);
        colorBanda2 =(TextView) findViewById(R.id.banda_2);
        colorBanda3 =(TextView) findViewById(R.id.banda_3);
        colorBanda4 = (TextView) findViewById(R.id.Tolerancia);

        Resultado = (TextView) findViewById(R.id.TextvierResultado);

        ArrayAdapter<String> adaptador_Banda_1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datosBanda1);
        ArrayAdapter<String> adaptador_Banda_2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datosBanda2);
        ArrayAdapter<String> adaptador_Banda_3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datosBanda3);
        ArrayAdapter<String> Adaptador_tolerancia = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datosTolerancia);
        Banda1.setAdapter(adaptador_Banda_1);
        Banda1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 1:
                        colorBanda1.setBackgroundColor(getResources().getColor(R.color.black));
                        break;
                    case 2:
                        colorBanda1.setBackgroundColor(getResources().getColor(R.color.sienna));
                        break;
                    case 3:
                        colorBanda1.setBackgroundColor(getResources().getColor(R.color.red));
                        break;
                    case 4:
                        colorBanda1.setBackgroundColor(getResources().getColor(R.color.orange));
                        break;
                    case 5:
                        colorBanda1.setBackgroundColor(getResources().getColor(R.color.yellow));
                        break;
                    case 6:
                        colorBanda1.setBackgroundColor(getResources().getColor(R.color.green));
                        break;
                    case 7:
                        colorBanda1.setBackgroundColor(getResources().getColor(R.color.blue));
                        break;
                    case 8:
                        colorBanda1.setBackgroundColor(getResources().getColor(R.color.violet));
                        break;
                    case 9:
                        colorBanda1.setBackgroundColor(getResources().getColor(R.color.gray));
                        break;
                    case 10:
                        colorBanda1.setBackgroundColor(getResources().getColor(R.color.white));
                        break;
                }
                valorBanda1 = i-1;
                calcular();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        Banda2.setAdapter(adaptador_Banda_2);
        Banda2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 1:
                        colorBanda2.setBackgroundColor(getResources().getColor(R.color.black));
                        break;
                    case 2:
                        colorBanda2.setBackgroundColor(getResources().getColor(R.color.sienna));
                        break;
                    case 3:
                        colorBanda2.setBackgroundColor(getResources().getColor(R.color.red));
                        break;
                    case 4:
                        colorBanda2.setBackgroundColor(getResources().getColor(R.color.orange));
                        break;
                    case 5:
                        colorBanda2.setBackgroundColor(getResources().getColor(R.color.yellow));
                        break;
                    case 6:
                        colorBanda2.setBackgroundColor(getResources().getColor(R.color.green));
                        break;
                    case 7:
                        colorBanda2.setBackgroundColor(getResources().getColor(R.color.blue));
                        break;
                    case 8:
                        colorBanda2.setBackgroundColor(getResources().getColor(R.color.violet));
                        break;
                    case 9:
                        colorBanda2.setBackgroundColor(getResources().getColor(R.color.gray));
                        break;
                    case 10:
                        colorBanda2.setBackgroundColor(getResources().getColor(R.color.white));
                        break;
                }
                valorBanda2 = i-1;
                calcular();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        Banda3.setAdapter(adaptador_Banda_3);
        Banda3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 1:
                        colorBanda3.setBackgroundColor(getResources().getColor(R.color.black));
                        break;
                    case 2:
                        colorBanda3.setBackgroundColor(getResources().getColor(R.color.sienna));
                        break;
                    case 3:
                        colorBanda3.setBackgroundColor(getResources().getColor(R.color.red));
                        break;
                    case 4:
                        colorBanda3.setBackgroundColor(getResources().getColor(R.color.orange));
                        break;
                    case 5:
                        colorBanda3.setBackgroundColor(getResources().getColor(R.color.yellow));
                        break;
                    case 6:
                        colorBanda3.setBackgroundColor(getResources().getColor(R.color.green));
                        break;
                    case 7:
                        colorBanda3.setBackgroundColor(getResources().getColor(R.color.blue));
                        break;
                    case 8:
                        colorBanda3.setBackgroundColor(getResources().getColor(R.color.violet));
                        break;
                    case 9:
                        colorBanda3.setBackgroundColor(getResources().getColor(R.color.gray));
                        break;
                    case 10:
                        colorBanda3.setBackgroundColor(getResources().getColor(R.color.white));
                        break;
                }
                valorbanda3 = i-1;
                calcular();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        tolerancia.setAdapter(Adaptador_tolerancia);
        tolerancia.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 1:
                        colorBanda4.setBackgroundColor(getResources().getColor(R.color.red));
                        toler = 2;
                        break;
                    case 2:
                        colorBanda4.setBackgroundColor(getResources().getColor(R.color.gold));
                        toler = 5;
                        break;
                    case 3:
                        toler = 10;
                        colorBanda4.setBackgroundColor(getResources().getColor(R.color.silver));
                        break;
                }
                calcular();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
    public void calcular (){
        resultado = 0;
        resultado = (int) (((valorBanda1*10)+valorBanda2)*Math.pow(10, valorbanda3));
        Resultado.setText(String.valueOf(resultado +" +/- "+ toler + "%"));

    }
}
