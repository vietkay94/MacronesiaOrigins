package zapper.macronesiaorigins;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static zapper.macronesiaorigins.R.drawable.epilepticdolphin;

public class GamePage1 extends AppCompatActivity {

    int mClickCounter = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_page1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }



    public void nextText (View v){

        String lines = " xxxThe Pacific Ocean, 1688xxxI am Captain Walter Adams.xxxFormer Royal Navy officer, entrepreneur, and as much as I hate to admit it, a hopeless gambler.xxxBack in the days I have always had a knack for reading the expressions of others and acting accordingly. xxxI thought this talent of mine would make me a ringer at the card table. But lady luck was a shallow harlot that has never graced me once.xxxAfter accruing massive debts from around all parts of Europe, his Majesty King James II offered me, at best, a way to redeem myself.xxxOr at worst, a slow death sentence.xxx\"Take one of my ships and a company of my sailors. Go out to find more of this 'New World' and claim it for me.\"xxxNow here I am, captain of the Epileptic Dolphin, a remodeled slave ship.xxxI swear, the floorboards still reek of negroes and saltwater.xxxI hear a knocking on my door.xxx\"Captain!\"xxxCapt. Adams: Come in.xxxKai: First sailor Kai reporting!xxxCapt. Adams: We've been at sea for over three months now Kai, our primary navigator has died of scurvy and we have not seen a speck of land.xxxCapt. Adams: Tell me what you need and let me enjoy my burial at sea.xxxKai, my simpleminded and portly sailor, is still convinced we will find a new land and return to England as heroes.xxxWhile everyone aboard has lost considerable weight during the trip, Kai has supplemented his diet with dozens of stowaway rats.xxxHe is a friendly lad. However, the fact that he remains relaxed even after months of not having laid eyes on a woman strikes me as something most queer.xxxKai: Moments before the fog rolled in, our lookout said he saw land, just a couple of days away from the looks of it! We're gonna be famous!xxxHm.";
        String[] arrayLines = lines.split("xxx");

        int counter = mClickCounter;
        String nextLine = arrayLines[counter];

        TextView t = (TextView) findViewById(R.id.textView);
        t.setText(nextLine);

        ImageView image = (ImageView) findViewById(R.id.imageView);

        if (counter == 1){
            image.setImageResource(R.drawable.epilepticdolphin);
        }

        if (counter == 7){
            image.setImageResource(R.drawable.epilepticdolphin2);
        }

        if (counter == 9){
            image.setImageResource(R.drawable.walteradams);
        }

        if (counter == 11){
            image.setImageResource(R.drawable.door);
        }

        if (counter == 14){
            image.setImageResource(R.drawable.doorkai);
        }

        if (counter == 21){
            Intent Choice1 = new Intent(this,Choice1.class);
            Choice1.putExtra("COUNTER",mClickCounter);

            startActivity(Choice1);
            finish();
        }

        mClickCounter++;
    }

}
