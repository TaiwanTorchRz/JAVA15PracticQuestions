package xyz.test.Ex;

public class InsufficientException extends Throwable{
    private int remain;
    public InsufficientException(String message,int remain) {
        super(message);
        this.remain = remain;
    }

    public int getRemain() {
        return remain;
    }
}
