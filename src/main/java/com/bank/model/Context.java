package main.java.com.bank.model;

import java.util.HashMap;
import java.util.Map;

public class Context {

    private Map<String, Object> data = new HashMap<>();

    public void setData(String key, Object value) {
        data.put(key, value);
    }

    public Object getData(String key) {
        return data.get(key);
    }
}
