package com.lite.my.masterok.Lumex;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.lite.my.masterok.R;

import java.util.Locale;

public class LumexActivity extends Activity {
    SensorManager sensormanager;
    Sensor lightsensor;
    TextView textLightValue;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lumex);

        TextView textLightSensor = (TextView) findViewById(R.id.info);
        textLightValue = (TextView) findViewById(R.id.textViewSensorValue);

        sensormanager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        lightsensor = sensormanager.getDefaultSensor(Sensor.TYPE_LIGHT);

        if (lightsensor == null) {
            //textLightSensor.setText("Датчик освещения не обнаружен!");

            Toast toast = Toast.makeText(getApplicationContext(),
                    "SENSOR NO!", Toast.LENGTH_SHORT);
                    //"Датчик освещения не обнаружен!", Toast.LENGTH_SHORT);
            toast.show();

        } else {
            //textLightSensor.setText("Датчик освещения " + lightsensor.getName()
                  //  + "доступен");

            Toast toast = Toast.makeText(getApplicationContext(),
                    "SENSOR OK!", Toast.LENGTH_SHORT);
            toast.show();
            sensormanager.registerListener(LightSensorListener, lightsensor,
                    SensorManager.SENSOR_DELAY_NORMAL);
        }
    }

    private final SensorEventListener LightSensorListener = new SensorEventListener() {

        @Override
        public void onAccuracyChanged(Sensor sensor, int accuracy) {
            // TODO Auto-generated method stub
        }

        @Override
        public void onSensorChanged(SensorEvent event) {
            if (event.sensor.getType() == Sensor.TYPE_LIGHT) {
                //textLightValue.setText("%.0f" event.values[0]+" lm");
                textLightValue.setText(String.format(Locale.US, "%.0f", event.values[0]) + " lux");
            }
        }

    };

    public void onClickSamsung(View view) {
        Intent a = new Intent(this,SamsungActivity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
        long mills = 15L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
    }
}