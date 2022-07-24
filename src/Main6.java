import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main6 {
    public static void main (String[] args){
     // 1.
        Read read= new Read();
        int x=read.getInt();
        System.out.println(x);
     // 2.
        float z= read.getFloat();
        System.out.println(z);
     // 3.
        int []arr=read.getmyArray();
        System.out.println(Arrays.toString(arr));
    // 4.
      int myList= read.myList();
       System.out.println(myList);



    }
}
