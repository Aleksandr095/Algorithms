import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Truck truck1 = new Truck();
        Truck truck2 = new Truck();
        Truck truck3 = new Truck();

        truck1.x = 0;
        truck1.y = 0;
        truck1.speed = 60;
        truck1.id = 0;

        truck2.x = 2;
        truck2.y = 2;
        truck2.speed = 60;
        truck2.id = 1;

        truck3.x = 10;
        truck3.y = 6;
        truck3.speed = 60;
        truck3.id = 2;

        ArrayList<Truck> arrayList = new ArrayList();
        arrayList.add(truck1);
        arrayList.add(truck2);
        arrayList.add(truck3);

        long result = truck1.findFirstTruck(arrayList, 5, 4);

        System.out.println(result);
    }
}
