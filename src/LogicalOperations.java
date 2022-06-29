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
        if ( numbber > 3 && numbber != 4) {

            return "The number is greater than 3 and not equal to 4";

        } else if (numbber == 4) {

            return "The number is equal to 4";

        } else if (numbber < 3); {

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


    public  boolean isEligibleToVote(int iseligibletovote) {
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
//1.write a java program to count backwards from a given number to a lower given number
}
