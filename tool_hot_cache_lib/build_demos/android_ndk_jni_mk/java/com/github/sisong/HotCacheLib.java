package com.github.sisong;

public class HotCacheLib{
    public static native int cache(String oldApkPath,String newApkPath,String cacheLibFilesDir);
    public static native int check(String oldApkPath,String newApkPath);
}
