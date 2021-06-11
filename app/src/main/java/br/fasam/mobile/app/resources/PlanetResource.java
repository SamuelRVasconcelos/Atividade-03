package br.fasam.mobile.app.resources;

import java.util.List;

import br.fasam.mobile.app.model.DefaultModel;
import br.fasam.mobile.app.model.Planet;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * 4. Criar contrato (interface) que terá as operações(métodos) que irá interagir com a API
 * (POST,GET,PUT,DELETE,OPTIONS -->>Http)
 */
public interface PlanetResource {

    @GET("api/planets")
    Call<List<DefaultModel>> get();

    @GET("api/planets/{id}")
    Call<DefaultModel> get(@Path("id") int id);
}
