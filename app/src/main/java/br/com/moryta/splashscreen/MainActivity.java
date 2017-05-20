package br.com.moryta.splashscreen;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout tilName;
    private TextInputLayout tilAge;
    private Spinner spTeams;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tilName = (TextInputLayout) findViewById(R.id.tilName);
        tilAge = (TextInputLayout) findViewById(R.id.tilAge);
        spTeams = (Spinner) findViewById(R.id.spTeams);
    }

    public void signUp(View view) {
        Intent intent = new Intent(this, ConfirmationActivity.class);
        intent.putExtra("NAME",
                tilName.getEditText().getText().toString());
        intent.putExtra("AGE",
                tilAge.getEditText().getText().toString());
        intent.putExtra("TEAM",
                spTeams.getSelectedItem().toString());

        startActivity(intent);
    }
}
