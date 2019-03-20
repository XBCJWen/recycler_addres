package com.example.a17374.myactivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
        EditText addres,passwd;
        Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        addres=findViewById(R.id.edtTxt_addres);
        passwd=findViewById(R.id.edtTxt_passwd);
        register=findViewById(R.id.btn_register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String addres_1=String.valueOf(addres.getText().toString().trim());
                String passwd_1=String.valueOf(addres.getText().toString().trim());

                if (addres_1.isEmpty()&&passwd_1.isEmpty()) {
                    Toast.makeText(Register.this, "注册的密码or账号不能为空", Toast.LENGTH_LONG).show();

                }
                else{
                        SharedPreferences sp = getApplication().getSharedPreferences("data", 0);
                        SharedPreferences.Editor edit = sp.edit();
                        edit.putString("addres", String.valueOf(addres.getText().toString().trim()));
                        edit.putString("passwd", String.valueOf(passwd.getText().toString().trim()));
                        edit.commit();
                        Toast.makeText(Register.this, "注册成功", Toast.LENGTH_LONG).show();
                        finish();
                    }
            }
        });
    }
}
