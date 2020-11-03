public class CarManager {
    public static void main (String[] args) {

        Car prius = new PassengerCar("Toyota Prius", 2008, 15000, 1200, Color.GREEN);

        Car renault = new Bus("Renault Laguna", 2000, 9700, 1600, Color.WHITE);
        
        Car toyota = new Bus("Renault Laguna", 2000, 9700, 1600, Color.WHITE); 

        prius.addDistance(1000);
        prius.addDistance(2000);
        prius.addDistance(20.9);
        prius.addDistance(15000);
        renault.addDistance(15000);

        System.out.println(prius);
        System.out.println(renault);
        
        System.out.println(prius.isReadyToService());
        System.out.println(renault.isReadyToService());
    }
}
