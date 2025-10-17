package array;

import java.util.Scanner;

public final class one_dimensional_function {
    
     int i;
           Scanner objin = new Scanner(System.in);
           void Input(int a[],int n)
           {
                for(i=0;i<n;i++)
                {
                    System.out.print("Input Array :");
                    a[i] = objin.nextInt();
                }
           }
           void Ouput(int a[],int n)
           {
               for(i=0;i<n;i++)
               {
                   System.out.print(a[i]+"  ");
               }
           }
           int search(int a[],int n)
           {
               int svalue;
               int index=-1;
               System.out.println("Input Value to Search :");
               svalue=objin.nextInt();
               for(i=0;i<n;i++)
               {
                   if(a[i]==svalue)
                   {
                       index=i;
                       break;
                   }
               }
              return index;
           }
           void Update(int a[],int n)
           {
               int nvalue;
               int index=search(a, n);
               if(index==-1)
               {
                   System.out.println("........Search not Found.........");
               }
               else
               {
                   System.out.print("Input New value :");
                   nvalue=objin.nextInt();
                   a[index]=nvalue;
                   System.out.println("Update Completed ..!");
               }
           }
           void Delete(int a[],int n)
           {
               int index=search(a, n);
               if(index==-1)
               {
                   System.out.println(".......Search not Found.........");
               }
               else
               {
                   for(i=index;i<n;i++)
                   {
                       a[i]=a[i+1];
                   }
                   n=n-1;
                   Ouput(a, n);
               }
           }
           void Sort(int a[],int n)
           {
               int t,j;
               for(i=0;i<n;i++)
               {
                   for(j=i+1;j<n;j++)
                   {
                       t=a[i];
                       a[i]=a[j];
                       a[j]=t;
                   }
               }
           }
           public one_dimensional_function()
           {
               int a[] = new int[100];
               String st;
               int n=0,op;
               do{
                   System.out.println("1. Input ");
                   System.out.println("2. Output ");
                   System.out.println("3. Search ");
                   System.out.println("4. Update ");
                   System.out.println("5. Delete ");
                   System.out.println("6. Sort ");
                   System.out.print("Please Choose One Option  :");
                   op=objin.nextInt();
                   switch (op) {
                       case 1 -> {
                           System.out.print("Input N :");
                           n=objin.nextInt();
                           Input(a, n);
                       }
                       case 2 -> {
                           Ouput(a, n);
                       }
                       case 3 -> {
                           int index=search(a,n);
                           if(index==-1)
                               System.out.println("Search not Found");
                           else
                               System.out.println("Seach Found At "+index);
                       }
                       case 4 -> {
                           Update(a, n);
                       }
                       case 5 -> {
                           Delete(a, n);
                       }
                       case 6 -> {
                           Sort(a, n);
                       }
                   }
                   System.out.println("\nPrees yes to Continue ...!");
                   System.out.println("Prees No to Stop ...!");
                   st=objin.next();
               }while(st.equals("yes"));
           }
    public static void main(String[] args) {
               new one_dimensional_function();
    }
    
}
