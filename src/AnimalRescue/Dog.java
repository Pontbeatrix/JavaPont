package AnimalRescue;

public class Dog extends Animal{
  private int fangsLength;

    public int getFangsLength() {
        return fangsLength;
    }

    public void setFangsLength(int fangsLength) {
        this.fangsLength = fangsLength;
    }

    public void waveTail(){
      System.out.println("waving the tail");
  }
    public void speak(){
        System.out.println("Ham");
    }
    public void eat(){
        System.out.println("Eating dog food");
    }



}

