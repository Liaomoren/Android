package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    private RadioGroup radioGroup;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p58);
        EditText Name = findViewById(R.id.p58Name);
        EditText Email = findViewById(R.id.p58Email);
        EditText Password = findViewById(R.id.p58Password);
        //设置密码为密文
        Password.setTransformationMethod(PasswordTransformationMethod.getInstance());
        RadioGroup Sex = findViewById(R.id.Sex);
        Sex.setOnCheckedChangeListener(this);
        Button ButSubmit = findViewById(R.id.Submit);
        ButSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //将用户信息打印给后台（存入数据库）
                System.out.println("名字:" + Name.getText().toString());
                System.out.println("邮箱:" + Email.getText().toString());
                System.out.println("密码:" + Password.getText().toString());
                //提示
                Toast.makeText(MainActivity.this,"提交成功",Toast.LENGTH_LONG).show();
            }
        });
        CheckBox Sing = findViewById(R.id.p58Sing);
        CheckBox Dance = findViewById(R.id.p58Dance);
        CheckBox Read = findViewById(R.id.p58Read);
        CheckBox Run = findViewById(R.id.p58Run);
        Sing.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    System.out.println("兴趣选择了唱歌");
                }else {
                    System.out.println("兴趣取消了唱歌");
                }
            }
        });

        Dance.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    System.out.println("兴趣选择了跳舞");
                }else {
                    System.out.println("兴趣取消了跳舞");
                }
            }
        });

        Read.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    System.out.println("兴趣选择了读书");
                }else {
                    System.out.println("兴趣取消了读书");
                }
            }
        });

        Run.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    System.out.println("兴趣选择了跑步");
                }else {
                    System.out.println("兴趣取消了跑步");
                }
            }
        });

    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        if(i == R.id.SexB){
            System.out.println("男");
        } else{
            System.out.println("女");
        }

    }
}