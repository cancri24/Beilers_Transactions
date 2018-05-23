package mobile.cse.beilers_transactions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    //attributes are, in order: glaze, icing, powder, drizzle, specialTopping, & filling
    boolean attributes[] = {false, false, false, false, false, false};
    String[] donutNames = {};
    Donut[] donuts = new Donut[49];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout orderListLayout = findViewById(R.id.orderListLayout);
        LinearLayout donutList = findViewById(R.id.donutList);

        for(int i =0 ;i < donuts.length; i++) {
            String packageName = getPackageName();
            int resId = getResources().getIdentifier(donutNames[i], "string", packageName);
            String name = getString(resId);

            resId = getResources().getIdentifier(donutNames[i]+"_name", "string-array", packageName);
            String[] attString = getResources().getStringArray(resId);

            boolean attList[] = new boolean[attString.length];
            for(int j = 0; j < attString.length; j++) attList[j] = (attString[j].equals("true"));

        donuts[i] = new Donut(name, this, attList, ((LinearLayout) orderListLayout));
        donutList.addView(donuts[i].getListLayout());
    }

        /* may not end up using this
        LinearLayout attributeList = (LinearLayout) findViewById(R.id.attributeList);

        CheckBox glaze = (CheckBox) findViewById(R.id.glaze);
        CheckBox icing = (CheckBox) findViewById(R.id.icing);
        CheckBox powder = (CheckBox) findViewById(R.id.powder);
        CheckBox drizzle = (CheckBox) findViewById(R.id.drizzle);
        CheckBox specialTopping = (CheckBox) findViewById(R.id.specialTopping);
        CheckBox filling = (CheckBox) findViewById(R.id.filling); */

    }

    public void onCheckBoxesClicked(View view) {
        // Is the button now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.glaze:
                if (checked)
                    //Person selected
     //               donutType = "glaze";
                break;
            case R.id.icing:
                if (checked)
                    //Item Selected
       //             donutType = "icing";
                break;
            case R.id.powder:
                if(checked)
                    //Both selected
         //           donutType  = "powder";
                break;
            case R.id.drizzle:
                if (checked)
                    //Item Selected
          //          donutType  = "drizzle";
                break;
            case R.id.specialTopping:
                if (checked)
                    //Item Selected
          //          donutType  = "specialTopping";
                break;
            case R.id.filling:
                if (checked)
                    //Item Selected
         //           donutType  = "filling";
                break;
        }
    }

    public void checkDonuts(boolean[] attributes) {
        for(Donut donut : donuts) {
            if(donut.shouldAppear(attributes)) donut.showList();
            else donut.hideList();
        }
    }
}
