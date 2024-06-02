import java.util.Scanner;

public class SistemaMedida {
    public static void main(String[] args) {
    
        String sigla ="";
            Scanner scanner = new Scanner(System.in);

            System.out.println("Informe a sigla desejada : ");
            sigla = scanner.next();

                System.err.println("**** IF ELSE ****");

            if(sigla.equals("P")){
                System.out.println("PEQUENO");

            }else if (sigla.equals("M")){
                System.out.println("MEDIA");

            }else if (sigla.equals("G")){
                System.out.println("GRANDE");

            }else {
                System.out.println("Sigla invalida");
            }
            
                System.err.println("**** SWITCH CASE ****");
                
            switch (sigla){
                case "P":{ 
                    System.err.println("PREQUENO");
                    break;
                }
                case "M":{
                    System.err.println("MEDIO");
                    break;
                }
                case "G":{
                    System.err.println("GRANDE");
                    break;
                }
                default:{
                    System.out.println("Sigla invalida");
                }
            }
    }
}
