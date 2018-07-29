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
        Subject subject = new SubjectImpl();
        Observerble observerble1 = new ObserverbleOne(subject);
        Observerble observerble2 = new ObserverbleTwo(subject);
        ((SubjectImpl) subject).setMeasurements(24,56,32);
    }
}
