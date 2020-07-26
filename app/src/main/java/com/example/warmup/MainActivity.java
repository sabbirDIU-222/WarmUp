package com.example.warmup;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.icu.text.UnicodeSetSpanner;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12;
    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        inOne();

    }


    public void inOne(){
        bt1 = findViewById(R.id.first);
        bt2 = findViewById(R.id.second);
        bt3 = findViewById(R.id.third);
        bt4 = findViewById(R.id.fourth);
        bt5 = findViewById(R.id.fifth);
        bt6 = findViewById(R.id.six);
        bt7 = findViewById(R.id.seventh);
        bt8 = findViewById(R.id.eaight);
        bt9 = findViewById(R.id.ninth);
        bt10 = findViewById(R.id.ten);
        bt11 = findViewById(R.id.eleven);
        bt12 = findViewById(R.id.twelve);


        // add listener


        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
        bt9.setOnClickListener(this);
        bt10.setOnClickListener(this);
        bt11.setOnClickListener(this);
        bt12.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        try {

            switch (v.getId()){
                case R.id.first:
                    fragment = new FirstFragment();
                    getFragmentManager().beginTransaction().
                            replace(R.id.fragmentId,fragment).commit();
                    break;

                case R.id.second:
                    fragment = new SecondFragment();
                    getFragmentManager().beginTransaction().
                            replace(R.id.fragmentId,fragment).commit();
                    break;


                case R.id.third:
                    fragment = new ThirdFragment();
                    getFragmentManager().beginTransaction().
                            replace(R.id.fragmentId,fragment).commit();
                    break;


                case R.id.fourth:
                    fragment = new FourthFragment();
                    getFragmentManager().beginTransaction().
                            replace(R.id.fragmentId,fragment).commit();
                    break;

                case R.id.fifth:
                    fragment = new FifthFragment();
                    getFragmentManager().beginTransaction().
                            replace(R.id.fragmentId,fragment).commit();
                    break;


                case R.id.six:
                    fragment = new SixFragment();
                    getFragmentManager().beginTransaction().
                            replace(R.id.fragmentId,fragment).commit();
                    break;



                case R.id.seventh:
                    fragment = new SevenFragment();
                    getFragmentManager().beginTransaction().
                            replace(R.id.fragmentId,fragment).commit();
                    break;


                case R.id.eaight:
                    fragment = new EaightFragment();
                    getFragmentManager().beginTransaction().
                            replace(R.id.fragmentId,fragment).commit();
                    break;

                case R.id.ninth:
                    fragment = new NineFragment();
                    getFragmentManager().beginTransaction().
                            replace(R.id.fragmentId,fragment).commit();
                    break;
                case R.id.ten:
                    fragment = new TenkFragment();
                    getFragmentManager().beginTransaction().
                            replace(R.id.fragmentId,fragment).commit();
                    break;
                case R.id.eleven:
                    fragment = new ElevenFragment();
                    getFragmentManager().beginTransaction().
                            replace(R.id.fragmentId,fragment).commit();
                    break;
                case R.id.twelve:
                    fragment = new TwelveFragment();
                    getFragmentManager().beginTransaction().
                            replace(R.id.fragmentId,fragment).commit();
                    break;


                default:
                    Toast.makeText(getApplicationContext(),"Nothing", Toast.LENGTH_SHORT).show();
                    break;


            }

        }catch (Exception e){

            Toast.makeText(getApplicationContext(),"Nothing", Toast.LENGTH_SHORT).show();

        }

    }
}
