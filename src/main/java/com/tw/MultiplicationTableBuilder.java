package com.tw;

public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;
        boolean isStartLessThanOrEqualToEnd = builder.isStartLessThanOrEqualToEnd(start, end);
        System.out.println(isStartLessThanOrEqualToEnd);
        boolean isValidRange = builder.isValidRange(start, end);
        System.out.println(isValidRange);
        if (!isValidRange || !isStartLessThanOrEqualToEnd) {
            System.out.println("");
        } else {
            String table = builder.printMultiplicationsInRange(start, end);
            System.out.println(table);
            System.out.println(builder.build(start, end));
        }
    }

    public String build(int start, int end) {
        return "";
    }

    private boolean isStartLessThanOrEqualToEnd(int start, int end) {
        return start <= end;
    }

    private boolean isValidRange(int startNumber, int endNumber) {
        return startNumber > 1 && startNumber <= 1000 &&
                endNumber > 1 && endNumber <= 1000;
    }

    private String printOneMultiplication(int multiplicand, int multiplier) {
        return String.format("%d*%d=%d", multiplicand, multiplier, multiplicand * multiplier);
    }

    private String printOneLineMultiplication(int startNumber, int endNumber) {
        StringBuilder line = new StringBuilder();
        for (int multiplicand = startNumber; multiplicand <= endNumber; multiplicand++) {
            line.append(printOneMultiplication(multiplicand, endNumber));
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
            multiplicationTable.append(printOneLineMultiplication(startNumber, multiplier));
        }
        return multiplicationTable.toString();
    }
}
