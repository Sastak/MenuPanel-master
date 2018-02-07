package com.kgeccse.app.menupanel;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class NoticeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);

        /*String url="https://www.makemytrip.com/";
        WebView web = (WebView)findViewById(R.id.WebView);
        web.loadUrl(url);*/
         /* public void loadWebPage(View view){

        Intent intent = new Intent(MainActivity.this, NoticeActivity.class);
        startActivity(intent);

    }*/





    }

    public  void active(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://kgec.edu.in/notice/Administrative/"));
        startActivity(browserIntent);
    }
    public  void active1(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://kgec.edu.in/notice/Placement/"));
        startActivity(browserIntent);
    }
    public  void active2(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://kgec.edu.in/notice/Academic/"));
        startActivity(browserIntent);
    }
    public  void active3(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://kgec.edu.in/notice/Academic/"));
        startActivity(browserIntent);
    }
    public  void active4(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://kgec.edu.in/notice/Others/"));
        startActivity(browserIntent);
    }





}

