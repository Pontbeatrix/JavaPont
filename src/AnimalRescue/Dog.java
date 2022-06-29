package AnimalRescue;

public class Dog {
   private int age;
   private String race;
   private String name;
   private String color;
   private double  weight;
   private int heightCm;
   private String favoriteFood;
   private String preferredActivity;



   public String getName() {
       return name;
   }

       public void setName (String name){
          this.name = name;

       }

    public int getAge() {
        return age;
    }

    public void setAge (int age){
        this.age = age;

    }
    public String getRace(){
       return race;
    }

    public void setRace(String race){
       this.race=race;
    }
    public String getColor(){
       return color;
    }
    public void setColor(String color){
       this.color=color;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }

    public int getHeightCm(){
        return heightCm;
    }
    public void setHeightCm(int heightCm){
        this.heightCm=heightCm;
    }
    public void setFavoriteFood(String favoriteFood){
        this.favoriteFood=favoriteFood;
    }
    public String getFavoriteFood(){
        return favoriteFood;
    }
    public void setPreferredActivity(String preferredActivity){
        this.preferredActivity=preferredActivity;
    }
    public String getPreferredActivity(){
        return preferredActivity;
    }


   public void eat(){
       System.out.println("Eating dog food");
   }

   public void sleep(){
      System.out.println("Snozzes...zzz");
  }
   public void speak(){
      System.out.println("Ham");
  }
  public void play(){
      System.out.println("Playing fetch");
  }
  public void waveTail(){
      System.out.println("waving the tail");
  }



}

