package sn.uasz.Catalogue.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.uasz.Catalogue.models.Depense;
import sn.uasz.Catalogue.services.DepenseService;

import java.util.List;

//lis bien le code
@RestController
@RequestMapping("/api/catalogues")

public class DepenseController {

    @Autowired
    private DepenseService depenseService;

    // La méthode qui récupere les dépenses effectué
    @GetMapping("/depenses")
    public List<Depense> listDepense() {

        return depenseService.getAllDepense();
    }

    @PostMapping("/depenses")
    public Depense save(@RequestBody Depense depense) {
        return depenseService.addDepense(depense);
    }

}
