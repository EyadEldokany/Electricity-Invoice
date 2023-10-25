import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        customers n = new customers(in.next(), in.next(), in.nextInt());
        System.out.print("Name : " +n.getName() +"\n"+ "Address :" +n.getAddress() +"\n"+ "Consumed = " + n.getKwConsumed() +"\n"+ "Cost = ");
        slices.calculation(n.getKwConsumed());
    }
}