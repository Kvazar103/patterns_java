package Singleton_Pattern;

public class Main {
//    Паттерн Singleton в Java використовується для забезпечення того, що в класі буде тільки один екземпляр,
//    і ми матимемо глобальну точку доступу до цього екземпляра.
//    Це корисно, коли маємо клас, який координує доступ до певного ресурсу, такого як база даних або конфігураційний файл,
//    і ми не хочемо, щоб було можливо створювати багато екземплярів цього класу.
    public static void main(String[] args) {

        Singleton singleton1=Singleton.getInstance();
        System.out.println(singleton1.toString());

        Singleton singleton2=Singleton.getInstance();
        System.out.println(singleton2.toString());
        //в консолі одинакові значення це означає що дві змінні посилаються на один і той самий об'єкт в пам'яті
    }
}
