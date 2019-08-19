package com.example.alertdialog02072019;

public class NhanvienBuilder implements Builder{
    private String ten;
    private String diachi;

    @Override
    public NhanvienBuilder setTen(String ten) {
        this.ten = ten;
        return this;
    }

    @Override
    public NhanvienBuilder setDiachi(String diachi) {
        this.diachi = diachi;
        return this;
    }

    public Nhanvien builder(){
        return  new Nhanvien(ten,diachi);
    }
}
