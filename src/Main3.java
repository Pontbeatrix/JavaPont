public class Main3 {

  public static void main(String[] args) {


    Calculator calculator = new Calculator();
    calculator.celsius(97);
    calculator.adunare();
    calculator.impartire(28, 50);
    calculator.operatiunea_A();
    calculator.operatiunea_B();
    calculator.operatiunea_C();
    calculator.operatiunea_D();
    calculator.adunare_v2();
    calculator.scadere();
    calculator.inmultire();
    calculator.impartire_v2();
    calculator.result();
    calculator.res();
    calculator.Java();


    LogicalOperations op = new LogicalOperations();
    // 3.
    int first = 3;
    int second = 5;
    System.out.println("Bigger number is:" + op.checkBiggerNumber(first, second));

    // 4.
    System.out.println(op.verifyText("FastTrack"));
    // 5.
    int number = 2;
    String textInput = "FastTrack";
    System.out.println(op.verifyTextandNumber(textInput, number));
    // 6.
    int numb = 6;
    String textIn = "The forecast snow is:";
    System.out.println(op.stage6(textIn, numb));

    // 7.
    int numbber = 0;
    String texti="Numarul este mai mic decat 3:";
    System.out.println(op.stage7(texti,numbber));

    // 8.
    int the_number = 2022;
    System.out.println("The number is:" + " " +op.stage8("",the_number)+ " "+"!");


    // 9.
    int isnumbereven = 21;
    System.out.println("Numarul e par:" + " " +op.isNumberEven(isnumbereven)+ " "+"!");

    // 10.
    int iseligibletovote = 19;
    System.out.println("Persoana are drept de vot:" + " " +op.isEligibleToVote(iseligibletovote)+ " "+"!");

    // 11.
    int x = 2;
    int y = 150;
    int z = 68;
    System.out.println("Cel mai mare numar este:" + " " +op.CelMaiMareNumar(x,y,z) + " "+"!");

    }
  }







