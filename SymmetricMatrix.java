import java.io.*;
import java.util.*;
class SymmetricMatrix
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int i,j,c=0;
        int a[][]=new int[3][3];
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=obj.nextInt();
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(a[i][j]==a[j][i])
                {
                    c++;
                }
            }
        }
        System.out.println((c==9)?"Yes":"No");
    }
}