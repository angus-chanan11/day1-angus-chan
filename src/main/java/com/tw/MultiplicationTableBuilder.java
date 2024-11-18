package com.tw;

public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;
        System.out.println(builder.build(start, end));
    }

    public String build(int start, int end) {
        boolean isStartLessThanOrEqualToEnd = isStartLessThanOrEqualToEnd(start, end);
        boolean isValidRange = isValidRange(start, end);
        if (!isValidRange || !isStartLessThanOrEqualToEnd) {
            return null;
        } else {
            String table = printMultiplicationsInRange(start, end);
            return table;
        }
    }

    private boolean isStartLessThanOrEqualToEnd(int start, int end) {
        return start <= end;
    }

    private boolean isValidRange(int startNumber, int endNumber) {
        return startNumber > 1 && startNumber <= 1000 &&
                endNumber > 1 && endNumber <= 1000;
    }

    private String generateOneMultiplication(int multiplicand, int multiplier) {
        return String.format("%d*%d=%d", multiplicand, multiplier, multiplicand * multiplier);
    }

    private String generateOneLineMultiplication(int startNumber, int endNumber) {
        StringBuilder line = new StringBuilder();
        for (int multiplicand = startNumber; multiplicand <= endNumber; multiplicand++) {
            String multiplication = generateOneMultiplication(multiplicand, endNumber);
            line.append(multiplication);
            if (endNumber != multiplicand) {
                line.append(" ");
            }
        }

        line.append("\n");
        return line.toString();
    }

    private String printMultiplicationsInRange(int startNumber, int endNumber) {
        StringBuilder multiplicationTable = new StringBuilder();
        for (int multiplier = startNumber; multiplier <= endNumber; multiplier++) {
            multiplicationTable.append(generateOneLineMultiplication(startNumber, multiplier));
        }
        return multiplicationTable.toString();
    }
}
