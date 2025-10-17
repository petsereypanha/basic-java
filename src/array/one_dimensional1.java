package array;
public class one_dimensional1 {
    public static void main(String[] args) {
        String [] stringArray = new String[5];
        stringArray[0] = "ETEC";
        stringArray[1] = "IT";
        stringArray[2] = "Professional";
        stringArray[3] = "Training";
        stringArray[4] = "Center";
        System.out.println("StringArray Output");
        for (String stringArray1 : stringArray) {
            System.out.println(stringArray1);
        }
    }
    
}
