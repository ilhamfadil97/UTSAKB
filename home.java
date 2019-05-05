package com.example.mysimpleapp;


import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



/**
 * Created on 2/05/2019
 * Nama : Ilham fadil azmi
 * Nim : 10116906
 *Kelas : IF-14K
 *
 */





public class home extends AppCompatActivity {
    private ViewPager viewPager;
    private SlideAdapter myadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        myadapter = new SlideAdapter(this);
        viewPager.setAdapter(myadapter);
    }

    public void Skip (View view){
        Intent intent = new Intent(home.this, Menu.class);
        startActivity(intent);


    }


}
