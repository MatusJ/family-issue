package family.experiments;

import family.Family;
import family.members.BornAble;
import family.members.Boy;
import family.members.Daughter;

import java.util.ArrayList;

import java.util.Random;

public class BirthExperiment {
    private final long familiesSampleSize;
    private ArrayList<Family> families;
    private long boys;
    private long girls;

    public BirthExperiment() {
        this.familiesSampleSize = 1000000L;
        this.families = new ArrayList<>();
        this.boys = 0;
        this.girls = 0;
    }

    public BirthExperiment doExperiment() {
        for (int i = 0; i < familiesSampleSize; i++) {
            Family fam = new Family();
            do {
                if (new Random().nextDouble() > BornAble.probabilityOfBoyToBeBorn) {
                    fam.addMember(new Boy());
                    boys++;
                } else {
                    fam.addMember(new Daughter());
                    girls++;
                }
            } while(fam.lastChildIsBoy());
            families.add(fam);
        }
        //this.showOutput();
        return this;
    }

    public long diffBoysMinusGirls() {
        return this.boys - this.girls;
    }

    private void showOutput() {
        System.out.println("Sample size: " + this.familiesSampleSize);
        System.out.println("Boys: " + this.boys);
        System.out.println("Girls: " + this.girls);
        System.out.println("Boys - Girls = " + this.diffBoysMinusGirls());
    }
}
