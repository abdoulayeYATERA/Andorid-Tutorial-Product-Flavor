package yadevapp.com.android_tutorial_flavor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private final String TAG = getClass().getSimpleName();
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: ");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        if (BuildTypeConfig.ENABLE_ANALYTICS) {
            Log.d(TAG, "onCreate: analytics enabled");
            //start analytics ...
            //...
        } else {
            Log.d(TAG, "onCreate: analytics disabled");
        }
    }
}
