package com.example.viewtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.zip.Inflater;

public class CustomToast extends AppCompatActivity {
Button button ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_toast);
        button = findViewById(R.id.Actionbtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "defalt toast", Toast.LENGTH_LONG).show();

                Toast toast = new Toast(getApplicationContext());
                View view1 = LayoutInflater.from(getApplicationContext()).inflate(R.layout.custom_toast, (ViewGroup)findViewById(R.id.toast_root));
//                TextView toast_messsage = view1.findViewById(R.id.toast_message);
//                toast_messsage.setText("i am sagar this toeas is genareted by me");
                toast.setView(view1);
                toast.setGravity(Gravity.TOP,0,0);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }
}