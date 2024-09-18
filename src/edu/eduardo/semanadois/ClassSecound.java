package edu.eduardo.semanadois;
public class ClassSecound {
    // Varivéis
    public static void main(String[] args) {
        /*
        // Estrutura
        String meuNome = "Eduardo";
        //Nome + Variavél (nome bem definido) = valor (Atribuição) de acordo com a sua Var.

        int anoNascimento = 2002;
        // O valor da minha Var está de acordo com o nome declarado.

        // Valor Lógicos (True ou False)
        boolean verdadeira = true;

        // Manipulação de Var
        anoNascimento = 2010;
        // Modifiquei o valor da Var para 2010 e assim ela se torna universal, já que o tipo dela foi declarado inicialmente.

        /*
         * int idade = 22;
         * double altura = 1.80;
         * Dog Bethoven; Var sem valor, posso atribuir um valor em outro momento código.
         */
        
         // Variavéis usadas no bloco de método abaixo.
         String primeiroNome = "Eduardo";
         String segundoNome = "Santos";
        // Atribui valores do tipo string nos parâmetros do 'nomeCompleto'.

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        // o valor da Var nomeCompleto é a chamada do método nomeCompleto com seus parametros


        System.out.println(nomeCompleto); // Vou chamar a Var e imprimir seu valor que lhe foi atribuido acima.
    }
    
    // Métodos
    // tipoRetorno (string, int, boolean) + nomeObjetivoNoInfinitivo(somar, formatar, multiplicar) + Parametro(s)(int numUm + int numDois, int numTres)
    public static String nomeCompleto( String primeiroNome, String segundoNome) {
        return "Meu nome é " + primeiroNome + " " + segundoNome; //Concatenação da primeira palavra com a segunda.

        // Ou como opção pode usar a função .concat(), ela vai concatenar a primeira string com espaço e concatenar a segunda string.
        
        
    }
}
