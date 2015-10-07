package zapper.macronesiaorigins;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class SelectScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    // brings you to select screen
    public void startNewGame(View v) {
        Intent myIntent = new Intent(this,GamePage1.class);

        startActivity(myIntent);
        finish();
    }

    public void startCredits(View v) {
        Intent myIntent = new Intent(this,Credits.class);

        startActivity(myIntent);
    }

}
