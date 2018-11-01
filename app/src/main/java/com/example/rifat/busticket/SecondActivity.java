package com.example.rifat.busticket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void onClickBtn1(View view) {
        Intent intent = new Intent(SecondActivity.this, ShowAll.class);
        intent.putExtra("key","1");
        startActivity(intent);

    }
    public void onClickBtn2(View view) {
        Intent intent = new Intent(SecondActivity.this, ShowAll.class);
        intent.putExtra("key","2");
        startActivity(intent);

    }
    public void onClickBtn3(View view) {
        Intent intent = new Intent(SecondActivity.this, ShowAll.class);
        intent.putExtra("key","3");
        startActivity(intent);

    }
    public void onClickBtn4(View view) {
        Intent intent = new Intent(SecondActivity.this, ShowAll.class);
        intent.putExtra("key","4");
        startActivity(intent);

    }
     public void onClickBtn5(View view) {
        Intent intent = new Intent(SecondActivity.this, ShowAll.class);
        intent.putExtra("key","5");
        startActivity(intent);

    }
    public void onClickBtn6(View view) {
        Intent intent = new Intent(SecondActivity.this, ShowAll.class);
        intent.putExtra("key","6");
        startActivity(intent);

    }
    public void onClickBtn7(View view) {
        Intent intent = new Intent(SecondActivity.this, ShowAll.class);
        intent.putExtra("key","7");
        startActivity(intent);

    }
    public void onClickBtn8(View view) {
        Intent intent = new Intent(SecondActivity.this, ShowAll.class);
        intent.putExtra("key","8");
        startActivity(intent);

    }
    public void onClickBtn9(View view) {
        Intent intent = new Intent(SecondActivity.this, ShowAll.class);
        intent.putExtra("key","9");
        startActivity(intent);

    }
    public void onClickBtn10(View view) {
        Intent intent = new Intent(SecondActivity.this, ShowAll.class);
        intent.putExtra("key","10");
        startActivity(intent);

    }

}
