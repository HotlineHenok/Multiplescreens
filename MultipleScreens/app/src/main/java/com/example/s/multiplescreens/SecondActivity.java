package com.example.s.multiplescreens;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by S on 10-11-2015.
 */
public class SecondActivity extends AppCompatActivity{
    private TextView testView;
    private TextView mailview;
    private TextView jokeview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        testView = (TextView) findViewById(R.id.testview);
        mailview = (TextView) findViewById(R.id.mailview);
        jokeview = (TextView) findViewById(R.id.joketext);

        Bundle extras_name = getIntent().getExtras();
        String name = extras_name.getString("usersName");

        Bundle extras_email = getIntent().getExtras();
        String email = extras_email.getString("usersEmail");

        String greetingmessage = String.format(getResources().getString(R.string.Welcome_message), name);
        String emailmessage = String.format(getResources().getString(R.string.email_message), email);
        String joke_message = getString(R.string.joke_message);

        testView.setText(greetingmessage);
        mailview.setText(emailmessage);
        jokeview.setText(joke_message);

    }
}
