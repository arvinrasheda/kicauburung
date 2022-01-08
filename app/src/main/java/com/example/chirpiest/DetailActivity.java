package com.example.chirpiest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.chirpiest.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

public class DetailActivity extends AppCompatActivity {

    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imgBurung = findViewById(R.id.imgBurung);
        TextView tvName = findViewById(R.id.item_name);

        Burung burung = getIntent().getParcelableExtra(ITEM_EXTRA);
        if (burung != null) {
            Glide.with(this)
                    .load(burung.getPhoto())
                    .into(imgBurung);

            tvName.setText(burung.getName());
        }

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("List Suara Burung" + burung.getName());
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        }
    }

    public void onClickButtonCreate(View view)
    {
        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}