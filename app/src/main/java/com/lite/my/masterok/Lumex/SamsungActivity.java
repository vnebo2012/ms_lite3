package com.lite.my.masterok.Lumex;


import android.app.Activity;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

import com.lite.my.masterok.R;
import com.lite.my.masterok.Start_Activity;

import java.util.Timer;

public class SamsungActivity extends Activity implements SensorEventListener {

    private SensorManager mSensorManager;
    private Sensor mLightSensor;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mSensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        mLightSensor = mSensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
        setContentView(R.layout.activity_lumex);
    }

    protected void onResume() {
        mSensorManager.registerListener(this, mLightSensor, SensorManager.SENSOR_DELAY_UI);
        super.onResume();
    }

    protected void onPause() {
        mSensorManager.unregisterListener(this);
        super.onPause();
    }

    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }

    private enum LightLevel {
        LIGHT_LVL_UNKNOWN, LIGHT_LVL_1, LIGHT_LVL_2, LIGHT_LVL_3, LIGHT_LVL_4
    }

    private LightLevel getLightLevelBySensorValue(float sensorValue) {
        if (sensorValue < 1000.0) {
            return LightLevel.LIGHT_LVL_1;
        }
        if (sensorValue >= 1000.0 && sensorValue < 9000.0) {
            return LightLevel.LIGHT_LVL_2;
        }
        if (sensorValue >= 9000.0 && sensorValue < 15000.0) {
            return LightLevel.LIGHT_LVL_3;
        }
        if (sensorValue >= 15000) {
            return LightLevel.LIGHT_LVL_4;
        }
        return LightLevel.LIGHT_LVL_UNKNOWN;
    }

    public void onSensorChanged(SensorEvent event) {
        final LightLevel lightLevel = getLightLevelBySensorValue(event.values[0]);
        if (event.sensor.getType() == Sensor.TYPE_LIGHT) {
            TextView txt = (TextView) findViewById(R.id.textViewSensorValue);
            txt.setText("Light level: " + lightLevel);
        }
    }

    @Override
    public void onBackPressed() {
        Timer t = new Timer();
        t.cancel();
        Intent a = new Intent(this, Start_Activity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
    }
}
