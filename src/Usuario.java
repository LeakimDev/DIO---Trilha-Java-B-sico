
void main() {
    SmartTv smartTv = new SmartTv();
    String quebra = System.lineSeparator();

    System.out.println("A TV está ligada? " + smartTv.ligada);
    System.out.println("Está no canal :  " + smartTv.canal);
    System.out.println("Está no volume :  " + smartTv.volume + quebra);

    smartTv.aumentarVolume();
    smartTv.aumentarVolume();
    smartTv.aumentarVolume();
    smartTv.aumentarVolume();
        System.out.println(quebra);
    smartTv.aumentandoCanal();
    System.out.println("Está no canal :  " + smartTv.canal);
    smartTv.mudarCanal(15);
    System.out.println("Está no canal : " + smartTv.canal);
}
