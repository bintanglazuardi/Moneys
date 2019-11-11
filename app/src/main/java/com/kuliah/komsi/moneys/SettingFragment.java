package com.kuliah.komsi.moneys;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SettingFragment extends Fragment implements View.OnClickListener {
    ImageView profileImage;
    TextView namaUser, saldoUser;
    Button btnEdit;
    public static final String EXTRA_NAMA = "NAMA";
    public static final String EXTRA_SALDO = "SALDO";
    private String nama, saldo;
//    public static final int TEXT_REQUEST = 1;


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public SettingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_setting, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        profileImage = view.findViewById(R.id.profil_image);
        namaUser = view.findViewById(R.id.nama_user);
        saldoUser = view.findViewById(R.id.saldo_user);
        btnEdit = view.findViewById(R.id.btn_edit);
        btnEdit.setOnClickListener(this);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (savedInstanceState != null){
            String textNama = savedInstanceState.getString(EXTRA_NAMA);
            setNama(textNama);
            String textSaldo = savedInstanceState.getString(EXTRA_SALDO);
            setSaldo(textSaldo);
        }
        if (getArguments() != null){
            String gantiNama = getArguments().getString(EXTRA_NAMA);
            String gantiSaldo = getArguments().getString(EXTRA_SALDO);
            namaUser.setText(gantiNama);
            saldoUser.setText(gantiSaldo);
        }
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);


    }

    @Override
    public void onClick(View view) {
        Intent mIntent = new Intent(getActivity(), EditDompet.class);
        startActivity(mIntent);
    }
}
