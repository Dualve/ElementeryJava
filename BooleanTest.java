package com.company;

class BooleanTest {
    static void testBoolean(){
        boolean a = true, b = false, c;
        System.out.println("\n\n\n BOOLEAN \n\n\n");

        System.out.println("\n *Arithmetical Operators*");
    // c = a + b; // addition
    // c = a - b; // subtraction
    // c = a * b; // multiplication
    // c = a / b; // division
    // c = a % b; // modulus
    // c = -a; // unary minus
    // c = +a; // unary plus
    // c = ++a; // prefix increment
    // c = a++; // postfix increment
    // c = --a; // prefix decrement
    // c = a--; // postfix decrement
        System.out.println("\n *Bitwise Operators*");
        c = a & b; // bitwise AND
        System.out.printf("%b & %b = %b\n", a, b, c);
        c = a | b; // bitwise OR
        System.out.printf("%b | %b = %b\n", a, b, c);
        c = a ^ b; // bitwise XOR
        System.out.printf("%b ^ %b = %b\n", a, b, c);
    // c = ~a; // bitwise unary compliment
    // c = a << 1; // left shift
    // c = a >> 1; //right shift
    // c = a >>> 1; // zero fill right shift
        System.out.println("\n *Assignment Operators*");
        System.out.printf("%b |= %b --> c = %b\n", c, a, c |= a);
        System.out.printf("%b &= %b --> c = %b\n", c, a, c &= a);
        System.out.printf("%b ^= %b --> c = %b\n", c, a, c ^= a);
    // c += a;
    // c -= a;
    // c *= a;
    // c /= a;
    // c %= a;
    // c >>= 1;
    // c <<= 1;
    // c >>>= 1;
        System.out.println("\n *Relational Operators*");
    // equal to
        System.out.printf("%b == %b --> %b\n", a, b, a == b);
    // not equal to
        System.out.printf("%b != %b --> %b\n", a, b, a != b);
    // c = a > b; // greater than
    // c = a >= b; // greater than or equal to
    // c = a < b; // less than
    // c = a <= b; // less than or equal to
        System.out.println("\n *Logical Operations*");
        c = a && b; // logical AND
        System.out.printf("%b && %b = %b\n", a, b, c);
        c = a || b; // logical OR
        System.out.printf("%b || %b = %b\n", a, b, c);
        c = a ^ b; // logical XOR
        System.out.printf("%b ^ %b = %b\n", a, b, c);
    // logical NOT
        System.out.printf("!%b --> %b\n", a, !a);
        System.out.println("\n *Misc Operators*");
        System.out.println("\nCondition Operator:");
        System.out.printf(" %b ? %b : %b --> %b\n", c, a, b, (c ? a : b));
        System.out.println("\nType Cast Operator:");
    // byte bt = 1;
    // short sh = -32000;
    // char ch = '\u0002';
    // long l = 100000000000000000L;
    // float f = 1.9f;
    // double d = 123456789.625;
        boolean bool = true;
        //c = (boolean) bt;
    //c = (boolean) sh;
    //c = (boolean) ch;
    //c = (boolean) l;
    //c = (boolean) f;
    //c = (boolean) d;
        c = bool;
        System.out.printf("int = boolean: c = (int)%b --> Compile Error\n",
                bool);

    }
}
