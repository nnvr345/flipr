package com.example.flipr;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class AdminLoginActivity extends AppCompatActivity {

    private EditText editTextEmail, editTextPassword;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = editTextEmail.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();

                // Here, you can authenticate the admin locally or send the credentials to your server for validation

                // Example: authenticating admin locally (not recommended for production)
                // boolean isAuthenticated = AuthenticateAdminLocally(email, password);
                // if (isAuthenticated) {
                //     // Admin login successful
                //     Toast.makeText(AdminLoginActivity.this, "Admin login successful", Toast.LENGTH_SHORT).show();
                // } else {
                //     // Admin login failed
                //     Toast.makeText(AdminLoginActivity.this, "Admin login failed", Toast.LENGTH_SHORT).show();
                // }

                // For simplicity, assuming login is always successful
                Toast.makeText(AdminLoginActivity.this, "Admin login successful", Toast.LENGTH_SHORT).show();
            }
        });
    }

    // Method to authenticate admin locally
    private boolean AuthenticateAdminLocally(String email, String password) {
        // Implement your logic to authenticate admin locally using stored credentials
        return false;
    }
}
