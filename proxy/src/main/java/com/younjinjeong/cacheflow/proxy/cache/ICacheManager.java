package com.younjinjeong.cacheflow.proxy.cache;

public interface ICacheManager {
    String get(String key);

    void set(String key, String value);
}
