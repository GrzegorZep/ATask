package de.atask.parcel;

import java.util.List;
import java.util.stream.Collectors;

class Barcode {
    private List<Character> characterList;

    Barcode(String barcode) {
        this.characterList = barcode.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
    }
}
