package com.app.firstproject.firstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MitProjektAkt extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mit_projekt_akt);

        Button b = (Button) findViewById(R.id.buttonOk);
        b.setOnClickListener(this);

        }

    @Override
    public void onClick(View view) {
        EditText editName = (EditText) findViewById(R.id.editName);

        String name = editName.getText().toString();
        TextView tv = (TextView) findViewById(R.id.textViewVisNavn);
        tv.setText("Velkommen, " + name);
    }
}

