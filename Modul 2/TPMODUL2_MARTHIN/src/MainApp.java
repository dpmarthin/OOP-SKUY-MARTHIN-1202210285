public class MainApp {
    public static void main (String[] args) {
        Perangkat perangkat = new Perangkat ("Adata", 2, 1.80f);
        perangkat.informasi ();

        System.out.println ("");
        Handphone handphone = new Handphone ("Sandisk", 3, 2.20f, false);
        handphone.informasi ();
        handphone.telfon (628122122);
        handphone.kirimSMSpertama (62852112);
        handphone.kirimSMSkedua (628121212, 629292211);

        System.out.println ("");
        Laptop laptop = new Laptop ("Seagate", 8, 2.40f, true);
        laptop.informasi ();
        laptop.bukaGame ("Dota 2");
        laptop.kirimEmailpertama ("niceyuk@gmail.com");
        laptop.kirimEmailkedua ("aanarji@gmail.com", "rusmango@gmail.com");
        
    }
}