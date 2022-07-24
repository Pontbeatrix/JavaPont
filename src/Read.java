import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
//#####################################################################################################################################
//############################################## LAB 15 Tema - Try-Catch ##############################################################

//1. In clasa Read, din programul vostru, creati o metoda tratat, care sa returneze un numar de la tastatura.
public class Read {
    public int getInt() {
        int number = 0;
        boolean repeat;

        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("\n 1.Keyboard numbers: ");

                number = scan.nextInt();
                repeat = false;
            } catch (InputMismatchException exception) {
                System.err.println("Please enter valid number!");
                repeat = true;
            }
        } while (repeat);
        return number;
    }


//2. In clasa Read, duplicati metoda de la punctul 1, astfel incat sa aveti mai multe metode,
// care sa citeasca si sa returneze si alte tipuri de numere (float, int, double, long, etc)


    public float getFloat() {
        float number = 0;
        boolean repeat;

        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("\n 2.Duplicate of Float: ");
                number = scan.nextInt();
                repeat = false;
            } catch (InputMismatchException exception) {
                System.err.println("Please enter valid number!");
                repeat = true;
            }
        } while (repeat);
        return number;
    }


//3. In clasa Read, creati o metoda care sa returneze un array de numere populat de la tastatura.
// Metoda sa primeasca ca si parametru un numar, care reprezinta cate pozitii are.

    public int[] getmyArray() {
        int[] arr = new int[5];
        boolean repeat = false;
        do {
            try {
                Scanner search = new Scanner(System.in);
                System.out.println("\n 3.Position of array: ");
                for (int i = 0; i < 6; i++) {
                    arr[i] = search.nextInt();
                }
            } catch (ArrayIndexOutOfBoundsException e) {

                System.err.println("Array Bounds Exceeded...\nTry Again");


            } catch (InputMismatchException exception) {
                System.err.println("Please enter valid number!");

            }
        } while (repeat);
        return arr;

    }

//4. In clasa Read, creati o metoda care sa returneze o lista de numere populate de la tastatura. Metoda nu v-a primii parametru lungimea.
// In rezolvarea ei trebuie folosit try-catch.
// (Hint: a se citi de la tastatura atata timp cat valoarea primita e numar, cand nu mai e numar, sa se intrerupa citirea)

    public int myList() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Please enter a number ... ");
        Scanner INPUT = new Scanner(System.in);

        try {
            int num;
            while ((num = INPUT.nextInt()) > 0) {
                list.add(num);
                System.out.println(list);
            }
        } catch (InputMismatchException exception) {
            System.err.println("Please enter valid number!");

            INPUT.close();

        }

        return Integer.parseInt(null);
    }

//5. In clasa LogicalOp, creati o metoda care sa primeasca un array de numere ca si parametru, si un numar.
// Fara a folosi conditii, si folosind un try-catch, afisati valoarea de pe pozitia numarului primit,
// iar daca valoarea numarului este mai mare decat numarul de pozitii din array, afisati textul: "Inside catch, number too large".











}








