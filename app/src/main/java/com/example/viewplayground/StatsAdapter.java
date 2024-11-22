package com.example.viewplayground;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class StatsAdapter extends RecyclerView.Adapter<StatsAdapter.ViewHolder> {

    public StatsAdapter() {
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textViewCalc;

        public ViewHolder(View itemView) {
            super(itemView);
            this.textViewCalc = itemView.findViewById(R.id.textViewCalc);
        }
    }

    @Override
    public StatsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.stats_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textViewCalc.setText(
                position + " x " + position + "\n" + position + " x " + position + "\n" + position + " x " + position
        );
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return 9;
    }

}
