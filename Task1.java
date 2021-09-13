public class Task1 {
    public String trucksAndCargo(int x1, int x2, int xCargo) {
        if (xCargo - x2 > xCargo - x1) return "1";
        else if (xCargo - x2 < xCargo - x1) return "2";
        else return null;
    }
}
