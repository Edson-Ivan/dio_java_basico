public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // TIPOS PRIMITIVOS
        byte idade = 22;
        short ano = 2021;
        int cep = 2100733; // Se iniciar com zero, e necessaria alterar o tipo a ser utilizado
        long cpf = 987654543257L; // Se iniciar com zero, e necessaria alterar o tipo a ser utilizado. Sempre finaliza com L para confirmar que um long.
        float pi = 3.14F; // Finaliza com F para confirmar que e um float
        double salario = 2500;

        //***************************************************************

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short)numeroNormal;

        //CONSTANTES 

        final double VALOR_DE_PI = 3.14;
    }
}
