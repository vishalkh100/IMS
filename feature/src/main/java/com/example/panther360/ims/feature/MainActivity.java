package com.example.panther360.ims.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    protected Button login;
    private EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login=findViewById(R.id.btnlogin);
        username=findViewById(R.id.txtuser);
        password=findViewById(R.id.txtpass);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();

            }
        });
    }

    public void login(){
        String user=username.getText().toString().trim();
        String pass=password.getText().toString().trim();
        if(user.equals("vishalkh100")&& pass.equals("12345"))
        {
            Intent intent = new Intent(MainActivity.this, DeviceListActivity.class);
            startActivity(intent);
            Toast.makeText(this,"Username and password match!",Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this,"Username and password do not match!", Toast.LENGTH_LONG).show();
        }
    }
}
