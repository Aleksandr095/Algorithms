import java.util.List;

public class Truck { // Task3
    long id;
    double x; //координата по оси x
    double y; //координата по оси y
    double speed; //скорость грузовика

    public long findFirstTruck(List<Truck> trucks, int xCargo, int yCargo) {
        double[] time = new double[trucks.size()];
        for (int i = 0; i < trucks.size(); i++) {
            double dist = Math.sqrt((Math.pow(trucks.get(i).x - (double) xCargo, 2.0) + Math.pow(trucks.get(i).y - (double) yCargo, 2.0)));
            time[i] = dist / trucks.get(i).speed;
            System.out.println("dist = " + dist);
            System.out.println("time = " + time[i]);
        }
        double min = time[0];
        int minId = 0;
        for (int i = 1; i < time.length; i++) {
            if (time[i] < min) {
                min = time[i];
                minId = i;
            }
        }
        return trucks.get(minId).id;
    }
}
