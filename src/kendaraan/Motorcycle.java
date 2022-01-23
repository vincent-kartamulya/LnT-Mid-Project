package kendaraan;
import java.util.Scanner;

public class Motorcycle extends Kendaraan{
    Scanner input = new Scanner(System.in);
    int helm;
    public int price;

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getHelm() {
        return helm;
    }
    public void setHelm(int helm) {
        this.helm = helm;
    }
    
    @Override
    public void output(){
        System.out.println("\nBrand: " + this.getBrand());
        System.out.println("Name : " + this.getName());
        System.out.println("License Plate : " + this.getLicenseNum());
        System.out.println("Type : " + this.getType());
        System.out.println("Gas Capacity : " + this.getGasCap());
        System.out.println("Top Speed : " + this.getTopSpeed());
        System.out.println("Wheel(s) : " + this.getWheel());
        System.out.println("Helmet: " + this.helm);
    }

    @Override
    public void selling() {
        System.out.printf("\n%s is standing!\n", this.getName());
        System.out.print("Input helmet price : ");
        price = input.nextInt();
        System.out.printf("Price : Rp %d\n", price);
    }
}