package br.com.moryta.splashscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ConfirmationActivity extends AppCompatActivity {

    private TextView tvConfirmation;

    private String name;
    private String age;
    private String team;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);

        tvConfirmation = (TextView) findViewById(R.id.tvConfirmation);

        if (getIntent() != null) {
            name = getIntent().getStringExtra("NAME");
            age = getIntent().getStringExtra("AGE");
            team = getIntent().getStringExtra("TEAM");

            tvConfirmation.setText(
                    getString(R.string.sign_up_confirmation,
                            name,
                            team)
            );
        }
    }
}
