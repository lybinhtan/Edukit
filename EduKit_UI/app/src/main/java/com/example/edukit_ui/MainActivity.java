package com.example.edukit_ui;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.ref.ReferenceQueue;

public class MainActivity extends AppCompatActivity {

    TextView txt_View;
    ImageView img_Check;
    Button btn_On, btn_Off, btn_Discover, btn_Paired;

    //private static final int REQUEST_ENABLE_BT = 0;
    private static final int REQUEST_DISCOVER_BT = 1;


    BluetoothAdapter ble_adap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_View        = findViewById(R.id.txt_View);
        img_Check       = findViewById(R.id.img_Check);
        btn_On          = findViewById(R.id.btn_On);
        btn_Off         = findViewById(R.id.btn_Off);
        btn_Discover    = findViewById(R.id.btn_Discover);
        btn_Paired      = findViewById(R.id.btn_Paired);

        ble_adap        = BluetoothAdapter.getDefaultAdapter();

        // check bluetooth status

        /*if(ble_adap == null){
            txt_View.setText("Bluetooth is not available");
        }
        else {
            txt_View.setText("Bluetooth is available");
        }*/

        // Set image status

        /*if(ble_adap.isEnabled()){
            img_Check.setImageResource(R.drawable.ic_action_on);
        }

        else{
            img_Check.setImageResource(R.drawable.ic_action_off);
        }*/

        //Turn on BL

        btn_On.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!ble_adap.isEnabled()){
                    Toast.makeText(MainActivity.this, "Turning on Bluetooth", Toast.LENGTH_SHORT).show();

                    Intent intent =  new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                    startActivityForResult(intent,REQUEST_DISCOVER_BT );
                }

                else{
                    Toast.makeText(MainActivity.this, "Bluetooth is Ready", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Turn of BL

        btn_Off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ble_adap.isEnabled()){
                    ble_adap.disable();
                    Toast.makeText(MainActivity.this, "Turning off Bluetooth", Toast.LENGTH_SHORT).show();
                    img_Check.setImageResource(R.drawable.ic_action_off);
                }

                else{
                    Toast.makeText(MainActivity.this, "Bluetooth is Off", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // next Activity

        btn_Paired.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,UI_Control.class );
                startActivity(intent);

            }
        });

    }


}
