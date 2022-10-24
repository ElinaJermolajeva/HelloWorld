package lekcijaCetri.labDarbs;

public class House {
    int stavuDaydzums;
    int loguSkaits;
    int durvjuSkaits;
    String adrese;
    double griestuAugstums;
    long kadastralaVertiba;
    boolean vaiPrivatipasums;

    public void printHouse() {
        System.out.println("House{" +
                "stavuDaydzums=" + stavuDaydzums +
                ", loguSkaits=" + loguSkaits +
                ", durvjuSkaits=" + durvjuSkaits +
                ", adrese='" + adrese + '\'' +
                ", griestuAugstums=" + griestuAugstums +
                ", kadastralaVertiba=" + kadastralaVertiba +
                ", vaiPrivatipasums=" + vaiPrivatipasums +
                '}');
    }
}
