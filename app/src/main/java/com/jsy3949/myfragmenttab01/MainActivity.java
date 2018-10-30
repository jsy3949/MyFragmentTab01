package com.jsy3949.myfragmenttab01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout button1 = (LinearLayout) findViewById(R.id.button1);
        LinearLayout button2 = (LinearLayout) findViewById(R.id.button2);
        LinearLayout button3 = (LinearLayout) findViewById(R.id.button3);
        LinearLayout button4 = (LinearLayout) findViewById(R.id.button4);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /*해당버튼 클릭시 바로 표현*/
                //getFragmentManager().beginTransaction().replace(R.id.main_frame,new MyFragment1()).commit();
                //getFragmentManager().beginTransaction().setCustomAnimations(R.animator.click_anim, R.animator.unclick_anim).replace(R.id.main_frame,new MyFragment1()).commit();
                //.setCustomAnimations(입력되는 화면의 애니메이션, 사라지는 화면의 애니메이션)
                getFragmentManager().beginTransaction().setCustomAnimations(R.animator.click_anim2, R.animator.unclick_anim2).replace(R.id.main_frame,new MyFragment1()).commit();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //getFragmentManager().beginTransaction().replace(R.id.main_frame,new MyFragment2()).commit();
                //getFragmentManager().beginTransaction().setCustomAnimations(R.animator.click_anim, R.animator.unclick_anim).replace(R.id.main_frame,new MyFragment2()).commit();
                getFragmentManager().beginTransaction().setCustomAnimations(R.animator.click_anim2, R.animator.unclick_anim2).replace(R.id.main_frame,new MyFragment2()).commit();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //getFragmentManager().beginTransaction().replace(R.id.main_frame,new MyFragment3()).commit();
               // getFragmentManager().beginTransaction().setCustomAnimations(R.animator.click_anim, R.animator.unclick_anim).replace(R.id.main_frame,new MyFragment3()).commit();
                getFragmentManager().beginTransaction().setCustomAnimations(R.animator.click_anim2, R.animator.unclick_anim2).replace(R.id.main_frame,new MyFragment3()).commit();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //getFragmentManager().beginTransaction().replace(R.id.main_frame,new MyFragment4()).commit();
                //getFragmentManager().beginTransaction().setCustomAnimations(R.animator.click_anim, R.animator.unclick_anim).replace(R.id.main_frame,new MyFragment4()).commit();
                getFragmentManager().beginTransaction().setCustomAnimations(R.animator.click_anim2, R.animator.unclick_anim2).replace(R.id.main_frame,new MyFragment4()).commit();
            }
        });


    }
}
