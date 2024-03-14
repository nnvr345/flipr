package com.example.flipr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    private EditText editTextEmail, editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        Button buttonLogin = findViewById(R.id.buttonLogin);
        buttonLogin.setOnClickListener(v -> {
            String email = editTextEmail.getText().toString().trim();
            String password = editTextPassword.getText().toString().trim();

            // Here, you can save the admin credentials to a local database or file
            // Alternatively, you can send this data to your server for registration

            // Example: saving admin credentials locally (not recommended for production)
            // SaveAdminCredentials(email, password);

            Toast.makeText(MainActivity.this, "Admin registration successful", Toast.LENGTH_SHORT).show();
        });
    }
    // Method to save admin credentials locally
    private void SaveAdminCredentials(String email, String password) {
        // Implement your logic to save admin credentials to a local database or file
    }
}
