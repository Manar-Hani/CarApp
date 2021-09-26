package com.manar.carsapp.Adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.CarHoldler> {
    @NonNull
    @Override
    public CarHoldler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CarHoldler holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class CarHoldler extends RecyclerView.ViewHolder {
        public CarHoldler(@NonNull View itemView) {
            super(itemView);
        }
    }
}
