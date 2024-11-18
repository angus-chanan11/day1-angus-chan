package com.tw;

public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;
        boolean isStartLessThanOrEqualToEnd = builder.isStartLessThanOrEqualToEnd(start, end);
        System.out.println(isStartLessThanOrEqualToEnd);
    }

    public String build(int start, int end) {
        return "";
    }

    private boolean isStartLessThanOrEqualToEnd(int start, int end) {
        return start <= end;
    }
}
