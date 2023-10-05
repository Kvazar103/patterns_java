package Builder_pattern;

public class Pizza {
    String topping1;
    String topping2;
    String topping3;
    String topping4;

    //реалізувати два і більше конструктора ми не можемо отже слід використати патерн білдер
//    Pizza(String topping1,String topping2){
//        this.topping1=topping1;
//        this.topping2=topping2;
//    }
//    Pizza(String topping1,String topping4){
//        this.topping1=topping1;
//        this.topping4=topping4;
//    }
    //для реалізації патерна створюємо публічний статичний клас

    public static class Builder{
        private final Pizza pizza;

        Builder(){
            pizza=new Pizza();
        }
        public Builder topping1(String topping1){
            pizza.topping1=topping1;
            return this;
        }
        public Builder topping2(String topping2){
            pizza.topping2=topping2;
            return this;
        }
        public Builder topping3(String topping3){
            pizza.topping3=topping3;
            return this;
        }
        public Builder topping4(String topping4){
            pizza.topping4=topping4;
            return this;
        }
        public Pizza build(){
            return pizza;
        }
    }

}
