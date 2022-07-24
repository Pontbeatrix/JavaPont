
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LogicalOperations {

    ////2. Given a text input, if it is “FastTrack”, then print “Learning text comparison”. If not, print
    //“Got to try some more”

    public String verifyText(String textinput) {
        if (textinput.equals("FastTrack")) {
            return "Learning text comparison";
        } else if (!textinput.equals("FastTrack")) {
            return "Got to try some more";

        }
        return "Not applicable";
    }

    //3.Given a text input and a number input, if the text is equal to “FastTrack” AND the
    //number is equal to or lower than 3, print the text and the number. If the text is not
    //“FastTrack” AND the number is equal to or higher than 4, print the number and the
    //text, in this order.

    public String verifyTextandNumber(String textInput, int number) {
        if (textInput.equals("FastTrack") && number <= 3) {
            return (textInput + number);
        } else if (!textInput.equals("FastTrack") && number >= 4) {
            return (number + textInput);
        }
        {
            return "Not applicable";
        }
    }
//3. In clasa LogicalOp, creati o metoda de tip int, care sa se numeasca checkBiggerNumber(), si sa primeasca doua int-uri ca si parametrii.//
// Folosind if - else, verificati in interiorul metode care numar este mai mare, dintre cele doua valori care va vin ca si parametrii, si returnati numarul mai mare.

    public int checkBiggerNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }

    }
//6. Creati o metoda de tip String, care sa primeasca un parametru de tip int.
// Daca numarul primit este mai mare de 8, SAU egal cu 6, atunci sa se returneze “The amount of snow this winter was(cm): “
// si numarul. Daca nu, sa printeze “The forecast snow is(cm):” si numarul. Apelati metoda in main() pentru a verifica daca functioneaza.

    public String stage6(String textIn, int numb) {
        if (textIn.equals("The amount of snow this winter was(cm):") && numb >= 8) {
            return (textIn + numb);
        } else if (!textIn.equals("The forecast snow is(cm):") && numb <= 6) {
            return (textIn + numb);
        }
        {
            return "0";
        }

    }

//7. Creati o metoda de tip String, care sa primeasca un parametru de tip numar.
// Daca numarul e mai mare decat 3, SI nu egal cu 4, returnati “The number is greater than 3 and not equal to 4”.
// Daca numarul este egal cu 4, returnati “The number is equal to 4”, iar daca numarul este mai mic de 3 returnati “The number is lower than 3”.
// Apelati metoda in main() pentru a verifica daca functioneaza.

    public String stage7(String texti, int numbber) {
        if (numbber > 3 && numbber != 4) {

            return "The number is greater than 3 and not equal to 4";

        } else if (numbber == 4) {

            return "The number is equal to 4";

        } else if (numbber < 3) ;
        {

            return "The number is lower than 3";

        }

    }

// 8. Creati o metoda care primeste un numar ca si parametru si sa afiseze ce numar a primit.
// Folosind constructia Switch-Case, verificati ce numar s-a primit si afisati textul "The number is:  x !" unde x trebuie sa reprezinte numarul apasat.
// Pentru exemplul de fata sa nu se foloseasca concatenarea stringului "The number is:" cu numarul de la parametru, ci sa se scrie intreg textul cu tot cu numar pentru fiecare caz din Switch-Case.
// Apelati metoda in main() pentru a verifica daca functioneaza.

    public String stage8(String name, int the_number) {
        switch (the_number) {
            case 2020:
                name = "2020";
                break;

            case 2021:
                name = "2021";
                break;

            case 2022:
                name = "2022";
                break;

            case 2023:
                name = "2023";
                break;

            default:
                name = "ERROR";
                break;

        }
        return name;
    }

// 9. Creati o metoda care sa se numeasca isNumberEven. Metoda trebuie sa primeasca ca parametru un numar, si sa returneze adevarat sau fals.
// Daca numarul e par sa returneze true iar daca e impar sa returnese false. Apelati metoda in main() pentru a verifica daca functioneaza.

    public boolean isNumberEven(int isnumbereven) {
        if (isnumbereven % 2 == 0) {
            return true;
        }
        return false;
    }

// 10. Creati o metoda care sa se numeasca isEligibleToVote. Metoda sa primeasca ca si parametru un numar,
// care sa reprezinte varsta, iar metoda sa iti zica daca daca persoana are drept de vot.
// Daca varsta e peste 18, sa se returneze true iar daca nu, sa returneze false.
// Apelati metoda in main() pentru a verifica daca functioneaza.


    public boolean isEligibleToVote(int iseligibletovote) {
        if (iseligibletovote >= 18) {
            return true;
        }
        return false;
    }

