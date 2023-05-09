package com.diky.appmovie.data.api

import com.diky.appmovie.data.model.ListResponse
import com.diky.appmovie.data.model.MovieResponse
import com.diky.appmovie.data.model.TvShowResponse
import retrofit2.Call
import retrofit2.http.GET
import com.diky.appmovie.utils.API_KEY

interface ApiService {

    @GET("movie/now_playing?api_key=$API_KEY")
    fun getMovies(): Call<ListResponse<MovieResponse>>

    @GET("tv/airing_today?api_key=$API_KEY")
    fun getTvShow(): Call<ListResponse<TvShowResponse>>

}