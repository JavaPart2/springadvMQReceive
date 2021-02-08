package be.hvwebsites.voorraad.events;

import be.hvwebsites.voorraad.domain.Artikel;

public class ArtikelGemaakt {
    private long id;
    private String naam;

    public Artikel naarArtikel(){
        return new Artikel(id);
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
}
