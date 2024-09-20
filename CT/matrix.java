import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {

        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];
        int i, j, k;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the values of first matrix");
        for (i = 0; i < 3; i++) {

            for (j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }


        System.out.println("enter the values of second matrix");
        for (i = 0; i < 3; i++) {

            for (j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();
            }
        }


        System.out.println("first matrix is ");
        for (i = 0; i < 3; i++) {

            for (j = 0; j < 3; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }



        System.out.println("second matrix is ");
        for (i = 0; i < 3; i++) {

            for (j = 0; j < 3; j++) {
                System.out.print(b[i][j] + "  ");
            }
            System.out.println();
        }



        System.out.println("the multiplication is ");
        
        for(i=0; i<3;i++){
    
        for(j=0; j<3; j++)
        {
            c[i][j]=0;
            for(k=0; k<3; k++)
            {
                c[i][j]+=a[i][k]*b[k][j];
            }
            System.out.print(c[i][j]+"  ");
        }
        System.out.println();
   
    }
}
}
