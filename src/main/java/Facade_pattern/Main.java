package Facade_pattern;

import java.time.LocalDateTime;
import java.util.UUID;

//"Фасад" - це структурний патерн проектування,
//який надає простий інтерфейс складній системі класів, бібліотеці або фреймворку.
public class Main {
    public static void main(String[] args) {
        UUID userId=UUID.randomUUID();
        NotificationFacade notificationFacade=new NotificationFacade();
        //Відправка СМС
        notificationFacade.sendSms(userId);
        //Відправка Email
        notificationFacade.sendEmail(userId);

        //Замість того щоб тут писати складну логіку яка є в NotificationFacade в методах sendSms i sendEmail
        // ми вставили ту логіку в NotificationFacade а тут просто викликаємо методи
        // і тим самим ми скриваємо складну структуру надаючи простий інтерфейс для користування
    }
}
