package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Age extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.age);


        Button cal = (Button) findViewById(R.id.agebtn);
        final TextView res1 = (TextView) findViewById(R.id.ageview);
        final EditText age = (EditText) findViewById(R.id.ageField);
        final EditText cage = (EditText) findViewById(R.id.crushageField);

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res1.setText("");
                Editable n = age.getText();
                Editable ca = cage.getText();
                if ((n.toString().trim().length() == 0) || (ca.toString().trim().length() == 0)) {
                    Toast.makeText(Age.this, "Vui lòng không bỏ trống!", Toast.LENGTH_LONG).show();
                } else {
                    String so1 = age.getText().toString();
                    int year1 = Integer.parseInt(so1);

                    String so2 = cage.getText().toString();
                    int year2 = Integer.parseInt(so2);

                    int hieu1 = year2 - year1;
                    int hieu2 = year1 - year2;

                    if (hieu1 == 4 || hieu1 == 2 || hieu1 == 8 || hieu2 == 4 || hieu2 == 2 || hieu2 == 8) {
                        res1.setText("Xin chúc mừng! Tuổi của 2 bạn rất hợp nhau");
                    }
                    if (hieu1 == 3 || hieu1 == 5 || hieu1 == 7 || hieu1 == 9 || hieu2 == 3 || hieu2 == 5 || hieu2 == 7 || hieu2 == 9) {
                        res1.setText("Thật tiếc! Tuổi của 2 bạn không hợp nhau!");
                    }
                    if (hieu1 == 1 || hieu1 == 6 || hieu2 == 1 || hieu2 == 6) {
                        res1.setText("Tuổi của 2 bạn khá hợp nhau! Hãy cùng cố gắng nhé!");
                    }
                    if (hieu1 >= 10 || hieu2 >= 10) {
                        res1.setText("Khoảng cách tuổi là khá lớn! Nhưng cuộc sống lại rất bình yên, đừng ngại ngùng khoảng cách tuổi tác nhé!");
                    }
                }

            }
        });
    }
}
