package sn.uasz.Catalogue.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.uasz.Catalogue.models.Depense;
import sn.uasz.Catalogue.services.DepenseService;

import java.util.List;

@RestController
@RequestMapping("/api/catalogues")

public class DepenseController {
    // Modifier cette partie pour le lien de la base de données
    @Autowired
    private DepenseService depenseService;

    @GetMapping("/depenses")
    public List<Depense> listDepense() {

        return depenseService.getAllDepense();
    }

    @PostMapping("/depenses")
    public Depense save(@RequestBody Depense depense) {
        return depenseService.addDepense(depense);
    }

}
