package util;

import java.lang.reflect.Proxy;

public class ProxyClassFactory {

    public static Object getProxyInstance(Object obj) {
        //创建代理类对象
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        myInvocationHandler.setObject(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), myInvocationHandler);
    }


}
