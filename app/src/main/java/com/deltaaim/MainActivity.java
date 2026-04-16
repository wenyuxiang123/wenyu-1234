package com.deltaaim;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnCapture;
    private TextView textStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCapture = findViewById(R.id.btn_capture);
        textStatus = findViewById(R.id.text_status);

        btnCapture.setOnClickListener(v -> {
            textStatus.setText("功能开发中...");
            Toast.makeText(this, "请先采集数据训练模型", Toast.LENGTH_SHORT).show();
        });
    }
}
