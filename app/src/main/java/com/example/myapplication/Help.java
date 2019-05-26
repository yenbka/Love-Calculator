package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.BreakIterator;

public class Help extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);
        TextView mytextview;
        mytextview = findViewById(R.id.helpview);
        String htmlcontent =
               "<h4><font color= \"#FFFDFD\">Chào mừng đến với ứng dụng Love Calculator!</font></h4>"
                + "<p><font color=\"#9AF665\">App là \"thầy bói\" công nghệ của bạn. Chỉ với 1 \"cú chạm\" bạn có thể biết được bạn và người ấy có hợp nhau hay không?" +
                       "Bạn có thể xem bói theo: </font></p>"
                       +"<p><font color=\"#9AF665\">1. Xem bói theo tên</font></p>"
                +"<p><font color=\"#9AF665\">2. Xem bói theo tuổi</font></p>"
                +"<p><font color=\"#9AF665\">Cách xem:</font></p>" +
                       "<p><font color=\"#9AF665\">1. Chọn Tab \"Bói Tên\" nếu muốn xem theo tên hoặc \"Bói Tuổi\" nếu muốn xem theo tuổi </font></p>" +
                       "<p><font color=\"#9AF665\">2. Nhập Tên/Tuổi của bạn và người ấy</font></p>" +
                       "<p><font color=\"#9AF665\">3. Chạm vào button \"Xem kết quả\"</font></p>"
                +"<p><font color=\"#FAFA03\">&copy; 2019 Sản phẩm của Yến và Nga</font><p>";

       mytextview.setText(android.text.Html.fromHtml(htmlcontent));
    }
}
