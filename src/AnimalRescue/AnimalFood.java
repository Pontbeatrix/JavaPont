package AnimalRescue;

public class AnimalFood {

    private int foodprice;
    private double quantityfood;
    private int instock;


    AnimalFood(int foodprice, double quantityfood, int instock) {


        this.foodprice = foodprice;
        this.quantityfood = quantityfood;
        this.instock = instock;


    }

    public int getFoodprice() {
        return foodprice;
    }

    public double getQuantityfood() {
        return quantityfood;


    }

    public int getInstock() {
        return instock;

    }
}