package com.example.verly.sgandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Integer bil1,bil2,hasil;

    EditText editTextBil1;
    EditText editTextBil2;

    Button btnTambah,btnKurang,btnKali,btnBagi;

    TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextBil1 = findViewById(R.id.edtBil1);
        editTextBil2 = findViewById(R.id.edtBil2);

        btnTambah = findViewById(R.id.btnTambah);
        btnKurang = findViewById(R.id.btnKurang);
        btnKali = findViewById(R.id.btnKali);

        btnBagi = findViewById(R.id.btnBagi);

        textViewHasil = findViewById(R.id.txtHasil);

        btnTambah.setOnClickListener(this);
        btnKali.setOnClickListener(this);
        btnKurang.setOnClickListener(this);
        btnBagi.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnTambah:
                bil1 = Integer.parseInt(editTextBil1.getText().toString());
                bil2 = Integer.parseInt(editTextBil2.getText().toString());

                hasil = bil1+bil2;

                textViewHasil.setText(String.valueOf(hasil));
                break;

            case R.id.btnKurang:
                bil1 = Integer.parseInt(editTextBil1.getText().toString());
                bil2 = Integer.parseInt(editTextBil2.getText().toString());

                hasil = bil1-bil2;

                textViewHasil.setText(String.valueOf(hasil));
                break;

            case R.id.btnKali:
                bil1 = Integer.parseInt(editTextBil1.getText().toString());
                bil2 = Integer.parseInt(editTextBil2.getText().toString());

                hasil = bil1*bil2;

                textViewHasil.setText(String.valueOf(hasil));
                break;

            case R.id.btnBagi:
                bil1 = Integer.parseInt(editTextBil1.getText().toString());
                bil2 = Integer.parseInt(editTextBil2.getText().toString());

                hasil = bil1/bil2;

                textViewHasil.setText(String.valueOf(hasil));
                break;
        }
    }
}
