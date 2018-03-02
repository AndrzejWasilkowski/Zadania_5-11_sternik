package pl.sternik.aw.zadania.zad07;

public class DivideByZeroException extends ArithmeticException {
    public DivideByZeroException (String msg){
        super("DividedByZeroException: " + msg);
    }
}
