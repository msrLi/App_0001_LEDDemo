package com.example.binson.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private boolean ledon = false;
    private Button button = null;
    private CheckBox ledp[] = new CheckBox[4];

    class MybuttonListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            ledon = !ledon;
            if (ledon) {
                button.setText("LED ALL ON");
                for (int i = 0; i < ledp.length; i++) {
                    ledp[i].setChecked(true);
                }
            } else {
                button.setText("LED ALL OFF");
                for (int i = 0; i < ledp.length; i++) {
                    ledp[i].setChecked(false);
                }
            }
        }
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.LED1:
                if (checked)
                    Toast.makeText(this, "LED1 ON", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(this, "LED1 OFF", Toast.LENGTH_SHORT).show();
                break;
            case R.id.LED2:
                if (checked)
                    Toast.makeText(this, "LED2 ON", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(this, "LED2 OFF", Toast.LENGTH_SHORT).show();
                break;
            case R.id.LED3:
                if (checked)
                    Toast.makeText(this, "LED3 ON", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(this, "LED3 OFF", Toast.LENGTH_SHORT).show();
                break;
            case R.id.LED4:
                if (checked)
                    Toast.makeText(this, "LED4 ON", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(this, "LED4 OFF", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.BUTTON);
        ledp[0] = (CheckBox) findViewById(R.id.LED1);
        ledp[1] = (CheckBox) findViewById(R.id.LED2);
        ledp[2] = (CheckBox) findViewById(R.id.LED3);
        ledp[3] = (CheckBox) findViewById(R.id.LED4);
        button.setOnClickListener(new MybuttonListener());

        /*
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                ledon = !ledon;
                if (ledon)
                    button.setText("LED ALL ON");
                else
                    button.setText("LED ALL OFF");
            }
        });
        */
    }


}

