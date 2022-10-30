package lekcijaCetri.labDarbs;

public class Automasina {
    String zimols;
    int durvis;
    boolean tehniskaApskate;


    public void printAutomasina() {
        System.out.println(
                "Automašīna " + zimols +
                        "Automasšīnai ir " + durvis + " durvis" +
                        "Automašīnai it tehniskā apskate " + tehniskaApskate);
    }
}
