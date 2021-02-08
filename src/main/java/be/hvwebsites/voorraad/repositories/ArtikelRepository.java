package be.hvwebsites.voorraad.repositories;

import be.hvwebsites.voorraad.domain.Artikel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtikelRepository extends JpaRepository<Artikel, Long> {
}
