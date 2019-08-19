package com.example.alertdialog02072019;

public class Sinhvien {
    private String ten;
    private WeekDay ngayhoc;

    public Sinhvien(String ten, WeekDay ngayhoc) {
        this.ten = ten;
        this.ngayhoc = ngayhoc;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public WeekDay getNgayhoc() {
        return ngayhoc;
    }

    public void setNgayhoc(WeekDay ngayhoc) {
        this.ngayhoc = ngayhoc;
    }
}