// 11. Creati o metoda care sa primeasca 3 numere ca si parametrii si sa returneze cel mai mare numar.
// Apelati metoda in main() pentru a verifica daca functioneaza.


    public int CelMaiMareNumar(int x, int y, int z) {

        return z > (x > y ? x : y) ? z : ((x > y) ? x : y);
    }
//###################################################################################################################

//##### Tema - Java FOR Loops LAB 12 ################################################################################

//# Rezolvati urmatoarele exercitii in proiectul de Calculator folosind bucle FOR: ##################################

// 1. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru. Metoda sa verifice numarul primit,
// si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit ca si parametru.
// Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

    public void NumaratoarePanaLaOSuta(int x) {
        System.out.print("\n1. NumaratoarePanaLaOSuta:\n");
        for (int i = x; i <= 100; i++) {
            System.out.println(i);
        }
    }
// 2. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
// Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100, pornind de la numarul primit ca si parametru.
// Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
// Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    public void NumaratoarePanaLaMinusOSuta(int q) {
        System.out.print("\n2. NumaratoarePanaLaMinusOSuta:\n");
        for (int u = q; u >= -100; u--) {
            System.out.println(u);
        }
    }

// 3. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
// Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit,pana la cel de-al doilea
// (ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.
//Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
//Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    public void NumaratoareDeLaPanaLa(int nn, int mm) {
        System.out.print("\n3. NumaratoareDeLaPanaLa:\n");
        for (int x = nn, y = mm; x <= y; x++) {
            System.out.println(x);
        }
    }

// 4. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
// Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.
// (ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).
//Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
//Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    public void NumaratoareDeLaYPanaLaX(int xx, int yy) {
        System.out.print("\n4. NumaratoareDeLaYPanaLaX:\n");
        for (int x = xx, y = yy; x >= y; y++) {
            System.out.println(y);
        }
    }

// 5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.


    public void ToateNumerelePare(int pp) {
        System.out.print("\n5. ToateNumerelePare:\n");
        for (int i = pp; i <= 100; i = i + 2) {
            System.out.println(i);
        }
    }


// 6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.


    public void ToateNumereleImpare(int ii) {
        System.out.print("\n6. ToateNumereleImpare:\n");
        for (int i = ii; i <= 100; i = i + 2) {
            System.out.println(+i);
        }
    }

// 7. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
// Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru, iar la final sa returneze rezultatul.
// Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.


    public double SaAduneToateNumerelePanaLaOSuta() {
        System.out.print("\n7. SaAduneToateNumerelePanaLaOSuta:\n");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }


// 8. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
// Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru, si sa calculeze media numerelor.
// La final, metoda sa returneze media. Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.


    public double SaAduneToateNumerelePanaLaOSutaSiSaCalculezeMedia() {
        System.out.print("\n8. SaAduneToateNumerelePanaLaOSutaSiSaCalculezeMedia:\n");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum / 100d;
    }


