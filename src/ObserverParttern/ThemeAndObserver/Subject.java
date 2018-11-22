package ObserverParttern.ThemeAndObserver;
//主题接口
public interface Subject {
    public void registerObserver(Observer o);
    public  void removeObserver(Observer o);
    //当主题状态改变时这个方法会被调用通知所有的观察者
    public void notifyObserver();
}
