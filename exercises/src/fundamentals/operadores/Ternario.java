package fundamentals.operadores;

public class Ternario {
    public static void main(String[] args) {
        double media = 7.6;
        String resultadoFinal = media >= 7.0 ? "Aprovado" : "em Recuperação";

        System.out.println("O aluno está " + resultadoFinal + ".");
    }
}
