package com.example.rifat.busticket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);





}

    public void onClickBtn1(View view) {

        Intent intent = new Intent(ThirdActivity.this, ShowLong.class);
        intent.putExtra("key","1");
        startActivity(intent);
    }
    public void onClickBtn2(View view) {
        Intent intent = new Intent(ThirdActivity.this, ShowLong.class);
        intent.putExtra("key","2");
        startActivity(intent);

    }
    public void onClickBtn3(View view) {
        Intent intent = new Intent(ThirdActivity.this, ShowLong.class);
        intent.putExtra("key","3");
        startActivity(intent);

    }
    public void onClickBtn4(View view) {
        Intent intent = new Intent(ThirdActivity.this, ShowLong.class);
        intent.putExtra("key","4");
        startActivity(intent);

    }
    public void onClickBtn5(View view) {
        Intent intent = new Intent(ThirdActivity.this, ShowLong.class);
        intent.putExtra("key","5");
        startActivity(intent);

    }






}
