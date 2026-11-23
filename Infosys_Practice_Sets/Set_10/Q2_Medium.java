/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) IN-PERSON CODING ASSESSMENT
 * SET 10 | QUESTION 2 &bull; Easy-Medium (12 Cases)
 * Q2 (Easy-Med - 12 Cases): Microcontroller Buffer (Implement Queue using Dual Stacks)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Implement FIFO queue using two stacks with amortized $O(1)$ operations.
 *
 * [CONSTRAINTS]
 * Standard exam constraints.
 *
 * [SAMPLE INPUT / OUTPUT]
 * Standard sample cases.
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Watch for boundary and 32-bit integer overflow traps.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q2_Medium.java
 *       java -cp . Q2_Medium
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q2_Medium {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static class DualStackQueue {
        // >>> WRITE YOUR FIELDS & CONSTRUCTORS HERE <<<
        public void push(int x) {}
        public int pop() { return 0; }
        public int peek() { return 0; }
        public boolean empty() { return false; }
    }

    // =========================================================================
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("INFOSYS EXAM PRACTICE: SET 10 - QUESTION 2");
        System.out.println("Q2 (Easy-Med - 12 Cases): Microcontroller Buffer (Implement Queue using Dual Stacks)");
        System.out.println("==================================================");
        int passed = 0, total = 0; total++;
        DualStackQueue q = new DualStackQueue();
        q.push(1); q.push(2);
        int pk = q.peek();
        int po = q.pop();
        boolean emp = q.empty();
        boolean allPass = (pk == 1 && po == 1 && !emp); if (allPass) passed++;
        System.out.println("[TEST 1] Queue ops: push(1), push(2), peek(), pop(), empty()");
        System.out.println("         Expected: peek=1, pop=1, empty=false");
        System.out.println("         Got:      peek=" + pk + ", pop=" + po + ", empty=" + emp);
        System.out.println("         Verdict:  " + (allPass ? ">> PASS <<" : "!! FAIL !!"));
        printSummary(passed, total);
    }

    // =========================================================================
    // TEST HELPER UTILITIES
    // =========================================================================
    private static void printSummary(int passed, int total) {
        System.out.println("\n--------------------------------------------------");
        System.out.println("RESULT: " + passed + " / " + total + " Test Cases Passed.");
        if (passed == total) {
            System.out.println("STATUS: [PASS] All automated test cases cleared!");
        } else {
            System.out.println("STATUS: [FAIL] Check your logic and re-test.");
        }
        System.out.println("==================================================");
    }

    // =========================================================================
    // EXAM HALL FAST I/O PARSER (Available for reading inputs from System.in)
    // =========================================================================
    static class FastReader {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try { String l = br.readLine(); if (l == null) return null; st = new StringTokenizer(l); }
                catch (IOException e) { return null; }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
    }
}
