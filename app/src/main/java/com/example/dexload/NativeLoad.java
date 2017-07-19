package com.example.dexload;

import android.app.Activity;
import android.content.res.AssetManager;
import dalvik.system.DexClassLoader;

public class NativeLoad {
    private DexClassLoader mDex;
    static {
        System.loadLibrary("DexLoad");
    }
    public NativeLoad(String dexName, String DataPath, AssetManager asset) {
        loadDex(dexName,DataPath,asset);
    }
    native private void loadDex(String dexName,String DataPath,AssetManager asset);
    native public void test(Activity ac);
}
