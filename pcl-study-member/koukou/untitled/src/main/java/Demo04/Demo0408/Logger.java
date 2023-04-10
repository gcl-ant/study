package Demo04.Demo0408;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class Logger implements InvocationHandler {

    private Object target;

    private Map<String, Integer> methodCallCount = new HashMap<>();
    private Map<String, Long> methodTotalTime = new HashMap<>();

    public Logger(Object target) {
        this.target = target;
    }

    public final static void print(String functionName, long excuteTime) {
        System.out.println(String.format("%s 方法执行的当前执行时间是 %d", functionName, excuteTime));
    }

    public static <T> T createProxy(T target) {
        return (T) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new Logger(target)
        );
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime = System.currentTimeMillis();

        Object result = method.invoke(target, args);

        long endTime = System.currentTimeMillis();

        long excuteTime = endTime - startTime;

        String functionName = method.getName();

        saveData(functionName, excuteTime);

        print(functionName, excuteTime);

        return result;
    }

    private void saveData(String functionName, long excuteTime) {
        methodCallCount.put(functionName, methodCallCount.getOrDefault(functionName, 0) + 1);
        methodTotalTime.put(functionName, methodTotalTime.getOrDefault(functionName, 0L) + excuteTime);
    }

    public void printMethodStatictics() {
        String maxCalledMethod = "";
        int maxCallCount = 0;
        String maxExcuteTimeMethod = "";
        long maxExceutionTime = 0;

        for (Map.Entry<String, Integer> entry : methodCallCount.entrySet()) {

            String methodName = entry.getKey();
            int callCount = entry.getValue();
            long totalTime = methodTotalTime.get(methodName);
            long avgTime = totalTime / callCount;

            if (callCount > maxCallCount) {
                maxCalledMethod = methodName;
                maxCallCount = callCount;
            }
            if (totalTime > maxExceutionTime) {
                maxExcuteTimeMethod = methodName;
                maxExceutionTime = totalTime;
            }

            System.out.println(String.format("方法 %s 被执行  %d 次。平均执行时间是 %d ms", methodName, callCount, avgTime));
        }

        System.out.println(String.format("方法 %s ,最大时间是 %d ms", maxCalledMethod, maxCallCount));
        System.out.println(String.format("方法 %s , 最多执行时间数是 %d ms", maxExcuteTimeMethod, maxExceutionTime));
    }
}
