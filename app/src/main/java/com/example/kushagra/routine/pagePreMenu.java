package com.example.kushagra.routine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pagePreMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_pre_menu);

        Button button1 = (Button) this.findViewById(R.id.btn_1_p);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(pagePreMenu.this, page1Pre.class);
                startActivity(i1);
            }
        });

        Button button2 = (Button) this.findViewById(R.id.btn_6_p);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(pagePreMenu.this, page6Pre.class);
                startActivity(i2);
            }
        });
    }
}
