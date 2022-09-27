package fr.banque.BanqueException;

import java.lang.Exception;

public class BanqueException  extends Exception {
    public BanqueException() {
        super();
    }

    public BanqueException(String message) {
        super(message);
    }

    public BanqueException(Throwable cause) {
        super(cause);
    }

    public BanqueException(String message, Throwable cause) {
        super(message, cause);
    }
}
