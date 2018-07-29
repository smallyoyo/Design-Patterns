package observer;

import observerble.Observerble;

/**
 * @program: ObserverPatterns
 * @description: 主题类
 * @author: David
 * @create: 2018-07-29 23:21
 **/
public interface Subject {

    /**
     * 注册一个观察者
     * @param
     * @return
     */
    public void registerObserver(Observerble o);

    /**
     * 删除一个观察者
     * @param
     * @return
     */
    public void removeObserver(Observerble o);

    /**
     * 通知所有观察者
     * @param
     * @return
     */
    public void notifyObserver();
}
