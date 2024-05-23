public class Usuario {
    public static void main(String[] args) throws Exception {

        SmarTv smarTv = new SmarTv();

    smarTv.diminuirVolume();
    smarTv.diminuirVolume();
    smarTv.diminuirVolume();
    smarTv.diminuirVolume();
    smarTv.aumentarVolume();
    
        System.out.println("Voume Atual : " + smarTv.volume);
        System.out.println("TV Ligada ? " + smarTv.ligada);
        System.out.println("Canal Atual : " + smarTv.canal);
        System.out.println("Voume Atual :" + smarTv.volume);

        smarTv.escolherCanal(23);
        System.out.println("Canal Atual : " + smarTv.canal);

      smarTv.ligar();
      System.out.println("Novo Status -> TV Ligada ? " + smarTv.ligada);

      smarTv.desligar();
      System.out.println("Novo Status -> TV Ligada ? " + smarTv.ligada);

     




        
    }
}
