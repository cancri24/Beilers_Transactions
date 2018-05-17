package mobile.cse.beilers_transactions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    String attributes[] = {"glaze", "icing", "powder", "drizzle", "specialTopping", "filling"};
    Donut[] donuts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* may not end up using this
        LinearLayout attributeList = (LinearLayout) findViewById(R.id.attributeList);

        CheckBox glaze = (CheckBox) findViewById(R.id.glaze);
        CheckBox icing = (CheckBox) findViewById(R.id.icing);
        CheckBox powder = (CheckBox) findViewById(R.id.powder);
        CheckBox drizzle = (CheckBox) findViewById(R.id.drizzle);
        CheckBox specialTopping = (CheckBox) findViewById(R.id.specialTopping);
        CheckBox filling = (CheckBox) findViewById(R.id.filling); */

        LinearLayout orderListLayout = findViewById(R.id.orderListLayout);
        LinearLayout donutList = findViewById(R.id.donutList);

        //Creates Everything Donut using Donut class
        String[] everyAtt = getResources().getStringArray(R.array.Everything);
        boolean[] attList = new boolean[everyAtt.length];
        for(int i = 0; i < attList.length; i++) attList[i] = (everyAtt[i].equals("true"));
        String name = getResources().getString(R.string.Everything_name);
        Donut everything = new Donut(name, this, attList, orderListLayout);
        donutList.addView(everything.getListLayout());
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
}
