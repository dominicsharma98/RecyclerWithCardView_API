package com.example.akash.recyclerwithcardview;

public class person {



    String name;
    String info;
    int photoID;

    public person(String name, String info, int photoID) {
        this.name = name;
        this.info = info;
        this.photoID = photoID;
    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getPhotoID() {
        return photoID;
    }

    public void setPhotoID(int photoID) {
        this.photoID = photoID;
    }
}
