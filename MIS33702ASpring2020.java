
package computer;

import javax.swing.JOptionPane;

public class MIS33702ASpring2020{
    
    //Arrays with vals
    static String [] computer = {"1-Dell", "2-Acer", "3-HP", "4-Apple"};
    static double[] price = {750.50,550.25,650.25,950.50};
    static String [] hdSpaceGig = {"1-256","2-512","3-1024","4-2048"};
    static double [] hdPrice = {125,175,250,450};    
    
    public static laptop[] getSetLaptops(){
        
        double modelPrice,hdP;
        int length; //Used to splice computer elements
        
        String temp = JOptionPane.showInputDialog("How many computers would you like?");
        int num = Integer.parseInt(temp); //Num of laptops
        
        laptop laptops[] = new laptop[num]; //Laptop obj array
        
        for(int a = 0; a < num; a++){

            String model = JOptionPane.showInputDialog("Select Computer Provider\n" + computer[0] + "\n" + computer[1] + "\n" + computer[2] + "\n" + computer[3]);
            int modelNum = Integer.parseInt(model) - 1; //Minus one to resize for array pos
            String hdSize = JOptionPane.showInputDialog("Select Hard Disk Capacity\n" + hdSpaceGig[0] + "\n" + hdSpaceGig[1] + "\n" + hdSpaceGig[2] + "\n" + hdSpaceGig[3]);
            int hdSizeNum = Integer.parseInt(hdSize) - 1; //Minus one to resize for array pos
            
            modelPrice = price[modelNum];
            hdP = hdPrice[hdSizeNum];
            length = computer[modelNum].length();
            model = computer[modelNum].substring(2,length);
            length = hdSpaceGig[hdSizeNum].length();
            hdSize = hdSpaceGig[hdSizeNum].substring(2,length);
            hdSizeNum = Integer.parseInt(hdSize);
            
            laptops[a] = new laptop(model,modelPrice,hdSizeNum,hdP);
        }
        
        return laptops;
        
    }
    
    public static void display(laptop laptops[]){
        int length = laptops.length;
        double sum = 0;
        
        System.out.println("Computer\tPrice\t\tDisk Capacity\tHD Price\tConfigured Price");
        
        for(int a = 0; a < length; a++){
            laptops[a].showAll();
            sum += laptops[a].configuredPrice;
        }
        
        System.out.println("Total amount Ordered " + sum + " Number of Computers " + length);
    }
    public static void main(String[] args) {
       
       //int len = getSetLaptops().length;
       laptop laptops[] = getSetLaptops();
       display(laptops);
        
    }   
    
}

