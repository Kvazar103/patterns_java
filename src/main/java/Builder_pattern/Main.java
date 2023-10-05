package Builder_pattern;

//Паттерн "Білдер" (Builder pattern) - це породжуючий паттерн проектування, який використовується для конструювання
//складних об'єктів крок за кроком. Він дозволяє створювати об'єкти зі складними конфігураціями,
//не забруднюючи конструктори з великою кількістю параметрів. Цей паттерн особливо корисний,
//коли об'єкт має багато параметрів, але ви хочете, щоб не всі вони були обов'язковими, і деякі з них можуть
//мати значення за замовчуванням.Основна ідея паттерна "Білдер" полягає в тому,
//що він використовує вкладений статичний клас для налаштування параметрів об'єкта, а потім створює цей об'єкт за допомогою цих налаштувань.
public class Main {
    public static void main(String[] args) {
        Pizza pizza=new Pizza.Builder()
                .topping1("Cheese")
                .topping2("Tomato")
                .topping3("Mushrooms")
                .build();

        Pizza pizza2=new Pizza.Builder()
                .topping1("Cheese")
                .topping2("Tomato")
                .topping4("Mushrooms")
                .build();
        System.out.println(pizza.topping1);
        System.out.println(pizza.topping2);
        System.out.println(pizza.topping3);

    }
}
