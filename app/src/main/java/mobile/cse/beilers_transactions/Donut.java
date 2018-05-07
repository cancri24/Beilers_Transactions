package mobile.cse.beilers_transactions;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Donut {
    private LinearLayout donutListLayout;
    private LinearLayout donutOrderLayout;

    private TextView donutName;
    private TextView donutOrderName;

    private Button plusOne;
    private Button plusSix;
    private Button removeAll;

    private int quantity;
    private String name;

    private boolean glaze;
    private boolean icing;
    private boolean powder;
    private boolean drizzle;
    private boolean specialTopping;
    private boolean filling;
    private boolean[] attributes = {glaze, icing, powder, drizzle, specialTopping, filling};

    Donut(String dname, String id, Context mainact, boolean[] attributeList) {
        name = dname;

        //TODO: set id of all this stuff somehow (is this necessary?)
        //Create ListLayout and everything in it
        donutListLayout = new LinearLayout(mainact);
        donutListLayout.setOrientation(LinearLayout.HORIZONTAL);

        donutName = new TextView(mainact);
        donutName.setTextColor(Color.WHITE);
        donutName.setText(name);

        plusOne = new Button(mainact);
        plusOne.setWidth(400);
        plusOne.setHeight(400);
        plusOne.setText("+1");

        plusSix = new Button(mainact);
        plusSix.setWidth(400);
        plusSix.setHeight(400);
        plusSix.setText("+6");

        donutListLayout.addView(donutName);
        donutListLayout.addView(plusOne);
        donutListLayout.addView(plusSix);

        //Create OrderLayout and everything in it
        donutOrderLayout = new LinearLayout(mainact);
        donutOrderLayout.setOrientation(LinearLayout.HORIZONTAL);

        quantity = 0;
        donutOrderName =new TextView(mainact);
        donutOrderName.setTextColor(Color.WHITE);
        donutOrderName.setText(name + " (" + quantity + ")");

        removeAll = new Button(mainact);
        removeAll.setWidth(400);
        plusOne.setHeight(400);
        plusOne.setText("X");

        donutOrderLayout.addView(donutOrderName);
        donutOrderLayout.addView(removeAll);

        attributes = attributeList;
    }

    public View getListLayout() {
        return donutListLayout;
    }
    public View getOrderLayout() {
        return donutOrderLayout;
    }

    public String getName() {
        return name;
    }

    public void hideList() {
        donutListLayout.setVisibility(View.GONE);
    }
    public void showList() {
        donutListLayout.setVisibility(View.VISIBLE);
    }
}
