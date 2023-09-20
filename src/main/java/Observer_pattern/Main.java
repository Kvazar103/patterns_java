package Observer_pattern;
//Цей паттерн визначає залежність одного або більше об'єктів (спостерігачів) від іншого об'єкта (суб'єкта) так,
// що коли суб'єкт змінює свій стан, всі його спостерігачі автоматично повідомляються і оновлюються.
public class Main {
    public static void main(String[] args) {
        YoutubeChannel youtubeChannel=new YoutubeChannel();

        YoutubeUser user1=new YoutubeUser();
        YoutubeUser user2=new YoutubeUser();
        YoutubeUser user3=new YoutubeUser();

        youtubeChannel.addSubscriber(user1);
        youtubeChannel.addSubscriber(user2);
        youtubeChannel.addSubscriber(user3);

        youtubeChannel.uploadNewVideo("Java Tutorial #3. Observer pattern.");

        //youtubechannel- субєкт. user1,user2,user3 - спостерігачі тоді ми оновлюємо субєкт і в нас виходить нове відео
        //і після того у нас виходить автоматичне сповіщення всіх зареєстрованих/підписаних спостерігачів
    }
}
