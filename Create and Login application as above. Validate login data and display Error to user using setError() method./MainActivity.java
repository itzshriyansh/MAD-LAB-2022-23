package com.example.mocp7;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    EditText e1, e2;
    Button b1;
    String username, password;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.editText1);
        e2 = (EditText) findViewById(R.id.editText2);
        b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                username = e1.getText().toString();
                password = e2.getText().toString();
                if (e1.getText().length() > 3) {
                    if (e2.getText().length() > 3) {
                        Toast.makeText(getApplicationContext(), "Login success",
                                Toast.LENGTH_SHORT).show();
                    } else {
                        e2.setError("Password Mininum length is 4");
                    }
                } else {
                    e1.setError("Name Mininum length is 4");
                }
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
