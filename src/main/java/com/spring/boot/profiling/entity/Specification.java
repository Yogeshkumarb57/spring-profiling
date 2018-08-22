package com.spring.boot.profiling.entity;

public class Specification {
    private String ram;
    private String cpu;
    private String storage;

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public Specification(){}

    public Specification(String ram, String cpu, String storage) {
        this.ram = ram;
        this.cpu = cpu;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Specification{" +
                "ram='" + ram + '\'' +
                ", cpu='" + cpu + '\'' +
                ", storage='" + storage + '\'' +
                '}';
    }
}
