package com.example;

import android.app.Activity;
import android.os.Bundle;

// Add some dummy imports to actually use the dependencies.
import org.acra.*;
import com.google.inject.*;
import com.google.zxing.*;

public class IvyAndroidExampleActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}