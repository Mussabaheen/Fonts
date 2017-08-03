package mussabaheen.example.com.fonts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.graphics.Typeface;

public class MainActivity extends AppCompatActivity {
    TextView txt1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txt1 = (TextView) findViewById(R.id.t1);
        Typeface font1 = Typeface.createFromAsset(getAssets(), "After_Shok.ttf");
        txt1.setTypeface(font1);

        TextView txt2 = (TextView) findViewById(R.id.t2);
        Typeface font2 = Typeface.createFromAsset(getAssets(), "alpha_echo.ttf");
        txt2.setTypeface(font2);

        TextView txt3 = (TextView) findViewById(R.id.t3);
        Typeface font3 = Typeface.createFromAsset(getAssets(), "ArmWrestler.ttf");
        txt3.setTypeface(font3);

        TextView txt4 = (TextView) findViewById(R.id.t4);
        Typeface font4 = Typeface.createFromAsset(getAssets(), "BPdotsCondensed.ttf");
        txt4.setTypeface(font4);

        TextView txt5 = (TextView) findViewById(R.id.t5);
        Typeface font5 = Typeface.createFromAsset(getAssets(), "BPdotsCondensedDiamond.ttf");
        txt5.setTypeface(font5);


    }
}
