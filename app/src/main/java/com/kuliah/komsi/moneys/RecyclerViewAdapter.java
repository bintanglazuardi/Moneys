package com.kuliah.komsi.moneys;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mContext;
    List<Transaksi> mData;

    public RecyclerViewAdapter(List<Transaksi> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_transaksi, parent, false);
        MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_tanggal.setText(mData.get(position).getTanggal());
        holder.tv_kategori.setText(mData.get(position).getKategori());
        holder.tv_biaya.setText(mData.get(position).getBiaya());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class  MyViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_tanggal;
        private TextView tv_kategori;
        private TextView tv_biaya;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_tanggal = (TextView) itemView.findViewById(R.id.txt_tanggal);
            tv_kategori = (TextView) itemView.findViewById(R.id.txt_kategori);
            tv_biaya = (TextView) itemView.findViewById(R.id.txt_biaya);
        }
    }
}
