package xyz.test.Ex;

public class CashCard {
    private String number;
    private int balance;
    private int bonus;

    public CashCard(String number, int balance, int bonus) {
        this.number = number;
        this.balance = balance;
        this.bonus = bonus;
    }

    public void store(int money) {
        assert (money > 0): "儲值是負的？你是來亂的嗎？";
        if(money > 0) {
            this.balance += money;
            if(money >= 1000) {
                this.bonus++;
            }
        }
        else {
//            System.out.println("儲值是負的？你是來亂的嗎？");
            assert false: "儲值是負的？你是來亂的嗎？";
            throw new IllegalArgumentException("儲值是負的？你是來亂的嗎？");
        }
    }

    public void charge(int money) throws InsufficientException {
        assert money > 0 : "扣負數？這不是叫我儲值嗎？";
        if(money > 0) {
            if(money <= this.balance) {
                this.balance -= money;
            }
            else {
                System.out.println("錢不夠啦！");
                throw new InsufficientException("錢不夠啦！",this.balance);
            }
        }
        else {
//            System.out.println("扣負數？這不是叫我儲值嗎？");
//            assert false : "扣負數？這不是叫我儲值嗎？";
            throw new IllegalArgumentException("扣負數？這不是叫我儲值嗎？");
        }
    }

    public int exchange(int bonus) {
        if(bonus > 0) {
            this.bonus -= bonus;
        }
        return this.bonus;
    }

    public int getBalance() {
        return balance;
    }

    public int getBonus() {
        return bonus;
    }

    public String getNumber() {
        return number;
    }

}

