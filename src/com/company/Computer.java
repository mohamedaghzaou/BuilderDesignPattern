package com.company;

public class Computer {

    private long id;
    private String name;
    private String model;
    private String version;
    private String manufacturer;

    public Computer() {
    }

    public Computer(long id, String name, String model, String version, String manufacturer) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.version = version;
        this.manufacturer = manufacturer;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
