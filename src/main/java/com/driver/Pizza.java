package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean isExtraCheeseAdded;
    private boolean isExtraToppingsAdded;
    private boolean isTakeawayAdded;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
            price = 300;
        else
            price = 400;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheeseAdded)
            isExtraCheeseAdded = true;
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppingsAdded)
            isExtraToppingsAdded = true;
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeawayAdded)
            isTakeawayAdded = true;
    }

    public String getBill(){
        // your code goes here
        int toppings,total=price;
        if(isVeg)
            toppings = 70;
        else
            toppings = 120;

        StringBuilder str = new StringBuilder("");
        str.append("Base Price Of The Pizza: "+price+'\n');
        if(isExtraCheeseAdded) {
            str.append("Extra Cheese Added: "+80+'\n');
            total += 80;
        }
        if(isExtraToppingsAdded) {
            str.append("Extra Toppings Added: "+toppings+'\n');
            total += toppings;
        }
        if(isTakeawayAdded) {
            str.append("Paperbag Added: "+20+'\n');
            total += 20;
        }
        str.append("Total Price: "+total);

        bill = str.toString();
        return this.bill;
    }
}
