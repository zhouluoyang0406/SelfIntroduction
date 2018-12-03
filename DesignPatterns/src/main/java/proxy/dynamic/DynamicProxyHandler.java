package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyHandler implements InvocationHandler {
    private Object object;
    public DynamicProxyHandler(final Object object) {
        this.object = object;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName() == "killBoss") {
            System.out.println("前准备");
            Object result = method.invoke(object, args);
            System.out.println("后准备");
            return result;
        }else {
            Object result = method.invoke(object, args);
            return result;
        }
    }
}