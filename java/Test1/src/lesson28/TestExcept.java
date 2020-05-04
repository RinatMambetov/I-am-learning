package lesson28;

public class TestExcept {

    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat("meat");
        try {
            t.drink("water");
            try {
                t.drink("beer");
            } catch (NotWaterException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.getMessage();
            } finally {
                System.out.println("It's inner finally block");
            }
        } catch (RuntimeException e) {
            e.getMessage();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("It's outer finally block");
        }
    }
}

class NotMeatException extends RuntimeException {

    NotMeatException(String str) {
        super(str);
    }
}

class NotWaterException extends Exception {

    NotWaterException(String str) {
        super(str);
    }
}

class Tiger {

    void eat(String eatAttempt) {
        if (!eatAttempt.equals("meat")) {
            throw new NotMeatException("Tiger don't eat " + eatAttempt);
        } else System.out.println("Tiger eats meat");
    }

    void drink(String drinkAttempt) throws NotWaterException {
        if (!drinkAttempt.equals("water")) {
            throw new NotWaterException("Tiger don't drink " + drinkAttempt);
        } else System.out.println("Tiger drink water");
    }
}