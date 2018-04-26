package com.example.alunos.combancodedados;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {
     ImageView addUsua;
     ImageView usua;

     TextView txt_addUsua;
     TextView txt_usua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        addUsua = (ImageView) findViewById(R.id.imageView);
        usua = (ImageView) findViewById(R.id.imageView2);
    }
    public void btnClickMoreUsers(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void btnClickUser(View v){
        Intent i = new Intent(this, UserActivity.class );
        startActivity(i);
    }

}
