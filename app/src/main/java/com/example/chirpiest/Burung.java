package com.example.chirpiest;

import android.os.Parcel;
import android.os.Parcelable;

public class Burung implements Parcelable {
    private String name;
    private int photo;

    public Burung() {

    }
    protected Burung(Parcel in) {
        name = in.readString();
        photo = in.readInt();
    }

    public static final Creator<Burung> CREATOR = new Creator<Burung>() {
        @Override
        public Burung createFromParcel(Parcel in) {
            return new Burung(in);
        }

        @Override
        public Burung[] newArray(int size) {
            return new Burung[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeInt(photo);
    }
}
