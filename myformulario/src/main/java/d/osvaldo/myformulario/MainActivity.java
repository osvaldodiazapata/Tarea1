package d.osvaldo.myformulario;

import android.app.DatePickerDialog;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bfecha, bguardar;
    TextView tguardar;
    EditText efecha, elogin,epassword,erpassword,ecorreo;
    RadioButton rmasculino, rfemenino;
    private int dia, mes, agno;
    String genero="", bailar=" ", nadar=" ", correr=" ",cine=" ", departamento;
    String departamentos[] = {"Lugar de nacimiento","1. Amazonas: Leticia","2. Antioquia: Medellín","3. Arauca: Arauca","4. Atlántico: Barranquilla","5. Bolívar: Cartagena",
            "6. Boyacá: Tunja","7. Caldas: Manizales","8. Caquetá: Florencia","9. Casanare: Yopal","10. Cauca: Popayán", "11. Cesar: Valledupar",
            "12. Chocó: Quibdó","13. Córdoba: Montería","14. Cundinamarca: Bogotá", "15. Guainía: Puerto Inírida","16. Guaviare: San José del Guaviare",
            "17. Huila: Neiva","18. La Guajira: Riohacha","19. Magdalena: Santa Marta","20. Meta: Villavicencio","21. Nariño: Pasto","22. Norte de Santander: Cúcuta",
            "23. Putumayo: Mocoa","24. Quindio: Armenia","25. Risaralda: Pereira","26. San Andres y Providencia: San Andres","27. Santander: Bucaramanga",
            "28. Sucre: Sincelejo","29. Tolima: Ibagué","30. Valle del Cauca: Cali","31. Vaupés: Mitú","32. Vichada: Puerto Carreño"};
    Spinner sdepartamento;
    boolean flag_genero = false,flag_lugar_nacimiento=false, flag_hobbies=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bfecha = findViewById(R.id.bFecha);
        bguardar = findViewById(R.id.bGuardar);
        efecha = findViewById(R.id.eFecha);
        elogin = findViewById(R.id.eLogin);
        epassword = findViewById(R.id.ePassword);
        erpassword = findViewById(R.id.erPassword);
        ecorreo = findViewById(R.id.eCorreo);
        bfecha.setOnClickListener(this);
        bguardar.setOnClickListener(this);
        tguardar = findViewById(R.id.tGuardar);
        rmasculino = findViewById(R.id.rMasculino);
        rmasculino = findViewById(R.id.rMasculino);
        rfemenino = findViewById(R.id.rFemenino);
        sdepartamento = (Spinner) findViewById(R.id.sDepartamento);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, departamentos);
        sdepartamento.setAdapter(adaptador);

        sdepartamento.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                switch (i){
                    case 1:
                        departamento= "Amazonas";flag_lugar_nacimiento=true;
                        break;
                    case 2:
                        departamento= "Antioquia";flag_lugar_nacimiento=true;
                        break;
                    case 3:
                        departamento= "Arauca";flag_lugar_nacimiento=true;
                        break;
                    case 4:
                        departamento= "Atlantico";flag_lugar_nacimiento=true;
                        break;
                    case 5:
                        departamento= "Bolivar";flag_lugar_nacimiento=true;
                        break;
                    case 6:
                        departamento= "Boyaca";flag_lugar_nacimiento=true;

                        break;
                    case 7:
                        departamento= "Caldas";flag_lugar_nacimiento=true;

                        break;
                    case 8:departamento= "Caquetá";flag_lugar_nacimiento=true;

                        break;
                    case 9:departamento= "Casanare";flag_lugar_nacimiento=true;

                        break;
                    case 10:departamento= "Cauca";flag_lugar_nacimiento=true;

                        break;
                    case 11:departamento= "Cesar";flag_lugar_nacimiento=true;

                        break;
                    case 12:departamento= "Chocó";flag_lugar_nacimiento=true;

                        break;
                    case 13:departamento= "Córdoba";flag_lugar_nacimiento=true;

                        break;
                    case 14:departamento= "Cundinamarca";flag_lugar_nacimiento=true;

                        break;
                    case 15:departamento= "Guainía";flag_lugar_nacimiento=true;

                        break;
                    case 16:departamento= "Guaviare";flag_lugar_nacimiento=true;

                        break;
                    case 17:departamento= "Huila";flag_lugar_nacimiento=true;

                        break;
                    case 18:departamento= "La Guajira";flag_lugar_nacimiento=true;

                        break;
                    case 19:departamento= "Magdalena";flag_lugar_nacimiento=true;

                        break;
                    case 20:departamento= "Meta";flag_lugar_nacimiento=true;

                        break;
                    case 21:departamento= "Nariño";flag_lugar_nacimiento=true;

                        break;
                    case 22:departamento= "Norte de Santander";flag_lugar_nacimiento=true;

                        break;
                    case 23:departamento= "Putumayo";flag_lugar_nacimiento=true;

                        break;
                    case 24:departamento= "Quindio";flag_lugar_nacimiento=true;

                        break;
                    case 25:departamento= "Risaralda";flag_lugar_nacimiento=true;

                        break;
                    case 26:departamento= "San Andres y Providencia";flag_lugar_nacimiento=true;

                        break;
                    case 27:departamento= "Santander";flag_lugar_nacimiento=true;

                        break;
                    case 28:departamento= "Sucre";flag_lugar_nacimiento=true;

                        break;
                    case 29:departamento= "Tolima";flag_lugar_nacimiento=true;

                        break;
                    case 30:departamento= "Valle del Cauca";flag_lugar_nacimiento=true;

                        break;
                    case 31:departamento= "Vaupés";flag_lugar_nacimiento=true;

                        break;
                    case 32:departamento= "Vichada";flag_lugar_nacimiento=true;

                        break;
                    }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    @Override
    public void onClick(View view) {
        if (view == bfecha){

            final Calendar c = Calendar.getInstance();
            dia = c.get(Calendar.DAY_OF_MONTH);
            mes = c.get(Calendar.MONTH);
            agno = c.get(Calendar.YEAR);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                    efecha.setText(i +"/"+ (i1+1)+"/"+i2);
                }
            }, dia, mes, agno);
            datePickerDialog.show();

        }
        if (view == bguardar){

            if((flag_hobbies && flag_lugar_nacimiento &&flag_genero && !elogin.getText().toString().isEmpty() && !epassword.getText().toString().isEmpty() && !ecorreo.getText().toString().isEmpty()
                    && !erpassword.getText().toString().isEmpty() && !efecha.getText().toString().isEmpty()) ) {
                if (epassword.getText().toString().equals(erpassword.getText().toString())) {
                    tguardar.setText(String.format("USUARIO: %s\n" +
                            "PASSWORD: %s\nCORREO: %s\nGENERO: %s\n" +
                            "HOBBIES: %s%s%s%s\nFECHA DE NACIMIENTO: %s\n"+
                            "LUGAR DE NACIMIENTO: %s\n",
                            elogin.getText().toString(), epassword.getText().toString(),
                            ecorreo.getText().toString(), genero, nadar, bailar, cine, correr,
                            efecha.getText().toString(), departamento));
                } else {
                    Toast.makeText(this, "LAS CONTRASEÑAS NO COINCIDEN", Toast.LENGTH_SHORT).show();
                }
            }else{
                Toast.makeText(this, "FALTA INFORMACION POR DILIGENCIAR", Toast.LENGTH_SHORT).show();
            }
        }
    }
    public void onRadioButtonClicked(View view){
        switch (view.getId()){
            case R.id.rMasculino:
                genero = "Masculino";
                flag_genero=true;
                break;
            case R.id.rFemenino:
                genero = "Femenino";
                flag_genero=true;
                break;


        }

    }

    public void onCheckBoxClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()){
            case R.id.cBailar:
                if (checked){
                    bailar = "Bailar";
                flag_hobbies=true;}
                else{
                    flag_hobbies=false;
                    bailar = ".";}
                break;
            case R.id.cNadar:
                if (checked){
                    nadar = "Nadar";
                flag_hobbies=true;}
                else{
                    flag_hobbies=false;
                    nadar = ".";}
                break;
            case R.id.cCine:
                if (checked){
                    cine = "Cine";
                flag_hobbies=true;}
                else{
                    flag_hobbies=false;
                    cine = ".";}
                break;
            case R.id.cCorrer:
                if (checked){
                    correr = "Correr";
                flag_hobbies=true;}
                else{
                    flag_hobbies=false;
                    correr = ".";}
                break;
        }
    }
}
