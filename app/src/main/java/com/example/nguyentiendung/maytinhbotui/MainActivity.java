package com.example.nguyentiendung.maytinhbotui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edit_input;
    TextView tvResult;

    Button btnNumber1;
    Button btnNumber2;
    Button btnNumber3;
    Button btnNumber4;
    Button btnNumber5;
    Button btnNumber6;
    Button btnNumber7;
    Button btnNumber8;
    Button btnNumber9;
    Button btnNumber0;

    Button btnCong;
    Button btnTru;
    Button btnNhan;
    Button btnChia;
    Button btnPoint;
    Button btnResult;
    Button btnClear;
    Button BtnClearAll;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWiget();
        setEventOnClick();
    }

    public void initWiget() {
        btnNumber0 = (Button) findViewById(R.id.btnNumber0);
        btnNumber1 = (Button) findViewById(R.id.btnNumber1);
        btnNumber2 = (Button) findViewById(R.id.btnNumber2);
        btnNumber3 = (Button) findViewById(R.id.btnNumber3);
        btnNumber4 = (Button) findViewById(R.id.btnNumber4);
        btnNumber5 = (Button) findViewById(R.id.btnNumber5);
        btnNumber6 = (Button) findViewById(R.id.btnNumber6);
        btnNumber7 = (Button) findViewById(R.id.btnNumber7);
        btnNumber8 = (Button) findViewById(R.id.btnNumber8);
        btnNumber9 = (Button) findViewById(R.id.btnNumber9);
        btnCong = (Button) findViewById(R.id.btnCong);
        btnTru = (Button) findViewById(R.id.btnTru);
        btnNhan = (Button) findViewById(R.id.btnNhan);
        btnChia = (Button) findViewById(R.id.btnChia);
        btnPoint = (Button) findViewById(R.id.btnPoint);
        btnResult = (Button) findViewById(R.id.btnResult);
        btnClear = (Button) findViewById(R.id.btnClear);
        BtnClearAll = (Button) findViewById(R.id.btnClearAll);
        edit_input = (EditText) findViewById(R.id.edit_input);
        tvResult = (TextView) findViewById(R.id.tv_result);


    }

    public void setEventOnClick() {
        btnNumber0.setOnClickListener(this);
        btnNumber1.setOnClickListener(this);
        btnNumber2.setOnClickListener(this);
        btnNumber3.setOnClickListener(this);
        btnNumber4.setOnClickListener(this);
        btnNumber5.setOnClickListener(this);
        btnNumber6.setOnClickListener(this);
        btnNumber7.setOnClickListener(this);
        btnNumber8.setOnClickListener(this);
        btnNumber9.setOnClickListener(this);
        btnNumber0.setOnClickListener(this);

        btnCong.setOnClickListener(this);
        btnTru.setOnClickListener(this);
        btnNhan.setOnClickListener(this);
        btnChia.setOnClickListener(this);

        btnPoint.setOnClickListener(this);
        btnResult.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        BtnClearAll.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnNumber0:
                //noi chuoi
                edit_input.append("0");
                break;
            case R.id.btnNumber1:
                edit_input.append("1");
                break;
            case R.id.btnNumber2:
                edit_input.append("2");
                break;
            case R.id.btnNumber3:
                edit_input.append("3");
                break;
            case R.id.btnNumber4:
                edit_input.append("4");
                break;
            case R.id.btnNumber5:
                edit_input.append("55");
                break;
            case R.id.btnNumber6:
                edit_input.append("6");
                break;
            case R.id.btnNumber7:
                edit_input.append("7");
                break;
            case R.id.btnNumber8:
                edit_input.append("8");
                break;
            case R.id.btnNumber9:
                edit_input.append("9");
                break;
            case R.id.btnCong:
                edit_input.append("+");
                break;
            case R.id.btnTru:
                edit_input.append("-");
                break;
            case R.id.btnNhan:
                edit_input.append("X");
                break;
            case R.id.btnChia:
                edit_input.append("/");
                break;
            case R.id.btnPoint:
                edit_input.append(".");
                break;
            case R.id.btnClear:
                //xóa kí tự tại vị trí con trỏ
                BaseInputConnection textInputConnection =new BaseInputConnection(edit_input,true);
                textInputConnection.sendKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN,KeyEvent.KEYCODE_DEL));
//              String xoa=Delete(edit_input.getText().toString());
//              edit_input.setText(xoa);
                break;
            case R.id.btnClearAll:
                edit_input.setText("");
                break;
            case R.id.btnResult:
               int number=Integer.parseInt(String.valueOf(edit_input.getText()));
                break;
        }
    }
//    public String Delete(String number){
//        int lenght=number.length();
//        String ten =number.substring(0,lenght-1);
//           return null;
//    }
// chua phep tinh +-x/

}
