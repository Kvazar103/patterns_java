package Strategy_pattern.Better_example_of_pattern_Strategy;

public class Developer {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
    public void executeActivity(){
        activity.justDoIt();
    }
}
