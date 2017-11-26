package tezui.shubham.m.tezui;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import io.ghyeok.stickyswitch.widget.StickySwitch;

/**
 * Created by Shubham on 11/25/2017.
 */

public class PaymentActivity extends Activity {
    ImageButton button2;
    StickySwitch sticky1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment);

        button2 = (ImageButton) findViewById(R.id.click);
        sticky1 = (StickySwitch) findViewById(R.id.sticky1);


        button2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int eventaction = event.getAction();
                switch (eventaction) {
                    case MotionEvent.ACTION_DOWN:

                        sticky1.setVisibility(View.VISIBLE);
                        button2.setVisibility(View.INVISIBLE);


                        return true;

                    case MotionEvent.ACTION_UP:
                        sticky1.setVisibility(View.INVISIBLE);
                        button2.setVisibility(View.VISIBLE);

                        break;
                }
                return false;
            }
        });
    }

}
