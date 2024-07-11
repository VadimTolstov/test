package Ycheba.Biblioteci.Exceptions;

public class MyException2 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.eat("myaso");
        try {
            tiger.drink("voda");
            try {
                tiger.drink("pivo");
            } catch (NeVodaException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Eto inner finally block");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


class NeMyasoException extends RuntimeException {
    NeMyasoException(String massage) {
        super(massage);
    }
}

class NeVodaException extends Exception {
    NeVodaException(String massage) {
        super(massage);
    }
}

class Tiger {
    void eat(String eta) {
        if (eta.equals("myaso")) {
            System.out.println("Tiger est myaso");
        } else {
            throw new NeMyasoException("Tiger ne est " + eta);
        }
    }

    void drink(String voda) throws NeVodaException {
        if (voda.equals("voda")) {
            System.out.println("Tiger pyet vodu");
        } else {
            throw new NeVodaException("Tiger ne pyet " + voda);
        }
    }
}
