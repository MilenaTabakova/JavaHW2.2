
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int amount = 1100;
        int bonus = 100;
        int sum;

        if (amount >= 1000) {
            sum = amount / bonus;
        } else {
            sum = 0;
        }
        System.out.println(sum + amount + balance);


    }
}