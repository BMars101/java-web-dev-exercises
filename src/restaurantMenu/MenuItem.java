package restaurantMenu;

import java.util.Objects;

public class MenuItem {
    private String name;
    private String description;
    private double price;
    private String category;
    private boolean isNew;

    public MenuItem(String name, String description, double price ){
       this.name = name;
       this.description = description;
       this.price = price;

       this.category = "No category";
       this.isNew = false;
    }

    public MenuItem(String name, String description, double price, String category, boolean isNew){
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price){
        this.price = price;
    }


    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean isNew) {
        this.isNew = isNew;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public boolean isNew(){
        return this.isNew;
    }


    @Override
    public String toString() {
        String returnString= "";
        returnString += "Item name: " + this.name + "\n";
        returnString += "Description: " + this.description + "\n";
        returnString += "Category: " + this.category + "\n";
        returnString += "Price: " + this.price + "\n";
        returnString += "Is item new? " + this.isNew + "\n";

        return returnString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return name == menuItem.name && description == menuItem.description;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
