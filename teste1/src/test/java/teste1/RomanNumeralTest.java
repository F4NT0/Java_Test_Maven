package teste1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class RomanNumeralTest{
    private RomanNumeral roman;

    @BeforeEach
    public void initialize(){
        this.roman = new RomanNumeral();
    }

    @Test
    public void singleNumber(){
        int result = roman.convert("I");
        Assertions.assertEquals(1,result);
    }

    @Test
    public void numberWithManyDigits(){
        int result = roman.convert("VII");
        Assertions.assertEquals(7,result);
    }

    @Test
    public void numberWithSubtractiveNotation(){
        int result = roman.convert("IV");
        Assertions.assertEquals(4,result);
    }

    @Test
    public void numberWithAndWithoutSubnotation(){
        int result = roman.convert("XLIV");
        Assertions.assertEquals(44,result);
    }
}