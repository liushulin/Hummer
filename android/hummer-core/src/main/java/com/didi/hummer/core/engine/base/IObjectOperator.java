package com.didi.hummer.core.engine.base;

import com.didi.hummer.core.engine.JSCallback;
import com.didi.hummer.core.engine.JSValue;

/**
 * JSValue的对象相关的操作接口类
 *
 * Created by XiaoFeng on 2019-09-25.
 */
public interface IObjectOperator {

    int getInt(String key);

    long getLong(String key);

    double getDouble(String key);

    boolean getBoolean(String key);

    String getString(String key);

    JSValue getJSValue(String key);

    void set(String key, Number value);

    void set(String key, boolean value);

    void set(String key, String value);

    void set(String key, Object value);

    void set(String key, JSValue value);

    void set(String key, JSCallback value);

    //Object... params 这种可扩展参数（也称为可变参数）语法在 Java 1.5（也被称为 Java 5）中引入，并且在 Java 1.8（也被称为 Java 8）以及后续版本中都是支持的
    Object callFunction(String funcName, Object... params);

}
