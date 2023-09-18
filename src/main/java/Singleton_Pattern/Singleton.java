package Singleton;

public class Singleton {
   // Приватне статичне поле для зберігання єдиного екземпляра
   private static Singleton instance;

   // Приватний конструктор, що забороняє створення екземплярів ззовні
   private Singleton() {

   }

   public static Singleton getInstance() {
      if(instance==null){ //якщо інстенс не створена ми будемо створювати об'єкт
         instance =new Singleton();
      }
      return instance;//якщо вже є силка на об'єкт в змінній, то просто повертаємо об'єкт
   }
}
