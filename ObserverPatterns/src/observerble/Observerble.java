package observerble;

/**
 * @program: ObserverPatterns
 * @description: 观察者超类
 * @author: David
 * @create: 2018-07-29 23:28
 **/
public interface Observerble {

    /**
     * 接受主题状态值
     * @param temperature 温度
     * @param humidity 湿度
     * @param pressure 压力
     * @return
     */
    public void update(float temperature, float humidity, float pressure);
}
