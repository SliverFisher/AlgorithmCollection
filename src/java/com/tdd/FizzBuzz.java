package com.tdd;

public class FizzBuzz {
    public String call(int i) {
        if (isFizzBuzz(i)) {
            return "FizzBuzz";
        }
        if (isFizz(i)) {
            return "Fizz";
        }
        if (isBuzz(i)) {
            return "Buzz";
        }
        return String.valueOf(i);
    }

    public boolean isFizzBuzz(int i) {
        return isFizz(i) && isBuzz(i);
    }

    public boolean isBuzz(int i) {
        return i % 5 == 0 || String.valueOf(i).contains("5");
    }

    public boolean isFizz(int i) {
        return i % 3 == 0 || String.valueOf(i).contains("3");
    }
}
