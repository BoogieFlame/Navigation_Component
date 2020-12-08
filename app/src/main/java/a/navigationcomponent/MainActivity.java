package a.navigationcomponent;

import androidx.appcompat.app.AppCompatActivity;
import android.net.Uri;
import android.os.Bundle;

import a.navigationcomponent.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity implements
    SecondFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {
    }
}