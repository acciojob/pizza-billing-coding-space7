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
            this.price = 300;
        else
            this.price = 400;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!this.isExtraCheeseAdded){
            this.isExtraCheeseAdded = true;
            this.price += 80;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!this.isExtraToppingsAdded) {
            this.isExtraToppingsAdded = true;
            if (this.isVeg)
                this.price += 70;
            else
                this.price += 120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!this.isTakeawayAdded){
            this.isTakeawayAdded = true;
            this.price += 20;
        }
    }

    public String getBill(){
        // your code goes here
        int toppings;
        if(this.isVeg)
            toppings = 70;
        else
            toppings = 120;

        StringBuilder str = new StringBuilder("");
        str.append("Base Price Of The Pizza: "+(isVeg?300:400)+'\n');
        if(this.isExtraCheeseAdded)
            str.append("Extra Cheese Added: "+80+'\n');
        if(this.isExtraToppingsAdded)
            str.append("Extra Toppings Added: "+toppings+'\n');
        if(this.isTakeawayAdded)
            str.append("Paperbag Added: "+20+'\n');

        str.append("Total Price: "+this.price+'\n');

        this.bill = str.toString();
        return this.bill;
    }
}


//package com.driver;
//
//public class Pizza {
//
//    private int price;
//    private Boolean isVeg;
//    private String bill;
//    private boolean ischeese = false;
//    private boolean istoppings = false;
//    private boolean ispaperbag = false;
//    public Pizza(Boolean isVeg){
//        this.isVeg = isVeg;
//        // your code goes here
//        if(isVeg){
//            this.price = 300; // veg pizza price
////            String base = "Base Price Of The Pizza: 300\n";
//        }
//        else {
//            this.price = 400; // non-veg pizza price
////            String base = "Base Price Of The Pizza: 400\n";
//        }
//        return;
//    }
//
//    public int getPrice(){
//
////        this.bill += this.price;
//        return this.price;
//    }
////    public int setPrice(int price){ // to set pizza price from deluxe
////
//////        this.bill += this.price;
////        this.price += price;
////        return this.price;
////    }
//
//    public void addExtraCheese(){
//        // your code goes here
//        if(this.ischeese == false){
//            this.ischeese = true;
//            this.price += 80;
////            String cheese = "Extra Cheese Added: 80\n";
//        }
//
//        return;
//    }
//
//    public void addExtraToppings(){
//        // your code goes here
//        if (isVeg && this.istoppings == false){
//            this.istoppings = true;
//            this.price += 70;
////            String toppings = "Extra Toppings Added: 70\n";
//
//        }
//        else if (!isVeg && this.istoppings ==false){
//            this.istoppings = true;
//            this.price += 120;
////            String toppings = "Extra Toppings Added: 120\n";
//        }
//        return;
//    }
//
//    public void addTakeaway(){
//        // your code goes here
//        if (this.ispaperbag == false){
//            this.ispaperbag = true;
//            this.price += 20;
////            String paperbag = "Paperbag Added: 20\n";
//        }
//
//        return;
//    }
//
//    public String getBill(){
//        // your code goes here
//        this.bill =("Base Price Of The Pizza: "+(isVeg?300:400)+"\nExtra Cheese Added: 80\nExtra Toppings Added: "+(isVeg?70:120)+(ispaperbag?"\nPaperbag Added: 20":"")+"\nTotal Price: "+this.price+"\n");
//        return this.bill;
//    }
//}