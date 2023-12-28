public class Challenge1 {
    public static void main(String[] args) {
        double Double = 20.00d;
        double Double2 = 80.00d;
        double results =   (Double+Double2) *100;
        System.out.println("MyValuesTotal = " +results);
        double remainder = results % 40.00d;
        System.out.println("theRamainder= " +remainder);
        boolean noRemainder = (remainder == 0 ) ? true : false;
        System.out.println("isNoRemainder = " + noRemainder);
        if (!noRemainder) {
            System.out.println("Got some no remainder");
        }
    }
}
