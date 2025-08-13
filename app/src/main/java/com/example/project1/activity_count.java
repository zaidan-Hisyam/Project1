package com.example.project1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class activity_count extends AppCompatActivity {

    private int angka = 0;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);

        textView2 = findViewById(R.id.textView2);
        Button tombolCount = findViewById(R.id.button);
        Button tombolRestart = findViewById(R.id.button1);
        Button tombolKembali = findViewById(R.id.button2);

        tombolCount.setOnClickListener(v -> {
            angka++;
            textView2.setText(String.valueOf(angka));
        });

        tombolRestart.setOnClickListener(v -> {
            angka = 0;
            textView2.setText(String.valueOf(angka));
            Toast.makeText(this, "Angka telah direset", Toast.LENGTH_SHORT).show();
        });

        tombolKembali.setOnClickListener(v -> {
            finish();
        });
    }
}