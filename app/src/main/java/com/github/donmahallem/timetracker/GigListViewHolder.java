package com.github.donmahallem.timetracker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GigListViewHolder extends LayoutViewHolder {

    public final TextView txtTitle;
    public GigListViewHolder( @NonNull ViewGroup parent) {
        super(parent, R.layout.lv_gig_list_item);
        this.txtTitle=super.itemView.findViewById(R.id.txt_title);
    }
}
