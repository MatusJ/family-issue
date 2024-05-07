package family.experiments;

public class ExperimentOnBirthExperiment {
    private final long numOfExperiments;
    private long diff;

    public ExperimentOnBirthExperiment() {
        numOfExperiments = 10L;
        diff = 0L;
    }

    public void doExperiment() {
        for (int i = 0; i < numOfExperiments; i++) {
            BirthExperiment be = new BirthExperiment();
            diff += new BirthExperiment().doExperiment().diffBoysMinusGirls();
        }
        this.showOutput();
    }

    private void showOutput() {
        System.out.println("Num of birth experiments: " + this.numOfExperiments);
        System.out.println("Boys - Girls = " + this.diff);
    }
}
