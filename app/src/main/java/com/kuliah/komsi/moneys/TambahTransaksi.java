package com.kuliah.komsi.moneys;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TambahTransaksi extends AppCompatActivity implements View.OnClickListener{
    Button btnSimpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_transaksi);
        //getSupportActionBar().hide();
        //getSupportActionBar().setDisplayShowTitleEnabled(false);
        TambahTransaksi.this.setTitle("Tambah Transaksi");

        btnSimpan = findViewById(R.id.simpan_transaksi);
        btnSimpan.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

    }

    public void simpanTransaksi(View view) {
        Toast.makeText(this,"Hello", Toast.LENGTH_SHORT ).show();
        Intent mIntent = new Intent(TambahTransaksi.this, HomeFragment.class);
        startActivity(mIntent);
        finish();
    }

    public void scanNota(View view) {
        Intent scanPage = new Intent(TambahTransaksi.this, ScanNota.class);
        startActivity(scanPage);
    }
}
