package d.osvaldo.myformulario;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bfecha;
    EditText efecha;
    private int dia, mes, agno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bfecha = (Button) findViewById(R.id.bFecha);
        efecha = (EditText) findViewById(R.id.eFecha);
        bfecha.setOnClickListener(this);

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
                    efecha.setText(i +" - "+ (i1+1)+" - "+i2);
                }
            }, dia, mes, agno);
            datePickerDialog.show();

        }
    }
}
