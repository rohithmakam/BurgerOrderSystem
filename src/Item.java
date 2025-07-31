import java.util.Objects;

public class Item {
    private String type;
    private String name;
    private double price;
    private String size = "MEDIUM";

    public Item(String type, String name, double price) {
        this.type = type.toUpperCase();
        this.name = name.toUpperCase();
        this.price = price;
    }

    public double getBasePrice() {
        return price;
    }

    public String getName() {

        if(Objects.equals(type, "SIDE") || Objects.equals(type, "DRINK")) {
            return  size + " " + name;
        }
        return name;
    }

    public double getAdjustedPrice() {
        return switch(size) {
            case "SMALL" -> getBasePrice() - 0.5;
            case "LARGE" -> getBasePrice() + 1;
            default -> getBasePrice();
        };
    }

    public void setSize(String size) {
        this.size = size.toUpperCase();
    }

    public static void printItem(String name, double price) {
        System.out.printf("%20s:%6.2f%n",name,price);
    }

    public void printItem(){
        printItem(getName(),getAdjustedPrice());
    }
}
