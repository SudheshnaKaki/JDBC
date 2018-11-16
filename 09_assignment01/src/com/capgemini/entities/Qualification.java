package com.capgemini.entities;

public class Qualification {

    String nameOfQualification;
    int experience;
    public String getNameOfQualification() {
           return nameOfQualification;
    }
    public void setNameOfQualification(String nameOfQualification) {
           this.nameOfQualification = nameOfQualification;
    }
    public int getExperience() {
           return experience;
    }
    public void setExperience(int experience) {
           this.experience = experience;
    }
    public Qualification(String nameOfQualification, int experience) {
           super();
           this.nameOfQualification = nameOfQualification;
           this.experience = experience;
    }
    public Qualification() {
           super();
    }
    @Override
    public String toString() {
           return "Qualification [nameOfQualification=" + nameOfQualification
                        + ", experience=" + experience + "]";
    }
    

}
