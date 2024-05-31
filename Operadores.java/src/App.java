public class App {
    public static void main(String[] args) throws Exception {
        String nomeCompleto = "Nome"+"Completo";
        System.out.println("nomeCompleto");

        int numero =5;

        numero = - numero;

        System.out.println(numero);

        numero = numero*-1; // Para transformar o numero em positivo.

        System.out.println(numero);

        // Incrementação - Decrementação

        numero++;
        System.out.println(numero);

        numero--;
        System.out.println(numero);

        // Para negar uma variavel

        boolean variavel = true;

        variavel = !variavel;

        System.out.println(variavel);

        //Operador ternario ?:

        int a=6, b=5;

        String resultado = a==b ? "verdadeiro" : "false";
        System.out.println(resultado);




    }
}
