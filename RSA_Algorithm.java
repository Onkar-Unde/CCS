import java.math.BigInteger;
import java.util.*;

public class RSA_Algorithm {

  public static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }

  public static void calculate(int p, int q, int msg) {
    int flag = 0;
    if (p < 1 && q < 1) {
      flag = 1;
    }

    for (int i = 2; i < p; i++) {
      if (p % i == 0 && q % i == 0) {
        flag = 1;
        break;
      }
    }

    if (flag == 1) {
      System.out.println("Numbers are not prime! Enter prime numbers");
    } 
    else {
      int n = p * q;
      int ph_N = (p - 1) * (q - 1);
      int e = 2;
      while (e < ph_N) {
        if (gcd(e, ph_N) == 1) {
          break;
        } else {
          e++;
        }
      }
 System.out.println("Value of 'e':" +e);
      int j = 0;
      while (true) {
        if (e * j % ph_N == 1) {
          break;
        }
        j += 1;
      }

      int d = j;
     System.out.println(" Value of D:"+d);
     BigInteger c = BigInteger.valueOf(msg).modPow(BigInteger.valueOf(e), BigInteger.valueOf(n));
      System.out.println("Encrypted Message:" + c);

      BigInteger M = c.modPow(BigInteger.valueOf(d), BigInteger.valueOf(n));
      System.out.println("Decrypted Message:" + M);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of p and q");
    int p = sc.nextInt();
    int q = sc.nextInt();
    System.out.println("Enter The Message:");
    int m = sc.nextInt();

    calculate(p, q, m);
  }
}