package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText userEdittext = findViewById(R.id.user_edit_text);
        EditText passwordEdittext = findViewById(R.id.password_edit_text);
        String inputuser = userEdittext.getText().toString();
        String inputpass = passwordEdittext.getText().toString();
        check auth = new check(inputuser,inputpass);


}
}
