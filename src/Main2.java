public class Main2 {
     // 1. Pentru exercitiile din clasa main() de data trecuta, creati metode separate pentru fiecare, tot in clasa Main.java, si apoi apelati-le in metoda main().

     public static void main(String[] args) {

        printMyName();


         // Punctul 7.
         Calculator calculator=new Calculator();
         calculator.celsius(97);

     // Punctul 8.
         calculator.metri(100);

         calculator.distance(15000, 1, 10, 50);

     }

     public static void printMyName() {

         System.out.println  ("Hello \n Pont Eniko");
         System.out.println(sum(15,17));
         System.out.println(suma(45,23));
         System.out.println(sumaa(20,867));
         System.out.println(sumaaa(5764,1753));
         System.out.println(text1);
         System.out.println(text2);
         System.out.println(text3);
         System.out.println(text4);
         System.out.println(punct4(76554,95734,8347742));
         System.out.println(printRobocop);
         System.out.println(punct6(891,98));



     }
//2. Scrieti care o metoda java pentru fiecare din urmatoarele operatii matematice: adunare, scadere, inmultire, impartire.
     //ADUNARE
     public static int sum(int a, int b){
         return a+b;
     }
     //SCADERE
     public static int suma(int c , int d){
         return c-d;
     }
     //INMULTIRE
     public static int sumaa(int e, int f){
         return e*f;
     }
     //IMPARTIRE
     public static float sumaaa(int g, float h){
         return g/h;
     }

   //3. Scrieti o metoda java, care sa afiseze urmatorul model:

     static String text1="    J   a  v     v  a";
     static String text2="    J  a a  v   v  a a";
     static String text3=" J  J aaaaa  V V  aaaaa";
     static String text4="  JJ a     a  V  a     a";

//4.Scrieti o metoda java, care sa primeasca 3 parametrii de tip numar, si sa returneze media numerelor.

   public static int punct4(int primulnumar ,int aldoileanumar ,int altreilanumar ){return primulnumar + aldoileanumar * altreilanumar;}

//5.Scrieti o metoda java, care sa afiseze urmatorul model:



     static String  printRobocop=
       "+\" \" \" \" \"+\n"+
       "[| o   o |]\n"+
        " |   ^   |\n"+
        " |       |\n"+
        " |  '_'  |\n"+
        " +_ _ _ __+\n" ;
//6.Scrieti o metoda java, care sa returneze restul impartirii a doua numere


    public static float punct6(int s, float e){ return s/e ;}




//8.Scrieti o metoda java, care sa primeasca ca si parametru un numar real, care sa reprezinte distanta in inch, si sa returneze distanta in metrii





}












