package com.company;

public class Main {

    public static void main(String[] args) {

        EsportsmanFactory factoryDota = new DotaEsportsmanFactory();
        EsportsmanFactory factoryCsGo = new CsGoEsportsmanFactory();

        Esportsman esportsmanDota = factoryDota.createEsportsman();
        Esportsman esportsmanCsGo = factoryCsGo.createEsportsman();

        System.out.println("Dota esportsman:");
        esportsmanDota.playGame();
        System.out.println("Counter Strike Global Offensive esportsman:");
        esportsmanCsGo.playGame();
    }
}
