package com.company;

public class ComputerBuilder {

    private long id;
    private String name;
    private String model;
    private String version;
    private String manufacturer;

    public long getId() {
        return id;
    }

    public ComputerBuilder setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ComputerBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public String getModel() {
        return model;
    }

    public ComputerBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public ComputerBuilder setVersion(String version) {
        this.version = version;
        return this;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public ComputerBuilder setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public Computer getComputer(){
        return  new Computer(id, name , model ,version, manufacturer);
    }
}
