import java.util.ArrayList;

import java.util.List;

public class Main5 {
    public static void main(String[] args) {

        LogicalOperations op = new LogicalOperations();


        // 1.
        List<Integer> myListOfInt = new ArrayList<>();

        op.printNumbersFromList(myListOfInt);

        // 2.
        List<Integer> myList = new ArrayList<>();
        myList.add(0, 23);
        myList.add(1, 22);
        myList.add(2, 24);

        op.listToNumber(myList, 69);

        // 3.

        List<Integer> myListInt = new ArrayList<>();
        myListInt.add(23);
        myListInt.add(22);
        myListInt.add(24);
        op.myAllNumberFromList(myListInt, 1);

        // 4.
        List<Integer> myLists = new ArrayList<>();
        op.printNumbersBackwardsFromList(myListOfInt);


        // 6.
        List<Integer> myfirstlist = new ArrayList<>();
        myfirstlist.add(5);
        myfirstlist.get(0);
        myfirstlist.size();
        op.myFirstList(myfirstlist);


        // 7.
        List<String> positionlist = new ArrayList<String>(5);
        positionlist.add("1");
        positionlist.add("2");
        positionlist.add("3");
        positionlist.add("4");
        op.arrList(positionlist);


        List<Integer> unorderedList = new ArrayList<>();
        unorderedList.add(13);
        unorderedList.add(11);
        unorderedList.add(123);
        unorderedList.add(4203);
        unorderedList.add(12);

        System.out.println(op.getHighestNumber(unorderedList));

        //.5

        int[] aRray = {3, 4, 5, 9, 11, 99};
        op.arrayNumber(aRray,8);

        op.waitPlease(5);
    }


}