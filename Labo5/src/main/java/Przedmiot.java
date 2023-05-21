import javax.persistence.*;

@Entity
public class Przedmiot {
    @Id
    @GeneratedValue
    private Long id;
    private String nazwa;

    @ManyToOne(cascade = CascadeType.ALL)
    private Klasa klasa;

    @ManyToOne(cascade = CascadeType.ALL)
    private Nauczyciel nauczyciel;


    public Klasa getKlasa() {
        return klasa;
    }

    public void setKlasa(Klasa klasa) {
        this.klasa = klasa;
    }




    public Nauczyciel getNauczyciel() {
        return nauczyciel;
    }

    public void setNauczyciel(Nauczyciel nauczyciel) {
        this.nauczyciel = nauczyciel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
