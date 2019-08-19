package com.example.alertdialog02072019;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnAlertDialog;
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
//        10A1 , 10A2 , 10A3
//        11A1 ,11A2 ,11A3
        Sinhvien sinhvien = new Sinhvien("Nguyen Van A",WeekDay.MONDAY);
        sinhvien.setNgayhoc(WeekDay.SUNDAY);
        Log.d("BBB",sinhvien.getNgayhoc().toString());
        btnAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Hộp thoại xác nhận");
                builder.setMessage("Bạn muốn tắt app hay không");
                builder.setIcon(R.mipmap.ic_launcher);
                builder.setCancelable(false);
                builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                builder.setNeutralButton("Hủy", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                builder.show();
            }
        });
    }
}
