package com.example.doancnpm;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        TextView tV_sign_up = findViewById(R.id.tV_sign_up);

        SpannableString spannableString = new SpannableString("Don't have an Account? SIGN UP");
        //Thiết lập màu chữ
        ForegroundColorSpan colorSpan = new ForegroundColorSpan(Color.BLUE);
        spannableString.setSpan(colorSpan, 23, 30, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        //Thiết lập gạch chân
        UnderlineSpan underlineSpan = new UnderlineSpan();
        spannableString.setSpan(underlineSpan, 23, 30, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        //Thiết lập sự kiện click
        ClickableSpan click_sign_up = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Toast.makeText(getApplicationContext(), "Sign Up clicked", Toast.LENGTH_SHORT).show();
            }
        };
        spannableString.setSpan(click_sign_up, 23, 30, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        tV_sign_up.setMovementMethod(LinkMovementMethod.getInstance());
        tV_sign_up.setText(spannableString);

    }
}