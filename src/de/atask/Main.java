package de.atask;

import de.atask.parcel.Barcode;
import de.atask.parcel.CheckDigit;
import de.atask.parcel.Parcel;

public class Main {

    public static void main(String[] args) {
        Barcode barcode = new Barcode("123");

        CheckDigit result = Parcel.calculate(barcode);

        System.out.println(result.getValue());
    }
}
