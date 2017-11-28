package com.guillen.gamarrapp.servicios;

import java.util.List;

import com.guillen.gamarrapp.model.ResponseMessage;
import com.guillen.gamarrapp.model.Tienda;
import com.guillen.gamarrapp.model.Usuario;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ApiService {

    String API_BASE_URL = "https://gamarra-rest-krobawsky.c9users.io";
    
  //Usuarios
    @GET("api/v1/usuarioall")
    Call<List<Usuario>> getUsuarios();
    
    @FormUrlEncoded
    @POST("/api/v1/usuario")
    Call<ResponseMessage> createUsuario(@Field("nombre") String nombre,
                                        @Field("dni") String dni,
                                        @Field("email") String email,
                                        @Field("password") String password);

    @GET("api/v1/login/user/{email}/pwd/{password}")
    Call<Usuario> validate(@Path("email") String email,
                                       @Path("password") String password); 

}