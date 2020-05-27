package com.ayraa.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void aries(View view) {
        Toast.makeText(getApplicationContext(), "Aries", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Details.class);
        intent.putExtra("sign", "aries".toString());
        startActivity(intent);
    }

    public void taurus(View view) {
        Toast.makeText(getApplicationContext(), "Taurus", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Details.class);
        intent.putExtra("sign", "taurus".toString());
        startActivity(intent);
    }
    

    public void gemini(View view) {
        Toast.makeText(getApplicationContext(), "Gemini", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Details.class);
        intent.putExtra("sign", "gemini".toString());
        startActivity(intent);
    }

    public void scorpio(View view) {
        Toast.makeText(getApplicationContext(), "Scorpio", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Details.class);
        intent.putExtra("sign", "scorpio".toString());
        startActivity(intent);
    }

    public void aquarius(View view) {
        Toast.makeText(getApplicationContext(), "Aquarius", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Details.class);
        intent.putExtra("sign", "aquarius".toString());
        startActivity(intent);
    }

    public void virgo(View view) {
        Toast.makeText(getApplicationContext(), "Virgo", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Details.class);
        intent.putExtra("sign", "virgo".toString());
        startActivity(intent);
    }

    public void leo(View view) {
        Toast.makeText(getApplicationContext(), "Leo", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Details.class);
        intent.putExtra("sign", "leo".toString());
        startActivity(intent);
    }


    public void sagittarius(View view) {
        Toast.makeText(getApplicationContext(), "Sagittarius", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Details.class);
        intent.putExtra("sign", "sagittarius".toString());
        startActivity(intent);
    }

    public void capricorn(View view) {
        Toast.makeText(getApplicationContext(), "Capricorn", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Details.class);
        intent.putExtra("sign", "capricorn".toString());
        startActivity(intent);
    }

    public void cancer(View view) {
        Toast.makeText(getApplicationContext(), "Cancer", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Details.class);
        intent.putExtra("sign", "cancer".toString());
        startActivity(intent);
    }

    public void pisces(View view) {
        Toast.makeText(getApplicationContext(), "Pisces", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Details.class);
        intent.putExtra("sign", "pisces".toString());
        startActivity(intent);
    }

    public void libra(View view) {
        Toast.makeText(getApplicationContext(), "Libra", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Details.class);
        intent.putExtra("sign", "libra".toString());
        startActivity(intent);
    }







}
