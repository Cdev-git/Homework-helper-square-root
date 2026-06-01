public class Main {
    static double problem = cacl(800, 1646);
    public static void main(String[] args){
        System.out.print(problem);
    }


    public static double cacl(double x, double y){
        double Rs = x + y;
        return Math.sqrt(Rs);
    }
}