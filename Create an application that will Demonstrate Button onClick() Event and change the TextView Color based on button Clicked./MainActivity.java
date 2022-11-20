package com.webbrowser;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
    Button btn;
    TextView t1;

 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState); 
 setContentView(R.layout.activity_main);
 btn=(Button)findViewById(R.id.btn1);
 btn.setOnClickListener(this);
 t1 =(TextView)findViewById(R.id.textView1) 
 }

    public void onClick(View arg0) {
        t1.setTextColor(Color.RED);
    }
}
