package mx.edu.cetis108.cetis108_4am_15325061080265_app005;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final int Agregar = Menu.FIRST;
    private static final int Borrar = Menu.FIRST + 1;
    private static final int Existente = Menu.FIRST + 2;

    ListView Archivo;
    Archivo DB;
    List<String> item = null;
    String getTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         Archivo=(ListView)findViewById(R.id.lstArchivo);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        menu.add(1,Agregar,0,R.string.crear);
        menu.add(2,Borrar,0,R.string.borrar_todas_las_notas);
        menu.add(3,Existente,0,R.string.salir);
        super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id){
            case Agregar:
                nota("agregar");
                return true;
            case Borrar:

                return true;
            case Existente:
              finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void nota(String nota){
        String tipo = "";
        String contenido = "";

        if(nota.equals("agregar")){
            tipo = "agregar";
            Intent intent = new Intent(this, ArchivoActivity.class);
            intent.putExtra("tipo",tipo);
            startActivity(intent);
        }
    }
}
