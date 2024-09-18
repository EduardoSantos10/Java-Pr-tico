package edu.eduardo.semanatres;
public class BoletimEscolar { // Identação é a forma de escrever meu código de maneira hierarquica
 
    public static void main(String[] args) { // Control + espaço + enter => Add a estrutura da MAIN
        int mediaFinal = 8;
            if (mediaFinal >= 8)
                System.out.println("Parabens, você passou! ");
            else if (mediaFinal == 6)
                System.out.println("Você passou raspando! ");
            else if( mediaFinal == 5)
                System.out.println("Recuperação! ");
            else
                System.out.println("REPROVADO!");

    // No caso acima eu usei a estrutura de repetição (IF, ELSE), para avaliar se o estudante foi aprovado ou não!

    }
}
