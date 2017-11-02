package com.patterns.patterns.builder.models;

public class Camara {

    private String opticalZoom;
    private String digitalZoom;
    private String displaySize;
    private String inMemorySize;

    public String getOpticalZoom() {
        return opticalZoom;
    }

    public void setOpticalZoom(String opticalZoom) {
        this.opticalZoom = opticalZoom;
    }

    public String getDigitalZoom() {
        return digitalZoom;
    }

    public void setDigitalZoom(String digitalZoom) {
        this.digitalZoom = digitalZoom;
    }

    public String getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(String displaySize) {
        this.displaySize = displaySize;
    }

    public String getInMemorySize() {
        return inMemorySize;
    }

    public void setInMemorySize(String inMemorySize) {
        this.inMemorySize = inMemorySize;
    }

    @Override
    public String toString() {
        return "Camara{" +
                "opticalZoom='" + opticalZoom + '\'' +
                ", digitalZoom='" + digitalZoom + '\'' +
                ", displaySize='" + displaySize + '\'' +
                ", inMemorySize='" + inMemorySize + '\'' +
                '}';
    }
}
