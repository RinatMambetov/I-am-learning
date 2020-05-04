package lesson4;

class test1 {
    // don't have main method => not executable
}

    // any class is reference type of data

public class classes {

    // instance variables

    int id = 1;
    String name = "Ivan";
    double balance = 100;

}

class test {
    public static void main(String[] args) {

        classes myAccount = new classes();
        classes yourAccount = new classes();

        myAccount.name = "Rinat";
        yourAccount.name = new String("Zaur");

        System.out.println(myAccount.name);
        System.out.println(yourAccount.name);
        System.out.println(myAccount.balance);

        classes newAccount = myAccount;

        System.out.println(newAccount.name);
        System.out.println(newAccount.balance);

        classes herAccount;

        System.out.println("Loosed variable: " + new classes().balance);
    }
}