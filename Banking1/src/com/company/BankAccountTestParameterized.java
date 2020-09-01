package com.company;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class BankAccountTestParameterized {

    private BankAccount account;
    private double amount;
    private boolean branch;
    private double expected;

    public BankAccountTestParameterized(double amount, boolean branch, double expected) {
        this.amount = amount;
        this.branch = branch;
        this.expected = expected;
    }

    @org.junit.jupiter.api.BeforeEach
    void setup() {
        account = new BankAccount("Tejas", "Bansal", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }

    static Stream<  Arguments> testConditions() {
        return Stream.of(
                arguments(100.00, true, 1100.00),
                arguments(200.00, true, 1200.00),
                arguments(325.14, true, 1325.14),
                arguments(489.33, true, 1489.33),
                arguments(1000.00, true, 2000.00)
        );
    }


    @ParameterizedTest(name = "({0}, {1}, {2})")
    @MethodSource("testConditions")
    @org.junit.jupiter.api.Test
    void deposit(double amount, boolean branch, double expected) throws Exception {
        account.deposit(amount, branch);
        assertEquals(expected, account.getBalance(), 0);
    }
}
