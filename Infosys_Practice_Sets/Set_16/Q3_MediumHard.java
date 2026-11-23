/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) IN-PERSON CODING ASSESSMENT
 * SET 16 | QUESTION 3 &bull; Medium-Hard (12 Cases)
 * Q3 (Med-Hard - 12 Cases): The Hotel Manager's Guest Scheduling (Official HackWithInfy)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * As a luxury hotel manager, you have $N$ guests arriving today. Guest $i$ has a preferred arrival time $C[i]$. You can only check in one guest per time unit, and checking in takes exactly 1 hour. If guest $i$ is served at hour $x$ (where $x \in \{1, 2, \dots, N\}$), their unhappiness penalty is $|C[i] - x|$. Find the minimum total unhappiness penalty achievable by ordering the check-ins optimally.
 *
 * [CONSTRAINTS]
 * $1 \le N \le 10^5$, $1 \le C[i] \le 10^9$.
 *
 * [SAMPLE INPUT / OUTPUT]
 * C = [4, 2, 1, 5] | Sample Output: 2 (Sorted C = [1, 2, 4, 5], served at [1, 2, 3, 4] → |1-1|+|2-2|+|4-3|+|5-4| = 2)
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Infosys Trap: Total unhappiness sum on $N = 10^5$ with $C[i] = 10^9$ reaches $10^{14}$! `totalUnhappiness` MUST be `long`.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q3_MediumHard.java
 *       java -cp . Q3_MediumHard
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q3_MediumHard {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static long solveHotelManager(int[] C) {
        // >>> WRITE YOUR SOLUTION HERE <<<
        return 0L;
    }

    // =========================================================================
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("INFOSYS EXAM PRACTICE: SET 16 - QUESTION 3");
        System.out.println("Q3 (Med-Hard - 12 Cases): The Hotel Manager's Guest Scheduling (Official HackWithInfy)");
        System.out.println("==================================================");
        int passed = 0, total = 0; total++;
        int[] C = {4, 2, 1, 5}; long exp1 = 2L;
        long got1 = solveHotelManager(C);
        boolean p1 = (got1 == exp1); if (p1) passed++;
        System.out.println("[TEST 1] C = " + Arrays.toString(C));
        System.out.println("         Expected penalty: " + exp1 + " | Got: " + got1);
        System.out.println("         Verdict:          " + (p1 ? ">> PASS <<" : "!! FAIL !!"));
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
