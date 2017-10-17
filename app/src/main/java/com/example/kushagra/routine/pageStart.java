package com.example.kushagra.routine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pageStart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_start);

        Button button1 = (Button) this.findViewById(R.id.btn_board);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iboard = new Intent(pageStart.this, pageBoardMenu.class);
                startActivity(iboard);
            }
        });


        Button button2 = (Button) this.findViewById(R.id.btn_pre);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ipre = new Intent(pageStart.this, pagePreMenu.class);
                startActivity(ipre);
            }
        });
    }
}
