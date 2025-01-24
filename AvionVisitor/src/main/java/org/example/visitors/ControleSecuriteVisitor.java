package org.example.visitors;

import org.example.avions.*;

public class ControleSecuriteVisitor implements AvionVisitor{
    @Override
    public void visit(AvionCargo avion) {
        System.out.println("Contrôle de sécurité pour l'avion cargo : vérification de la cargaison (" + avion.getCargaison() + ")");
    }

    @Override
    public void visit(AvionPassagers avion) {
        System.out.println("Contrôle de sécurité pour l'avion de passagers : vérification des " + avion.getNbrPassagers() + " passagers");
    }

    @Override
    public void visit(AvionMilitaire avion) {
        System.out.println("Contrôle de sécurité pour l'avion militaire : vérification de la mission (" + avion.getMission() + ")");
    }
}
