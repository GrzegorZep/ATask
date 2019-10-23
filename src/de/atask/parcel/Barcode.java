package de.atask.parcel;

import java.util.List;
import java.util.stream.Collectors;

public class Barcode {
    private String value;

    public Barcode(String barcode) {
        this.value = barcode;
    }

    public String getBarcode() {
        return value;
    }

    public List<Character> getCharacterList() {
        return value.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
    }
}
