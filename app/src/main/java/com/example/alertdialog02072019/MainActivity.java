package com.example.alertdialog02072019;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btnAlertDialog;
    int position = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAlertDialog = findViewById(R.id.buttonShowDialog);

//        Nhanvien nhanvien = new NhanvienBuilder()
//                            .setTen("Nguyen Van A")
//                            .setDiachi("38 nguyen lam")
//                            .builder();
//        Log.d("BBB",nhanvien.getDiachi() + "");
        //enum
//        10A1 , 10A2 , 10A3
//        11A1 ,11A2 ,11A3
//        Sinhvien sinhvien = new Sinhvien("Nguyen Van A",WeekDay.MONDAY);
//        sinhvien.setNgayhoc(WeekDay.SUNDAY);
//        Log.d("BBB",sinhvien.getNgayhoc().toString());
        btnAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                position = -1;
                final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Hộp thoại xác nhận");

                builder.setIcon(R.mipmap.ic_launcher);
                builder.setCancelable(false);

                final String[] mangtenconvat ={"Mèo","Chó","Hưu","Chim","Sóc"};

                builder.setSingleChoiceItems(mangtenconvat, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        position = i;
                    }
                });
                builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (position <= -1){
                            Toast.makeText(MainActivity.this, "Bạn hay chọn 1 con vật", Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(MainActivity.this, mangtenconvat[position], Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                builder.show();
            }
        });
    }
}
