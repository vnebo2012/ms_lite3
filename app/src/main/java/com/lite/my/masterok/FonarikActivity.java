package com.lite.my.masterok;


import android.app.Activity;
import android.hardware.Camera;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;

public class FonarikActivity extends Activity {

    private Switch mSwitch;
    private Camera camera;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fonarik);

        mSwitch = (Switch) findViewById(R.id.switch_light);
        mSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (camera == null) {
                    camera = Camera.open();
                }
                Camera.Parameters parameters = camera.getParameters();
                if (!isChecked) {
                    parameters.setFlashMode(Camera.Parameters.FLASH_MODE_OFF);
                } else {
                    parameters.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH);
                }
                camera.setParameters(parameters);
                camera.startPreview();
            }
        });
    }

    @Override
    public void onDestroy() {
        camera.release();
        super.onDestroy();
    }

}