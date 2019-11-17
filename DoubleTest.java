package com.company;

public class DoubleTest {
    static void testDouble(){
        double result, varFirst = 5132402134234.232406d, varSecond = 201.314231D;

        System.out.println("\n\n\n DOUBLE \n\n\n");
        System.out.println("\n *Arithmetical Operators*");

        result = varFirst + varSecond;
        System.out.printf("%f + %f = %f\n", varFirst, varSecond, result);

        result = varFirst - varSecond;
        System.out.printf("%f - %f = %f\n", varFirst, varSecond, result);

        result = varFirst * varSecond;
        System.out.printf("%f * %f = %f\n", varFirst, varSecond, result);

        result = varFirst / varSecond;
        System.out.printf("%f / %f = %f\n", varFirst, varSecond, result);

        result = varFirst % varSecond;
        System.out.printf("%f %% %f = %f\n", varFirst, varSecond, result);

        // /0 and a%0 = Error

        varFirst = 12436326.031525d;
        result = -varFirst;
        System.out.printf("-%f = %f\n", varFirst, result);

        result = +varFirst;
        System.out.printf("+%f = %f\n", varFirst, result);

        varFirst = 12436326.031525d;
        System.out.printf("++%f = %f\n", varFirst, ++varFirst);

        varFirst = 12436326.031525d;
        System.out.printf("%f++ = %f\n", varFirst, varFirst++);

        varFirst = 12436326.031525d;
        System.out.printf("--%f = %f\n", varFirst, --varFirst);

        varFirst = 12436326.031525d;
        System.out.printf("%f-- = %f\n", varFirst, varFirst--);

        System.out.println("\n *Bitwise Operators*");
        System.out.println("\n Such operators are wrong for DOUBLE \n");

//        result = varFirst & varSecond;
//        System.out.printf("%d & %d = %d\n", varFirst, varSecond, result);
//        System.out.println("in binary form:");
//        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(varFirst),
//                Integer.toBinaryString(varSecond), Integer.toBinaryString(result));
//
//        result = varFirst | varSecond;
//        System.out.printf("%d | %d = %d\n", varFirst, varSecond, result);
//        System.out.println("in binary form:");
//        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(varFirst),
//                Integer.toBinaryString(varSecond), Integer.toBinaryString(result));
//
//        result = varFirst ^ varSecond;
//        System.out.printf("%d ^ %d = %d\n", varFirst, varSecond, result);
//        System.out.println("in binary form:");
//        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(varFirst),
//                Integer.toBinaryString(varSecond), Integer.toBinaryString(result));
//
//        result = ~varFirst;
//        System.out.printf("~%d = %d\n", varFirst, result);
//        System.out.println("in binary form:");
//        System.out.printf("~%s = %s\n", Integer.toBinaryString(varFirst),
//                Integer.toBinaryString(result));
//
//        result = varFirst << 1;
//        System.out.printf("~%d << 1 = %d\n", varFirst, result);
//        System.out.println("in binary form:");
//        System.out.printf("~%s << 1 %s\n", Integer.toBinaryString(varFirst),
//                Integer.toBinaryString(result));
//
//        result = varFirst >> 1;
//        System.out.printf("%d >> 1 = %d\n", varFirst, result);
//        System.out.println("in binary form:");
//        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(varFirst),
//                Integer.toBinaryString(result));
//
//        varFirst = 5;
//        result = varFirst >>> 1;
//        System.out.printf("%d >>> 1 = %d\n", varFirst, result);
//        System.out.println("in binary form:");
//        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(varFirst),
//                Integer.toBinaryString(result));
//
//        varFirst = -5;
//        result = varFirst >> 1;
//        System.out.printf("%d >>> 1 = %d\n", varFirst, result);
//        System.out.println("in binary form:");
//        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(varFirst),
//                Integer.toBinaryString(result));

        System.out.println("\n *Assigment Operators*");

        result = 7932415.013133d;
        System.out.printf("%f += %f --> c = %f\n", result, varFirst,
                result += varFirst);
        System.out.printf("%f -= %f --> c = %f\n", result, varFirst,
                result -= varFirst);
        System.out.printf("%f *= %f --> c = %f\n", result, varFirst,
                result *= varFirst);
        System.out.printf("%f /= %f --> c = %f\n", result, varFirst,
                result /= varFirst);
        System.out.printf("%f %%= %f --> c = %f\n", result, varFirst,
                result %= varFirst);

        //c %= 0; --> Arithmetical Excep
        //c /= 0; --> Arithmetical Excep

//        System.out.printf("%f |= %f --> c = %f\n", result, varFirst
//                , result |= varFirst);
//        System.out.printf("%f &= %f --> c = %f\n", result, varFirst,
//                result &= varFirst);
//        System.out.printf("%f ^= %f --> c = %f\n", result, varFirst,
//                result ^= varFirst);
//        System.out.printf("%f >>= 1 --> c = %f\n", result, result >>= 1);
//        System.out.printf("%f <<= 1 --> c = %f\n", result, result <<= 1);
//        System.out.printf("%f >>>= 1 --> c = %f\n", result, result >>>= 1);

        System.out.println("\n***** Relational Operators *****");
        // greater than
        System.out.printf("%f > %f --> %b\n", varFirst, varSecond,
                varFirst > varSecond);
        // greater than or equal to
        System.out.printf("%f >= %f --> %b\n", varFirst, varSecond,
                varFirst >= varSecond);
        // less than
        System.out.printf("%f < %f --> %b\n", varFirst, varSecond,
                varFirst < varSecond);
        // less than or equal to
        System.out.printf("%f <= %f --> %b\n", varFirst, varSecond,
                varFirst <= varSecond);
        // equal to
        System.out.printf("%f == %f --> %b\n", varFirst, varSecond,
                varFirst == varSecond);
        // not equal to
        System.out.printf("%f != %f --> %b\n", varFirst, varSecond,
                varFirst != varSecond);

        System.out.println("\n *Logical Operations*");
        // logical AND
        System.out.printf("(%f > %f) && (%f > 0) --> %b\n", varFirst, varSecond,
                varFirst, (varFirst > varSecond) && (varFirst > 0));
        // bitwise logical AND
        System.out.printf("(%f > %f) & (%f > 0) --> %b\n", varFirst, varSecond,
                varFirst, (varFirst > varSecond) & (varFirst > 0));
        // logical OR
        System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", varFirst, varSecond,
                varSecond, (varFirst >= varSecond) || (varSecond != 0));
        // bitwise logical OR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", varFirst, varSecond,
                varSecond, (varFirst >= varSecond) | (varSecond != 0));
        // logical XOR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", varFirst, varSecond,
                varSecond, (varFirst >= varSecond) ^ (varSecond != 0));
        // logical NOT
        System.out.printf("!(%f >= %f) --> %b\n", varFirst, varSecond,
                !(varFirst >= varSecond));
        System.out.println("\n *Misc Operators*");
        System.out.println("\nCondition Operator:");
        System.out.printf("%f > %f ? %f : %f --> %f\n", varFirst, varSecond,
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
        System.out.printf("int = byte: c = %d --> c = %f\n", bt, result);
        result = sh;
        System.out.printf("int = short: c = %d --> c = %f\n", sh, result);
        result = ch;
        System.out.printf("int = char: c = '%c' --> c = %f\n", ch, result);
        result = l;
        System.out.printf("int = long: c = %d --> c = %f\n", l, result);
        result = f;
        System.out.printf("int = float: c = %f --> c = %f\n", f, result);
        result = d;
        System.out.printf("int = double: c = %f --> c = %f\n", d, result);
        // c = (int)bool;
        System.out.printf("in  = boolean: c = (double)%b --> Compile Error\n", bool);
    }
}
