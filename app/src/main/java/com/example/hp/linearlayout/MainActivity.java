package com.example.hp.linearlayout;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private RadioButton rbRed, rbGreen, rdBlue;
    private Button btnSetColor, btnCancel, btnClear;
    private TextView tvBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        rbRed= (RadioButton) findViewById(R.id.rb_red);
        rdBlue= (RadioButton) findViewById(R.id.rb_blue);
        rbGreen= (RadioButton) findViewById(R.id.rb_green);
        btnSetColor= (Button) findViewById(R.id.btn_set_color);
        btnCancel= (Button) findViewById(R.id.btn_cancel);
        btnClear= (Button) findViewById(R.id.btn_clear);
        tvBackground= (TextView) findViewById(R.id.tv_background);

        btnSetColor.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
        btnClear.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_set_color:
                if (rbRed.isChecked()) {
                    tvBackground.setBackgroundResource(R.color.colorRed);
                }else if (rbGreen.isChecked()) {
                    tvBackground.setBackgroundResource(R.color.colorGreen);
                }else if (rdBlue.isChecked()) {
                    tvBackground.setBackgroundResource(R.color.colorBlue);
                }
                break;
            case R.id.btn_cancel:
                break;
            case R.id.btn_clear:
                tvBackground.setBackgroundColor(Color.BLACK);
                break;
            default:
                break;
        }
    }
}
