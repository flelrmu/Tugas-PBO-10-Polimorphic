package id.ac.unand.fti.si.pbo;

public class App {
    
    public static void main(String[] args) {
        //polomorphic
    MemberReguler member1 = new MemberReguler();
    MemberSilver member2 = new MemberSilver();
    MemberGold member3 = new MemberGold();
    MemberPlatinum member4 = new MemberPlatinum();

    double totalBayar1 = member1.hitungTotalBayar(8000000);
    double totalBayar2 = member2.hitungTotalBayar(7500000);
    double totalBayar3 = member3.hitungTotalBayar(6000000);
    double totalBayar4 = member4.hitungTotalBayar(1000000);

    System.out.println("Total Bayar Member Reguler :" +totalBayar1);
    System.out.println("Total Bayar Member Silver :" +totalBayar2);
    System.out.println("Total Bayar Member Gold :" +totalBayar3);
    System.out.println("Total Bayar Member Platinum :" +totalBayar4);
    
    }
}
