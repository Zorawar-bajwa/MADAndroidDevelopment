package com.ayraa.app1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.core.text.HtmlCompat;
import android.text.Spanned;

import java.util.Objects;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        // Back Arrow
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


        // Get the Intent that started this activity
        Intent intent = getIntent();
        String sign = intent.getStringExtra("sign");

        if(Objects.equals(sign, "aries")){
            Spanned spanned = HtmlCompat.fromHtml(getString(R.string.aries_text), HtmlCompat.FROM_HTML_MODE_COMPACT);
            TextView xOutput = (TextView) findViewById(R.id.details);
            xOutput.setText(spanned);
            xOutput.setMovementMethod(new ScrollingMovementMethod());
            ImageButton ib = (ImageButton) findViewById(R.id.pic);
            ib.setBackgroundResource(R.drawable.aries);
        }
        else if(Objects.equals(sign, "taurus")){
            Spanned spanned = HtmlCompat.fromHtml(getString(R.string.taurus_text), HtmlCompat.FROM_HTML_MODE_COMPACT);
            TextView xOutput = (TextView) findViewById(R.id.details);
            xOutput.setText(spanned);
            xOutput.setMovementMethod(new ScrollingMovementMethod());
            ImageButton ib = (ImageButton) findViewById(R.id.pic);
            ib.setBackgroundResource(R.drawable.taurus);
        }
        else if(Objects.equals(sign, "gemini")){
            Spanned spanned = HtmlCompat.fromHtml(getString(R.string.gemini_text), HtmlCompat.FROM_HTML_MODE_COMPACT);
            TextView xOutput = (TextView) findViewById(R.id.details);
            xOutput.setText(spanned);
            xOutput.setMovementMethod(new ScrollingMovementMethod());
            ImageButton ib = (ImageButton) findViewById(R.id.pic);
            ib.setBackgroundResource(R.drawable.gemini);
        }

        else if(Objects.equals(sign, "cancer")){
            Spanned spanned = HtmlCompat.fromHtml(getString(R.string.cancer_text), HtmlCompat.FROM_HTML_MODE_COMPACT);
            TextView xOutput = (TextView) findViewById(R.id.details);
            xOutput.setText(spanned);
            xOutput.setMovementMethod(new ScrollingMovementMethod());
            ImageButton ib = (ImageButton) findViewById(R.id.pic);
            ib.setBackgroundResource(R.drawable.cancer );
        }

        else if(Objects.equals(sign, "leo")){
            Spanned spanned = HtmlCompat.fromHtml(getString(R.string.leo_text), HtmlCompat.FROM_HTML_MODE_COMPACT);
            TextView xOutput = (TextView) findViewById(R.id.details);
            xOutput.setText(spanned);
            xOutput.setMovementMethod(new ScrollingMovementMethod());
            ImageButton ib = (ImageButton) findViewById(R.id.pic);
            ib.setBackgroundResource(R.drawable.cancer );

        }

        else if(Objects.equals(sign, "virgo")){
            Spanned spanned = HtmlCompat.fromHtml(getString(R.string.virgo_text), HtmlCompat.FROM_HTML_MODE_COMPACT);
            TextView xOutput = (TextView) findViewById(R.id.details);
            xOutput.setText(spanned);
            xOutput.setMovementMethod(new ScrollingMovementMethod());
            ImageButton ib = (ImageButton) findViewById(R.id.pic);
            ib.setBackgroundResource(R.drawable.cancer );

        }


        else if(Objects.equals(sign, "libra")){
            Spanned spanned = HtmlCompat.fromHtml(getString(R.string.libra_text), HtmlCompat.FROM_HTML_MODE_COMPACT);
            TextView xOutput = (TextView) findViewById(R.id.details);
            xOutput.setText(spanned);
            xOutput.setMovementMethod(new ScrollingMovementMethod());
            ImageButton ib = (ImageButton) findViewById(R.id.pic);
            ib.setBackgroundResource(R.drawable.cancer );

        }

        else if(Objects.equals(sign, "scorpio")){
            Spanned spanned = HtmlCompat.fromHtml(getString(R.string.scorpio_text), HtmlCompat.FROM_HTML_MODE_COMPACT);
            TextView xOutput = (TextView) findViewById(R.id.details);
            xOutput.setText(spanned);
            xOutput.setMovementMethod(new ScrollingMovementMethod());
            ImageButton ib = (ImageButton) findViewById(R.id.pic);
            ib.setBackgroundResource(R.drawable.cancer );

        }

        else if(Objects.equals(sign, "sagittarius")){
            Spanned spanned = HtmlCompat.fromHtml(getString(R.string.sagittarius_text), HtmlCompat.FROM_HTML_MODE_COMPACT);
            TextView xOutput = (TextView) findViewById(R.id.details);
            xOutput.setText(spanned);
            xOutput.setMovementMethod(new ScrollingMovementMethod());
            ImageButton ib = (ImageButton) findViewById(R.id.pic);
            ib.setBackgroundResource(R.drawable.cancer );

        }

        else if(Objects.equals(sign, "capricorn")){
            Spanned spanned = HtmlCompat.fromHtml(getString(R.string.capricorn_text), HtmlCompat.FROM_HTML_MODE_COMPACT);
            TextView xOutput = (TextView) findViewById(R.id.details);
            xOutput.setText(spanned);
            xOutput.setMovementMethod(new ScrollingMovementMethod());
            ImageButton ib = (ImageButton) findViewById(R.id.pic);
            ib.setBackgroundResource(R.drawable.cancer );

        }

        else if(Objects.equals(sign, "aquarius")){
            Spanned spanned = HtmlCompat.fromHtml(getString(R.string.aquarius_text), HtmlCompat.FROM_HTML_MODE_COMPACT);
            TextView xOutput = (TextView) findViewById(R.id.details);
            xOutput.setText(spanned);
            xOutput.setMovementMethod(new ScrollingMovementMethod());
            ImageButton ib = (ImageButton) findViewById(R.id.pic);
            ib.setBackgroundResource(R.drawable.cancer );

        }

        else if(Objects.equals(sign, "pisces")){
            Spanned spanned = HtmlCompat.fromHtml(getString(R.string.pisces_text), HtmlCompat.FROM_HTML_MODE_COMPACT);
            TextView xOutput = (TextView) findViewById(R.id.details);
            xOutput.setText(spanned);
            xOutput.setMovementMethod(new ScrollingMovementMethod());
            ImageButton ib = (ImageButton) findViewById(R.id.pic);
            ib.setBackgroundResource(R.drawable.cancer );

        }


    }

    // Back Arrow
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }



}
