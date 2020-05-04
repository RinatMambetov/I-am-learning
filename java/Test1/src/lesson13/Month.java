package lesson13;

public class Month {

    static void showAmountDays(int m) {
        switch(m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(31);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
                break;
            default:
                System.out.println(28);
        }
    }

}

class MonthTest {

    public static void main(String[] args) {
        Month.showAmountDays(1);
        Month.showAmountDays(2);
        Month.showAmountDays(3);
        Month.showAmountDays(4);
        Month.showAmountDays(5);
        Month.showAmountDays(6);
        Month.showAmountDays(7);
        Month.showAmountDays(8);
        Month.showAmountDays(9);
        Month.showAmountDays(10);
        Month.showAmountDays(11);
        Month.showAmountDays(12);
    }

}