package de.atask.parcel;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Parcel {

    private static final int MOD = 36;
    private static final Map<String, Integer> BARCODE_VALUES = Stream.of(new Object[][]{
            {"0", 0}, {"1", 1}, {"2", 2}, {"3", 3}, {"4", 4}, {"5", 5}, {"6", 6}, {"7", 7}, {"8", 8}, {"9", 9},
            {"A", 10}, {"B", 11}, {"C", 12}, {"D", 13}, {"E", 14}, {"F", 15}, {"G", 16}, {"H", 17}, {"I", 18},
            {"J", 19}, {"K", 20}, {"L", 21}, {"M", 22}, {"N", 23}, {"O", 24}, {"P", 25}, {"Q", 26}, {"R", 27},
            {"S", 28}, {"T", 29}, {"U", 30}, {"V", 31}, {"W", 32}, {"X", 33}, {"Y", 34}, {"Z", 35}
    }).collect(Collectors.toMap(o -> (String) o[0], o -> (Integer) o[1]));

    public static CheckDigit calculate(Barcode barcode) {

        int cd, val;
        cd = MOD;
        for (Character character : barcode.getCharacterList()) {
            val = BARCODE_VALUES.get(character.toString());
            cd = cd + val;
            if (cd > MOD)
                cd = cd - MOD;
            cd = 2 * cd;
            if (cd > MOD)
                cd = cd - MOD - 1;
        }
        cd = MOD + 1 - cd;
        if (cd == MOD)
            cd = 0;
        int finalCd = cd;
        String result = BARCODE_VALUES.keySet().stream()
                .filter(k -> BARCODE_VALUES.get(k).equals(finalCd)).findFirst().get();
        return new CheckDigit(result);
    }
}
