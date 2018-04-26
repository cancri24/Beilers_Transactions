package mobile.cse.beilers_transactions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView simpleList;
    String attributes[] = {"glaze", "icing", "powder", "drizzle", "specialTopping", "filling"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout attributeList = (LinearLayout) findViewById(R.id.attributeList);

        CheckBox glaze = (CheckBox) findViewById(R.id.glaze);
        CheckBox icing = (CheckBox) findViewById(R.id.icing);
        CheckBox powder = (CheckBox) findViewById(R.id.powder);
        CheckBox drizzle = (CheckBox) findViewById(R.id.drizzle);
        CheckBox specialTopping = (CheckBox) findViewById(R.id.specialTopping);
        CheckBox filling = (CheckBox) findViewById(R.id.filling);

        Button orderButton = (Button) findViewById(R.id.orderButton);
    }
}
