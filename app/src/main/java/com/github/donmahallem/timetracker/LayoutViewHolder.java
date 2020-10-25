package com.github.donmahallem.timetracker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LayoutViewHolder extends RecyclerView.ViewHolder {

    public LayoutViewHolder( @NonNull ViewGroup parent,@LayoutRes int layoutResource) {
        super(LayoutInflater.from(parent.getContext()).inflate(layoutResource,parent,false));
    }
}
