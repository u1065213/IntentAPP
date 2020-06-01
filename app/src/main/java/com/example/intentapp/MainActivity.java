package com.example.intentapp;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SearchEvent;
import android.view.View;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnOK(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        switch (view.getId()){
            case R.id.button:
                intent.setData(Uri.parse("mailto:u1065204@hk.edu.tw"));
                intent.putExtra(Intent.EXTRA_SUBJECT,"嗨");
                intent.putExtra(Intent.EXTRA_TEXT,"你好");
                break;
            case R.id.button2:
                intent.setData(Uri.parse("https://www.hk.edu.tw/main.php"));
                break;
            case R.id.button3:
                intent.setData(Uri.parse("geo:23.8584022,120.9102202"));
                break;
            case R.id.button4:
                intent.setAction(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY,"弘光科技大學");
                break;

        }
        startActivity(intent);
    }
}
