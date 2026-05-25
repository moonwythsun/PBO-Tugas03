package Atribut;

public class Husbando extends KarakterHSR {

    private String region;
    private String favorit;

    public Husbando(String idKarakter,
            String namaKarakter,
            String path,
            String elemen,
            int rarity,
            String region,
            String favorit) {

        super(idKarakter, namaKarakter, path, elemen, rarity);

        this.region = region;
        this.favorit = favorit;
    }

    public void infoKarakter() {

        System.out.println("=== INFO HUSBANDO ===");

        System.out.println("ID Karakter : " + idKarakter);
        System.out.println("Nama        : " + namaKarakter);
        System.out.println("Path        : " + path);
        System.out.println("Elemen      : " + elemen);
        System.out.println("Rarity      : " + rarity + " Bintang");
        System.out.println("Region      : " + region);
        System.out.println("Favorit     : " + favorit);
    }

    public void statusKarakter() {

        System.out.println(
                namaKarakter
                + " merupakan karakter favorit di Honkai: Star Rail."
        );
    }
}