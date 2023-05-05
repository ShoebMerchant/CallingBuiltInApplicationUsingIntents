package com.example.callingbuiltinapplicationusingintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnWeb, btnCall, btnMap,btnContact;
    int request_Code = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        btnWeb = (Button) findViewById(R.id.btnWeb);
//        btnWeb.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.com"));
//                startActivity(i);
//            }
//        });
//
//        btnCall = (Button) findViewById(R.id.btnCall);
//        btnCall.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(
//                        Intent.ACTION_DIAL,
//                        Uri.parse("tel:+919561463128"));
//                startActivity(i);
//            }
//        });
//
//        btnMap = (Button) findViewById(R.id.btnMap);
//        btnMap.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(
//                        Intent.ACTION_VIEW,
//                        Uri.parse("geo:37.827500,-122.481670"));
//                startActivity(i);
//            }
//        });



//        Button btnActivity2 = findViewById(R.id.btnActivity2);
//        btnActivity2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(MainActivity.this, Activity2.class);
//                startActivity(i);
//            }
//        });
    }

    public void operations(View view) {
        Button btn = (Button) view;
        if(btn.getId()==R.id.btnActivity2){
            startActivity(new Intent(MainActivity.this,Activity2.class));
        }
        if(btn.getId()==R.id.btnContact){
            Intent i = new Intent(Intent.ACTION_PICK);
            i.setType(ContactsContract.Contacts.CONTENT_TYPE);
            startActivityForResult(i, request_Code);
        }
        if(btn.getId()==R.id.btnMap){
            Intent i = new Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("geo:37.827500,-122.481670"));
            startActivity(i);
        }
        if(btn.getId()==R.id.btnCall){
            Intent i = new Intent(
                    Intent.ACTION_DIAL,
                    Uri.parse("tel:+919561463128"));
            startActivity(i);
        }
        if(btn.getId()==R.id.btnWeb){
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.com"));
            startActivity(i);
        }
    }
}