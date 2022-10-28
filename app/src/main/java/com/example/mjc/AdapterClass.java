package com.example.mjc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.ViewHolder> {
    Context context;
    List<ModelClass> modelClassList;

    public AdapterClass(Context context, List<ModelClass> modelClassList) {
        this.context = context;
        this.modelClassList = modelClassList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == 0) {
            View root = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_recyclerview, parent, false);

            return new ViewHolder(root);

        } else if (viewType == 1) {
            View root = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_recycler_low, parent, false);

            return new ViewHolder(root);

        } else {
            View root = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_recycler_medium, parent, false);

            return new ViewHolder(root);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.mobilenumber.setText(modelClassList.get(position).getMobilenumber());
        holder.address.setText(modelClassList.get(position).getAddress());
        holder.pincode.setText(modelClassList.get(position).getPincode());
        holder.postelcode.setText(modelClassList.get(position).getPostel());
        holder.startdate.setText(modelClassList.get(position).getStartdate());
        holder.enddate.setText(modelClassList.get(position).getEnddate());
        holder.content.setText(modelClassList.get(position).getContent());
    }

    @Override
    public int getItemViewType(int position) {
        return position % 3;
    }

    @Override
    public int getItemCount() {
        return modelClassList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView mobilenumber, address, pincode, postelcode, startdate, enddate, content;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            mobilenumber = itemView.findViewById(R.id.mobilenumberrecycler);
            address = itemView.findViewById(R.id.locationId);
            pincode = itemView.findViewById(R.id.pincode);
            postelcode = itemView.findViewById(R.id.postelcode);
            startdate = itemView.findViewById(R.id.startdate);
            enddate = itemView.findViewById(R.id.enddate);
            content = itemView.findViewById(R.id.contentdata);

        }
    }
}

