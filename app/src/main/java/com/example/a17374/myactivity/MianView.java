package com.example.a17374.myactivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MianView extends AppCompatActivity {
    Button login;
    Button register;
    EditText addres;
    EditText passwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mian_view);
                login = findViewById(R.id.btn_login);
                register = findViewById(R.id.btn_register);
                addres = findViewById(R.id.edtTxt_addres);
                passwd = findViewById(R.id.edtTxt_passwd);
                register.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), Register.class);
                        startActivity(intent);
                    }
                });
                login.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        SharedPreferences sp = getApplication().getSharedPreferences("data", 0);
                        String adress_1 = sp.getString("addres", null);
                        String passwd_1 = sp.getString("passwd", null);
                        String addres_2 = String.valueOf(addres.getText().toString().trim());
                        String passwd_2 = String.valueOf(passwd.getText().toString().trim());
                        if(addres_2.isEmpty()&&passwd_2.isEmpty()){
                            Toast.makeText(MianView.this, "账号or密码不能为空", Toast.LENGTH_LONG).show();

                        }
                        else  if (addres_2.equals(adress_1) && passwd_2.equals(passwd_1)) {
                            Toast.makeText(MianView.this, "登录成功", Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(getApplicationContext(), NewsActivity.class);
                            startActivity(intent);
                        }
                        else {
                            Toast.makeText(MianView.this, "密码or账号错误", Toast.LENGTH_LONG).show();
                        }
                    }
                });


    }
}
