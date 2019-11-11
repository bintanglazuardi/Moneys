package com.kuliah.komsi.moneys;

import java.util.ArrayList;

public class TransaksiData {
    public static String[][] data = new String[][]{
            {"Makanan1","20000","3"},
            {"Makanan2","30000","3"},
            {"Makanan3","40000","4"},
            {"Makanan4","50000","4"},
            {"Makanan5","60000","5"},
            {"Makanan1","20000","3"},
            {"Makanan2","30000","3"},
            {"Makanan3","40000","4"},
            {"Makanan4","50000","4"},
            {"Makanan5","60000","5"}
    };
    public static ArrayList<Transaksi> getListData(){
        ArrayList<Transaksi> list = new ArrayList<>();
        for (String[] aData : data){
            Transaksi transaksi = new Transaksi();
            transaksi.setTanggal(aData[0]);
            transaksi.setTanggal(aData[0]);
            transaksi.setTanggal(aData[0]);
            list.add(transaksi);
        }
     return list;
    }
}
