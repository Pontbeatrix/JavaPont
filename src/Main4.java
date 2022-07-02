public class Main4 {

    public static void main(String[] args) {

    LogicalOperations op = new LogicalOperations();

    //##### Tema - Java FOR Loops LAB 12 ###############################################################################

    // 1.

        int x = 50;
        op.NumaratoarePanaLaOSuta(x);

    // 2.

        int q = 5;
        op.NumaratoarePanaLaMinusOSuta(q);

    // 3.

       int nn = 80;
       int mm = 90;
       op.NumaratoareDeLaPanaLa(nn,mm);

    // 4.

        int xx = 60;
        int yy = 50;
        op.NumaratoareDeLaYPanaLaX(xx,yy);

    // 5.

        int pp = 2;
        op.ToateNumerelePare(pp);

    // 6.

        int ii = 1;
        op.ToateNumereleImpare(+ii);

    // 7.

        System.out.println("\nRezultatul este: " +op.SaAduneToateNumerelePanaLaOSuta());

    // 8.

        System.out.println("\nMedia numerelor este: " +op.SaAduneToateNumerelePanaLaOSutaSiSaCalculezeMedia());

    // 9.

        LogicalOperations.AfisezeUrmatorulTipar();

//######################################################################################################################
//##### Tema - Java WHILE Loop LAB 12 ##################################################################################


    // 1.

        int xxx = 70;
        op.NumaratoarePanaLaOSutaWhile(xxx);

    // 2.

        int zzz = 4;
        op.NumaratoarePanaLaMinusOSutaWhile(zzz);

    // 3.

        int nnn = 20;
        int mmm = 28;
        op.NumaratoareDeLaPanaLaWhile(nnn,mmm);

    // 4.

        int jjj = 50;
        int kkk = 40;
        op.NumaratoareDeLaYPanaLaXWhile(jjj,kkk);

    // 5.

        int gg = 2;
        op.ToateNumerelePareWhile(gg);

    // 6.

        int hh = 1;
        op.ToateNumereleImpareWhile(hh);

    // 7.

        System.out.println(op.GetAverageInIntervalWhile(111,8899));

    // 8.

       int div = 1;
       int isi = 106;
       op.DivisibleBySeven(div,isi);

    // 9.

       int i = 1;
       int n = 20;
       int firstTerm = 0;
       int secondTerm = 1;
       op.FibonacciNumbers(1,20,0,1);

    // 10.

        int hhh = 1;
        op.CozaLozaWoza(hhh);



    }

}
