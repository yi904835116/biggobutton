package edu.washington.yiz24.biggobutton;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    Button button;
    int count =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                count++;
                if(count == 1){
                    button.setText("You have pushed me " + count + " time!");
                }else{
                    button.setText("You have pushed me " + count + " times!");
                }
            }
        });

    }
}
