package com.example.s.multiplescreens;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    private Button RememberButton, ForgotButton;
    private EditText NameText, EmailText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        RememberButton = (Button) findViewById(R.id.first_button);
        ForgotButton = (Button) findViewById(R.id.button_2);
        NameText = (EditText) findViewById(R.id.editText_name);
        EmailText = (EditText) findViewById(R.id.editText3);

    }

    public void onGetNameInput(View view) {
        String usersName = String.valueOf(NameText.getText());
        String usersEmail = String.valueOf(EmailText.getText());

        Intent name_email = new Intent(this, SecondActivity.class);
        name_email.putExtra("usersName", usersName);
        name_email.putExtra("usersEmail", usersEmail);

        startActivity(name_email);

        SharedPreferences info = this.getSharedPreferences("data", this.MODE_PRIVATE);
        SharedPreferences.Editor editor = info.edit();
        editor.putString("name", usersName);
        editor.putString("email", usersEmail);
        editor.commit();
    }

    public void onForgotButton(View view) {
        String badResponse = "Dummy!";
        Toast.makeText(this, badResponse, Toast.LENGTH_SHORT).show();
    }
}
