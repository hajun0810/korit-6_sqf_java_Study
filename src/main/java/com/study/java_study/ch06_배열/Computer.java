package com.study.java_study.ch06_배열;

public class Computer {
    private String cpu;
    private String ram;

    public Computer(String ram, String cpu) {
        this.ram = ram;
        this.cpu = cpu;
    }

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

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }
}
