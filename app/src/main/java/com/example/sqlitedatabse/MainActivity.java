package com.example.sqlitedatabse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private EditText title;
    private EditText message;
    private Button insertData;
    private DatabaseHelper databaseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        databaseHelper = new DatabaseHelper((getApplicationContext()));

        title = findViewById(R.id.title);
        message = findViewById(R.id.message);
        insertData = findViewById(R.id.insertData);

        insertData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getTitle = title.getText().toString();
                String getMessage = title.getText().toString();
                databaseHelper.insertData(new Data(getTitle, getMessage));
            }
        });
    }
}