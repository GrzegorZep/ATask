package de.atask.tests;

import de.atask.parcel.Barcode;
import de.atask.parcel.CheckDigit;
import de.atask.parcel.Parcel;

public class ParcelTest {

    public static void main(String[] arg) {

        //test1
        shouldReturnGivenCheckDigitWhenCalculatingCorrespondingBarcode(new Barcode("01632532948375"), new CheckDigit('2'));

        //test2
        shouldReturnGivenCheckDigitWhenCalculatingCorrespondingBarcode(new Barcode("01631234567890"), new CheckDigit('Y'));

        //test3
        shouldReturnGivenCheckDigitWhenCalculatingCorrespondingBarcode(new Barcode("01632532948375"), new CheckDigit('2'));

        //test4
        shouldReturnGivenCheckDigitWhenCalculatingCorrespondingBarcode(new Barcode("06219912345678"), new CheckDigit('D'));

    }

    private static void shouldReturnGivenCheckDigitWhenCalculatingCorrespondingBarcode(Barcode barcode, CheckDigit checkDigit) {

        CheckDigit result = Parcel.calculate(barcode);
        assert result.equals(checkDigit) : "Check Digit was diffrent!";
    }

}
