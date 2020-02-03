
import java.util.*;
public class DS_Presentation {
    public static void main(String[] args) {
        System.out.println("____________________________________________________");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("Students Prerequisite Subjects Managment System for Islamia University of Bahawal Pur ");
        System.out.println("****************************************************");
        System.out.println("____________________________________________________");
        System.out.println("Processing Please wait............\n\n");
        Scanner read=new Scanner(System.in);
        int subjects;
        int code;
        int m=0;
        System.out.println("Enter Number of Subjects You want to Check Prerequisites :");
        subjects=read.nextInt();
        int [] DS1;
        DS1 = new int [subjects];
        int [] DS2;
        DS2 = new int [subjects];
        int [][] DS3;
        DS3 = new int[subjects][subjects];
        System.out.println("____________________________________________________");
        System.out.println("____________________________________________________");
        System.out.println("Enter Course Code which you are studied :-");
        System.out.println("Code look like 1101,1203,1304,1405 etc ");
        System.out.println("____________________________________________________");
        System.out.println("____________________________________________________");
        for(int i=0;i<=subjects-1;i++)
        {
          DS1[i]=read.nextInt();
        }
        System.out.println("____________________________________________________");
        System.out.println("____________________________________________________");
        System.out.println("Enter Course Code which you want to study in this section :-");
        System.out.println("Code look like 1301,1203,1304,1405 etc ");
        System.out.println("____________________________________________________");
        System.out.println("____________________________________________________\n\n\n");
        for(int j=0;j<=subjects-1;j++)
        {
          DS2[j]=read.nextInt();
        }
        System.out.println("____________________________________________________");
        System.out.println("____________________________________________________\n\n");
        for(int a=0;a<=subjects-1;a++)
        {
            code=DS1[a];
            code=code+100;
            for(int b=0;b<=subjects-1;b++)
            {
                if(code==DS2[b])
                {
                    System.out.println("Subject Matched "+DS1[a]+(" and ")+code);
                    m++;
                }
            }
        }
        System.out.println("____________________________________________________");
        System.out.println("____________________________________________________\n\n\n");
        if(m==0)
        {
            System.out.println(":: Sorry We Can't Allocate You Subjects for this Semester ::\n");
            System.out.println("____________________________________________________\n\n");
            System.out.println("Processing Complete ");
        }
        if(m!=0)
        {
            System.out.println(":: We Allocate You "+m+(" Subjects For this Semester Codes are Given Before ::\n"));
            System.out.println("____________________________________________________\n\n");
            System.out.println("Processing Complete ");
        }
    }
}
