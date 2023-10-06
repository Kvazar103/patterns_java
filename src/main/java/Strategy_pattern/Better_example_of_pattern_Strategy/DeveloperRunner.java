package Strategy_pattern.Better_example_of_pattern_Strategy;
//даний шаблон частково похожий на шаблон state, різниця в тому що ми керуємо зміною активності
// в класі Developer а не в клієнтському класі
public class DeveloperRunner {
    public static void main(String[] args) {
        Developer developer=new Developer();

        developer.setActivity(new Sleeping());
        developer.executeActivity();

        developer.setActivity(new Training());
        developer.executeActivity();

        developer.setActivity(new Coding());
        developer.executeActivity();

        developer.setActivity(new Reading());
        developer.executeActivity();

        developer.setActivity(new Sleeping());
        developer.executeActivity();
    }
}
