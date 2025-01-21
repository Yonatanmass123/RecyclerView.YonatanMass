package com.example.recyclerviewyonatanmass;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

  int [] mData;
  Context mContext;
    public MyAdapter(Context context, int [] data)
  {
      this.mContext = context;
      this.mData = data;
  }
    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_layout, parent, false);
        return  new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int i) {
        holder.tv.setText(i);
    }

    @Override
    public int getItemCount() {
        return this.mData.length;
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            this.tv = itemView.findViewById(R.id.itemTv);
        }
    }
}
