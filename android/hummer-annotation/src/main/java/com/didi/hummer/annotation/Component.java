package com.didi.hummer.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Component {
    String value() default "";
}

/**
 * 注解
 @Target(ElementType.TYPE)：这表示该Component注解只能用于类、接口（包括注解类型）或枚举声明上。
 @Retention(RetentionPolicy.RUNTIME)：这表示该Component注解在运行时仍然可见，因此可以通过反射来读取它。
 public @interface Component：这定义了一个名为Component的公共注解。
 String value() default "";：这定义了一个名为value的元素，其类型为String，并为其提供了一个默认值""（空字符串）。当使用这个注解时，可以选择性地为value提供一个值。
 总的来说，这个Component注解可以被用在类、接口或枚举上，并且它有一个可选的value元素。该注解在运行时仍然可见，因此可以用于各种运行时处理，如依赖注入、AOP等
 */