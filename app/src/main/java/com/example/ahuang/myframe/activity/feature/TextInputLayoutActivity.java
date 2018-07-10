package com.example.ahuang.myframe.activity.feature;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ahuang.myframe.R;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TextInputLayoutActivity extends AppCompatActivity {

    @BindView(R.id.et_username)
    EditText mEtUsername;
    @BindView(R.id.tl_username)
    TextInputLayout mTlUsername;
    @BindView(R.id.et_password)
    EditText mEtPassword;
    @BindView(R.id.tl_password)
    TextInputLayout mTlPassword;
    @BindView(R.id.bt_login)
    Button mBtLogin;

    private static final String EMAIL_PATTERN =  "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
    private Pattern mPattern=Pattern.compile(EMAIL_PATTERN);
    private Matcher matcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_input_layout);
        ButterKnife.bind(this);
        mBtLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hideKeyboard();
                login();
            }
        });
    }


    private void login(){
        String username=mTlUsername.getEditText().getText().toString().trim();
        String password=mTlPassword.getEditText().getText().toString().trim();
        if (!validateUserName(username)){
            mTlUsername.setErrorEnabled(true);
            mTlUsername.setError("请输入正确的邮箱地址");
        }else if (!validatePassword(password)){
            mTlPassword.setErrorEnabled(true);
            mTlPassword.setError("密码字数过少");
        }else {
            mTlUsername.setErrorEnabled(false);
            mTlPassword.setErrorEnabled(false);
            Toast.makeText(TextInputLayoutActivity.this,"登陆成功",Toast.LENGTH_SHORT).show();
        }
    }

    private void hideKeyboard() {
        View view = getCurrentFocus();
        if (view != null) {
            ((InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE)).
                    hideSoftInputFromWindow(view.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        }
    }

    private boolean validatePassword(String password){
        return password.length() > 6;
    }

    private boolean validateUserName(String username){
        matcher=mPattern.matcher(username);
        return matcher.matches();
    }



}
