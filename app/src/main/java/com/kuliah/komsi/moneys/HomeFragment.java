package com.kuliah.komsi.moneys;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import static android.os.Looper.prepare;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener{
    private RecyclerViewAdapter rvTransaksi;
    private ArrayList<Transaksi> list = new ArrayList<>();

    //Daftar Kategori
    private String[] Kategori = {"Makanan", "Transportasi", "Pendidikan", "Kesehatan", "Bisnis"};
    //Daftar Kategori
    private String[] Biaya = {"20000", "10000", "300000", "50000", "100000"};
    //Daftar Kategori
    private String[] Tanggal = {"5", "6", "7", "8", "9"};

    Button btnTambah;
    /*View v;
    private RecyclerView myrecyclerview;
    private List<Transaksi> listTransaksi;*/

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();

        View view_home = inflater.inflate(R.layout.fragment_home, container, false);
        setHasOptionsMenu(true);
        RecyclerView recyclerView = view_home.findViewById(R.id.rv_transaksi);
        //DaftarItem();



        // Inflate the layout for this fragment
        /*rvTransaksi = getView().findViewById(R.id.rv_transaksi);
        rvTransaksi.setHasFixedSize(true);*/

        /*list.addAll(TransaksiData.getListData());
        showRecyclerList();*/

        /*v = inflater.inflate(R.layout.fragment_home, container, false);
        myrecyclerview = v.findViewById(R.id.rv_transaksi);
        RecyclerViewAdapter recyclerAdapter = new RecyclerViewAdapter(listTransaksi);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerAdapter);*/
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    /*private void DaftarItem() {
        int count = 0;
        for (String kategori : Kategori){
//            {"Makanan1","20000","3"},
            list.add(new Transaksi(Kategori, Biaya, Tanggal[count]));
            count++;
        }
    }*/

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*listTransaksi = new ArrayList<>();*/

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btnTambah = view.findViewById(R.id.add_transaction);
        btnTambah.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent mIntent = new Intent(getActivity(), TambahTransaksi.class);
        startActivity(mIntent);
    }

    /*private void showRecyclerList(){
        rvTransaksi.setLayoutManager(new LinearLayoutManager(getContext()));
        ListTransaksiAdapter listTransaksiAdapter = new ListTransaksiAdapter(list);
        rvTransaksi.setAdapter(listTransaksiAdapter);
   }*/


}
