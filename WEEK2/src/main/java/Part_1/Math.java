package Part_1;

public class Math {
    public static void main(String[] args) {
        Math a = new Math();
        a.sieveEratosthenes(10); ;
    }

    /*---------------------------------------
    * Tìm ước số chung lớn nhất của 2 số nguyên a và b
    * Created by Hieu 02/08/2020
    * ------------------------------------------
    * */
    public int gcd(int a, int b){
        int k=0;
        for (int i = a; i > 0; i--) {
            if(a % i ==0 && b % i==0){
                k=i;
                break;
            }
        }
        return k;
    }

    /*---------------------------------------
     * Tính Fibonacci của 1 số nguyên n
     * Created by Hieu 02/08/2020
     * ------------------------------------------
     * */
    public int fibonacci(int n){
        int Fn = 0;
        if(n == 0) {
            Fn = 0;
            return Fn;
        }
        else if(n == 1){
            Fn = 1;
            return Fn;
        }
        else if(n > 1){
            Fn =  this.fibonacci(n-1) + this.fibonacci(n-2);
            return Fn;
        }
        else return -1;
    }

    /*---------------------------------------
     * Phương thức tìm số nguyên tố từ 1 -> N
     * Created by Hieu 02/08/2020
     * ------------------------------------------
     * */
    public void sieveEratosthenes(int n){
        boolean[] b = new boolean[1000];
        b[2] = true;
        b[3] = true;
        for (int i = 4; i <= n; i++) {
            b[i] = true;
            for (int j = 2; j < i; j++) {
                if(i % j == 0 && b[j] == true){
                    b[i] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if(b[i]){
                System.out.print(i + " ");
            }
        }
    }

}
