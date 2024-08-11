public class SmartTv {

    boolean ligada = true;
    int canal = 1;
    int volume = 10;

    public void ligarTv(){
        ligada = true;
        System.out.println("TV ligada" + "\n");
    }

    public void desligarTv(){
        ligada = false;
        System.out.println("TV desligada" + "\n");
    }

    public void aumentarVolumeTv(){
        volume += 1;
        System.out.println("\nVolume aumentado para: " + volume + "\n");
    }

    public void diminuirVolumeTv(){
        volume -= 1;
        System.out.println("\nVolume reduzido para: " + volume + "\n");
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("\nCanal alterado! Canal atual: " + canal + "\n");
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("\nCanal aumentado! Canal atual:" + canal + "\n");
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("\nCanal reduzido! Canal atual:" + canal + "\n");
    }

    public String statusTv(){
        return "\nSTATUS SMART TV\n" + "TV ligada: " + ligada + "\n" + "Canal: " + canal + "\n" + "Volume: " + volume + "\n";
    }

    public String controleTv(){
        return "Controle\n" + "0 - Deligar\n" + "1 - Para aumentar volume\n" + "2 - Diminuir Volume\n" + "3 - Próximo Canal\n" + "4 - Canal anterior\n" + "5 - Digitar um canal\n";
    }
    
}
