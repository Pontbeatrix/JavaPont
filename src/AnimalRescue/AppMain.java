package AnimalRescue;

public class AppMain {


    public static void main(String[] args) {

        Dog oscar = new Dog();

        oscar.setName("Oscar");
        System.out.println("Dog name: " + (oscar.getName()));
        oscar.setAge(9);
        System.out.println("Age is: " + (oscar.getAge()));
        oscar.setRace("akita");
        System.out.println("Race is: " + (oscar.getRace()));
        oscar.setColor("white");
        System.out.println("Dog color is: " + (oscar.getColor()));
        oscar.setWeight(23.5);
        System.out.println("The dog weight is: " + (oscar.getWeight()) + " kg");
        oscar.setHeightCm(20);
        System.out.println("Dog height is: " + (oscar.getHeightCm()) + " cm");
        oscar.setFavoriteFood("Pedigree");
        System.out.println("The dog favorit food is: " + (oscar.getFavoriteFood()));
        oscar.setPreferredActivity("Ball");
        System.out.println("Dog play with: " + (oscar.getPreferredActivity()));

        oscar.eat();
        oscar.sleep();
        oscar.speak();
        oscar.play();
        oscar.waveTail();


        Cat bella = new Cat("Bella", "asian", 3, "grey", 5, 9, 8, 8, 9, "whiskas", "box");
        System.out.println("Name: " + (bella.getName() + "\nRace: " + bella.getRace() + "\nAge: " + bella.getAge() + "\nColor: " + bella.getColor() + "\nWeight: " + bella.getWeigth() + "\nHeight : " + bella.getHeightcm() + "\nHealth: " + bella.getHealth() + "\nFullness: " + bella.getFullness() + "\nMood: " + bella.getMoood() + "\nFavorit food: " + bella.getFavoritfood() + "\nPreferred Activity: " + bella.getPreferredActivity()));

        AnimalFood animalFood = new AnimalFood(99, 9, 8);
        System.out.println("Price: " + (animalFood.getFoodprice()+"\nQty: "+ animalFood.getQuantityfood()+"\nStock: "+ animalFood.getInstock()));


    }



}







