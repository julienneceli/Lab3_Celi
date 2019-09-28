package com.example.lab3_celi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    EditText eCourse1, eCourse2, eCourse3, eCourse4, eCourse5, eCourse6, eCourse7, eCourse8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eCourse1 = findViewById(R.id.editText2);
        eCourse2 = findViewById(R.id.editText3);
        eCourse3 = findViewById(R.id.editText4);
        eCourse4 = findViewById(R.id.editText5);
        eCourse5 = findViewById(R.id.editText6);
        eCourse6 = findViewById(R.id.editText7);
        eCourse7 = findViewById(R.id.editText8);
        eCourse8 = findViewById(R.id.editText9);


    }

    public void writeData(View v) {
        FileOutputStream fos = null;
        String a = eCourse1.getText().toString();
        String b = eCourse2.getText().toString();

        //String[] str = s.split(",");

        try {
            fos = openFileOutput("data2.txt", MODE_PRIVATE);
            String name2 = eCourse1.getText().toString();
            fos.write(name2.getBytes());
            Toast.makeText(this, " Save Inside Internal Storage", Toast.LENGTH_LONG).show();

        } catch (Exception e) {
            Toast.makeText(this, "Error Writing Data", Toast.LENGTH_LONG).show();

        } finally {

            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    

    public void next(View v) {

    }


}
