package com.company;

public class LongTest {
    static void testLong(){
        long result, varFirst = 1200000000, varSecond = 400000000;

        System.out.println("\n\n\n LONG \n\n\n");
        System.out.println("\n *Arithmetical Operators*");

        result = varFirst + varSecond;
        System.out.printf("%d + %d = %d\n", varFirst, varSecond, result);

        result = varFirst - varSecond;
        System.out.printf("%d - %d = %d\n", varFirst, varSecond, result);

        result = varFirst * varSecond;
        System.out.printf("%d * %d = %d\n", varFirst, varSecond, result);

        result = varFirst / varSecond;
        System.out.printf("%d / %d = %d\n", varFirst, varSecond, result);

        result = varFirst % varSecond;
        System.out.printf("%d %% %d = %d\n", varFirst, varSecond, result);

        // /0 and a%0 = Error

        varFirst = 500000000;
        result = -varFirst;
        System.out.printf("-%d = %d\n", varFirst, result);

        result = +varFirst;
        System.out.printf("+%d = %d\n", varFirst, result);

        varFirst = 500000000;
        System.out.printf("++%d = %d\n", varFirst, ++varFirst);

        varFirst = 500000000;
        System.out.printf("%d++ = %d\n", varFirst, varFirst++);

        varFirst = 500000000;
        System.out.printf("--%d = %d\n", varFirst, --varFirst);

        varFirst = 500000000;
        System.out.printf("%d-- = %d\n", varFirst, varFirst--);

        System.out.println("\n *Bitwise Operators*");

        result = varFirst & varSecond;
        System.out.printf("%d & %d = %d\n", varFirst, varSecond, result);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Long.toBinaryString(varFirst),
                Long.toBinaryString(varSecond), Long.toBinaryString(result));

        result = varFirst | varSecond;
        System.out.printf("%d | %d = %d\n", varFirst, varSecond, result);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Long.toBinaryString(varFirst),
                Long.toBinaryString(varSecond), Long.toBinaryString(result));

        result = varFirst ^ varSecond;
        System.out.printf("%d ^ %d = %d\n", varFirst, varSecond, result);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Long.toBinaryString(varFirst),
                Long.toBinaryString(varSecond), Long.toBinaryString(result));

        result = ~varFirst;
        System.out.printf("~%d = %d\n", varFirst, result);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Long.toBinaryString(varFirst),
                Long.toBinaryString(result));

        result = varFirst << 1;
        System.out.printf("~%d << 1 = %d\n", varFirst, result);
        System.out.println("in binary form:");
        System.out.printf("~%s << 1 %s\n", Long.toBinaryString(varFirst),
                Long.toBinaryString(result));

        result = varFirst >> 1;
        System.out.printf("%d >> 1 = %d\n", varFirst, result);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(varFirst),
                Long.toBinaryString(result));

        varFirst = 500000000;
        result = varFirst >>> 1;
        System.out.printf("%d >>> 1 = %d\n", varFirst, result);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(varFirst),
                Long.toBinaryString(result));

        varFirst = -500000000;
        result = varFirst >> 1;
        System.out.printf("%d >>> 1 = %d\n", varFirst, result);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(varFirst),
                Long.toBinaryString(result));

        System.out.println("\n *Assigment Operators*");

        result = 700000000;
        System.out.printf("%d += %d --> c = %d\n", result, varFirst,
                result += varFirst);
        System.out.printf("%d -= %d --> c = %d\n", result, varFirst,
                result -= varFirst);
        System.out.printf("%d *= %d --> c = %d\n", result, varFirst,
                result *= varFirst);
        System.out.printf("%d /= %d --> c = %d\n", result, varFirst,
                result /= varFirst);
        System.out.printf("%d %%= %d --> c = %d\n", result, varFirst,
                result %= varFirst);

        //c %= 0; --> Arithmetical Excep
        //c /= 0; --> Arithmetical Excep

        System.out.printf("%d |= %d --> c = %d\n", result, varFirst
                , result |= varFirst);
        System.out.printf("%d &= %d --> c = %d\n", result, varFirst,
                result &= varFirst);
        System.out.printf("%d ^= %d --> c = %d\n", result, varFirst,
                result ^= varFirst);
        System.out.printf("%d >>= 1 --> c = %d\n", result, result >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", result, result <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", result, result >>>= 1);

        System.out.println("\n***** Relational Operators *****");
        // greater than
        System.out.printf("%d > %d --> %b\n", varFirst, varSecond,
                varFirst > varSecond);
        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", varFirst, varSecond,
                varFirst >= varSecond);
        // less than
        System.out.printf("%d < %d --> %b\n", varFirst, varSecond,
                varFirst < varSecond);
        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", varFirst, varSecond,
                varFirst <= varSecond);
        // equal to
        System.out.printf("%d == %d --> %b\n", varFirst, varSecond,
                varFirst == varSecond);
        // not equal to
        System.out.printf("%d != %d --> %b\n", varFirst, varSecond,
                varFirst != varSecond);

        System.out.println("\n *Logical Operations*");
        // logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", varFirst, varSecond,
                varFirst, (varFirst > varSecond) && (varFirst > 0));
        // bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", varFirst, varSecond,
                varFirst, (varFirst > varSecond) & (varFirst > 0));
        // logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", varFirst, varSecond,
                varSecond, (varFirst >= varSecond) || (varSecond != 0));
        // bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", varFirst, varSecond,
                varSecond, (varFirst >= varSecond) | (varSecond != 0));
        // logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", varFirst, varSecond,
                varSecond, (varFirst >= varSecond) ^ (varSecond != 0));
        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", varFirst, varSecond,
                !(varFirst >= varSecond));
        System.out.println("\n *Misc Operators*");
        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", varFirst, varSecond,
                varFirst, varSecond, (varFirst > varSecond ? varFirst : varSecond));

        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        result = bt;
        System.out.printf("int = byte: c = %d --> c = %d\n", bt, result);
        result = sh;
        System.out.printf("int = short: c = %d --> c = %d\n", sh, result);
        result = ch;
        System.out.printf("int = char: c = '%c' --> c = %d\n", ch, result);
        result = l;
        System.out.printf("int = long: c = %d --> c = %d\n", l, result);
        result = (long) f;
        System.out.printf("int = float: c = (long)%f --> c = %d\n", f, result);
        result = (long) d;
        System.out.printf("int = double: c = (long)%f --> c = %d\n", d, result);
        // c = (long)bool;
        System.out.printf("in  = boolean: c = (long)%b --> Compile Error\n", bool);
    }
}
