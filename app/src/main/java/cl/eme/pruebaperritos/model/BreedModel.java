package cl.eme.pruebaperritos.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import cl.eme.pruebaperritos.data.Api;
import cl.eme.pruebaperritos.data.RetrofitClient;
import cl.eme.pruebaperritos.presenter.IPresenterModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BreedModel implements InterfaceModel {

    IPresenterModel iPresenterModel;

    public BreedModel(IPresenterModel iPresenterModel) {
        this.iPresenterModel = iPresenterModel;
    }

    @Override
    public void loadBreeds() {
        Api servicio = RetrofitClient.getRetrofitInstance().create(Api.class);
        Call<ListadoDeRazas> listCall = servicio.listaRazas();
        List<String> list = new ArrayList<>();
        listCall.enqueue(new Callback<ListadoDeRazas>() {
            @Override
            public void onResponse(Call<ListadoDeRazas> call, Response<ListadoDeRazas> response) {
                ListadoDeRazas breedList = response.body();
                Map<String, List<String>> map = breedList.getMessage();
                for (String key : map.keySet()) {
                    if (map.get(key).isEmpty()) {
                        list.add(key);
                    } else {
                        for (String subBreed : map.get(key)) {
                            list.add(key + " " + subBreed);
                        }
                        iPresenterModel.notificar(list);
                    }
                }
            }


            @Override
            public void onFailure(Call<ListadoDeRazas> call, Throwable t) {
            }
        });
    }
             @Override
             public void loadImages(String raza, String subRaza) {

    }
}

