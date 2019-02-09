package com.example.a2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText password = (EditText) findViewById(R.id.editText);
                EditText text = (EditText) findViewById(R.id.editText2);

                Validator validator = new Validator();

                String word = password.getText().toString();

                if(validator.Validate(word) == 5)
                    text.setText("Strong enough");
                else
                    text.setText("Not Strong Enough");
            }
        });

    }
}
