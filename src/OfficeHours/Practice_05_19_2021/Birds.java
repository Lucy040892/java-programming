package OfficeHours.Practice_05_19_2021;

public class Birds {
    //encapsulation
    private String species;
    private boolean canFly;
    private double beakLength;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        if(species == null || species.isEmpty()){
            return;
        }
        this.species = species;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public double getBeakLength() {
        return beakLength;
    }

    public void setBeakLength(double beakLength) {
        if(beakLength < 0) {
            return;
        }
        this.beakLength = beakLength;
    }
}
