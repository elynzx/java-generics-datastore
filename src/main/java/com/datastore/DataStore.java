package com.datastore;

import java.util.List;
import java.util.Map;

public class DataStore<T, K> {
    private final List<T> dataList;
    private final Map<K, T> dataMap;

    public DataStore(List<T> dataList, Map<K, T> dataMap) {
        this.dataList = dataList;
        this.dataMap = dataMap;
    }

}
