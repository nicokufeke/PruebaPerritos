package cl.eme.pruebaperritos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import cl.eme.pruebaperritos.databinding.ActivityMainBinding;
import cl.eme.pruebaperritos.presenter.Presenter;

/*
Parte I: Modelo de la Aplicación.
1.-
[ ] Creación del modelo de la aplicación. Al final de este documento se adjunta el diagrama del modelo.
[ ] Crear los POJOS necesarios para recibir la información de la API.
[ ] Crear los POJOS necesarios para subir la colección de favoritos a Firestore (raza,url, timeStamp).
Observación: obtener el TimeStamp en formato String.
2. [ ] Crear item_list_XXX.xml que correspondan a cada elemento a mostrar.
3. [ ] Crear los Fragmentos necesarios: [ ] Listado de Razas, [ ] Detalles y [ ] Listado de Favoritos (opcional).
4. [ ] Mostrar en un fragmento el RecyclerView con el listado de razas.
5. [ ] Mostrar en un fragmento el RecyclerView con el listado de fotos de la raza seleccionada.
6. [ ] Crear los adapters que serán necesarios para transformar los distintos DataSet.

Parte II: Consumo y muestra de la información.
1. [ ] Crear el Cliente Retrofit y la interface necesaria para la conexión.
2. [ ] Realizar la conexión a la API.
3. [ ] Crear el presentador que servirá para conectar la vista con el modelo. Se necesita más de un presentador.
4. [ ] Implementar los métodos en las vistas correspondientes.
5. [ ] Instanciar los adapters donde sea necesario y pasar los dataSets que necesite cada uno de ellos.

Parte III: Guardar favoritos usando Firestore
1. [ ] Implementar la funcionalidad para que al hacer un clik largo a una foto, este lleve los datos a Firestore.
2. [ ] Mostrar el detalle de los favoritos en un Fragmento de detalles (Opcional).

 */

public class MainActivity extends AppCompatActivity {

public ActivityMainBinding binding;
private Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}