package observer.observerimpl;

import observer.Subject;
import observerble.Observerble;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: ObserverPatterns
 * @description: 主题实现类
 * @author: David
 * @create: 2018-07-29 23:23
 **/
public class SubjectImpl implements Subject {

    private List<Observerble> observers;

    private float temperature;

    private float humidity;

    private float pressure;

    public SubjectImpl() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observerble o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observerble o) {
        int i = observers.indexOf(o);
        if (i > 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        observers.stream().forEach(o -> o.update(temperature, humidity, pressure));
    }

    /**
     * 改变主题状态值,并通知所有观察者
     * @param
     * @return
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObserver();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
