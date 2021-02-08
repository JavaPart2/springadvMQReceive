package be.hvwebsites.voorraad.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "artikels")
public class Artikel {
    @Id
    private long id;
    private int voorraad;

    public Artikel(long id) {
        this.id = id;
    }

    protected Artikel() {
    }
}
