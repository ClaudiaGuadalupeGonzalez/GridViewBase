package cggg.mx.edu.tesoem.itics.gridviewbase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gvdatos;
    contenido contenido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gvdatos = findViewById(R.id.gvcontenedor);

        ArrayList<String> arreglo = new ArrayList<>();
        arreglo.add("Fernando");
        arreglo.add("francisco");
        arreglo.add("saul");
        arreglo.add("Guadalupe");
        arreglo.add("Guzman");
        arreglo.add("armando");
        arreglo.add("diana");
        arreglo.add("pancho");
        arreglo.add("mariana");
        arreglo.add("leslie");
        arreglo.add("yesica");
        arreglo.add("ian");

        contenido = new contenido(this,arreglo);
        gvdatos.setAdapter(contenido);
    }
}
