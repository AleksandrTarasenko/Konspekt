package Core.Exception.Tregulov;

public class MyException {
    void marafon(int tvozduha, int tempBega) throws PodvernutNoguException {
        if (tempBega > 12) {
            throw new PodvernutNoguException("visokiy temp :" + tempBega);
        }
        if (tvozduha > 32) {
            throw new SveloMishcuException();
        }
    }

    public static void main(String[] args) {
        MyException my = new MyException();
        try {
            my.marafon(10, 20);
        } catch (PodvernutNoguException e) {
            System.out.println(e.getMessage());
        }
    }
}

class PodvernutNoguException extends Exception {
    PodvernutNoguException(String message) {
        super(message);
    }

    PodvernutNoguException() {

    }
}

class SveloMishcuException extends RuntimeException {
    SveloMishcuException(String message) {
        super(message);
    }

    SveloMishcuException() {

    }
}