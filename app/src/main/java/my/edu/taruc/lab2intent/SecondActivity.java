package my.edu.taruc.lab2intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textViewMessage;
        textViewMessage = findViewById(R.id.textViewMessage);

        //retrieve intent data
        Intent intent = getIntent(); //asking who called me??
        if (intent.hasExtra(MainActivity.TAG_MESSAGE)) {
            String stringMsg = intent.getStringExtra(MainActivity.TAG_MESSAGE);
            textViewMessage.setText(stringMsg);
        }
        //else 'no message received'
    }
    public void closeActivity(View view)
    {
        finish();
    }
}
