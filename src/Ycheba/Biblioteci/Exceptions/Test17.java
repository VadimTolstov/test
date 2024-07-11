package Ycheba.Biblioteci.Exceptions;

public class Test17 {
    void marafon(int temperaturaVozduxa, int tempBega) throws PodvernutNoguExtends {
        if (tempBega > 12) {
            throw new PodvernutNoguExtends("Темп бега был слишком высоким " + tempBega);
        }
        if (temperaturaVozduxa > 32) {
            throw new SveloMishcuExtends();
        }
        System.out.println("Вы пробежали марафон");
    }

    public static void main(String[] args) {
        Test17 test17 = new Test17();
        try {
            test17.marafon(33, 25);
        } catch (PodvernutNoguExtends e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("В любом случаи вы получите грамоту");
        }
    }
}

class PodvernutNoguExtends extends Exception {
    PodvernutNoguExtends(String message) {
        super(message);
    }

    PodvernutNoguExtends() {
    }
}

class SveloMishcuExtends extends RuntimeException {

    SveloMishcuExtends(String message) {
        super(message);
    }

    SveloMishcuExtends() {
    }
}