package com.example.john.testrecycleyview.service;

import com.example.john.testrecycleyview.Tools.Url;
import com.example.john.testrecycleyview.entity.SouSuoEntity;
import com.example.john.testrecycleyview.entity.SouSuoResultEntity;

import java.security.Key;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by Administrator on 16-1-15.
 */
public interface SouSuoService {

   @GET("/v3/app/android/phone/search/hotkeywords")
   Call<SouSuoEntity> getHotKeyList();

   /*type :  recommand , rslist+quary(q)*/
   @GET("/v3/app/android/phone/search/{type}")
   Call<SouSuoResultEntity> getRecommandList(@Path("type") String type, @Query("inputSearch") String inputSearch, @Query("page")int page);



}




















