package com.example.monster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private TextView tvMsg;
private ImageView ivMg;
private EditText etmsg;
private Button btnok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMsg=findViewById(R.id.tvMsg);
        ivMg=findViewById(R.id.ivMg);
        etmsg=findViewById(R.id.etmsg);
        btnok=findViewById(R.id.btnok);
        btnok.setOnClickListener(view ->{
            String msg=etmsg.getText().toString();
            if(msg.isEmpty()){
                Toast.makeText(this,"Message cannot be empty",Toast.LENGTH_SHORT).show();
            }else{
                tvMsg.setText(msg);
            }
        });
    }
}