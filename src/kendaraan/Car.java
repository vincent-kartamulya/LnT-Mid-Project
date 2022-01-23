package kendaraan;

public class Car extends Kendaraan{
    int entertainmentSystem;
    
    public int getEntertainmentSystem() {
        return entertainmentSystem;
    }
    public void setEntertainmentSystem(int entertainmentSystem) {
        this.entertainmentSystem = entertainmentSystem;
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
        System.out.println("Entertainment System: " + this.entertainmentSystem);
    }
    
    @Override
    public void selling() {
        System.out.println("\nTurning on entertainment system...");
        if(this.getType().equals("Supercar")){
            System.out.println("Boosting!");
        }
    }
}

    
