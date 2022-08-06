package restaurantMenu;
import java.util.ArrayList;
import java.util.Date;

public class Restaurant {
    public static void main(String[] args) {
        Menu restaurantMenu = new Menu();
        MenuItem appetizer1 = new MenuItem("buffalo wings", "meaty chicken wings with signature buffalo sauce.", 7.99, "appetizer", true);
        MenuItem mainCourse = new MenuItem("cheeseburger", "your choice of cheese, lettuce, tomato cooked to your preference.", 9.99, "Main", false);
        MenuItem dessert = new MenuItem("warm brownie", "decadent chocolate brownie, warmed with a generous scoop of icecream.", 5.00, "dessert", true);
        restaurantMenu.addMenuItem(appetizer1);
        restaurantMenu.addMenuItem(mainCourse);
        restaurantMenu.addMenuItem(dessert);
        System.out.println(restaurantMenu.showMenu());
        //System.out.println(appetizer1);

        restaurantMenu.removeMenuItem(mainCourse);
        System.out.println(restaurantMenu.showMenu());


    }
}