// 9. Creat o metoda in clasa LogicalOp care sa afiseze urmatorul tipar:
// *******
// ******
// *****
// ****
// ***
// **
// *
//Cateva mentiuni:
//- pentru a putea rezolva problema, trebuie folosite doua bucle for. O bucla se va construi in alta bucla.
//- prima bucla for se va ocupa de afisarea pe orizontala, si cealalta pe verticala
//- semnul asterisk (*) se poate afisa sub forma de string
//Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    public static void AfisezeUrmatorulTipar() {
        System.out.print("\n9. AfisezeUrmatorulTipar:\n");
        int asterix = 7;
        for (int i = 1; i <= asterix; i++) {
            for (int j = asterix; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//####################################################################################################################

//##### Tema - Java WHILE Loop LAB 12 ################################################################################

//## Rezolvati urmatoarele exercitii in proiectul de Calculator folosind bucle WHILE: ################################

// 1. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru.
// Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit ca si parametru.
// Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

    public void NumaratoarePanaLaOSutaWhile(int xxx) {
        System.out.print("\n1. NumaratoarePanaLaOSutaWhile:\n");
        int i = xxx;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }

//2. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru.
// Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100, pornind de la numarul primit ca si parametru.
// Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

    public void NumaratoarePanaLaMinusOSutaWhile(int zzz) {
        System.out.print("\n2. NumaratoarePanaLaMinusOSutaWhile:\n");
        int i = zzz;
        while (i >= -100) {
            System.out.println(i);
            i--;
        }
    }

// 3. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
// Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit, pana la cel de-al doilea
// (ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.
//Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
//Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    public void NumaratoareDeLaPanaLaWhile(int nnn, int mmm) {
        System.out.print("\n3. NumaratoareDeLaPanaLaWhile:\n");
        int x = nnn;
        int y = mmm;
        while (x <= y) {
            System.out.println(x);
            x++;
        }
    }

// 4. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
// Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.
// (ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).
//Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
//Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.


    public void NumaratoareDeLaYPanaLaXWhile(int jjj, int kkk) {
        System.out.print("\n4. NumaratoareDeLaYPanaLaXWhile:\n");
        int x = jjj;
        int y = kkk;
        while (x >= y) {
            System.out.println(y);
            y++;
        }
    }

//5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.

    public void ToateNumerelePareWhile(int gg) {
        System.out.print("\n5. ToateNumerelePareWhile:\n");
        int i = gg;
        while (i <= 100) {
            System.out.println(i);
            i = i + 2;
        }
    }

// 6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.

    public void ToateNumereleImpareWhile(int hh) {
        System.out.print("\n6. ToateNumereleImpareWhile:\n");
        int i = hh;
        while (i <= 100) {
            System.out.println(i);
            i = i + 2;
        }
    }


// 7. Creati o metoda care sa adune toate numerele din intervalul 111 si 8899.
// Sa se afiseze suma totala, iar dupa aceea sa se calculeze si afiseze media numerelor din acel interval.
// Introduceti o variabila int count in metoda, pentru a numara toate numerele din interval.
// Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    public double GetAverageInIntervalWhile(int start, int finish) {
        System.out.print("\n7. GetAverageInIntervalWhile:\n");
        int sum = 0;
        double count = 0;
        while (start <= finish) {
            sum = sum + start;
            start++;
            count++;
        }
        return (sum / count);
    }

// 8. Creati o metoda care sa primeasca doi parametrii de tip numar, si sa returneze media numerelor divizibile cu 7, din acel interval.
// Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    public int DivisibleBySeven(int div, int isi) {
        System.out.print("\n8. DivisibleBySeven:\n");
        while (div <= isi) {
            System.out.println(div);
            div += 7;
        }
        return (div / isi);
    }

