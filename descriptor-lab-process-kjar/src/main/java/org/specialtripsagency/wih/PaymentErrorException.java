package org.specialtripsagency.wih;

public class PaymentErrorException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public PaymentErrorException() {
        super();
    }

    public PaymentErrorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public PaymentErrorException(String message, Throwable cause) {
        super(message, cause);
    }

    public PaymentErrorException(String message) {
        super(message);
    }

    public PaymentErrorException(Throwable cause) {
        super(cause);
    }
    
    

}
