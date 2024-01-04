package models;
import java.util.Arrays;


public class Tshirt {
    //fields for Tshirt
    private String name;
    private int productCode;
    private double price;
    private String brand;
    private String description;
    private String[] availableSizes;

    //Generating Constructor
    public Tshirt(String name, int productCode, double price, String brand, String description, String[] availableSizes) {
        this.name = name;
        this.productCode = productCode;
        this.price = price;
        this.brand = brand;
        this.description = description;
        this.availableSizes = availableSizes;
    }



    // Method to describe the T-shirt given in the format
    public void describeTshirt() {
        System.out.println("Item name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Product code: " + productCode);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Sizes: " + Arrays.toString(availableSizes));
        System.out.println();
    }
//Generating Getter
    public String getName() {
        return name;
    }

    public int getProductCode() {
        return productCode;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getDescription() {
        return description;
    }

    public String[] getAvailableSizes() {
        return availableSizes;
    }

// Generating Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setProductCode(Integer productCode) {
        this.productCode = productCode;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAvailableSizes(String[] availableSizes) {
        this.availableSizes = availableSizes;

    }

    }

