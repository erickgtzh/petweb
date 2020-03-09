package mx.edu.up.petweb;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import layout.FragmentA;

public class PaymentActivity extends AppCompatActivity implements FragmentA.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
