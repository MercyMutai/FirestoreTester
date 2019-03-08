package com.mlineth.firestoretester;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class SetupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup);

        Toolbar setupTB = findViewById(R.id.setup_tb);
        setSupportActionBar(setupTB);
        getSupportActionBar().setTitle("Update Profile");

        Button uploadBtn = findViewById(R.id.upload_btn);
        uploadBtn.setOnClickListener(v -> uploadDetails());
    }

    private void uploadDetails() {
        startActivity(new Intent(this, DashboardActivity.class));
        finish();
    }
}
