package com.demo.cb;

public class CompteBancaire {
    private double solde = 0.0;

    public CompteBancaire(double solde) {
        if(solde >= 0.0) {
            this.solde = solde;
        }
    }

    public double getSolde() {
        return solde;
    }

    public double deposer(double montant) {
        if(montant >= 0) {
            solde += montant;
        }
        return solde;
    }

    public double retirer(double montant) {
        if(montant >= 0 && solde - montant >= 0) {
            solde -= montant;
        }
        return solde;
    }
}
