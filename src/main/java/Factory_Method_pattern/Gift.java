package Factory_Method_pattern;
//creator бстрактний клас або інтерфейс, який визначає методи для створення об'єктів.
// Він може також містити інші методи, які використовують створювані об'єкти.
public abstract class Gift {//клас абстрактний, бо не будемо створювати його екземпляри, а тільки екземпляри його класів наслідників
    public abstract String getName();

}