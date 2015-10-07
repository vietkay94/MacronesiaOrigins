package zapper.macronesiaorigins;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Choice1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void result1 (View v){

        int clickCounter = getIntent().getIntExtra("COUNTER",0);
        clickCounter++;
        finish();
    }

    public void result2 (View v){

        int clickCounter = getIntent().getIntExtra("COUNTER",0);
        clickCounter = clickCounter + 2;
        finish();
    }

    public void result3 (View v){

        int clickCounter = getIntent().getIntExtra("COUNTER",0);
        clickCounter = clickCounter + 3;
        finish();
    }
}
