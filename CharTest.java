package com.company;

public class CharTest {
    static void testChar(){
        char result, varFirst = '\u0041', varSecond = '\u0042';

        System.out.println("\n\n\n CHAR \n\n\n");
        System.out.println("\n *Arithmetical Operators*");

        result = (char) (varFirst + varSecond);
        System.out.printf("%c + %c = %c\n", varFirst, varSecond, result);

        result = (char) (varFirst - varSecond);
        System.out.printf("%c - %c = %c\n", varFirst, varSecond, result);

        result = (char) (varFirst * varSecond);
        System.out.printf("%c * %c = %c\n", varFirst, varSecond, result);

        result = (char) (varFirst / varSecond);
        System.out.printf("%c / %c = %c\n", varFirst, varSecond, result);

        result =(char) (varFirst % varSecond);
        System.out.printf("%c %% %c = %c\n", varFirst, varSecond, result);

        // /0 and a%0 = Error

        varFirst = '\u0050';
        result =(char) -varFirst;
        System.out.printf("-%c = %c\n", varFirst, result);

        result =(char) +varFirst;
        System.out.printf("+%c = %c\n", varFirst, result);

        varFirst = '\u0050';
        System.out.printf("++%c = %c\n", varFirst, ++varFirst);

        varFirst = '\u0050';
        System.out.printf("%c++ = %c\n", varFirst, varFirst++);

        varFirst ='\u0050';
        System.out.printf("--%c = %c\n", varFirst, --varFirst);

        varFirst ='\u0050';
        System.out.printf("%c-- = %c\n", varFirst, varFirst--);

        System.out.println("\n *Bitwise Operators*");

        result = (char)(varFirst & varSecond);
        System.out.printf("%c & %c = %c\n", varFirst, varSecond, result);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(varFirst),
                Integer.toBinaryString(varSecond), Integer.toBinaryString(result));

        result = (char) (varFirst | varSecond);
        System.out.printf("%c | %c = %c\n", varFirst, varSecond, result);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(varFirst),
                Integer.toBinaryString(varSecond), Integer.toBinaryString(result));

        result = (char) (varFirst ^ varSecond);
        System.out.printf("%c ^ %c = %c\n", varFirst, varSecond, result);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(varFirst),
                Integer.toBinaryString(varSecond), Integer.toBinaryString(result));

        result = (char) ~varFirst;
        System.out.printf("~%c = %c\n", varFirst, result);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(varFirst),
                Integer.toBinaryString(result));

        result = (char) (varFirst << 1);
        System.out.printf("~%c << 1 = %c\n", varFirst, result);
        System.out.println("in binary form:");
        System.out.printf("~%s << 1 %s\n", Integer.toBinaryString(varFirst),
                Integer.toBinaryString(result));

        result = (char) (varFirst >> 1);
        System.out.printf("%c >> 1 = %c\n", varFirst, result);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(varFirst),
                Integer.toBinaryString(result));

        varFirst = '\u0050';
        result = (char)(varFirst >>> 1);
        System.out.printf("%c >>> 1 = %c\n", varFirst, result);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(varFirst),
                Integer.toBinaryString(result));

        varFirst = '\u0050';
        result = (char)(varFirst >> 1);
        System.out.printf("%c >>> 1 = %c\n", varFirst, result);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(varFirst),
                Integer.toBinaryString(result));

        System.out.println("\n *Assigment Operators*");

        result = '\u005A';
        System.out.printf("%c += %c --> c = %c\n", result, varFirst,
                result += varFirst);
        System.out.printf("%c -= %c --> c = %c\n", result, varFirst,
                result -= varFirst);
        System.out.printf("%c *= %c --> c = %c\n", result, varFirst,
                result *= varFirst);
        System.out.printf("%c /= %c --> c = %c\n", result, varFirst,
                result /= varFirst);
        System.out.printf("%c %%= %c --> c = %c\n", result, varFirst,
                result %= varFirst);

        //c %= 0; --> Arithmetical Excep
        //c /= 0; --> Arithmetical Excep

        System.out.printf("%c |= %c --> c = %c\n", result, varFirst
                , result |= varFirst);
        System.out.printf("%c &= %c --> c = %c\n", result, varFirst,
                result &= varFirst);
        System.out.printf("%c ^= %c --> c = %c\n", result, varFirst,
                result ^= varFirst);
        System.out.printf("%c >>= 1 --> c = %c\n", result, result >>= 1);
        System.out.printf("%c <<= 1 --> c = %c\n", result, result <<= 1);
        System.out.printf("%c >>>= 1 --> c = %c\n", result, result >>>= 1);

        System.out.println("\n***** Relational Operators *****");
        // greater than
        System.out.printf("%c > %c --> %b\n", varFirst, varSecond,
                varFirst > varSecond);
        // greater than or equal to
        System.out.printf("%c >= %c --> %b\n", varFirst, varSecond,
                varFirst >= varSecond);
        // less than
        System.out.printf("%c < %c --> %b\n", varFirst, varSecond,
                varFirst < varSecond);
        // less than or equal to
        System.out.printf("%c <= %c --> %b\n", varFirst, varSecond,
                varFirst <= varSecond);
        // equal to
        System.out.printf("%c == %c --> %b\n", varFirst, varSecond,
                varFirst == varSecond);
        // not equal to
        System.out.printf("%c != %c --> %b\n", varFirst, varSecond,
                varFirst != varSecond);

        System.out.println("\n *Logical Operations*");
        // logical AND
        System.out.printf("(%c > %c) && (%c > 0) --> %b\n", varFirst, varSecond,
                varFirst, (varFirst > varSecond) && (varFirst > 0));
        // bitwise logical AND
        System.out.printf("(%c > %c) & (%c > 0) --> %b\n", varFirst, varSecond,
                varFirst, (varFirst > varSecond) & (varFirst > 0));
        // logical OR
        System.out.printf("(%c >= %c) || (%c != 0) --> %b\n", varFirst, varSecond,
                varSecond, (varFirst >= varSecond) || (varSecond != 0));
        // bitwise logical OR
        System.out.printf("(%c >= %c) | (%c != 0) --> %b\n", varFirst, varSecond,
                varSecond, (varFirst >= varSecond) | (varSecond != 0));
        // logical XOR
        System.out.printf("(%c >= %c) | (%c != 0) --> %b\n", varFirst, varSecond,
                varSecond, (varFirst >= varSecond) ^ (varSecond != 0));
        // logical NOT
        System.out.printf("!(%c >= %c) --> %b\n", varFirst, varSecond,
                !(varFirst >= varSecond));
        System.out.println("\n *Misc Operators*");
        System.out.println("\nCondition Operator:");
        System.out.printf("%c > %c ? %c : %c --> %c\n", varFirst, varSecond,
                varFirst, varSecond, (varFirst > varSecond ? varFirst : varSecond));

        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        result = (char) bt;
        System.out.printf("int = byte: c = (char)%d --> c = %c\n", bt, result);
        result = (char) sh;
        System.out.printf("int = short: c = (char)%d --> c = %c\n", sh, result);
        result = ch;
        System.out.printf("int = char: c = '%c' --> c = %c\n", ch, result);
        result = (char) l;
        System.out.printf("int = long: c = (char)%d --> c = %c\n", l, result);
        result = (char) f;
        System.out.printf("int = float: c = (char)%f --> c = %c\n", f, result);
        result = (char) d;
        System.out.printf("int = double: c = (char)%f --> c = %c\n", d, result);
        //result = (char)bool;
        System.out.printf("in  = boolean: c = (char)%b --> Compile Error\n", bool);
    }
}
