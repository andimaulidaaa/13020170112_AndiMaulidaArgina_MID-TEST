package com.Maulida.project4.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.Maulida.project4.R;
import com.Maulida.project4.helper.MoviesRecyclerViewHolder;
import com.Maulida.project4.model.Movies;
import com.Maulida.project4.view.Detail;
import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class MovieRecyclerAdapter extends RecyclerView.Adapter<MoviesRecyclerViewHolder> {
    private Context context;
    private List<Movies> list = new ArrayList<>();
    private GridLayoutManager gridLayoutManager;
    private View view;

    public void init(Context context, GridLayoutManager gridLayoutManager){
        this.context = context;
        this.gridLayoutManager = gridLayoutManager;
    }

    public void setData(List<Movies> list){
        this.list = list;
    }

    @Override
    public int getItemViewType(int position) {
        int spanCount = gridLayoutManager.getSpanCount();
        if (spanCount == 1){
            return 1;
        }else {
            return 2;
        }
    }

    @NonNull
    @Override
    public MoviesRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == 1){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_mode, parent, false);
        }else{
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_mode, parent, false);
        }
        MoviesRecyclerViewHolder vh = new MoviesRecyclerViewHolder(view, viewType);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull final MoviesRecyclerViewHolder holder, int position) {
        Glide.with(context)
                .load(list.get(position).getImgUrl())
                .into(holder.image);

        if (holder.getItemViewType() == 1){
            holder.detail.setText(list.get(position).getDetail());
            holder.title.setText(list.get(position).getTitle());
            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(context, Detail.class);
                    i.putExtra("position", holder.getAdapterPosition());
                    context.startActivity(i);
                }
            });
            holder.btn_hapus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    list.remove(holder.getAdapterPosition());
                    notifyItemRemoved(holder.getAdapterPosition());
                }
            });
        }else{
            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context.getApplicationContext(),holder.title.getText().toString(),Toast.LENGTH_SHORT).show();
                }
            });
            holder.title.setText(list.get(position).getTitle());
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
