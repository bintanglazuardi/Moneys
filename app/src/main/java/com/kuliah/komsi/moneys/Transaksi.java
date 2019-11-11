package com.kuliah.komsi.moneys;

import android.os.Parcel;
import android.os.Parcelable;

public class Transaksi {
    private String tanggal;
    private String kategori;
    private String biaya;

    Transaksi(String Kategori, String Biaya, String Tanggal){
        this.kategori = Kategori;
        this.biaya = Biaya;
        this.tanggal = Tanggal;

    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getBiaya() {
        return biaya;
    }

    public void setBiaya(String biaya) {
        this.biaya = biaya;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags){
        dest.writeString(this.tanggal);
        dest.writeString(this.kategori);
        dest.writeString(this.biaya);
    }

    Transaksi(){

    }

    private Transaksi(Parcel in){
        this.tanggal = in.readString();
        this.kategori = in.readString();
        this.biaya = in.readString();
    }

    public static final Parcelable.Creator<Transaksi> CREATOR = new Parcelable.Creator<Transaksi>() {
        @Override
        public Transaksi createFromParcel(Parcel source) {
            return new Transaksi(source);
        }
        @Override
        public Transaksi[] newArray(int size) {
            return new Transaksi[size];
        }
    };
}
