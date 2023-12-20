package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        private void fetchData(){
            // Create Retrofit instance
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("http://127.0.0.1:8000/") // Replace with your API base URL
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            // Create ApiService instance
            ApiService apiService = retrofit.create(ApiService.class);

            // Make API call
            Call<ApiResponse> call = apiService.getApiResponse();
            call.enqueue(new Callback<ApiResponse>() {
                @Override
                public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {
                    if (response.isSuccessful()) {
                        ApiResponse apiResponse = response.body();
                        if (apiResponse != null) {
                            // Handle the API response data
                            List<JobDetails> jobDetailsList = apiResponse.getJob_details();
                            // Pass the jobDetailsList to your RecyclerView adapter and update the UI
                        }
                    } else {
                        // Handle unsuccessful response
                        // ...
                    }
                }

                @Override
                public void onFailure(Call<ApiResponse> call, Throwable t) {
                    // Handle network failure
                    // ...
                }
            });
        }


}