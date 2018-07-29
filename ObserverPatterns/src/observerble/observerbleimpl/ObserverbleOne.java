package observerble.observerbleimpl;

import observer.Subject;
import observer.observerimpl.SubjectImpl;
import observerble.Observerble;

/**
 * @program: ObserverPatterns
 * @description: 观察者一
 * @author: David
 * @create: 2018-07-29 23:47
 **/
public class ObserverbleOne implements Observerble {

    private Subject subject;

    private float temperature;

    private float humidity;

    private float pressure;

    public ObserverbleOne(Subject subject) {
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
        System.out.println("I'm observerbleOne: just now temperature is "+temperature
            +"and just now humidity is "+humidity
            +"and just now pressure is "+pressure
        );
    }

    public void displayGet(Subject sub) {
        SubjectImpl subject = (SubjectImpl)sub;
        System.out.println("I'm observerbleOne: just now temperature is "+subject.getTemperature()
                +"and just now humidity is "+subject.getHumidity()
                +"and just now pressure is "+subject.getPressure()
        );
    }
}
