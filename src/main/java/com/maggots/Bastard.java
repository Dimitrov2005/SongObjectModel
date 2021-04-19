package com.maggots;

public class Bastard implements Person{
    public boolean isHated;

    public int severity = 0;

    @Override
    public boolean understand(String info) {
        return false;
    }

    @Override
    public void liveLife() {

    }

    @Override
    public String say(String messageToSay) {
        return null;
    }

    public boolean takeAStand(Maggot againstMaggot){
        return againstMaggot.getSeverity() <= severity ? true : false;
    }

    public void setTruthOpts(Truth truth){
        truth.setPerverted(true);
    }

}
