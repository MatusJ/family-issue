package family;

import lombok.Getter;

import java.math.BigInteger;

public class BirthExperiment {
    @Getter
    private final BigInteger familySampleSize;

    public BirthExperiment() {
        this.familySampleSize = BigInteger.valueOf(100000);
    }
}
