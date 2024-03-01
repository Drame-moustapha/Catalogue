package sn.uasz.Catalogue.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.uasz.Catalogue.models.Produit;

import java.security.Provider;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
