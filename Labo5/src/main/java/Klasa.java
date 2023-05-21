import javax.persistence.*;
import java.util.List;
@Entity
public class Klasa {
    @Id
    @GeneratedValue
    private Long id;
    private String nazwa;
    private Long rok;
    @OneToOne()
    Nauczyciel nauczyciel;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "klasa")
    private  List<Uczen> uczniowie;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "klasa")
    private  List<Przedmiot> przedmioty;

    public Nauczyciel getNauczyciel() {
        return nauczyciel;
    }

    public void setNauczyciel(Nauczyciel nauczyciel) {
        this.nauczyciel = nauczyciel;
    }

    public List<Przedmiot> getPrzedmioty() {
        return przedmioty;
    }

    public void setPrzedmioty(List<Przedmiot> przedmioty) {
        this.przedmioty = przedmioty;
    }



    public Long getRok() {
        return rok;
    }

    public void setRok(Long rok) {
        this.rok = rok;
    }

    public List<Uczen> getUczniowie() {
        return uczniowie;
    }

    public void setUczniowie(List<Uczen> uczniowie) {
        this.uczniowie = uczniowie;
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
