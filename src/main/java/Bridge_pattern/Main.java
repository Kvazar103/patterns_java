package Bridge_pattern;

//Цей патерн дозволяє розділити один великий клас або кілька тісно пов'язаних між собою класів на дві окремі ієрархії,
// які можна розробляти незалежно один від одного. Іншими словами, це процес поступового додавання функціональності,
// при якому абстракція та реалізація виділяються у різні класи.
//«Міст» може бути корисним, коли розробники намагаються розширити підкласи у двох незалежних вимірах.
// Це часто проблема при використанні успадкування, і Bridge намагається вирішити її, перемикаючи успадкування на композицію.

//Міст - це патерн проектування, який розділяє класи на дві групи на групу класів
// які відповідають за певну першу логіку, найчастіше спільну логіку і групу класів відповідаючи за другу,
// найчастіше більш унікальну/малу/налаштовану логіку, і дозволяти цим групам класів взаємно працювати разом.
public class Main {
    public static void main(String[] args) {
        Triangle triangle=new Triangle(new GreenColor());
        triangle.draw();
    }
    //Патерн містить дві окремі ієрархії класів
    //першу з спільною логікою(абстракцією) і другу групу, з більш детально логікою(реалізацією),
    //в нашому випадку клас Shape і наслідники(Triangle, Rectangle) це Абстракція(перша група),
    //а клас Color (і класи BlackColor, GreenColor і RedColor) це Реалізація(друга група).
}
