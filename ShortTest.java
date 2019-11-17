package com.company;

public class ShortTest {
    static void testShort() {
        short result, varFirst = 12, varSecond = 6;

        System.out.println("\n\n\n SHORT \n\n\n");
        System.out.println("\n *Arithmetical Operators*");

        result = (short) (varFirst + varSecond);
        System.out.printf("%d + %d = %d\n", varFirst, varSecond, result);

        result = (short) (varFirst - varSecond);
        System.out.printf("%d - %d = %d\n", varFirst, varSecond, result);

        result = (short) (varFirst * varSecond);
        System.out.printf("%d * %d = %d\n", varFirst, varSecond, result);

        result = (short) (varFirst / varSecond);
        System.out.printf("%d / %d = %d\n", varFirst, varSecond, result);

        result = (short) (varFirst % varSecond);
        System.out.printf("%d %% %d = %d\n", varFirst, varSecond, result);

        // /0 and a%0 = Error

        varFirst = 2;
        result =(short) -varFirst;
        System.out.printf("-%d = %d\n", varFirst, result);

        result = (short) +varFirst;
        System.out.printf("+%d = %d\n", varFirst, result);

        varFirst = 2;
        System.out.printf("++%d = %d\n", varFirst, ++varFirst);

        varFirst = 2;
        System.out.printf("%d++ = %d\n", varFirst, varFirst++);

        varFirst = 2;
        System.out.printf("--%d = %d\n", varFirst, --varFirst);

        varFirst = 2;
        System.out.printf("%d-- = %d\n", varFirst, varFirst--);

        System.out.println("\n *Bitwise Operators*");

        result = (short) (varFirst & varSecond);
        System.out.printf("%d & %d = %d\n", varFirst, varSecond, result);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(varFirst),
                Integer.toBinaryString(varSecond), Integer.toBinaryString(result));

        result = (short) (varFirst | varSecond);
        System.out.printf("%d | %d = %d\n", varFirst, varSecond, result);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(varFirst),
                Integer.toBinaryString(varSecond), Integer.toBinaryString(result));

        result = (short) (varFirst ^ varSecond);
        System.out.printf("%d ^ %d = %d\n", varFirst, varSecond, result);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(varFirst),
                Integer.toBinaryString(varSecond), Integer.toBinaryString(result));

        result = (short) ~varFirst;
        System.out.printf("~%d = %d\n", varFirst, result);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(varFirst),
                Integer.toBinaryString(result));

        result = (short) (varFirst << 1);
        System.out.printf("~%d << 1 = %d\n", varFirst, result);
        System.out.println("in binary form:");
        System.out.printf("~%s << 1 %s\n", Integer.toBinaryString(varFirst),
                Integer.toBinaryString(result));

        result = (short) (varFirst >> 1);
        System.out.printf("%d >> 1 = %d\n", varFirst, result);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(varFirst),
                Integer.toBinaryString(result));

        varFirst = 2;
        result = (short) (varFirst >>> 1);
        System.out.printf("%d >>> 1 = %d\n", varFirst, result);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(varFirst),
                Integer.toBinaryString(result));

        varFirst = -2;
        result = (short) (varFirst >> 1);
        System.out.printf("%d >>> 1 = %d\n", varFirst, result);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(varFirst),
                Integer.toBinaryString(result));

        System.out.println("\n *Assigment Operators*");

        result = 7;
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
        result =  sh;
        System.out.printf("int = short: c = %d --> c = %d\n", sh, result);
        result = (short) ch;
        System.out.printf("int = char: c = (short)'%c' --> c = %d\n", ch, result);
        result = (short) l;
        System.out.printf("int = long: c = (short)%d --> c = %d\n", l, result);
        result = (short) f;
        System.out.printf("int = float: c = (short)%f --> c = %d\n", f, result);
        result = (short) d;
        System.out.printf("int = double: c = (short)%f --> c = %d\n", d, result);
        //result = (byte)bool;
        System.out.printf("in  = boolean: c = (short)%b --> Compile Error\n", bool);
    }
}
