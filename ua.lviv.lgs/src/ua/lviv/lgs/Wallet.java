package ua.lviv.lgs;

public class Wallet {
    private double amountofmoney;
    private double width;

    public Wallet(double amountofmoney, double width) {
        super();
        this.amountofmoney = amountofmoney;
        this.width = width;
    }

    public double getAmountofmoney() {
        return amountofmoney;
    }

    public void setAmountofmoney(int amountofmoney) {
        this.amountofmoney = amountofmoney;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Wallet{" + "amountofmoney=" + amountofmoney + ", width=" + width + '}';
    }
}
