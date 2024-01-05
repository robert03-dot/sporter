package src.humans;

import java.io.Serializable;

public abstract class Human implements Serializable {

    private String name;
    private int birthDate;

    public Human(String name, int birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return this.name;
    }

    public int getBirthDate() {
        return this.birthDate;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Human)) {
            return false;
        }
        Human other = (Human) obj;
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        return true;
    }
}

