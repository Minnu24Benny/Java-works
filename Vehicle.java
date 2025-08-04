import java.time.Year;
class Vehicle{
String brand;
String model;
int year;
double basePrice;


Vehicle(String brand,String model,int year,double basePrice){
this.brand=brand;
this.model=model;
this.year=year;
this.basePrice=basePrice;}

void displayInfo(){
System.out.println("Brand:"+brand);
System.out.println("Model:"+model);
System.out.println("Year:"+year);
System.out.println("Base Price:"+basePrice);
}


double calculateResaleValue(){
int currentYear=Year.now().getValue();
int age=currentYear-year;
return basePrice*Math.pow(0.85,age);
}
}


class Car extends Vehicle{
int numberOfDoors;

Car(String brand,String model,int year,double basePrice,int numberOfDoors){
super(brand,model,year,basePrice);
this.numberOfDoors=numberOfDoors;
}


double calculateInsurance(){
 return 5000+(1000*numberOfDoors);
}

double calculateMaintenance(){
 return 3000+(500*numberOfDoors);
}


void displayInfo(){
super.displayInfo();
System.out.println("Number Of Doors:"+numberOfDoors);
System.out.println("Insurance:"+calculateInsurance());
System.out.println("Maintenace:"+calculateMaintenance());
System.out.println("Resale:"+calculateResaleValue());
}
}


class Motorcycle extends Vehicle{
boolean sidecar;

Motorcycle(String brand,String model,int year,double basePrice,boolean sidecar){
super(brand,model,year,basePrice);
this.sidecar=sidecar;
}

double calculateInsurance(){
 return sidecar ? 2500+1500 :2500;
}
double calculateMaintenance(){
return sidecar ? 2000+1000:2000;}

void displayInfo(){
super.displayInfo();
System.out.println("sidecar Available:"+(sidecar ? "Yes" : "No"));
System.out.println("Insurance:"+calculateInsurance());
System.out.println("Maintenace:"+calculateMaintenance());
System.out.println("Resale:"+calculateResaleValue());
}
}

class MainVehicle{
public static void main(String[]args){
Car car1=new Car("Toyota","Innova Crysta",2018,1800000,4);
Motorcycle bike1=new Motorcycle("Royal Enfield","Hunter 350",2018,150000,true);

System.out.println("Car Details:");
car1.displayInfo();

System.out.println("Motorcycle Details:");
bike1.displayInfo();
}
}



