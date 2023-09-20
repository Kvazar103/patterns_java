package Observer_pattern;

public interface Publisher {
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubscriber(String message);
}
