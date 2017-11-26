package com.gallerina.app.intention;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    ////contoh penggunaan Explisit
    public void Kirim(View view) {
        Intent intent = new Intent(this, DetailActivity.class);
        startActivity(intent);
    }

    //contoh penggunaan Implisit
    public void callMe(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:082284293423"));
        startActivity(intent);
    }
}
