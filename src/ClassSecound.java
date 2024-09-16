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

        System.out.println(nomeCompleto);
    }
    
    // Métodos
    public static String nomeCompleto( String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
        
    }
}
