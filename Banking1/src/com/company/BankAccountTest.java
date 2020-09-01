package com.company;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    
    private BankAccount account;
    private static int count;

    @org.junit.jupiter.api.BeforeAll
    static void beforeClass() {
        System.out.println("This executes before any test cases. Count = " + count++);
    }

    @org.junit.jupiter.api.BeforeEach
    void setup() {
        account = new BankAccount("Tejas", "Bansal", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }

    @org.junit.jupiter.api.Test
    void deposit() {
        double balance = account.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);
    }

    @org.junit.jupiter.api.Test
    void withdraw_notBranch() throws Exception {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {

        });
        account.withdraw(600.00, false);
        fail("Should have thrown an IllegalArgumentException");
    }

    @org.junit.jupiter.api.Test
    void withdraw_branch() {
        double balance = account.withdraw(600.00, true);
        assertEquals(400.00, balance, 0);
    }

    @org.junit.jupiter.api.Test
    void getBalance_deposit() throws Exception {
        account.deposit(200.00, true);
        assertEquals(1200.00, account.getBalance(), 0);
    }

    @org.junit.jupiter.api.Test
    void getBalance_withdraw() throws Exception {
        account.withdraw(200.00, true);
        assertEquals(800.00, account.getBalance(), 0);
    }

    @org.junit.jupiter.api.Test
    public void isChecking_true() {
        assertTrue(account.isChecking(), "The account is NOT a checking account");
    }

    @org.junit.jupiter.api.AfterAll
    static void afterClass() {
        System.out.println("This executes after any test class. Count = " + count++);
    }

    @org.junit.jupiter.api.AfterEach
    void teardown() {
        System.out.println("Count = " + count++ );
    }

}