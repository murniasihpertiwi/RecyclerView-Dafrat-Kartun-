package com.example.daftarkartun;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListKartunAdapter extends RecyclerView.Adapter<ListKartunAdapter.ListViewHolder> {
    private ArrayList<Kartun> listKartun;

    public ListKartunAdapter(ArrayList<Kartun> list) {
        this.listKartun = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_kartun, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Kartun kartun = listKartun.get(position);
        Glide.with(holder.itemView.getContext())
                .load(kartun.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(kartun.getName());
        holder.tvDetail.setText(kartun.getDetail());

    }

    @Override
    public int getItemCount() {
        return listKartun.size();
    }


    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        ListViewHolder(View itemview) {
            super(itemview);
            imgPhoto =  itemview.findViewById(R.id.img_item_kartun);
            tvName =  itemview.findViewById(R.id.tv_item_name);
            tvDetail =  itemview.findViewById(R.id.tv_detail);
        }
    }
}
