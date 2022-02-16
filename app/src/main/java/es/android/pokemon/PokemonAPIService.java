package es.android.pokemon;

import es.android.pokemon.PokemonFetchResults;
import retrofit2.Call;
import retrofit2.http.GET;
public interface PokemonAPIService {
    @GET("pokemon/?limit=50")
    Call<PokemonFetchResults> getPokemons();
    @GET("pokemon/{id}")
    Call<PokemonFetchResults> getDetails();
}
