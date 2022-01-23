import kendaraan.*;
import java.util.Scanner;
import java.util.ArrayList;

// MID LNT PROJECT VINCENT KARTAMULYA SANTOSO
public class Main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Kendaraan> data = new ArrayList<Kendaraan>();
    static String tipeKendaraan, brand, name, licenseNum, type;
    static int topSpeed, gasCap, wheel;

    public static void inputData(){
        //Input tipe kendaraan
        do{
            System.out.print("Input vehicle type [Car | Motorcycle]: ");
            tipeKendaraan = input.nextLine();
        }while(!tipeKendaraan.equals("Car") && !tipeKendaraan.equals("Motorcycle"));

        //Input brand
        do{
            System.out.print("Input brand [>= 5]: ");
            brand = input.nextLine();
        }while(brand.length() < 5);    

        //Input nama
        do{
            System.out.print("Input name [>= 5]: ");
            name = input.nextLine();
        }while(name.length() < 5);    
        
        //Input license number
        int flag = 1;
        do{
            flag = 1;
            System.out.print("Input license number: ");
            licenseNum = input.nextLine();
            // check huruf pertama
            if(licenseNum.charAt(0) < 'A' || licenseNum.charAt(0) > 'Z' ||
            (int) licenseNum.charAt(1) != 32){
                flag = 0;
            }
            if(flag != 0){
                int i = 2;
                int count = 0;
                // check angka
                while(!Character.isWhitespace(licenseNum.charAt(i))){
                    if(licenseNum.charAt(i) < '0' || licenseNum.charAt(i) > '9' || count >= 4){
                        flag = 0;
                        break;
                    }
                    count++;
                    i++;
                    if(i == licenseNum.length()){
                        flag = 0;
                        break;
                    }
                }
                i++;
                count = 0;
                // check huruf-huruf terakhir
                if(flag != 0){
                    while(!Character.isWhitespace(licenseNum.charAt(i))){
                        if(licenseNum.charAt(i) < 'A' || licenseNum.charAt(i) > 'Z' || count >= 3){
                            flag = 0;
                            break;
                        }
                        count++;
                        i++;
                        if(i == licenseNum.length()){
                            break;
                        }
                    }
                }
            }
        }while(flag == 0);
        
        //Input top speed
        do{
            System.out.print("Input top speed [100 <= topSpeed <= 250]: ");
            topSpeed = input.nextInt();
        }while(topSpeed < 100 || topSpeed > 250);

        //Input gas capacity
        do{
            System.out.print("Input gas capacity [30 <= gasCap <= 60]: ");
            gasCap = input.nextInt();
        }while(gasCap < 30 || gasCap> 60);

        //Input wheel
        if(tipeKendaraan.equals("Car")){
            do{
                System.out.print("Input wheel [4 <= wheel <= 6]: ");
                wheel = input.nextInt();
            }while(wheel < 4 || wheel > 6);
        }else{
            do{
                System.out.print("Input wheel [2 <= wheel <= 3]: ");
                wheel = input.nextInt();
            }while(wheel < 2 || wheel > 3);
        }

        //Input Type
        if(tipeKendaraan.equals("Car")){
            do{
                System.out.print("Input type [SUV | Supercar | Minivan]: ");
                type = input.nextLine();
            }while(!type.equals("SUV") && !type.equals("Supercar") && !type.equals("Minivan"));
        }else{
            do{
                System.out.print("Input type [Automatic | Manual]: ");
                type = input.nextLine();
            }while(!type.equals("Automatic") && !type.equals("Manual"));
        }
        
        //Input atribut khusus
        if(tipeKendaraan.equals("Car")){
            int entertainmentSystem;
            do{
                System.out.print("Input entertainment system amount [>= 1]: ");
                entertainmentSystem = input.nextInt();
            }while(entertainmentSystem < 1);

            Car newCar = new Car();
            newCar.setTipeKendaraan(tipeKendaraan);
            newCar.setBrand(brand);
            newCar.setName(name);
            newCar.setLicenseNum(licenseNum);
            newCar.setTopSpeed(topSpeed);
            newCar.setGasCap(gasCap);
            newCar.setWheel(wheel);
            newCar.setType(type);
            newCar.setEntertainmentSystem(entertainmentSystem);
            data.add(newCar);
        }else{
            int helm;
            do{
                System.out.print("Input helmet amount [>= 1]]: ");
                helm = input.nextInt();
            }while(helm < 1);

            Motorcycle newMotor = new Motorcycle();
            newMotor.setTipeKendaraan(tipeKendaraan);
            newMotor.setBrand(brand);
            newMotor.setName(name);
            newMotor.setLicenseNum(licenseNum);
            newMotor.setTopSpeed(topSpeed);
            newMotor.setGasCap(gasCap);
            newMotor.setWheel(wheel);
            newMotor.setType(type);
            newMotor.setHelm(helm);
            data.add(newMotor);
        }
       
        System.out.println("\nInput Success!");
        System.out.print("ENTER to return");
    }

    public static void table(){
        System.out.println("\n|------|--------------------|----------------------|");
        System.out.println("|  No  |       Type         |         Name         |");
        System.out.println("|------|--------------------|----------------------|");
        for(int i=0; i<data.size(); i++){
            System.out.printf("|%3d   | %-19s| %-21s|\n", i+1, data.get(i).getTipeKendaraan(), data.get(i).getName());
        }
        System.out.println("|------|--------------------|----------------------|");
        System.out.println("|------|--------------------|----------------------|");
    }

    public static void viewData(){
        int choice;
        table();
        
        do{
            do{
                System.out.print("\nPick a vehicle number to test drive[Enter '0' to exit]: ");
                choice = input.nextInt();
            }while(choice < 0 || choice > data.size());

            if(choice != 0){
                data.get(choice-1).output();
                data.get(choice-1).selling();;
            }
        }while(choice != 0);
    }

    public static void mainMenu(){
        int choice;
        do{
            System.out.println("\n\n==============================");
            System.out.println("   Welcome to PT Musang App");
            System.out.println("==============================");
            System.out.println("1. Input Data");
            System.out.println("2. View Data");
            System.out.println("3. Exit\n");
            System.out.print("Your choice >> ");
    
            choice = input.nextInt();
    
            if(choice == 1){
                inputData();
            }else if(choice == 2){
                viewData();
            }else if(choice == 3){
                System.out.println("Thank you for using this program!");
                System.out.println("Have a nice day :) \n\n");
                return;
            }
        }while(choice != 1 || choice != 2);
    }
    public static void main(String[] args){
        mainMenu();
    }
}