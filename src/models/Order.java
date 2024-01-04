package models;
import java.util.Arrays;
public class Order {
    //fields for Order
    private String name;
    private String phoneNumber;
    private String[] itemCodes;
    private int[] prices;

    //Getter Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String[] getItemCodes() {
        return itemCodes;
    }

    public void setItemCodes(String[] itemCodes) {
        this.itemCodes = itemCodes;
    }

    public int[] getPrices() {
        return prices;
    }

    public void setPrices(int[] prices) {
        this.prices = prices;
    }

    // Constructor
    public Order(String name, String phoneNumber, String[] itemCodes, int[] prices) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.itemCodes = itemCodes;
        this.prices = prices;

        }

        //Method for total price
    private double calculateTotalPrice() {
        double total = 0;
        for (int price : prices) {
            total += price;
        }
        return total;
    }
        // Method to print the bill with VAT and total price
        public void printBill() {
            double total = calculateTotalPrice();
            double vat = total * 0.13;

            System.out.println("Order details:");
            System.out.println("Name: " + name);
            System.out.println("Phone number: " + phoneNumber);
            System.out.println("Items: " + Arrays.toString(itemCodes));
            System.out.println("Prices: " + Arrays.toString(prices));

            //vat and total price
            System.out.println("VAT (13%): " + vat);
            System.out.println("Total Price: " + (total + vat));
            System.out.println(); // f0r empty line
        }


    }


