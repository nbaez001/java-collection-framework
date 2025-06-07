package com.empresa.proyecto.additional.generics;

public class CollectionDemo2 {
    public static void main(String[] args) {
        Bin<String, Integer> bin = new Bin<>();
        bin.setDryTrash("aswsasas");
        bin.setWetTrash(1234567);
        System.out.println("Dry Trash: " + bin.getDryTrash() + " Wet Trash: " + bin.getWetTrash());
    }
}

class Bin<D, W> {
    private D dryTrash;
    private W wetTrash;
    public D getDryTrash() {
        return dryTrash;
    }
    public W getWetTrash() {
        return wetTrash;
    }
    public void setWetTrash(W wetTrash) {
        this.wetTrash = wetTrash;
    }
    public void setDryTrash(D dryTrash) {
        this.dryTrash = dryTrash;
    }
}