// 9. Creati o metoda care sa afiseze primele 20 de numere din sirul lui Fibonacci.

    public String FibonacciNumbers(int i, int n, int firstTerm, int secondTerm) {


        System.out.println("9. Primele " + n + " de numere din sirul lui Fibonacci:");
        while (i <= n) {
            System.out.print(firstTerm + ", ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            i++;
        }
        return null;
    }

// 10. Creati o metoda numita CozaLozaWoza.
//Metoda va afisa:
//- numerele de la 1 la 110
//- 11 numere pe linie
//- se va afisa Coza pentru numerele care sunt multiplu de 3 (1 2 Coza 4)
//- se va afisa Loza pentru numerele care sunt multiplu de 5 (2 3 4 Loza 6)
//- se va afisa Woza pentru numerele care sunt multiplu de 7 (4 5 6 Woza 8)
//- se va afisa CozaLoza pentru numerele care sunt multiplu de 3 SI 5
//- se va afisa CozaWoza pentru multiplu de 3 SI 7
//- se va afisa WozaLoza pentru multiplu de 5 SI 7
//- se va afisa CozaLozaWoza pentru multiplu de 3 SI 5 SI 7
//Ar trebui sa arate similar:
//1 2 Coza 4 Loza Coza Woza 8 Coza Loza 11
//Coza 13 Woza CozaLoza 16 17 Coza 19 Loza CozaWoza 22
//23 Coza Loza 26 Coza Woza 29 CozaLoza 31 32 Coza
//......
//Apelati metoda in main() pentru a verifica daca functioneaza.

    public static void CozaLozaWoza(int hhh) {
        System.out.print("\n10. CozaLozaWoza:\n");
        for (int x = hhh; x <= 110; x += 1) {
            if (x % 3 == 0) {
                System.out.print(" Coza");
            } else if (x % 5 == 0) {
                System.out.print(" Loza");
            } else if (x % 7 == 0) {
                System.out.print(" Woza");
            } else if (x % 3 != 0 && x % 5 != 0 && x % 7 != 0) {
                System.out.print(" " + x);
            }
            if (x % 11 == 0) {
                System.out.println();
            }
        }
    }

    // LAB 13- Array
    // 2.  In clasa LogicalOp, creati o metoda care sa scrie pe un array de 100 de pozitii, valorile de la 1 la 100.
    // Sa se afiseze progresul in consola pe tot parcursul. Apelati metoda in main() pentru a verifica daca functioneaza.

    public int[] populateArrayUpToNumber(int number) {
        System.out.println("\n2. Position in arrey :\n");
        int[] array = new int[100];
        for (int i = 0; i <= 99; i++) {
            array[i] = i + 1;
            System.out.print(array[i] + " ");
        }

        return array;
    }
//3. Creati o metoda care primeasca un parametru de tip array de numere intregi gol, si sa il returneze populat cu toate valorile pare de la 1 la 100.
// Apelati metoda in main() pentru a verifica daca functioneaza. Atentie, metoda returneaza un array, deci acesta va trebui surprins si afisat folosind o bucla.

    public int evenNumberArray(int b) {
        System.out.print("\n3. ToateNumerelePare: \n");
        int number = 100;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        return b;
    }


// 4. Creati o metoda care sa primeasca un parametru de tip array de numere, si sa fie populat cu valori.
// Metoda sa calculeze si sa returneze media numerelor din array.
// Apelati metoda in main() pentru a verifica daca functioneaza.

    public double getAverageFromArray(int[] array) {
        System.out.println("\n4.Average number:");
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

//5. Creati o metoda care sa primeasca un parametru de tip array de string-uri, populat cu valori, si un parametru de tip String.
// Metoda sa verifice daca valoarea string-ului primit se regaseste in array-ul primit, iar daca da sa returneze true iar daca nu, sa returneze false.
// Apelati metoda in main() pentru a verifica daca functioneaza.

    public boolean isValueInArray(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

//6. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar.
// Metoda sa verifice daca numarul primit se afla in array-ul primit, si daca da, atunci sa returneze pozitia pe care se afla numarul.
// Apelati metoda in main() pentru a verifica daca functioneaza.


    public static int findIndex(int[] my_array, int t) {
        if (my_array == null) return -1;
        int len = my_array.length;
        int i = 0;
        while (i < len) {
            if (my_array[i] == t) return i;
            else i = i + 1;
        }
        return -1;


    }
//7. Creati o metoda care sa afiseze urmatoarea grila, folosind un array:
//- - - - - - - - - -
//- - - - - - - - - -
//- - - - - - - - - -
//- - - - - - - - - -
//- - - - - - - - - -
//- - - - - - - - - -
//- - - - - - - - - -
//- - - - - - - - - -
//- - - - - - - - - -
//- - - - - - - - - -

    public void afisezeUrmatoareaGrila() {
        int[][] a = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("- ", a[i][j]);
            }
            System.out.println();
        }
    }

//8. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar.
// Metoda sa verifice daca numarul exista in array, si daca da, sa returneze array-ul primit, fara acel numar.
// Apelati metoda in main() pentru a verifica daca functioneaza.

    public static int indexOfIntArray(int[] array, int key) {
        int returnvalue = -1;
        for (int i = 0; i < array.length; ++i) {
            if (key == array[i]) {
                returnvalue = i;
                break;
            }
        }
        return returnvalue;
    }


    //9. Creati o metoda care sa primeasca un array, si sa returneze al doilea cel mai mic numar din array.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public int getSmallest() {
        int[] arr = new int[]{25, 11, 7, 75, 56};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }


//10. Creati o metoda care sa primeasca doi parametrii: un array populat cu valori, si un array gol.
// Metoda sa copieze toate valorile din primul array, parcurgandu-l, in cel de-al doilea.
// Apelati metoda in main() pentru a verifica daca functioneaza.

    public static void copiezeToateValorileDinPrimulArray(int[] aaa, int[] bbb) {
        System.out.println("\n10. CopiezeToateValorileDinPrimulArray:\n");
        bbb = aaa;

        bbb[0]++;

        System.out.println("Continutul primul array (aaa): ");
        for (int i = 0; i < aaa.length; i++)
            System.out.print(aaa[i] + " ");

        System.out.println("\nContinutul al doilea array (bbb): ");
        for (int i = 0; i < bbb.length; i++)
            System.out.print(bbb[i] + " ");


    }

