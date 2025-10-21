package oop.basic;

import java.util.Scanner;

public class object_array_book_dowhile {
private int id;
    private String title, author, publish;
    private float price;
    Scanner ob = new Scanner(System.in);
    // input
    public void Input() {
            System.out.print("Input ID      :");
            id = ob.nextInt();
            System.out.print("Input Title   :");
            title = ob.next();
            System.out.print("Input Author  :");
            author = ob.next();
            System.out.print("Input Publish :");
            publish = ob.next();
            System.out.print("Input Price   :");
            price = ob.nextFloat();
    }
    public object_array_book_dowhile(){
        id=0;
        title = "N/A";
        author = "N/A";
        publish = "N/A";
        price = 0;
    }
    public object_array_book_dowhile(int id,  String title, String author, String publish, float price){
        this.id = id;
        this.title = title;
        this.author = author;
        this.publish = publish;
        this.price = price;
    }
    public float getPrice(){
        return price;
    }
    public int getID() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public static void Header() {
        System.out.printf("%-12s%-15s%-16s%-17s%-15s\n", "ID", "Title", "Author", "Publish", "Price");
    }

    public void Output() {
        System.out.printf("%-12d%-15s%-16s%-17s%-14.2f\n$", id, title, author, publish, price);
    }
    public static void main(String[] args) {
try (Scanner ob = new Scanner(System.in)) {
            int i, j, n = 0, op, sid,m;
            String sname;
            boolean f = false;
            object_array_book_dowhile bk[] = new object_array_book_dowhile[50];
            object_array_book_dowhile temp = new object_array_book_dowhile();
            do {
                System.out.println("\n=========--------| MENU |--------==============");
                System.out.println("1. Input");
                System.out.println("2. Output");
                System.out.println("3. Search");
                System.out.println("4. Update");
                System.out.println("5. Delete");
                System.out.println("6. Insert");
                System.out.println("7. Sort");
                System.out.println("8. Append");
                System.out.println("9. Find The maximum price of book");
                System.out.println("10. Find The minimum price of book");
                System.out.println("11. Find The sum price of book");
                System.out.println("12. Defaul Costructor");
                System.out.println("13.Constructor With Parameter");
                System.out.println("14. Exite");
                System.out.println("______________________________________________");
                System.out.print("Please Select One Option :");
                op = ob.nextInt();
                switch (op) {
                    case 1: {
                        System.out.print("Input Element of Book :");
                        n = ob.nextInt();
                        for (i = 0; i < n; i++) {
                            System.out.println("=======------| BOOK #"+i+1+" |-------========");
                            bk[i] = new object_array_book_dowhile();
                            bk[i].Input();
                        }
                    }break;
                    case 2: {
                        object_array_book_dowhile.Header();
                        for (i = 0; i < n; i++) {
                            bk[i].Output();
                        }
                    }break;
                    case 3: {
                        System.out.print("Input ID To Search :");
                        sid = ob.nextInt();
                        for (i = 0; i < n; i++) {
                            if (sid == bk[i].getID()) {
                                object_array_book_dowhile.Header();
                                bk[i].Output();
                                f = true;
                            }
                        }
                        if (f == false) {
                            System.out.println("Search is not Found ..!");
                        }
                    }break;
                    case 4: {
                        System.out.print("Input Name To Search For Update :");
                        sname = ob.next();
                        for (i = 0; i < n; i++) {
                            if (sname.equals(bk[i].getTitle())) {
                                bk[i].Input();
                                f = true;
                                System.out.println("Update Successful");
                            }
                        }
                        if (f == false) {
                            System.out.println("Search is not Found ..!");
                        }
                    }break;
                    case 5:{
                        System.out.print("Input Name To Search For Update :");
                        sname = ob.next();
                        for (i = 0; i < n; i++) {
                            if (sname.equals(bk[i].getTitle())) {
                                for(j=i;j<n;j++){
                                    bk[j]=bk[j+1];
                                }
                                n--;
                                f = true;
                                System.out.println("Update Successful");
                            }
                        }
                        if (f == false) {
                            System.out.println("Search is not Found ..!");
                        }
                    }break;
                    case 6:{
                        System.out.print("Input Name To Search For Update :");
                        sname = ob.next();
                        for (i = 0; i < n; i++) {
                            if (sname.equals(bk[i].getTitle())) {
                                for(j=i;j<n;j--){
                                    bk[j]=bk[j-1];
                                }
                                n++;
                                f = true;
                                System.out.println("Update Successful");
                            }
                        }
                        if (f == false) {
                            System.out.println("Search is not Found ..!");
                        }
                    }break;
                    case 7:{
                        for(i=0;i<n;i++){
                            for(j=i+1;j<n;j++){
                                if(bk[i].getID()>bk[i].getID()){
                                    temp = bk[i];
                                    bk[i] = bk[j];
                                    bk[j] = temp;
                                }
                            }
                        }
                        System.out.println("Sort is Completed ...!");
                    }break;
                    case 8:{
                        System.out.print("Input Elemnet To Appen :");
                        m=ob.nextInt();
                        for(i=n;i<n+m;i++){
                            bk[i].Input();
                        }
                        System.out.println("Appent Success Full ...!");
                    }break;
                    case 9:{
                        float max = bk[0].getPrice();
                        for(i=0;i<n;i++){
                            if(max < bk[i].getPrice()){
                               max = bk[i].getPrice();
                            }
                        }
                    }break;
                    case 10:{
                        float min = bk[0].getPrice();
                        for(i=0;i<n;i++){
                            if(min > bk[i].getPrice()){
                               min = bk[i].getPrice();
                            }
                        }
                    }break;
                    case 11:{
                        float sum = 0;
                        for(i=0;i<n;i++){
                            sum += bk[i].getPrice();
                        }
                        System.out.println("The Sum of Book :"+sum);
                    }break;
                    case 12:{
                        object_array_book_dowhile bk1 = new object_array_book_dowhile();
                        bk1.Output();
                    }break;
                    case 13:{
                        object_array_book_dowhile bk2 = new object_array_book_dowhile(123,"Annime","king","Qeen",2000);
                        bk2.Output();
                    }break;
                }
            } while (op != 14);
        }
    }
    
}