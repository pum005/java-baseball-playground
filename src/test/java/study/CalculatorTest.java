package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class CalculatorTest {

    private Scanner scanner;

    @BeforeEach
    void setUp() {
        scanner = new Scanner(System.in);
    }

    @DisplayName("사용자가 입력한 문자열 값에 따라 사칙연산을 수행할 수 있는 계산기를 구현")
    @Test
    void 계산기_구현_테스트() throws Exception {
        String value = "2 + 3 * 4 / 2";
        String[] values = value.split(" ");

        int index = 0;
        int operandOne = Integer.parseInt(values[index]);
        String operandTwo;
        String operator;

        String a;
        while (index + 2 < values.length) {
            operator = values[index+1];
            operandTwo = values[index+2];

            operandOne = compute(operandOne, operator, operandTwo);
            index += 2;
        }

        System.out.println("결과!: " + operandOne);
    }

    private int compute(int operandOne, String operator, String operandTwo) throws Exception {
        int operand1 = operandOne;
        int operand2 = Integer.parseInt(operandTwo);

        if (operator.equals("+")) {
            return operand1 + operand2;
        } else if (operator.equals("-")) {
            return operand1 - operand2;
        } else if (operator.equals("*")) {
            return  operand1 * operand2;
        } else if (operator.equals("/")) {
            return operand1 / operand2;
        }

        throw new Exception("올바른 연산자를 입력하세요");
    }
}
