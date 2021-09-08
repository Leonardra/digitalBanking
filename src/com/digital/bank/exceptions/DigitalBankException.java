package com.digital.bank.exceptions;

public class DigitalBankException extends Exception{
    public DigitalBankException() {

    }

    public DigitalBankException(String message) {
        super(message);
    }

    public DigitalBankException(String message, Throwable cause) {
        super(message, cause);
    }

    public DigitalBankException(Throwable cause) {
        super(cause);
    }
}
