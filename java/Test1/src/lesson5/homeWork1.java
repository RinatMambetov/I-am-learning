package lesson5;

public class homeWork1 {

    int id;
    String name;
    double balance;

    double increaseBalance(double more) {
        balance += more;
        return balance;
    }

    double decreaseBalance(double less) {
        balance -= less;
        return balance;
    }

    void printBalance() {
        System.out.println(balance);
    }

}

class bankAccount {

    public static void main(String[] args) {

        homeWork1 myAccount = new homeWork1();
        myAccount.id = 1;
        myAccount.name = "Rinat";
        myAccount.balance = 154.56;

        myAccount.increaseBalance(45.2);
        myAccount.decreaseBalance(18.99);

        myAccount.printBalance();

    }

}