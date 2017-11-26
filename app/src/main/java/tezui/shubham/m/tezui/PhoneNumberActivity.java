package tezui.shubham.m.tezui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static tezui.shubham.m.tezui.CountryActivity.valuecodes;
import static tezui.shubham.m.tezui.CountryActivity.valuesflags;

/**
 * Created by Shubham on 11/25/2017.
 */

public class PhoneNumberActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phone_number);
        TextView phnumerb = (TextView) findViewById(R.id.textView33);
        phnumerb.setText(valuecodes);
        ImageView ivflag =(ImageView)findViewById(R.id.flag);
        ivflag.setImageResource(valuesflags);
        Button genotp = (Button)findViewById(R.id.botp);
        genotp.setBackgroundColor(Color.BLUE);
        genotp.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext(),"Generate OTP" , Toast.LENGTH_SHORT).show();

                Intent i3 = new Intent(PhoneNumberActivity.this, PaymentActivity.class);
                startActivity(i3);

            }
        });

    }
}
