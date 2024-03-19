package com.example.firsttest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity {
   private EditText edtName;
    private EditText edtPass ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        edtName=findViewById(R.id.edtName)  ;
        edtPass=findViewById(R.id.edtPass)  ;



        //TODO : add event handler for submit button
    }
    public void btnSubmitOnClick (View view){
       String name = edtName.getText().toString();
        String Pass = edtPass.getText().toString();
        String msg = "name : "+name +",passward:" +Pass;

        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();

    }
}