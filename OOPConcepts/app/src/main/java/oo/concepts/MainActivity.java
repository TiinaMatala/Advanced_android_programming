package oo.concepts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nanny mPoppins = new Nanny();
        mPoppins.setPersonnelNr(12);
        mPoppins.setName("Mary Poppins");

        Children melina = new Children();
        melina.setCryingSensitivity("Sensitive");
        melina.setName("Melina");
    }
}
