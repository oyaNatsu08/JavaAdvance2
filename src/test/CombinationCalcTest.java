import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CombinationCalcTest {

    @Test
    public void n個の中からr個を選ぶ組み合わせの正常な値を返す() {
        int expected = 10;
        int result = CombinationCalc.Calculate(5, 3);
        assertEquals(expected, result);
    }

    @Test
    public void 引数が負の数の時ー1を返す() {
        int expected = -1;
        int result = CombinationCalc.Calculate(-5, 3);
        assertEquals(expected, result);
    }

    @Test
    public void nよりもrの値が大きい時ー1を返す() {
        int expected = -1;
        int result = CombinationCalc.Calculate(-5, 3);
        assertEquals(expected, result);
    }

}