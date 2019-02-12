package com.example.dondetocamibanda2;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import android.util.Log;

public class Controller implements Callback<EventData> {
    ServerResponse handler;
    // es el controlador para el retrofit
    // que las clases sean indep,
    //no queremos acceder desde controller a todos los metodos de main , solo ls de interface
    public Controller(ServerResponse handler) {//maneja las respuestas para este cont
        this.handler=handler;
    }


    // con CTRL +O implementamos las dos por defecto

    static final String BASE_URL = "rest.bandsintown.com/artists/";// mayus por ser CTE

    public void start() {
        // genera un nuevo obj gson
        Gson gson = new GsonBuilder()
                .setLenient()//si no cumple del to do la especificacion que lo intente leer
                .create();
        // instancia de retrofit y siempre seran igual!!
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))//con que vamos a convertir
                //podemos utilizar MossyConverterFactory, etc,
                .build();

        BandsApi gerritAPI = retrofit.create(BandsApi.class);// nuestro retrofit ya genera dicha
        //class
        //Call<List<Weather>> call = gerritAPI.loadWeather("status:open");// status si le pasaramos
        //algo en loadweather
        Call<EventData> call = gerritAPI.loadEventData();
        call.enqueue(this);
    }

    @Override
    public void onResponse(Call<EventData> call, Response<EventData> response) {
        if(response.isSuccessful()) {
            EventData eventData = response.body();
            handler.onResponse(eventData);//ya tenemos el bandsintown en el mainactiivity

            //Log.d("controller",bandsintown.getTitle());
            //changesList.forEach(change -> System.out.println(change.subject));
        } else {
            Log.d("controller",response.errorBody().toString());
        }
    }
    @Override
    public void onFailure(Call<EventData> call, Throwable t) {
        t.printStackTrace();

    }
    // genero una interface con 1 2 metodos para que el main actitvity impemente esa itnerface y sea
    //oblig que lleve el metodo que podnremos abaj
    public interface ServerResponse{
        // si la interfaz es publica los metodos tambien!
        void onResponse(EventData eventData);
        void onResponseFailed(String response);//solo devuelve el error
        void onFailure(String message);

    }


}



