package br.com.dio;

public class Concatenacao {
    public static void main(String[] args) {
        String primeiroNome = "Rayane";
        String segundoNome = "Assis";

        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
