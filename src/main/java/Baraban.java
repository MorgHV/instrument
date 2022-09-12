public class Baraban implements Instrument{
    String size;
    String zvuk;
    public  Baraban(String size,String zvuk){
        this.size = size;
        this.zvuk = zvuk;

    }

    @Override
    public void play() {
        System.out.print("Размер барабана: "+size);
        System.out.println(". Погнали "+ zvuk);}
    }

