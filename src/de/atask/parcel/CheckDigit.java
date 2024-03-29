package de.atask.parcel;

import java.util.Objects;

public class CheckDigit {
    private Character value;

    public CheckDigit(Character checkDigit){
        this.value = checkDigit;
    }

    public Character getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CheckDigit that = (CheckDigit) o;
        return value.equals(that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
