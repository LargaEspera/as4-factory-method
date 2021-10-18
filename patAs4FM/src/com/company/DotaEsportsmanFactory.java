package com.company;

public class DotaEsportsmanFactory implements EsportsmanFactory{
    @Override
    public Esportsman createEsportsman() {
        return new DotaEsportsman();
    }
}