//##########################################################################################################################################
//#############################################LAB 14-Tema JAVA list#######################################################################

    //1.Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou.

    public void printNumbersFromList(List<Integer> myListOfInt) {
        System.out.println("\n1. printNumbersFromList:\n");
        for (int i = 1; i <= 10; i++) {
            myListOfInt.add(i);
        }
        for (Integer value : myListOfInt) {
            System.out.println(value);
        }
    }

    // 2. Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru sa fie o lista de numere,
    // si celalalt un numar (real sau intreg). Metoda sa adauge numarul primit ca si parametru la final de lista.

    public void listToNumber(List<Integer> myList, int unNumar) {
        System.out.println("\n2. listToNumber:\n");
        myList.add(unNumar);
        System.out.println(myList);
    }


//3.Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru de tip Lista, iar celalalt un numar intreg.
// Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou,
// pornind de la numarul intreg primit ca si parametru.

    public void myAllNumberFromList(List<Integer> myListInt, int startfrom ) {
        System.out.println("\n3. myListInt :\n");
        List<Integer> newArray = new ArrayList<>();

        for (int i = startfrom; i <= myListInt.size() - 1; i++) {
            newArray.add(myListInt.get(i));
        }

        for (int number: newArray) {
            System.out.println(number);
        }

    }


//4.Scrieti o metoda Java,
// care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din lista, dar invers(de la capat la inceput).

    public void printNumbersBackwardsFromList(List<Integer> myLists) {
        System.out.println("\n4.printNumbersBackwardsFromList :\n");
        for (int i = myLists.size() - 1; i >= 0; i--) {
            System.out.println(myLists.get(i));
        }

    }
//5.Scrieti o metoda Java, care sa primeasca trei parametrii: unul de tip Lista de String-uri, unul de tip intreg, si unul de tip String.
// Metoda sa adauge parametrul de tip String in lista primita, iar parametrul de tip intreg reprezinta pozitia la care sa fie pus acel String.


    //6.Scrieti o metoda Java, care sa primeasca doi parametrii.
// Primul dintre ei va fi o Lista, iar metoda sa ia al doilea parametru si sa il adauge pe prima pozitie din lista.
    public void myFirstList(List<Integer> myfirstlist) {
        System.out.println("\n6.  myFirstList:\n");
        myfirstlist.add(3);
        System.out.println(myfirstlist);
    }

    // 7. Scrieti o metoda Java care sa primeasca parametru o Lista, si sa afiseze ce valori are lista, si ce pe ce pozitie. (Ex: “Pe pozitia 1 valoare este 4”).
    public void arrList(List<String> positionlist) {
        System.out.println("\n7.  positionlist:\n");
        System.out.println("Size of list: " + positionlist.size());
        for (String value : positionlist) {
            System.out.println("Pozitia= " + value);
        }
    }

//8.Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.

    public int getHighestNumber(List<Integer> unorderedList) {
        System.out.println("\n8.   unorderedList:\n");
        int max = unorderedList.get(0);

        for (int x : unorderedList) {
            if (x > max) {
                max = x;
            }
        }

        return max;

    }

    //5. In clasa LogicalOp, creati o metoda care sa primeasca un array de numere ca si parametru, si un numar.
    // Fara a folosi conditii, si folosind un try-catch, afisati valoarea de pe pozitia numarului primit,
    // iar daca valoarea numarului este mai mare decat numarul de pozitii din array, afisati textul: "Inside catch, number too large".

    public int arrayNumber(int[] array, int number) {

        try {
            System.out.println(array[number]);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("\n5.Inside catch, number too large");

        }
        return number;
    }
//6. In clasa LogicalOp, creati o metoda  'wait()'. Metoda sa nu returneze nimic, dar sa primeasca un parametru de tip int.
// In interiorul ei, tratati metoda Thread.sleep(), astfel incat metoda noastra sa primeasca valoarea in secunde, cat sa astepte.
// Ex: wait(5) -> asteapta 5 secunde.Mentiune: metoda Thread.sleep() se foloseste de milisecunde pentru a astepta.

public void waitPlease(int secunde){
    System.out.println("\n6.Wait please:"+ secunde);
        try{
            secunde=1000*secunde;
            Thread.sleep(secunde);

        }catch(Exception e){
            System.out.println(e);
        }
}


}















