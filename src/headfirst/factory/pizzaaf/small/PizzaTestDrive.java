package headfirst.factory.pizzaaf.small;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        PizzaIngredientFactory nyIn=new NYPizzaIngredientFactory();
        nyIn.createDough();
        nyIn.toString();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Sangwon ordered a " + pizza + "\n");
 
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Hwan ordered a " + pizza + "\n");
 }
}