package Latihan1;



public class Prima {
    
    public void Prima(int n) {
        for (int i = 0; i <= n; i++) {
            if (i < 2) {
                System.out.println(i + " bukan bilangan prima");
                continue;
            }

            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(i + " adalah bilangan prima");
            }else{
                System.out.println(i + " bukan bilangan prima");
            }
        }
    }
}
