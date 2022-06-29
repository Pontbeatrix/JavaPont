package AnimalRescue;

public class Cat {
    private int age;
    private String name;
    private String race;
    private String color;
    private double weight;
    private int heightcm;
    private int health;
    private int fullness;
    private int moood;
    private String favoritfood;
    private String preferredActivity;

    Cat(String name, String race, int age, String color, double weight, int heightcm, int health, int fullness, int moood, String favoritfood, String preferredActivity) {
        this.name = name;
        this.race = race;
        this.age = age;
        this.color = color;
        this.weight = weight;
        this.heightcm = heightcm;
        this.health = health;
        this.fullness = fullness;
        this.moood = moood;
        this.favoritfood = favoritfood;
        this.preferredActivity = preferredActivity;
    }
    public String getName() {
        return name;
    }
    public String getRace() {
        return race;
    }
    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }
    public double getWeigth() {
        return weight;
    }
    public int getHeightcm() {
        return heightcm;
    }
    public int getHealth() {
        return health;
    }
    public int getFullness() {
        return fullness;
    }
    public int getMoood() {
        return moood;
    }
    public String getFavoritfood() {
        return favoritfood;
    }
    public String getPreferredActivity() {
        return preferredActivity;
    }
        public void eat() {
        System.out.println("Eat cat foods");
    }
        public void play(){
        System.out.println("Play with toys");
        }
        public void sleep() {
            System.out.println("Sizzel");
        }
        public void lick(){
            System.out.println("Self clean");
            }



}




