import java.util.Scanner;

public class diffi_Hellman {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Value of p:");
    int p =sc.nextInt();

    System.out.println("Enter The Value of g:");
    int g= sc.nextInt();

    System.out.println("Enter The Value of a:");
    int a = sc.nextInt();
    
    System.out.println("Enter The Value of b:");
    int b=sc.nextInt();

    int yA= (int) Math.pow(g,a)%p;
    System.out.println("Public Key for User One:"+ yA);

    int yB = (int) Math.pow(g, b)%p;
    System.out.println("Public Key for User Two:"+ yB);

    int K_ab1 = (int) Math.pow(yB, a)%p;
    int K_ab2 = (int) Math.pow(yA, b)%p;

    System.out.println("Secret Key for User One:"+K_ab1);
    System.out.println("Secret Kay for User Two:"+K_ab2);
  }
}