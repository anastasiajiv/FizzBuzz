public class Multiplies {
    public static void main(String[] args) {
        int multiplies = 0;
        for (int i = 0; i < 1000; i++){
            boolean multiple_of_3 = i % 3 == 0;
            boolean multiple_of_5 = i % 5 == 0;

            if ( multiple_of_3 || multiple_of_5) {
                multiplies+=1;
            }

        }
        System.out.println(multiplies);
    }
}
