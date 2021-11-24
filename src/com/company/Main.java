package com.company;

public class Main {

    public static void main(String[] args) {
        //
        Computer b = new ComputerBuilder().
                setId(11).
                setManufacturer("Lenovo").
                getComputer();
        //
        ComputerBuilder computerBuilder = new ComputerBuilder();
        computerBuilder.setId(000);
        computerBuilder.setName("Thinkpad");
        Computer c = computerBuilder.getComputer();
        System.out.println(b.getId());

    }
}
