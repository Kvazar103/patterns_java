package Factory_Method_pattern;

public class Main {
//    Патерн Factory Method використовується,
//    коли необхідно змінювати тип створюваних об'єктів в залежності від ситуації або вимог програми.
    public static void main(String[] args) {
        Gift giftA=new GiftFactory().createGift(15);
        System.out.println(giftA.getName());
        Gift giftB=new GiftFactory().createGift(25);
        System.out.println(giftB.getName());
    }
}
