public class RecToPolar {
    public static void main(String[] args) {
        Double x = 10.0;
        Double y = 20.0;

        Double distance = Math.sqrt((x * x) + (y * y));
        double angle = Math.atan(x / y);

        System.out.format(distance + ", " + Math.toDegrees(angle)+"°");
    }
}
    

