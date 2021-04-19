package com.maggots;

public class Maggot implements Person{
    private final String right = "Unconditional";
    private final boolean isMartyr = true;
    private final boolean knowsPlan = false;
    private String name;
    private String life;
    private int severity;

    public Maggot (String name){
        this.name = name;
    }

    @Override
    public boolean understand(String info) {
        return false;
    }

    @Override
    public void liveLife() {
        System.out.println("Maggot lives " + this.life + "life");
    }

    public void giveLife(){
        System.out.println("Maggot has given life");
    }

    @Override
    public String say(String messageToSay) {
        return null;
    }

    public void hateBastard (Bastard bastard){
        bastard.isHated = true;
    }

    public void tryToDoSomething(String task){
        System.out.println("Maggot is: " + task);
    }

    public void fight(String reason){
        System.out.println("Maggot fights for: "+ reason);
    }

    public void walk(Maggot with){
        if(with == null){
            System.out.println("Maggot walks alone");
        }
        else System.out.println("Maggot walks with " + with.name);
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    public int getSeverity() {
        return severity;
    }

    public void setTruthOpts(Truth truth){
        truth.setPerverted(false);
    }

    public void pull (){
        System.out.println("Maggot pulls");
    }

    public void spitBack(Bastard target){
        System.out.println("Maggot spit back in bastard's face");
    }


}
