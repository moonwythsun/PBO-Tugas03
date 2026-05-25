package Atribut;

public class KarakterHSR {

    protected String idKarakter;
    protected String namaKarakter;
    protected String path;
    protected String elemen;
    protected int rarity;

    public KarakterHSR() {
        System.out.println("OBJECT KARAKTER HSR BERHASIL DIBUAT");
    }

    public KarakterHSR(String idKarakter, String namaKarakter) {
        this.idKarakter = idKarakter;
        this.namaKarakter = namaKarakter;
    }

    public KarakterHSR(String idKarakter, String namaKarakter,
            String path, String elemen, int rarity) {

        this.idKarakter = idKarakter;
        this.namaKarakter = namaKarakter;
        this.path = path;
        this.elemen = elemen;
        this.rarity = rarity;
    }

    public void create() {

        System.out.println("=== CREATE ===");

        System.out.println(
                "INSERT INTO karakter_hsr "
                + "(id_karakter, nama_karakter, path, elemen, rarity) "
                + "VALUES ('"
                + idKarakter + "', '"
                + namaKarakter + "', '"
                + path + "', '"
                + elemen + "', '"
                + rarity + "');"
        );
    }

    public String read() {

        return "SELECT * FROM karakter_hsr "
                + "WHERE id_karakter = '"
                + idKarakter + "';";
    }

    public void update() {

        System.out.println("=== UPDATE ===");

        System.out.println(
                "UPDATE karakter_hsr SET "
                + "nama_karakter = '" + namaKarakter
                + "', path = '" + path
                + "', elemen = '" + elemen
                + "', rarity = '" + rarity
                + "' WHERE id_karakter = '"
                + idKarakter + "';"
        );
    }

    public void delete() {

        System.out.println(
                "DELETE FROM karakter_hsr "
                + "WHERE id_karakter = '"
                + idKarakter + "';"
        );
    }
}