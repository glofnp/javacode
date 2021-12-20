package Week12;

public class NestedLoop01 {
    public static void main(String[] args) {
        int number = 10;
        for (int i = 2; i <= 3; i++) { //Loop นอก
            for (int j = 1; j <= 12; j++) {// loop ใน
                System.out.println(i + "x" + j + "=" + (i * j));
            }
        }
    }
}
