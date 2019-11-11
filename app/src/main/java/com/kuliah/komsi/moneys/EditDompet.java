package com.kuliah.komsi.moneys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EditDompet extends AppCompatActivity implements View.OnClickListener{
    TextView nama, saldo;
    public static final String EXTRA_NAMA = "NAMA";
    public static final String EXTRA_SALDO = "SALDO";
    EditText mNama, mSaldo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_dompet);
        //getSupportActionBar().hide();
        //getSupportActionBar().setDisplayShowTitleEnabled(false);
        EditDompet.this.setTitle("Edit Dompet");

        mNama = findViewById(R.id.nama_dompet);
        mSaldo = findViewById(R.id.jumlah_saldo);

//        Intent intent = getIntent();
        /*String nama1 = intent.getStringExtra(MainActivity.ExtraData);
        String saldo1 = intent.getStringExtra(MainActivity.ExtraData);*/
    }

    public void simpanPerubahan(View view) {
        String sNama = mNama.getText().toString();
        String sSaldo = mSaldo.getText().toString();
        Intent saveNama = new Intent(EditDompet.this, SettingFragment.class).putExtra(EXTRA_NAMA, sNama);
        Intent saveSaldo = new Intent(EditDompet.this, SettingFragment.class).putExtra(EXTRA_SALDO, sSaldo);
//        saveIntent.putExtra(EXTRA_SALDO, sSaldo);
        setResult(RESULT_OK, saveNama);
        setResult(RESULT_OK, saveSaldo);
        finish();

    }

    @Override
    public void onClick(View view) {

    }
}
