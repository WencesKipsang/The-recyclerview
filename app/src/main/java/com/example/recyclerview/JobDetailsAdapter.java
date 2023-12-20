package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class JobDetailsAdapter extends RecyclerView.Adapter<JobDetailsAdapter.ViewHolder>{
    private List<JobDetails> jobDetailsList;

    public JobDetailsAdapter(List<JobDetails> jobDetailsList) {
        this.jobDetailsList = jobDetailsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the item layout and create the ViewHolder
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_job_details, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Bind the data to
}
