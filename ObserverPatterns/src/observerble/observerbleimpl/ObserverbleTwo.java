package observerble.observerbleimpl;

import observer.Subject;
import observerble.Observerble;

/**
 * @program: ObserverPatterns
 * @description: 观察者2
 * @author: David
 * @create: 2018-07-29 23:51
 **/
public class ObserverbleTwo implements Observerble {

    private Subject subject;

    private float temperature;

    private float humidity;

    private float pressure;

    public ObserverbleTwo(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("I'm observerbleTwo: just now temperature is "+temperature
                +"and just now humidity is "+humidity
                +"and just now pressure is "+pressure
        );
    }
}
