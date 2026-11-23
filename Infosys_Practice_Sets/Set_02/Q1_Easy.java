/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) IN-PERSON CODING ASSESSMENT
 * SET 02 | QUESTION 1 &bull; Easy (12 Cases)
 * Q1 (Easy - 12 Cases): Semiconductor Defect In-Place Sorter (Dutch National Flag)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Silicon wafers are graded 0 (Defect-Free), 1 (Standard Grade), or 2 (Scrap). Sort an array of $N$ wafers in-place in $O(N)$ time and $O(1)$ extra space without using Java's built-in sort.
 *
 * [CONSTRAINTS]
 * $1 \le N \le 10^5$, $nums[i] \in \{0, 1, 2\}$.
 *
 * [SAMPLE INPUT / OUTPUT]
 * nums = [2,0,2,1,1,0] | Sample Output: [0,0,1,1,2,2]
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Infosys Trap: Incrementing `mid` when swapping with `high` traps an unexamined 0 in the middle!
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q1_Easy.java
 *       java -cp . Q1_Easy
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q1_Easy {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
public static void solveQ1(int[] nums) {
        // >>> WRITE YOUR SOLUTION HERE <<<
        return;
    }

    // =========================================================================
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("INFOSYS EXAM PRACTICE: SET 02 - QUESTION 1");
        System.out.println("Q1 (Easy - 12 Cases): Semiconductor Defect In-Place Sorter (Dutch National Flag)");
        System.out.println("==================================================");
        int passed = 0, total = 0;
        total++;
        int[] in1 = {2, 0, 2, 1, 1, 0}; int[] exp1 = {0, 0, 1, 1, 2, 2};
        solveQ1(in1);
        boolean p1 = Arrays.equals(in1, exp1); if (p1) passed++;
        System.out.println("[TEST 1] In: [2, 0, 2, 1, 1, 0]");
        System.out.println("         Expected: " + Arrays.toString(exp1) + " | Got: " + Arrays.toString(in1));
        System.out.println("         Verdict:  " + (p1 ? ">> PASS <<" : "!! FAIL !!"));
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
