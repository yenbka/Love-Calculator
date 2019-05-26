package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Name extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.name);


        Button cal = (Button) findViewById(R.id.resbtn);
        final TextView res = (TextView) findViewById(R.id.resview);
        final TextView res1 = (TextView) findViewById(R.id.resview1);
        final EditText name = (EditText) findViewById(R.id.nameField);
        final EditText cname = (EditText) findViewById(R.id.crushnameField);

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText("");
                res1.setText("");
                Editable n = name.getText();
                Editable cn = cname.getText();
                String concat = String.valueOf(n).concat(String.valueOf(cn)).toUpperCase();
                if ((n.toString().trim().length() == 0) || (cn.toString().trim().length() == 0)) {
                    Toast.makeText(Name.this, "Vui lòng không bỏ trống!", Toast.LENGTH_LONG).show();
                } else {
                    int sum = 0;
                    for (int i = 0; i < concat.length(); i++) {
                        char character = concat.charAt(i);
                        int ascii = (int) character;
                        sum += ascii;
                    }
                    res.setText("Phần trăm tình duyên giữa " + n + " và " + cn + " là " + sum % 100 + "%");
                    if(sum % 100 > 80){
                        res1.setText("Xin chúc mừng! Tên của 2 bạn sinh ra là dành cho nhau rồi! Còn chần chờ gì nữa mà không tỏ tình ngay thôi nào!");
                    }
                    if(sum % 100 < 50){
                        res1.setText("Thật tiếc! Duyên lỡ mất rồi! Hãy tiếp tục tìm một nửa của mình nào!");
                    }
                    if(50 <= sum % 100 && sum % 100 <= 80){
                        res1.setText("Hai bạn khá hợp nhau! Hãy cùng cố gắng nhé!");
                    }

                }
            }
        });
    }
}