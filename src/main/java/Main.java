public class Main {
    public static void main(String[] args) {
        Gitara gitara = new Gitara("5","brin'k-brin'k");
        Baraban baraban = new Baraban("bolshoi","bam-bam-bam-tssss");
        Tryba tryba = new Tryba("25cm","ty-ry-ty-ry-ry");
        Instrument[]all= {gitara,baraban,tryba};
        for (int i = 0; i< all.length;i++){
            all[i].play();
        }
        System.out.println("Ну это они у меня типо так играют");
    }
}
