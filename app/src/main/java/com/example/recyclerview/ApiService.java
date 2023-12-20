package com.example.recyclerview;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("jobTitle/1/")
    Call<ApiResponse> getApiResponse();
}
