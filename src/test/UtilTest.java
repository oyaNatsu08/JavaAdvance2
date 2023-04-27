import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilTest {

    @Test
    public void 文字列が数値であるかどうかを判定してtrueを返す() {
        boolean expected = true;
        boolean result = Util.isNumber("100");
        assertEquals(expected, result);
    }
    @Test
    public void 文字列が数値であるかどうかを判定してfalseを返す() {
        boolean expected = false;
        boolean result = Util.isNumber("AAA");
        assertEquals(expected, result);
    }

    @Test
    public void 文字列が郵便番号の形式であるか判定してtrueを返す() {
        boolean expected = true;
        boolean result = Util.isPostalCode("000-1234");
        assertEquals(expected, result);
    }

    @Test
    public void 文字列が郵便番号の形式であるか判定してfalseを返す() {
        boolean expected = false;
        boolean result = Util.isPostalCode("000-1234-56789");
        assertEquals(expected, result);
    }

    @Test
    public void 文字列が小文字のアルファベットのみか判定してtrueを返す() {
        boolean expected = true;
        boolean result = Util.isSmallAlphabet("hgldshgjal");
        assertEquals(expected, result);
    }

    @Test
    public void 文字列が小文字と大文字のアルファベットなのでfalseを返す() {
        boolean expected = false;
        boolean result = Util.isSmallAlphabet("gsHGskhgHdeE");
        assertEquals(expected, result);
    }

    @Test
    public void 文字列がnullのためfalseを返す() {
        boolean expected = false;
        boolean result = Util.isSmallAlphabet(null);
        assertEquals(expected, result);
    }

    @Test
    public void 文字列が空文字のためfalseを返す() {
        boolean expected = false;
        boolean result = Util.isSmallAlphabet("");
        assertEquals(expected, result);
    }

    @Test
    public void 三つの数値で三角形が作れるときtrueを返す() {
        boolean expected = true;
        boolean result = Util.isTriangle(2, 5, 5);
        assertEquals(expected, result);
    }

//    @Test void 三つの数値がint型の最大値を超えるときfalseを返す() {
//        boolean expected = false;
//        boolean result = Util.isTriangle(2147483647, 21474836473, 214748364712);
//        assertEquals(expected, result);
//    }

    @Test
    public void 三つの数値で三角形が作れないときfalseを返す() {
        boolean expected = false;
        boolean result = Util.isTriangle(1,1,10);
        assertEquals(expected, result);
    }

    @Test
    public void 三つの数値の中に負の数があるときfalseを返す() {
        boolean expected = false;
        boolean result = Util.isTriangle(1,1,-2);
        assertEquals(expected, result);
    }

    @Test
    public void 受け取った値が0から100000以内で整数を2乗した数値の場合その整数を返す() {
        int expected = 5;
        int result = Util.isSquareNumber(25);
        assertEquals(expected, result);
    }

    @Test
    public void 受け取った値が0から100000以内でなかった時ー1を返す() {
        int expected = -1;
        int result = Util.isSquareNumber(500000);
        assertEquals(expected, result);
    }

    @Test
    public void 受け取った値が0から100000以内で整数を2乗した数値でない時ー1を返す() {
        int expected = -1;
        int result = Util.isSquareNumber(50);
        assertEquals(expected, result);
    }

}