public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSoliciatado = 17.0;

            if (valorSoliciatado < saldo){
                saldo = saldo - valorSoliciatado;

                System.out.println(saldo);
            }else{
                System.out.println("Valor indisponivel");
            }
    }
}
