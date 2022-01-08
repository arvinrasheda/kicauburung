package com.example.chirpiest;

import java.util.ArrayList;

public class BurungData {
    private static String[] arrName = {
            "Murai Batu",
            "Cucak Hijau",
            "Cucak Rowo",
            "Kacer",
            "Pleci",
//            "Anis Merah",
//            "Lovebird",
//            "Jalak Suren",
//            "Kolibri",
//            "Canary",
//            "Ciblek",
//            "Hwa Mei",
    };

    private static int[] images = {
            R.drawable.muraibatu,
            R.drawable.cucakhijau,
            R.drawable.cucakrowo,
            R.drawable.kacer,
            R.drawable.pleci,

    };

    public static ArrayList<Burung> getListData() {
        ArrayList<Burung> list = new ArrayList<>();
        for (int position = 0; position < arrName.length ; position++) {
            Burung burung = new Burung();
            burung.setName(arrName[position]);
            burung.setPhoto(images[position]);
            list.add(burung);
        }
        return list;
    }


}
