package edu.eder.primeirasemana;
public class MinhaClasse {
    public static void main(String[] args) {
        System.out.print ("Olá a todos, seja bem-vindos! ");
        
        String primeiroNome = "Eder";
        String segundoNome = "William";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
    
}
