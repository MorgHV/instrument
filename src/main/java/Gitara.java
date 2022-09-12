public class Gitara implements Instrument {
    String kolichestvoStryn;
    String zvuk;

    public  Gitara(String kolichestvoStryn,String zvuk){
        this.kolichestvoStryn = kolichestvoStryn;
        this.zvuk = zvuk;

    }

    @Override
    public void play() {
        System.out.print("Количество струн гитары: "+kolichestvoStryn);
        System.out.println(". Погнали "+ zvuk);    }
}
