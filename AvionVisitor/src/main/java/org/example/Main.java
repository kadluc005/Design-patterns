package org.example;

import org.example.avions.*;
import org.example.visitors.*;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Avion> avions = new ArrayList<>();
        avions.add(new AvionCargo("Marchandises diverses"));
        avions.add(new AvionPassagers(150));
        avions.add(new AvionMilitaire("Mission secrète"));

        ControleSecuriteVisitor controleSecurite = new ControleSecuriteVisitor();
        CalculTaxeVisitor calculTaxe = new CalculTaxeVisitor();

        for (Avion avion : avions) {
            avion.acceptVisitor(controleSecurite);
            avion.acceptVisitor(calculTaxe);
            System.out.println();
        }
    }
}