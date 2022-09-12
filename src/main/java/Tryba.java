public class Tryba implements Instrument {
    String diametr;
    String zvuk;
    public  Tryba(String diametr,String zvuk){
        this.diametr = diametr;
        this.zvuk = zvuk;

    }

    @Override
    public void play() {
        System.out.print("Диаметр трубы: "+diametr);
        System.out.println(". Погнали "+ zvuk);
}
}
