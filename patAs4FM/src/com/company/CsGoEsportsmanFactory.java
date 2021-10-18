package com.company;

public class CsGoEsportsmanFactory implements EsportsmanFactory{
    @Override
    public Esportsman createEsportsman() {
        return new CsGoEsportsman();
    }
}
