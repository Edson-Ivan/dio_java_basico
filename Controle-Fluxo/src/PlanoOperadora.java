public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M";


            // Não esta sendo utilizado o case pois os planos foram inseridos de formar estrategicas e decrecente de acordo com o plano selecionado
            switch (plano) {
                case "T":{
                    System.err.println("5GB Youtube");
                }
                case "M":{
                    System.err.println("Whats e Instragem gratis");
                }
                case "B":{
                    System.err.println("100 minutos de ligação");
                }

            }
    }
}
