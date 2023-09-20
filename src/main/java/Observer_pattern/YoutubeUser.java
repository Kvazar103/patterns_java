package Observer_pattern;

public class YoutubeUser implements Subscriber{
    @Override
    public void showNotification(String text) {
        System.out.println("New video: "+text);
    }
}
