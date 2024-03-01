package sn.uasz.Catalogue.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.uasz.Catalogue.models.Depense;
import sn.uasz.Catalogue.repositories.DepenseRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepenseService {

    @Autowired
    private DepenseRepository depenseRepository;

    //METHOde pour ajouter une depense
    public Depense addDepense(Depense depense) {


        return depenseRepository.save(depense);
    }

    //methode pour afficher toutes les depenses
    public List<Depense> getAllDepense(){

        return depenseRepository.findAll();
    }

}
