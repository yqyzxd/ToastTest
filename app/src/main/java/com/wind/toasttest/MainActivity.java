package com.wind.toasttest;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;

import com.wind.toastlib.TransientFrame;

public class MainActivity extends Activity {
    private View content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        content = findViewById(R.id.content);


        content.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //showToast("显示吐司");
                 TransientFrame.make(content,"新吐司",TransientFrame.LENGTH_LONG).show();
            }

        });


    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        doNext(requestCode, grantResults);
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    private void doNext(int requestCode, int[] grantResults) {
        if (requestCode == 1215) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            } else {
            }
        }
    }


}
