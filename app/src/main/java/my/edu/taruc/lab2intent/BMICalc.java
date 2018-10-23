package my.edu.taruc.lab2intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;

public class BMICalc extends AppCompatActivity {

    private EditText height, weight;
    public static final String TAG_MESSAGE = "my.edu.tarc.lab2intent.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmicalc);

        //Link UI to program
        height = findViewById(R.id.height);
        weight = findViewById(R.id.weight);
    }

    public double calculateBMI()
    {
        double bmi =0;

        if(TextUtils.isEmpty(height.getText()))
        {
            height.setError("Please enter your height");
            return 0;
        }
        else if(TextUtils.isEmpty(weight.getText()))
        {
            height.setError("Please enter your weight");
            return 0;
        }
        double kg = Double.parseDouble(weight.getText().toString());
        double m = Double.parseDouble(height.getText().toString());
        bmi = kg / m*m;

        Intent intent = new Intent(this, BMIResult.class);
        intent.putExtra(TAG_MESSAGE, bmi);
        startActivity(intent);

        return bmi;

    }
}
