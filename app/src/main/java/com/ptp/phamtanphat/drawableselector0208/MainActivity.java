package com.ptp.phamtanphat.drawableselector0208;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        1- DrawableShape(Mau sac , hinh dang , pha mau , vien):
            -Ung dung de dieu chinh ve hinh dang va mau sac cho cac view
            -Khong co cac drawable con o ben trong
        2- Drawable-layerlist(Chen hoac long hinh anh(mau sac) vao nhau):
            -Nhung hinh anh hay mau sac neu nhu khai bao cuoi cung thi no se de len nhung thang o phia tren
            -Khai bao cap the bitmap ben trong neu nhu muon su dung ve hinh anh cho layerlist
        3- Drawable-Selector(Cac hanh dong khi nguoi dung tuong tac):
            -Khai bao 1 gia tri mac dinh(Hinh anh , mau sac) va gia tri nay nam o cuoi cung(Neu khong co gia tri nay thi khi run view no se bi mat background)
        4-Drawable-Clip(Cat nho hinh anh):
            -Tuong tac voi ham clipdrawable(java) de lay gia tri cho viec setlevel cho hinh anh
        5-Drawable Inset(Thu nho tam hinh ):
            -Bop cac vi tri(top , left ,right ,bottom) cua tam hinh cho nho lai
}
