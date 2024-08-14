import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("\n\n\n");

        Scanner scanner = new Scanner(System.in);
        SmartTv smartTV = new SmartTv();

        
        while (smartTV.ligada == true) {
            
        System.out.println(smartTV.statusTv());
        System.out.println(smartTV.controleTv());
        int opcao = scanner.nextInt();

            if (opcao == 0) {
                smartTV.desligarTv();
                smartTV.ligada = false;
            } else if (opcao == 1) {
                smartTV.aumentarVolumeTv();
            }else if(opcao == 2){
                smartTV.diminuirVolumeTv();
            }else if(opcao == 3){
                smartTV.aumentarCanal();
            }else if (opcao == 4){
                smartTV.diminuirCanal();
            }else if(opcao ==5){
                System.out.println("\nDigite o canal...\n");
                int canalRecebido = scanner.nextInt();
                smartTV.mudarCanal(canalRecebido);
            }
            else {
                System.out.println("\nA opção informada não é valida\n");
            }
        }

        System.out.println("\n\n\n");
        scanner.close();
    }
}
