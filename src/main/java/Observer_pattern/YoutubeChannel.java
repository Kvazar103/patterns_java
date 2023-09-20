package Observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Publisher{

    private List<Subscriber> subscribers=new ArrayList<>();
    private List<String> videos=new ArrayList<>();
    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscriber(String message) {
        subscribers.forEach(subscriber -> subscriber.showNotification(message));
    }

    public void uploadNewVideo(String videoTitle){
        videos.add(videoTitle);
        notifySubscriber(videoTitle);
    }
}
