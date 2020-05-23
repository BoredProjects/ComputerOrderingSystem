package computer;

public class laptop extends computer {
    protected double hdPrice;
    protected double hdSize;
    protected double configuredPrice;

    public laptop(String computerModel, double price,int hdS,double hdP) {
        super(computerModel, price);
        hdSize = hdS;
        hdPrice = hdP;
        configuredPrice = price + hdPrice;
    }
    public double getConfigPrice(){
        return configuredPrice;
    }
    public void showAll(){
        System.out.println(this.computerModel + "\t\t" + this.price + "\t\t" + this.hdSize + "\t\t" + this.hdPrice + "\t\t" + this.configuredPrice);
    }
    
    

    

}
