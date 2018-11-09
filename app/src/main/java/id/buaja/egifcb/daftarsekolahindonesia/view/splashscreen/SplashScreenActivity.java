package id.buaja.egifcb.daftarsekolahindonesia.view.splashscreen;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import id.buaja.egifcb.daftarsekolahindonesia.R;
import id.buaja.egifcb.daftarsekolahindonesia.view.detailsekolah.DetailSekolahActivity;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getBaseContext(), DetailSekolahActivity.class));
                finish();
            }
        }, 2000);
    }
}
