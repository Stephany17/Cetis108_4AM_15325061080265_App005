package mx.edu.cetis108.cetis108_4am_15325061080265_app005;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class ArchivoActivity extends AppCompatActivity {

    String tipo="";
    Button guardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_archivo);

        guardar=(Button)findViewById(R.id.btnGuardar);
        Bundle bundle =  this.getIntent().getExtras();
        tipo = bundle.getString("tipo");

        if (tipo.equals("agregar")){
            guardar.setText("Agregar nota");

        }
    }
}
