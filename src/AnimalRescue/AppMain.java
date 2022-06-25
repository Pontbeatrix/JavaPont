package AnimalRescue;

public class AppMain {

    public static void main(String[] args) {
     Dog oscar=new Dog();
        System.out.println(oscar.name);
        System.out.println( "Age is:" +(oscar.age));
        oscar.eat();
        oscar.sleep();
        oscar.speak();
        oscar.play();
        oscar.waveTail();
        Cat bella=new Cat();
        System.out.println(bella.name);
        System.out.println(bella.age);
        bella.eat();
        bella.play();
        bella.sleep();
        bella.lick();


    }
}
