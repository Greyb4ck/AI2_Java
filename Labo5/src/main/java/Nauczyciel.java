import javax.persistence.*;
import java.util.List;

@Entity
public class Nauczyciel {
    @Id
    @GeneratedValue
    private Long id;
    private String imie;
    private String Nazwisko;
    @OneToOne(cascade = CascadeType.ALL)
    Klasa klasa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nauczyciel")
    private List<Przedmiot> przedmioty;

    public Klasa getKlasa() {
        return klasa;
    }

    public void setKlasa(Klasa klasa) {
        this.klasa = klasa;
    }

    public List<Przedmiot> getPrzedmioty() {
        return przedmioty;
    }

    public void setPrzedmioty(List<Przedmiot> przedmioty) {
        this.przedmioty = przedmioty;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        Nazwisko = nazwisko;
    }
}

