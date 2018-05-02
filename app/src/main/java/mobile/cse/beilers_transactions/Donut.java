package mobile.cse.beilers_transactions;

import android.content.Context;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Donut {
    private LinearLayout donutLayout;
    private TextView donutName;
    private Button plusOne;
    private Button plusSix;

    Donut(String name, String id, Context mainact) {
        //need to set id of all this stuff somehow
        donutLayout = new LinearLayout(mainact);
        donutLayout.setOrientation(LinearLayout.HORIZONTAL);

        plusOne = new Button(mainact);
        plusOne.setWidth(400);
        plusOne.setHeight(400);
        plusOne.setText("+1");

        plusSix = new Button(mainact);
        plusSix.setWidth(400);
        plusSix.setHeight(400);
        plusSix.setText("+6");

    }
}
