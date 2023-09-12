public class Reduce {
    public static void main(String[] args) {
        int counts = 0;
        int value = 100;
        while(value != 0){
            if (value % 2 == 0){
                value = value / 2;
                counts++;
            }else {
                value = value - 1;
                counts++;
            }
        }
        System.out.println(counts);
    }
}
