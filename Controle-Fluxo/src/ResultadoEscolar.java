public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

        /* 
            if(nota >= 7){
                System.out.println("Aprovado");
            }else if (nota >= 5 && nota < 7) {
                System.out.println("Recuperacao");
           
            }else {
                System.out.println("Reprovado");
            }
        */
            //Utilizando condiçoes ternarias para simplicar o codigo
            String resultado = nota >=7 ? "Aprovador" : nota >=5 && nota <7 ? "Recuperação" : "Reprovador";
            //                          ? = IF                 ELSE IF                      : = ELSE
            System.out.println(resultado);
    }
}
