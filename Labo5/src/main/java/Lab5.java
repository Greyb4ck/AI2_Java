import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.ArrayList;

public class Lab5 {

    public static void main(String[] args) {
        EntityManager em = Persistence.createEntityManagerFactory("moja-baza").createEntityManager();
        Klasa k = new Klasa();
        Klasa k2 = new Klasa();
        Klasa k3 = new Klasa();
        Nauczyciel N1 = new Nauczyciel();
        Nauczyciel N2 = new Nauczyciel();
        Nauczyciel N3 = new Nauczyciel();

        N1.setImie("Maria");
        N1.setNazwisko("Chmielewska");

        N2.setImie("Julian");
        N2.setNazwisko("Sobczak");

        N3.setImie("Leszek");
        N3.setNazwisko("Sikorska");


        Przedmiot P1 = new Przedmiot();
        P1.setNazwa("W-F");
        P1.setNauczyciel(N1);
        P1.setKlasa(k);

        Przedmiot P2 = new Przedmiot();
        P2.setNazwa("Matma");
        P2.setNauczyciel(N1);
        P2.setKlasa(k);

        Przedmiot P3 = new Przedmiot();
        P3.setNazwa("Fizyka");
        P3.setNauczyciel(N1);
        P3.setKlasa(k);

        Przedmiot P4 = new Przedmiot();
        P4.setNazwa("Biologa");
        P4.setNauczyciel(N1);
        P4.setKlasa(k);

        Przedmiot P5 = new Przedmiot();
        P5.setNazwa("Muzyka");
        P5.setNauczyciel(N1);
        P5.setKlasa(k);




        Przedmiot P11 = new Przedmiot();
        P11.setNazwa("W-F");
        P11.setNauczyciel(N2);
        P11.setKlasa(k2);

        Przedmiot P21 = new Przedmiot();
        P21.setNazwa("Matma");
        P21.setNauczyciel(N2);
        P21.setKlasa(k2);

        Przedmiot P31 = new Przedmiot();
        P31.setNazwa("Fizyka");
        P31.setNauczyciel(N2);
        P31.setKlasa(k2);

        Przedmiot P41 = new Przedmiot();
        P41.setNazwa("Biologa");
        P41.setNauczyciel(N2);
        P41.setKlasa(k2);

        Przedmiot P51 = new Przedmiot();
        P51.setNazwa("Muzyka");
        P51.setNauczyciel(N2);
        P51.setKlasa(k2);




        Przedmiot P12 = new Przedmiot();
        P12.setNazwa("W-F");
        P12.setNauczyciel(N3);
        P12.setKlasa(k3);

        Przedmiot P22 = new Przedmiot();
        P22.setNazwa("Matma");
        P22.setNauczyciel(N3);
        P22.setKlasa(k3);

        Przedmiot P32 = new Przedmiot();
        P32.setNazwa("Fizyka");
        P32.setNauczyciel(N3);
        P32.setKlasa(k3);

        Przedmiot P42 = new Przedmiot();
        P42.setNazwa("Biologa");
        P42.setNauczyciel(N3);
        P42.setKlasa(k3);

        Przedmiot P52 = new Przedmiot();
        P52.setNazwa("Muzyka");
        P52.setNauczyciel(N3);
        P52.setKlasa(k3);



        N1.setPrzedmioty(new ArrayList<>());
        N1.getPrzedmioty().add(P1);
        N1.getPrzedmioty().add(P2);
        N1.getPrzedmioty().add(P3);
        N1.getPrzedmioty().add(P4);
        N1.getPrzedmioty().add(P5);

        N2.setPrzedmioty(new ArrayList<>());
        N2.getPrzedmioty().add(P11);
        N2.getPrzedmioty().add(P21);
        N2.getPrzedmioty().add(P31);
        N2.getPrzedmioty().add(P41);
        N2.getPrzedmioty().add(P51);

        N3.setPrzedmioty(new ArrayList<>());
        N3.getPrzedmioty().add(P12);
        N3.getPrzedmioty().add(P22);
        N3.getPrzedmioty().add(P32);
        N3.getPrzedmioty().add(P42);
        N3.getPrzedmioty().add(P52);


        em.getTransaction().begin();
        em.persist(N1);
        em.persist(N2);
        em.persist(N3);
        em.getTransaction().commit();





        k.setNazwa("2c");
        k.setRok(1L);
        k.setNauczyciel(N1);

        k2.setNazwa("2b");
        k2.setRok(1L);
        k2.setNauczyciel(N2);

        k3.setNazwa("2a");
        k3.setRok(1L);
        k3.setNauczyciel(N3);



        Uczen u1 = new Uczen();
        u1.setImie("Franek");
        u1.setNazwisko("Kowalski");
        u1.setKlasa(k);

        Uczen u2 = new Uczen();
        u2.setImie("Kasia");
        u2.setNazwisko("Nowak");
        u2.setKlasa(k);

        Uczen u3 = new Uczen();
        u3.setImie("Milosz");
        u3.setNazwisko("Krajewska");
        u3.setKlasa(k);

        Uczen u4 = new Uczen();
        u4.setImie("Emil");
        u4.setNazwisko("Kubiak");
        u4.setKlasa(k);

        Uczen u5 = new Uczen();
        u5.setImie("Diego");
        u5.setNazwisko("Mazur");
        u5.setKlasa(k);





        Uczen u12 = new Uczen();
        u12.setImie("Albert");
        u12.setNazwisko("Duda");
        u12.setKlasa(k2);

        Uczen u22 = new Uczen();
        u22.setImie("Kasia");
        u22.setNazwisko("Kaczmarczyk");
        u22.setKlasa(k2);

        Uczen u32 = new Uczen();
        u32.setImie("Florian ");
        u32.setNazwisko("Kowalczyk");
        u32.setKlasa(k2);

        Uczen u42 = new Uczen();
        u42.setImie("Leszek");
        u42.setNazwisko("Borkowski");
        u42.setKlasa(k2);

        Uczen u52 = new Uczen();
        u52.setImie("Diego");
        u52.setNazwisko("Kubiak");
        u52.setKlasa(k2);




        Uczen u13 = new Uczen();
        u13.setImie("Jacek");
        u13.setNazwisko("Wlodarczyk");
        u13.setKlasa(k3);

        Uczen u23 = new Uczen();
        u23.setImie("Martin");
        u23.setNazwisko("Rutkowski");
        u23.setKlasa(k3);

        Uczen u33 = new Uczen();
        u33.setImie("Eustachy ");
        u33.setNazwisko("Krupa");
        u33.setKlasa(k3);

        Uczen u43 = new Uczen();
        u43.setImie("Julian");
        u43.setNazwisko("Szulc");
        u43.setKlasa(k3);

        Uczen u53 = new Uczen();
        u53.setImie("Jacek");
        u53.setNazwisko("Lewandowski");
        u53.setKlasa(k3);




        N1.setKlasa(k);
        N2.setKlasa(k2);
        N3.setKlasa(k3);

        k.setUczniowie(new ArrayList<>());

        k.getUczniowie().add(u1);
        k.getUczniowie().add(u2);
        k.getUczniowie().add(u3);
        k.getUczniowie().add(u4);
        k.getUczniowie().add(u5);


        k2.setUczniowie(new ArrayList<>());

        k2.getUczniowie().add(u12);
        k2.getUczniowie().add(u22);
        k2.getUczniowie().add(u32);
        k2.getUczniowie().add(u42);
        k2.getUczniowie().add(u52);


        k3.setUczniowie(new ArrayList<>());

        k3.getUczniowie().add(u13);
        k3.getUczniowie().add(u23);
        k3.getUczniowie().add(u33);
        k3.getUczniowie().add(u43);
        k3.getUczniowie().add(u53);




        em.getTransaction().begin();
        em.persist(k);
        em.persist(k2);
        em.persist(k3);
        em.getTransaction().commit();


//        System.out.println(u1.getImie()+ " "+ u1.getNazwisko() + " " + k.getUczniowie());
//
//        Klasa klasa = em.find(Klasa.class, 1L);
//        for (Uczen u : klasa.getUczniowie()){
//            System.out.println(u.getImie()+ " "+ u.getNazwisko());
//        }


        Uczen uczen = em.find(Uczen.class, 35L);
        System.out.println("Wypis przedmiotów:");
        for (Przedmiot u : uczen.getKlasa().getNauczyciel().getPrzedmioty()){
            System.out.println(u.getNazwa());
        }
        System.out.println("\n" + "Wypis uczniów:" );
        Nauczyciel nauczyciel = em.find(Nauczyciel.class, 1L);
        //System.out.println(nauczyciel.getKlasa().getUczniowie());
        for (Uczen u : nauczyciel.getKlasa().getUczniowie()){
            System.out.println(u.getImie()+ " "+ u.getNazwisko());
        }


    }
}
