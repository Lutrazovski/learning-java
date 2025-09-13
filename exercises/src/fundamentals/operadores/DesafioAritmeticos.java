package fundamentals.operadores;

public class DesafioAritmeticos {
    public static void main(String[] args) {
        double a = Math.pow((6 * (3 + 2)), 2) / (3 * 2);
        double b = Math.pow((double) ((1 - 5) * (2 - 7)) / 2 , 2);
        double c = a - b;
        double d = Math.pow(c , 3) / Math.pow(10, 3);
        System.out.println(d);
    }
}
