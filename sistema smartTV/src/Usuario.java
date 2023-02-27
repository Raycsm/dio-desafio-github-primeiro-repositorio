public class Usuario {
    public static void main (String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        System.out.println("TV está ligada? " + smartTv.ligada);
        System.out.println("Qual o canal da TV? " + smartTv.canal);
        System.out.println("Qual o volume da TV? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("TV está ligada? " + smartTv.ligada);

        smartTv.mudarCanal(13);
        System.out.println("Qual o canal da TV? " + smartTv.canal);


    }

}
