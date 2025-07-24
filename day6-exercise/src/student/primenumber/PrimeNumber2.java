package student.primenumber;

import org.w3c.dom.ls.LSOutput;

public class PrimeNumber2 {
    public static void main(String[] args) {
        int a = getprime(200);
        System.out.println(a);
    }
    public  static int getprime(int n){
        int count=0;

        OUT:
        for(int i=2;i<=n;i++){
            for (int j =2 ;j<= Math.sqrt(i);j++){
                if(i%j==0){
                    continue OUT;
                }
            }
            count++;
            System.out.println(i);

        }

        return count;
    }



}

