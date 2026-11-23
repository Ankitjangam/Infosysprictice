/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) IN-PERSON CODING ASSESSMENT
 * SET 16 | QUESTION 4 &bull; Hard (12 Cases)
 * Q4 (Hard - 12 Cases): RPG Hero Monster Battle with Shield Trigger (Infosys SP Special)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * A hero has initial power $P$. There are $N$ monsters. Monster $i$ requires power at least $Req[i]$ to be defeated. Defeating monster $i$ grants bonus power $Bonus[i]$. However, if the hero's power reaches or exceeds threshold $K$, all remaining monsters activate an energy shield requiring hero to spend $Cost[i]$ from a fixed stamina pool $S$. Find the maximum monsters the hero can defeat.
 *
 * [CONSTRAINTS]
 * $1 \le N \le 1000$, $1 \le P, K \le 10^9$, $1 \le S \le 2000$.
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
 *       javac Q4_Hard.java
 *       java -cp . Q4_Hard
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q4_Hard {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static int solveHeroMonsters(long P, long K, int S, int[] req, int[] bonus, int[] cost) {
        // >>> WRITE YOUR SOLUTION HERE <<<
        return 0;
    }

    // =========================================================================
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("INFOSYS EXAM PRACTICE: SET 16 - QUESTION 4");
        System.out.println("Q4 (Hard - 12 Cases): RPG Hero Monster Battle with Shield Trigger (Infosys SP Special)");
        System.out.println("==================================================");
        int passed = 0, total = 0; total++;
        long P = 10, K = 20; int S = 5;
        int[] req = {5, 8}, bonus = {3, 5}, cost = {2, 3};
        int got1 = solveHeroMonsters(P, K, S, req, bonus, cost);
        int exp1 = 2;
        boolean p1 = (got1 == exp1); if (p1) passed++;
        System.out.println("[TEST 1] P=10, K=20, S=5, req=[5,8], bonus=[3,5], cost=[2,3]");
        System.out.println("         Expected defeated: " + exp1 + " | Got: " + got1);
        System.out.println("         Verdict:           " + (p1 ? ">> PASS <<" : "!! FAIL !!"));
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
