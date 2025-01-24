package org.example.visitors;

import org.example.avions.*;

public class CalculTaxeVisitor implements AvionVisitor{
    @Override
    public void visit(AvionCargo avion) {
        double taxe = 500.0;
        System.out.println("Taxe pour l'avion cargo : " + taxe + " €");
    }

    @Override
    public void visit(AvionPassagers avion) {
        double taxe = 10.0 * avion.getNbrPassagers(); // Exemple de taxe par passager
        System.out.println("Taxe pour l'avion de passagers : " + taxe + " €");
    }

    @Override
    public void visit(AvionMilitaire avion) {
        double taxe = 0.0; // Les avions militaires sont exonérés de taxe
        System.out.println("Taxe pour l'avion militaire : " + taxe + " €");
    }
}
