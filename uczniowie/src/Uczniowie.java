import java.util.Objects;

public class Uczen{
    private final String imie;
    private final String nazwisko;
    private final int wiek;
    private int klasa;

    public Uczen(String imie, String nazwisko, int wiek){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public int getKlasa() {
        return klasa;
    }

    public void setKlasa(int klasa) {
        this.klasa = klasa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Uczen uczen = (Uczen) o;
        return wiek == uczen.wiek && wiek == uczen.wiek && Objects.equals(imie, uczen.imie) && Objects.equals(nazwisko, uczen.nazwisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, wiek, klasa);
    }

    @Override
    public String toString() {
        return String.format("%s %s, rok wiek %d, klasa %d", imie, nazwisko, wiek, klasa);
    }
}