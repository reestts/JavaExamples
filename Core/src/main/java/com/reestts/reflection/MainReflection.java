package com.reestts.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MainReflection {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        MyClass myClass = new MyClass();
        Class class1 = myClass.getClass();
        Class class2 = MyClass.class;
        Class class3 = Class.forName("com.reestts.reflection.MyClass");

        Field[] fields = class1.getFields();
        for (Field field : fields) {
            System.out.println("Field name = " + field.getName() + ". Field type = " + field.getType());
        }

        System.out.println("*****");

        Field[] allFields = class2.getDeclaredFields();
        for (Field field : allFields) {
            System.out.println("Field name = " + field.getName() + ". Field type = " + field.getType());
        }

        System.out.println("*****");

        Method method = class3.getMethod("updateType");
        System.out.println("Method name = " + method.getName() + ". Method type = " + method.getReturnType());

        System.out.println("*****");

        Constructor constructor = class3.getConstructor(int.class, String.class, String.class);
        System.out.println(Arrays.toString(constructor.getParameterTypes()));
    }
}
