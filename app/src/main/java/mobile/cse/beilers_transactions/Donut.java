package mobile.cse.beilers_transactions;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

//TODO: Fix button sizes on plusOne, plusSix, and removeAll

public class Donut {
    private LinearLayout donutListLayout;
    private LinearLayout donutOrderLayout;

    private LinearLayout orderListLayout;

    private TextView donutName;
    private TextView donutOrderName;

    private Button plusOne;
    private Button plusSix;
    private Button removeAll;

    private int quantity;
    private String name;
    private boolean[] attributes;

    Donut(String dname, Context mainact, boolean[] attributeList, LinearLayout oList) {
        name = dname;
        orderListLayout = oList;

        //Create ListLayout and everything in it
        donutListLayout = new LinearLayout(mainact);
        donutListLayout.setOrientation(LinearLayout.HORIZONTAL);

        donutName = new TextView(mainact);
        donutName.setTextColor(Color.WHITE);
        donutName.setText(name);

        plusOne = new Button(mainact);
        plusOne.setWidth(40);
        plusOne.setHeight(40);
        plusOne.setText("+1");
        plusOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quantity == 0) orderListLayout.addView(donutOrderLayout);
                quantity++;
                donutOrderName.setText(name + " (" + quantity + ")");
            }
        });

        plusSix = new Button(mainact);
        plusSix.setWidth(40);
        plusSix.setHeight(40);
        plusSix.setText("+6");
        plusSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quantity == 0) orderListLayout.addView(donutOrderLayout);
                quantity += 6;
                donutOrderName.setText(name + " (" + quantity + ")");
            }
        });

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
        removeAll.setWidth(40);
        removeAll.setHeight(40);
        removeAll.setText("X");
        removeAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quantity = 0;
                donutOrderName.setText(name + " (" + quantity + ")");
                orderListLayout.removeView(donutOrderLayout);
            }
        });

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
