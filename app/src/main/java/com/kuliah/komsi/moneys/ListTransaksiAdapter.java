/*
package com.kuliah.komsi.moneys;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListTransaksiAdapter extends RecyclerView.Adapter<ListTransaksiAdapter.ListViewHolder> {
    private ArrayList<Transaksi> listTransaksi;
    public ListTransaksiAdapter(ArrayList<Transaksi> list){
        this.listTransaksi = list;
    }

    @NonNull
    @Override
    public ListTransaksiAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_transaksi, viewGroup, false);
        return new ListViewHolder(view);
    }

@Override
    public void onBindViewHolder(@NonNull ListTransaksiAdapter.ListViewHolder holder, int position) {

    }


    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Transaksi transaksi = listTransaksi.get(position);
        holder.tvTanggal.setText(transaksi.getTanggal());
        holder.tvKategori.setText(transaksi.getKategori());
        holder.tvBiaya.setText(transaksi.getBiaya());
    }

    @Override
    public int getItemCount() {
        return listTransaksi.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView tvTanggal, tvKategori, tvBiaya;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTanggal = itemView.findViewById(R.id.txt_tanggal);
            tvKategori = itemView.findViewById(R.id.txt_kategori);
            tvBiaya = itemView.findViewById(R.id.txt_biaya);

        }
    }
}
*/
