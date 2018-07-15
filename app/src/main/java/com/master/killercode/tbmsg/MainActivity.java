package com.master.killercode.tbmsg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.master.killercode.toolbox_msg.Toasted;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toasted.makeTextInfo(MainActivity.this , "frase" , Toasted.DURATION_LONG , Toasted.ICON_SHOW_ALL);
                Toasted.makeTextCustom(MainActivity.this,
                        "frase",
                        Toasted.DURATION_LONG,
                        Toasted.GRAVITY_CENTER,
                        Toasted.TYPE_SUCCESS,
                        Toasted.TEXT_GRAVITY_RIGHT,
                        Toasted.ICON_SHOW_LEFT);
            }
        });


    }
}
