package mx.edu.up.petweb;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import layout.FragmentA;
import layout.FragmentC;
import layout.FragmentD;
import layout.FragmentH;
import layout.FragmentN;
import layout.FragmentS;
import layout.FragmentoAdopta;
import layout.FragmentoAsegura;
import layout.FragmentoAyuda;
import layout.FragmentoConfiguracion;
import layout.FragmentoHistorial;
import layout.FragmentoInicio;
import layout.FragmentoNotificaciones;
import layout.FragmentoPago;
import layout.FragmentoPromocion;
import layout.FragmentoServicios;
import layout.FragmentoTrabaja;
import layout.quienessomos;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, quienessomos.OnFragmentInteractionListener,FragmentoInicio.OnFragmentInteractionListener, FragmentC.OnFragmentInteractionListener , FragmentD.OnFragmentInteractionListener, FragmentN.OnFragmentInteractionListener,FragmentH.OnFragmentInteractionListener, FragmentS.OnFragmentInteractionListener, FragmentA.OnFragmentInteractionListener, FragmentoPago.OnFragmentInteractionListener, FragmentoServicios.OnFragmentInteractionListener, FragmentoHistorial.OnFragmentInteractionListener, FragmentoPromocion.OnFragmentInteractionListener, FragmentoNotificaciones.OnFragmentInteractionListener, FragmentoAyuda.OnFragmentInteractionListener, FragmentoConfiguracion.OnFragmentInteractionListener, FragmentoAdopta.OnFragmentInteractionListener, FragmentoTrabaja.OnFragmentInteractionListener, FragmentoAsegura.OnFragmentInteractionListener{

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(0xFFFFFFFF);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
        Fragment fragment = new FragmentoInicio();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.content_main, fragment)
                .commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        boolean FragmentTransaction = false;
        Fragment fragment = null;

        if (id == R.id.nav_serv) {
            fragment = new FragmentoServicios();
            FragmentTransaction = true;
        }else if (id == R.id.nav_hist) {
            fragment = new FragmentoHistorial();
            FragmentTransaction = true;
        } else if (id == R.id.nav_prom) {
            fragment = new FragmentoPromocion();
            FragmentTransaction = true;
        } else if (id == R.id.nav_not) {
            fragment = new FragmentoNotificaciones();
            FragmentTransaction = true;
        } else if (id == R.id.nav_ayu) {
            fragment = new FragmentoAyuda();
            FragmentTransaction = true;
        } else if (id == R.id.nav_conf) {
            fragment = new FragmentoConfiguracion();
            FragmentTransaction = true;
        } else if (id == R.id.nav_adop) {
            fragment = new FragmentoAdopta();
            FragmentTransaction = true;
            Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.petweb.com.mx"));
            startActivity(intent);
        } else if (id == R.id.nav_trabaja) {
            fragment = new FragmentoTrabaja();
            FragmentTransaction = true;
        }
        else if (id == R.id.nav_quienes) {
            fragment = new quienessomos();
            FragmentTransaction = true;
        }

        if (FragmentTransaction) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.content_main, fragment)
                    .commit();

            item.setChecked(true);
            getSupportActionBar().setTitle(item.getTitle());
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }

    public void pedido(View view){
        Toast.makeText(this,"PEDIDO REALIZADO EXITOSAMENTE \n", Toast.LENGTH_LONG).show();
    }
}
