package com.example.dondetocamibanda2;

import retrofit2.Call;
import retrofit2.http.GET;

public interface BandsApi {
    // metodos para hacer las peticiones a las paginas web
    @GET("/events")
    // siempre buscamos en VLC
    Call<EventData> loadEventData();
}
