package sn.uasz.Catalogue.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import sn.uasz.Catalogue.models.Service;

public interface ServiceRpository extends JpaRepository<Service, Long> {
}
