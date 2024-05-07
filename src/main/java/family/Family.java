package family;

import family.members.BornAble;
import java.util.ArrayList;

public class Family {
    private ArrayList<BornAble> members;

    public Family() {
        members = new ArrayList<>();
    }

    public void addMember(BornAble newChild) {
        this.members.add(newChild);
    }

    public boolean lastChildIsBoy() {
        return this.members.getLast().isBoy();
    }
}
