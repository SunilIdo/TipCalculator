package tip.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calc15(View view) {
        EditText input = (EditText) findViewById(R.id.txtInput);
        double bill = Double.parseDouble(input.getText().toString());
        calcAndDisplay(bill, 0.15);
    }
    public void calc18(View view) {
        EditText input = (EditText) findViewById(R.id.txtInput);
        double bill = Double.parseDouble(input.getText().toString());
        calcAndDisplay(bill, 0.18);
    }
    public void calc20(View view) {
        EditText input = (EditText) findViewById(R.id.txtInput);
        double bill = Double.parseDouble(input.getText().toString());
        calcAndDisplay(bill, 0.20);
    }
    private void calcAndDisplay(double bill, double tipPercent)
    {
        TextView output = (TextView) findViewById(R.id.txtOutput);
        double tip = bill * tipPercent;
        double total = bill + tip;
        DecimalFormat df = new DecimalFormat("#.##");
        output.setText("Tip: $"+df.format(tip)+", Total Bill: $"+df.format(total));
    }
}