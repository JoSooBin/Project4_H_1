package com.cookandroid.project4_h_1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text1, text2;
    Switch chkAgree;
    RadioGroup rGroup1;
    RadioButton Nougat, Oreo, Pie;
    Button btnExit, btnReset;
    ImageView ImgLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        setTitle("안드로이드 사진 보기");

        text1 = (TextView) findViewById(R.id.Text1);
        chkAgree = (Switch) findViewById(R.id.ChkAgree);

        text2 = (TextView) findViewById(R.id.Text2);
        rGroup1 = (RadioGroup) findViewById(R.id.RGroup1);
        Nougat = (RadioButton) findViewById(R.id.Nougat);
        Oreo = (RadioButton) findViewById(R.id.Oreo);
        Pie = (RadioButton) findViewById(R.id.Pie);
        ImgLogo = (ImageView) findViewById(R.id.ImgLogo);
        btnExit = (Button) findViewById(R.id.BtnExit);
        btnReset = (Button) findViewById(R.id.BtnReset);

        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(chkAgree.isChecked() == true) {
                    text2.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
                    ImgLogo.setVisibility(View.VISIBLE);
                    btnExit.setVisibility(View.VISIBLE);
                    btnReset.setVisibility(View.VISIBLE);
                }
                else {
                    text2.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
                    ImgLogo.setVisibility(View.INVISIBLE);
                    btnExit.setVisibility(View.INVISIBLE);
                    btnReset.setVisibility(View.INVISIBLE);
                }
            }
        });

        rGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (rGroup1.getCheckedRadioButtonId()) {
                    case R.id.Nougat:ImgLogo.setImageResource(R.drawable.nougat);
                    break;
                    case R.id.Oreo:ImgLogo.setImageResource(R.drawable.oreo);
                    break;
                    case R.id.Pie:ImgLogo.setImageResource(R.drawable.pie);
                }
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chkAgree.setChecked(false);
                text2.setVisibility(View.INVISIBLE);
                rGroup1.setVisibility(View.INVISIBLE);
                ImgLogo.setVisibility(View.INVISIBLE);
                btnExit.setVisibility(View.INVISIBLE);
                btnReset.setVisibility(View.INVISIBLE);
            }
        });
    }
}