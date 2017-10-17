package com.example.kushagra.routine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pageBoardMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_board_menu);

        Button button1 = (Button) this.findViewById(R.id.btn_cmp_b);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(pageBoardMenu.this,pageCmpBoard.class);
                startActivity(i1);
            }
        });
    }
}
