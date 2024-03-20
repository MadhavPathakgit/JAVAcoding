package patternsPractice;

import com.sun.security.jgss.GSSUtil;

public class patterns1 {
    public static void main( String[] args ) {
//        pattern11(10);
        hollowRhombus( 5 );
//        pattern5( 5 );

    }
    static void hollowRhombus(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            // hollow rectangle stars
            for(int j= 1;j<=n;j++ ){
                if(i==1|| i==n|| j==1||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }


            System.out.println();
        }

    }
    static void solidRhombus(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
 
        }

    }
    static void pattern11(int n){
        for(int i = 1;i<=n;i++){
           for(int star = 1;star<=i;star++){
               System.out.print("*");
           }
           for(int space = 1;space<=2*(n-i);space++){
               System.out.print(" ");

           }
            for(int star = 1;star<=i;star++){
                System.out.print("*");
            }
        System.out.println();
        }
        for(int i = n;i>=1;i--){
            for(int star = 1;star<=i;star++){
                System.out.print("*");
            }
            for(int space = 1;space<=2*(n-i);space++){
                System.out.print(" ");

            }
            for(int star = 1;star<=i;star++){
                System.out.print("*");
            }
            System.out.println();
//

        }

    }
    static void pattern10(int n){
        for(int i = 1;i<=n;i++){
            for(int j= 1;j<=i;j++){
               if((i+j)%2==0){
                   System.out.print("1");
               }
               else{
                   System.out.print("0");
               }
            }
            System.out.println();
        }
    }
    static void pattern9(int totRows,int totalcols){
        for(int rows= 1;rows<=totRows;rows++){
            for(int col = 1;col<=totalcols;col++){
            if(rows==1|| rows==totRows||col==1||col==totalcols){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            }
            System.out.println();
        }
    }
    static void pattern3(int n) {
        for(int row = 1;row<=n;row++){
         for(int col =1;col<=n-row+1;col++){
             System.out.print("* ");

         }
            System.out.println();

        }
    }
    static void pattern5(int n){
        for(int row =1;row<=n;row++){
            {
                for(int col =1;col<=row;col++){
                    System.out.print("* ");


                }
                System.out.println();
            }
        }
        for(int row =1;row<= n;row++){

                for(int col =1;col<=n-row;col++){
                    System.out.print("* ");


            }
            System.out.println();
        }

    }
    static void pattern4(int n){
        for(int row = 1;row<=n;row++){
            for(int col = 1;col<=row;col++){
                System.out.print(col);

            }
            System.out.println();

        }
    }
   public static  void pattern6(int n){
        for(int row = 1;row<=n;row++){
            for(int spaces = 1;spaces<=n-row;spaces++){
                System.out.print (" ");
            }
            for(int  star= 1;star<=row;star++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
    static void pattern1(int n){
        for(int row = 1;row<=n;row++){
            for(int col = 1;col<=n;col++){
                System.out.print("*");

            }
            System.out.print("* ");
            System.out.println();

        }
    }
    public static void patterns7(int n){
        for(int i = 1;i<=n;i++){
            int count = 1;

            for(int j =1;j<=n-i+1;j++){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
    public static void patterns8(int n){
        int count = 1;
        for(int i =1;i<=n;i++){
            for(int j = 1;j<=i;j++ ){
                System.out.print(count+ " ");
                count++;
            }
            System.out.println();
        }
    }
    static void  patterns2(int n){
        for(int row = 0;row<=n;row++){
            // for every row,run the col
            for(int col = 1;col<=row;col++){
                System.out.print("* ");
            }
            // when one row is printed,we need to  add a newline
            System.out.println();
        }
    }
}
