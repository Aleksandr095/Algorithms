import java.util.HashMap;
import java.util.Map;

public class Task4 {
    public static Map<Long, Long> trucksToDriver = new HashMap<>();
    public static Map<Long, String> driversToTabelNumber = new HashMap<>();
    public static Map<String, Long> tabelNumberToTrucks = new HashMap<>();


    static {trucksToDriver.forEach((key, value)->tabelNumberToTrucks.put(driversToTabelNumber.get(value),key));}

    public Long getTrucksId(String tabelNumber){
        return tabelNumberToTrucks.get(tabelNumber);
    }
}