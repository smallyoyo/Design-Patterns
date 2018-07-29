import observer.Subject;
import observer.observerimpl.SubjectImpl;
import observerble.Observerble;
import observerble.observerbleimpl.ObserverbleOne;
import observerble.observerbleimpl.ObserverbleTwo;

/**
 * @program: ObserverPatterns
 * @description: 客户端测试
 * @author: David
 * @create: 2018-07-29 23:55
 **/
public class ClientMain {
    public static void main(String[] args) {
        SubjectImpl subject = new SubjectImpl();
        ObserverbleOne observerble1 = new ObserverbleOne(subject);
        ObserverbleTwo observerble2 = new ObserverbleTwo(subject);
        //主题主动推送
        subject.setMeasurements(24,56,32);
        //观察者拉取
        observerble1.displayGet(subject);

    }
}
