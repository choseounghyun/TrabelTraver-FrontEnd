package com.example.traveltracer.Member.Service;

import com.example.traveltracer.Member.Data.LoginData;
import com.example.traveltracer.Member.Data.SignUpdata;
import com.example.traveltracer.Member.Response.CommonResponse;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface MemberService {

    @POST("/signUp")
    Call<CommonResponse> userSignUp(@Body SignUpdata signUpdata);

    @GET("/check/{userId}")
    Call<CommonResponse> checkIdExist(@Path("userId") String userId);

    @FormUrlEncoded
    @POST("/login")
    Call<LoginData> login(@FieldMap HashMap<String, String> param);
}
