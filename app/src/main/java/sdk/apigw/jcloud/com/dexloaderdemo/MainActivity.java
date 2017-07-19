package sdk.apigw.jcloud.com.dexloaderdemo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import android.app.Activity;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;

import com.example.dexload.NativeLoad;

import dalvik.system.DexClassLoader;

public class MainActivity extends Activity {
    private Method methodTest;
    private final String TAG = "DexLoad";
    private DexClassLoader mDex;
    private NativeLoad mLoad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//		loadDex();
        //	test();
        mLoad = new NativeLoad("test.dex",getApplicationContext().getFilesDir().getParent(),getAssets());
        mLoad.test(this);
    }




}

