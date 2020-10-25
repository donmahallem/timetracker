package com.github.donmahallem.timetracker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class GigListAdapter extends RecyclerView.Adapter<GigListViewHolder> {
    private final String[] mDataset;

    // Provide a suitable constructor (depends on the kind of dataset)
    public GigListAdapter(String[] myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public GigListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new GigListViewHolder(parent);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(GigListViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.txtTitle.setText(mDataset[position]);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}