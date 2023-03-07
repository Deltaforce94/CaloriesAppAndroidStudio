package es.delta.onyourtrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    protected TextView titleText;
    protected EditText emailText;
    protected EditText passwordText;
    protected Button loginButton;

    private String email;
    private String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        titleText = findViewById(R.id.TextView1_login);
        emailText = findViewById(R.id.EmailText1_login);
        passwordText = findViewById(R.id.PasswordText1_login);
        loginButton = findViewById(R.id.button1_login);


        Toast.makeText(this, "Iniciando...", Toast.LENGTH_SHORT).show();

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                email = emailText.getText().toString();
                password = passwordText.getText().toString();

                openMainActivity();

            }
        });
    }
    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}