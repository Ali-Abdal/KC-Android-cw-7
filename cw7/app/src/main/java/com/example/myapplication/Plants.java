package com.example.myapplication;

public class Plants {
    private String plantName;
    private int plantPhoto;
    private double plantPrice;
    private String plantType;

    public Plants(String plantName, int plantPhoto, double plantPrice, String plantType) {
        this.plantName = plantName;
        this.plantPhoto = plantPhoto;
        this.plantPrice = plantPrice;
        this.plantType = plantType;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    public int getPlantPhoto() {
        return plantPhoto;
    }

    public void setPlantPhoto(int plantPhoto) {
        this.plantPhoto = plantPhoto;
    }

    public double getPlantPrice() {
        return plantPrice;
    }

    public void setPlantPrice(double plantPrice) {
        this.plantPrice = plantPrice;
    }

    public String getPlantType() {
        return plantType;
    }

    public void setPlantType(String plantType) {
        this.plantType = plantType;
    }
}
