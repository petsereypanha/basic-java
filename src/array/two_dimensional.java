package array;
public class two_dimensional {
    public static void main(String[] args) {
        int i,j;
        String [][] name = { {"Sam","Smith"},
                             {"Serey","Panha"}
            
        };
        for(i=0;i<2;i++){
           for(j=0;j<2;j++){
               System.out.print(name[i][j]);
           }
            System.out.println(" ");
        }
    }
    
}
