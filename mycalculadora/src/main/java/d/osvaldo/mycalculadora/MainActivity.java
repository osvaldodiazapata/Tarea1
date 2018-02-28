package d.osvaldo.mycalculadora;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {

    EditText editTextResultado, editTextoperando1, editTextoperando2, editTextoperacion ;

    boolean flag_operacion = false; //bandera para identificar si el boton pulsado es boton de operacion para no repetir
    boolean flag_operando_1 = false;
    double operando_1, operando_2, Resultado;
    int Flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextResultado =  findViewById(R.id.editTextResultado);
        editTextoperacion =  findViewById(R.id.editTextOperacion);
        editTextoperando1 =  findViewById(R.id.editTextOperando_1);
        editTextoperando2 =  findViewById(R.id.editTextOperando_2);

    }

    public void click (View v){
        int identificador = v.getId();
        switch (identificador){
            case R.id.button_0:
                //editTextResultado.setText(editTextResultado.getText() + "0");
                fill_operando("0");
                break;
            case R.id.button_1:
                //editTextResultado.setText(editTextResultado.getText() + "1");
                fill_operando("1");
                break;
            case R.id.button_2:
                //editTextResultado.setText(editTextResultado.getText() + "2");
                fill_operando("2");
                break;
            case R.id.button_3:
                //editTextResultado.setText(editTextResultado.getText() + "3");
                fill_operando("3");
                break;
            case R.id.button_4:
                //editTextResultado.setText(editTextResultado.getText() + "4");
                fill_operando("4");
                break;
            case R.id.button_5:
                //editTextResultado.setText(editTextResultado.getText() + "5");
                fill_operando("5");
                break;
            case R.id.button_6:
                //editTextResultado.setText(editTextResultado.getText() + "6");
                fill_operando("6");
                break;
            case R.id.button_7:
                //editTextResultado.setText(editTextResultado.getText() + "7");
                fill_operando("7");
                break;
            case R.id.button_8:
                //editTextResultado.setText(editTextResultado.getText() + "8");
                fill_operando("8");
                break;
            case R.id.button_9:
                //editTextResultado.setText(editTextResultado.getText() + "9");
                fill_operando("9");
                break;
            case R.id.button_suma:
                /*if (flag_operacion == false){
                    flag_operacion = true;
                    editTextResultado.setText(editTextResultado.getText() + "+");
                }*/
                editTextoperacion.setText("+");
                Flag = 1;
                break;
            case R.id.button_resta:
                /*if (flag_operacion == false){
                    flag_operacion = true;
                    editTextResultado.setText(editTextResultado.getText() + "-");
                }*/
                editTextoperacion.setText("-");
                Flag = 2;
                break;
            case R.id.button_multiplicacion:
                /*if (flag_operacion == false){
                    flag_operacion = true;
                    editTextResultado.setText(editTextResultado.getText() + "*");
                }*/
                editTextoperacion.setText("*");
                Flag = 3;
                break;
            case R.id.button_division:
                /*if (flag_operacion == false){
                    flag_operacion = true;
                    editTextResultado.setText(editTextResultado.getText() + "/");
                }*/
                editTextoperacion.setText("/");
                Flag = 4;
                break;
            case R.id.button_igual:
                if(!editTextoperando2.getText().toString().isEmpty()) {
                    operando_1 = Double.parseDouble(editTextoperando1.getText().toString());
                    operando_2 = Double.parseDouble(editTextoperando2.getText().toString());
                    switch (Flag) {
                        case 1: //suma
                            Resultado = operando_1 + operando_2;
                            editTextResultado.setText(String.valueOf(Resultado));
                            break;
                        case 2: //resta
                            Resultado = operando_1 - operando_2;
                            editTextResultado.setText(String.valueOf(Resultado));
                            break;
                        case 3: //multiplicacion
                            Resultado = operando_1 * operando_2;
                            editTextResultado.setText(String.valueOf(Resultado));
                            break;
                        case 4: //Division
                            Resultado = operando_1 / operando_2;
                            editTextResultado.setText(String.valueOf(Resultado));
                            break;
                        default:
                            Toast.makeText(this, "Select some operation", Toast.LENGTH_SHORT).show();
                            break;
                    }
                    Flag = 0;
                }
                else
                {
                    Toast.makeText(this, "FALTA INFORMACION", Toast.LENGTH_SHORT).show();
                }
                break;

        }
    }


    public void fill_operando(String dato){

        if (Flag == 0){
            editTextoperando1.setText(editTextoperando1.getText() + dato);
        }else{
            editTextoperando2.setText((editTextoperando2.getText() + dato));
        }

    }

}

