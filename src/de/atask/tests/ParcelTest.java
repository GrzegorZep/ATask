package de.atask.tests;

import de.atask.parcel.Barcode;
import de.atask.parcel.CheckDigit;
import de.atask.parcel.Parcel;

public class ParcelTest {

    public static void main(String[] arg) {

        //test1
        shouldReturnGivenCheckDigitWhenCalculatingcorrespondingBarcode(new Barcode("01632532948375"), new CheckDigit("2"));

        //test2
        shouldReturnGivenCheckDigitWhenCalculatingcorrespondingBarcode(new Barcode("01631234567890"), new CheckDigit("Y"));

        //test3
        shouldReturnGivenCheckDigitWhenCalculatingcorrespondingBarcode(new Barcode("01632532948375"), new CheckDigit("2"));

        //test4
        shouldReturnGivenCheckDigitWhenCalculatingcorrespondingBarcode(new Barcode("06219912345678"), new CheckDigit("D"));

    }

    private static void shouldReturnGivenCheckDigitWhenCalculatingcorrespondingBarcode(Barcode barcode, CheckDigit checkDigit) {

        CheckDigit result = Parcel.calculate(barcode);
        assert result.getValue().equals(checkDigit.getValue()) : "Check Digit was diffrent!";
    }

}
