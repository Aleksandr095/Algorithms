import java.time.Instant;

class Task5 {

    private static Instant previousMeasurementTime = Instant.parse("2020-10-29T13:56:40.11Z");

    public static void receiveCoordinates(int truckId, int x, int y, Instant measurementTime){
        if (previousMeasurementTime.isBefore(measurementTime)){
            previousMeasurementTime = measurementTime;
            processCoordinates(truckId, x, y, measurementTime);}
    }

    public static void processCoordinates(int truckId, int x, int y, Instant measurementTime){
        System.out.println("Пришел пакет "+truckId+" "+x+" "+y+" "+ measurementTime);
    }
}