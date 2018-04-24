package mobile.cse.beilers_transactions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout attributeList = (LinearLayout) findViewById(R.id.attributeList);


        CheckBox test = new CheckBox(this);
        /*
        CheckBox glaze = (CheckBox) findViewById(R.id.glaze);
        CheckBox icing = (CheckBox) findViewById(R.id.icing);
        CheckBox powder = (CheckBox) findViewById(R.id.powder);
        CheckBox drizzle = (CheckBox) findViewById(R.id.drizzle);
        CheckBox specialTopping = (CheckBox) findViewById(R.id.specialTopping);
        CheckBox filling = (CheckBox) findViewById(R.id.filling);

        attributeList.addView(glaze);
        attributeList.addView(icing);
        attributeList.addView(powder);
        attributeList.addView(drizzle);
        attributeList.addView(specialTopping);
        attributeList.addView(filling);
        */
        attributeList.addView(test);

    }
}
