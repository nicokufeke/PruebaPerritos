package cl.eme.pruebaperritos.model;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    @GET("dog-api/")
    Call<Perritos> getPerritos();






}
