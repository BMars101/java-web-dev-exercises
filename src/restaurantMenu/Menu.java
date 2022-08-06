package restaurantMenu;
//import java.util.Calendar;
import java.util.ArrayList;
//import java.util.HashMap;
import java.util.Date;
import java.util.Scanner;

public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;

    public Menu(){
        this.lastUpdated = new Date();
    }


    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return this.menuItems;
    }

    public Date getLastUpdated() {
        return this.lastUpdated;
    }

    public void addMenuItem(MenuItem itemToAdd){
        this.menuItems.add(itemToAdd);
        this.lastUpdated = new Date();
    }

    public void removeMenuItem(MenuItem itemToRemove){
        this.menuItems.remove(itemToRemove);
        this.lastUpdated = new Date();
    }
    public void removeByInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Select a number corresponding to the menu item you would like to remove:");
        this.showMenu();
        int indexToRemove = (input.nextInt() - 1);
        input.close();

        this.menuItems.remove(indexToRemove);
    }

    public void simpleShowItem(int index){
        MenuItem theItem = this.menuItems.get(index);
        System.out.println(theItem.getName() + ": " + theItem.getPrice());
    }
    public void showItem(){
        Scanner input = new Scanner(System.in);
        System.out.println(String.format("Select a number from %s to %s for the item you would like to see: ", 0, (this.menuItems.size()-1)));
        int itemToShow = input.nextInt();
        this.simpleShowItem(itemToShow);
        input.close();
    }
    public String showMenu(){
       String returnString = "";
       for(MenuItem item : this.menuItems){
           returnString += item.toString() +"\n";
       }
       return returnString;
    }

    public void showLastUpdated(){
        System.out.println(String.format("The menu was last updated on: %s", this.getLastUpdated()));
    }

}
