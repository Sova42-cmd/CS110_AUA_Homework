public class Problem01{
    public static void main (String[] args){

        // ––– 1 –––
        // int c = 65;
        // System.out.println(Integer.toBinaryString(c));
        /// 0000 0000 0000 0000 0000 0000 0100 0001 = 65 value of c

        // ––– 2 –––
        // System.out.println(String.format("%32s", Integer.toBinaryString(65)).replace(' ', '0'));
        // System.out.println((c | -1) << 1);
        // 0000 0000 0000 0000 0000 0000 0100 0001 = 65
        // 1111 1111 1111 1111 1111 1111 1111 1111 = -1
        // 1111 1111 1111 1111 1111 1111 1111 1111 = 65 | -1 = -1
        // Any value OR -1 will yield -1
        // 1111 1111 1111 1111 1111 1111 1111 1110 = (65 | -1) << 1
        /// = -2
        // Right shift is the equivalent of multiplication by 2.
        // Subexpression results and intermediate values that are
        // calculated in line 2 are included in the example.

        // ––– 3 –––
        // System.out.println(12345 & 5013);
        // System.out.println(Integer.toBinaryString(12345));
        // System.out.println(Integer.toBinaryString(5013));
        // 0000 0000 0000 0000 0011 0000 0011 1001 = 12345
        // 0000 0000 0000 0000 0001 0011 1001 0101 = 5013
        /// 0000 0000 0000 0000 0001 0000 0001 0001 = 4133
        // System.out.println(Integer.toBinaryString(4133));

        // ––– 4 –––
        // System.out.println(432 | -502);
        // int result = 432 | -502;
        // System.out.println(Integer.toBinaryString(result));
        // System.out.println(Integer.toBinaryString(432));
        // System.out.println(Integer.toBinaryString(-502));
        // 0000 0000 0000 0000 0000 0001 1011 0000 = 432
        // 1111 1111 1111 1111 1111 1110 0000 1010 = -502
        /// 1111 1111 1111 1111 1111 1111 1011 1010 = -70
        // System.out.println(Integer.toBinaryString(-70));

        // ––– 5 –––
        // System.out.println(-178 >> 2);
        // System.out.println(Integer.toBinaryString(-178));
        // 1111 1111 1111 1111 1111 1111 0100 1110 = -178
        // by shigting binary value by 2 to the right, we get
        /// 1111 1111 1111 1111 1111 1111 1101 0011 = -45
        // double checking ↓↓↓
        // System.out.println(Integer.toBinaryString(-45));
        // perfect ✓ (I put the check marks manually, no Ai)

        // ––– 6 –––
        // System.out.println((~178 + 1) >>> 4);
        // System.out.println(Integer.toBinaryString(178));
        // 0000 0000 0000 0000 0000 0000 1011 0010
        // System.out.println(Integer.toBinaryString(~178));
        // 1111 1111 1111 1111 1111 1111 0100 1101 = ~178 (flipped bits)
        // 1111 1111 1111 1111 1111 1111 0100 1101 = ~178 = -179
        // 1111 1111 1111 1111 1111 1111 0100 1110 = ~178 + 1 = -178
        // >>> 4, shifting the whole to the right by 4 positions ↓↓↓
        // triple > brings up 0's instead of 1's i guess, hence
        /// 0000 1111 1111 1111 1111 1111 1111 0100 = 268435444
        // System.out.println(Integer.toBinaryString((~178 + 1) >>> 4));
        // prints out the same value as written on line 62, perfect ✓

        // ––– from 7 to 13 –––.
        // int a = 70;
        // int b = 63;
        // System.out.println(a);
        // System.out.println(b);
        // int tmp = a;
        // a = b;
        // b = tmp;
        // System.out.println(a);
        // System.out.println(b);
        /// so far we've basically swapped the values of a and b
        /// analogy with drinks from class (we need a temporary place)

        // ––– 14 –––
        // System.out.println(Integer.toBinaryString(a));
        // System.out.println(Integer.toBinaryString(b));
        // a = 0011 1111 = 63
        // b = 0100 0110 = 70
        // a = a ^ b;
        // turns out ^ is the operator XOR, not the power of smth, hence we get
        // 0011 1111
        /// 0100 0110 = 0111 1001 = 121, hence a is now 121

        // ––– 15 –––
        // b = a ^ b
        // 0111 1001 = 121 (a)
        // 0100 0110 70 (b)
        /// 0011 1111 = 63, interesting, b is now 63 again

        // ––– 16 –––
        // a = a ^ b;
        // 0111 1001 = 121 (a)
        // 0011 1111 = 63 (b)
        /// 0100 0110 = 70, INTERESTING, a is now 70 again

        // ––– 17 –––
        /// a = a + b = 70 + 63 = 133

        // ––– 18 –––
        /// b = a - b = 133 - 63 = 70

        // ––– 19 –––
        /// a = a - b = 133 - 70 = 63

        // ––– 22 –––
        // System.out.println(0b1L << 3);
        // 0b is Java's prefix for binary value, and L at the end means its Long type.
        // hence 0b1L = 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0001
        // << 3 shifts every value to left by 3 places, and we get ↓↓↓
        // 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 1000
        /// and that monstrosity is equal to 8

        // ––– 23 –––
        // System.out.println(3 >> 0b0L);
        // System.out.println(Integer.toBinaryString(3));
        // 0000 0000 0000 0000 0000 0000 0000 0011 = 3
        /// here we're moving 3 by 0 places, so the result is still 3
        // 0b0L is a long, but the result returns as int still

        // ––– 24 –––
        // System.out.println(0X1E % 2E3);
        // 0x1E is hexidecimal value = 1 * 16 + 14 = 30
        // System.out.println(Integer.toBinaryString(0x1E));
        // 0000 0000 0000 0000 0000 0000 0001 1110 = 30
        // 2E3 is scientific notation = 2 * 10^3 = 2000.0 (double)
        // % gives the remainder, but 2000 fits into 30 zero times, so remainder is 30
        /// the result outpust 30.0 because now its a double not int

        // ––– 25 –––
        // System.out.println(10 == 010);
        // prefix 0 means that the value is in octodecimal (weird)
        // System.out.println(Integer.toBinaryString(10));
        // 0000 0000 0000 0000 0000 0000 0000 1010 = 10
        // System.out.println(Integer.toBinaryString(010));
        // 0000 0000 0000 0000 0000 0000 0000 1000 = 010 = 8
        /// 10 == 8 is false. The result is a boolean

        // ––– 26 –––
        // System.out.println(0x10 == 0b10000);
        // System.out.println(Integer.toBinaryString(0x10));
        // 0000 0000 0000 0000 0000 0000 0001 0000 = 0x10 = 16 (hex 16^1)
        // System.out.println(Integer.toBinaryString(0b10000));
        // 0000 0000 0000 0000 0000 0000 0001 0000 = 0b10000 = 16 (binary: 2^4)
        /// the result is boolean and true, since 16 = 16

        // ––– 27 –––
        // I hope a and b are now 63 and 70, since we swapped those earlier
        // int a = 63;
        // System.out.println(a++);
        // System.out.println(a);
        // 0000 0000 0000 0000 0000 0000 0011 1111 = 63
        // a++ gives back the old value first so println shows 63
        // 0000 0000 0000 0000 0000 0000 0100 0000 = 64
        /// second println function showes already the updated value of a (64)

        // ––– 28 –––
        // int b = 70;
        // System.out.println(++b);
        // 0000 0000 0000 0000 0000 0000 0100 0110 = 70 (b before)
        // ++ is written before b, so b gets increased first and the new value is what println sees
        /// 0000 0000 0000 0000 0000 0000 0100 0111 = 71

        // ––– 29 –––
        // a is 64 already from the exercise 27 (probably)
        // int a = 64;
        // System.out.println((a & (a - 1)) == 0);
        // System.out.println(Integer.toBinaryString(a));
        // 0000 0000 0000 0000 0000 0000 0100 0000
        // System.out.println(Integer.toBinaryString(a-1));
        // 0000 0000 0000 0000 0000 0000 0011 1111
        // & (AND) logical operator require both values to be 1, but there aren't such pair, hence ↓↓↓
        // 0000 0000 0000 0000 0000 0000 0000 0000 = 64 & 63 = 0
        /// prints out true, since 0 = 0

        // ––– 30 –––
        // from exercise 28 the valueof b is now 71
        // int b = 71;
        // System.out.println((b & (b - 1)) == 0);
        // System.out.println(Integer.toBinaryString(71));
        // 0000 0000 0000 0000 0000 0000 0100 0111 = 71
        // System.out.println(Integer.toBinaryString(71 - 1));
        // 0000 0000 0000 0000 0000 0000 0100 0110 = 70
        // & (AND) does its thing, hence ↓↓↓
        // 0000 0000 0000 0000 0000 0000 0100 0110 = 70 ≠ 0
        /// returns false, since 70 ≠ 0

        // ––– 31 –––
        /// lines 25 and 26 check if a number is a power of two
        // 64 & 63 = 0 so true: 64 is a power of two (2^6)
        // 71 & 70 = 70, not 0, so false: 71 is not a power of two

        // ––– 32 –––
        // int a = 64;
        // System.out.println(a ^= a);
        // a ^= a, is shortened for a = a ^ a, and ^ is the XOR operator
        // System.out.println(Integer.toBinaryString(a));
        // 0000 0000 0000 0000 0000 0000 0100 0000 = 64
        // 0000 0000 0000 0000 0000 0000 0100 0000
        /// 0000 0000 0000 0000 0000 0000 0000 0000 = 64 ^ 64 = 0

        // ––– 33 –––
        // int a = 64;
        // System.out.println(a |= 1); // same as a = a | 1 (OR operator)
        // 0000 0000 0000 0000 0000 0000 0100 0000 = 64
        // 0000 0000 0000 0000 0000 0000 0000 0001 = 1
        /// with OR operator = 0000 0000 0000 0000 0000 0000 0100 0001 = 65

        // ––– 34 –––
        // int a = 64;
        // int b = 70;
        // System.out.println(b = a & -1);
        // System.out.println(Integer.toBinaryString(-1));
        // 1111 1111 1111 1111 1111 1111 1111 1111
        // System.out.println(Integer.toBinaryString(64));
        // 0000 0000 0000 0000 0000 0000 0100 0000
        // System.out.println(Integer.toBinaryString(70));
        // 0000 0000 0000 0000 0000 0000 0100 0110
        // since -1 is all 1's and 64 is 1 only at one position
        /// with & (AND) operator, only one 1 passes and b is equal to 64

        // ––– 35 –––
        // int b = 64; // since b is now 64
        // System.out.println(b);
        // 64
        // System.out.println(Integer.toBinaryString(b));
        // 0000 0000 0000 0000 0000 0000 0100 0000
        // System.out.println(b <<= 2);
        // 256
        // System.out.println(Integer.toBinaryString(b));
        // 0000 0000 0000 0000 0000 0001 0000 0000
        //// shifting the value of b by 2 to the left and getting 256

        // ––– 36 –––
        // int b = 64;
        // System.out.println(b >>= 1);
        // System.out.println(Integer.toBinaryString(b));
        // 0000 0000 0000 0000 0000 0000 0001 0000
        // the opposite thing of exercise 35 happens here
        /// shifting the value of b by 1 to the right and getting 32

        // ––– 37 –––
        // System.out.println((short)0xABBA % 3.7);
        // System.out.println(Integer.toBinaryString(0xABBA));
        // we get 0000 0000 0000 0000 1010 1011 1011 1010, but
        // System.out.println(Integer.toBinaryString((short)0xABBA));
        // System.out.println((short)0xABBA);
        // 1111 1111 1111 1111 1010 1011 1011 1010 = -21574
        // % with 3.7 gives the remainder of -21574.0 / 3.7, about -3
        /// we get -2.9999999999989644 and not -3.0 because 3.7 can't be stored in binary,maybe

        // ––– 38 –––
        // System.out.println((char)(('a' + 'z') / 2));
        // System.out.println((int) 'a');
        // 97
        // System.out.println((int) 'z');
        // 122
        // System.out.println(Integer.toBinaryString(97));
        // 0000 0000 0110 0001
        // System.out.println(Integer.toBinaryString(122));
        // 0000 0000 0111 1010
        // System.out.println(Integer.toBinaryString(97 + 122));
        // 0000 0000 1101 1011
        // System.out.println(Integer.toBinaryString(109));
        // 0000 0000 0110 1101
        // 219 / 2 = 109 (0.5 gets disregarded)
        // 0000 0000 0110 1101 = 109 = m
        // m is right in the middle of a and z, the 13th letter.
        /// println show the letter m and not the number 109

        // ––– 39 –––
        // System.out.println(3 == 3.0f && '0' <= 'A');
        // 3 == 3.0f && '0' <= 'A'
        // 0000 0000 0000 0000 0000 0000 0000 0011 = 3
        // 3.0f is a float, not an int or char, so no bit row. 3 gets converted to 3.0f
        // and 3.0f == 3.0f is true
        // 0000 0000 0011 0000 = '0' = 48
        // 0000 0000 0100 0001 = 'A' = 65
        // in the comparison they become ints
        // 0000 0000 0000 0000 0000 0000 0011 0000 = 48
        // 0000 0000 0000 0000 0000 0000 0100 0001 = 65
        // 48 <= 65 is true digits come before capital letters in ASCII
        /// true && true = true. the results are booleans

        // ––– 40 –––
        // System.out.println(~(-0b101101) + 1);
        // 0000 0000 0000 0000 0000 0000 0010 1101 = 45
        // 1111 1111 1111 1111 1111 1111 1101 0011 = -45
        // 0000 0000 0000 0000 0000 0000 0010 1100 = ~(-45) = 44
        // 0000 0000 0000 0000 0000 0000 0010 1101 = 44 + 1 = 45

        // ––– 41 –––
        // System.out.println(!(-7 % 2 == 1 || 2_147_483_647 + 1 < 0));
        // 1111 1111 1111 1111 1111 1111 1111 1001 = -7 (int)
        // 0000 0000 0000 0000 0000 0000 0000 0010 = 2 (int)
        // 1111 1111 1111 1111 1111 1111 1111 1111 = -7 % 2 = -1
        // 0000 0000 0000 0000 0000 0000 0000 0001 = 1
        // -1 == 1 is false
        // 0111 1111 1111 1111 1111 1111 1111 1111 = 2_147_483_647
        // 1000 0000 0000 0000 0000 0000 0000 0000 = 2_147_483_647 + 1 = -2_147_483_648 (overflow, wraps around)
        // 0000 0000 0000 0000 0000 0000 0000 0000 = 0
        // -2_147_483_648 < 0 is true
        /// false || true = true, and ! flips it, so the result is false

        // ––– 42 –––
        // System.out.println((byte) 0x1F3F5F7FL >>> 4);
        // 0000 0000 0000 0000 0000 0000 0000 0000 0001 1111 0011 1111 0101 1111 0111 1111 = 0x1F3F5F7FL
        // 0111 1111 = (byte)0x1F3F5F7FL = 127
        // 0000 0000 0000 0000 0000 0000 0111 1111 = 127
        // 0000 0000 0000 0000 0000 0000 0000 0111 = 127 >>> 4 = 7
        /// >>> fills with zeros on the left, the 1111 on the right falls of = 7

        // ––– 43 –––
        // int a = 64;
        // System.out.println((true | (a++ < 1024 )) ? ++a : a++);
        // 0000 0000 0000 0000 0000 0000 0100 0000 = 64
        // 0000 0000 0000 0000 0000 0100 0000 0000 = 1024
        // a++ < 1024 compares the old value: 64 < 1024 is true, and then a becomes 65
        // 0000 0000 0000 0000 0000 0000 0100 0001 = 65
        // true | true = true
        // 0000 0000 0000 0000 0000 0000 0100 0010 = ++a = 66, this is what the result is
        /// a++ after the colon never runs. a is 66 now

        // ––– 44 –––
        // int a = 66;
        // System.out.println((true || (a++ < 1024 )) ? ++a : a++);
        // 0000 0000 0000 0000 0000 0000 0100 0010 = 66
        // 0000 0000 0000 0000 0000 0100 0000 0000 = 1024
        // || only checks the first condition, and if it's true it doesn't even check the second one
        /// the left side is true, so ++a < 1024 never runs and a stays 66

    }
}