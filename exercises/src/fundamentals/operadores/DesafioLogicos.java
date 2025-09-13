package fundamentals.operadores;

public class DesafioLogicos {
    public static void main(String[] args) {
        // Trabalho na terça (V ou F)
        // Trabalho na quinta-feira (V ou F)

        boolean terca = true;
        boolean quinta = true;

        boolean comprouTv50 = terca && quinta;
        boolean comprouTv32 = terca ^ quinta;
        boolean comprouSorvete = terca || quinta;
        boolean maisSaudavel = !comprouSorvete;

        System.out.println("TV de 50:"+ comprouTv50);
        System.out.println("TV de 32:"+ comprouTv32);
        System.out.println("Sorvete:"+ comprouSorvete);

        System.out.println("Saudável:"+ maisSaudavel);

    }
}
