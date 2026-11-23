/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) IN-PERSON CODING ASSESSMENT
 * SET 05 | QUESTION 4 &bull; Hard (12 Cases)
 * Q4 (Hard - 12 Cases): Microservice Task Pipeline (Course Schedule II Topo Sort)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Determine valid build order for $N$ courses with prerequisites, or return empty array if cyclic.
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
public static int[] solveQ4(int n, int[][] prereqs) {
        // >>> WRITE YOUR SOLUTION HERE <<<
        return new int[0];
    }

    // =========================================================================
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("INFOSYS EXAM PRACTICE: SET 05 - QUESTION 4");
        System.out.println("Q4 (Hard - 12 Cases): Microservice Task Pipeline (Course Schedule II Topo Sort)");
        System.out.println("==================================================");
        int passed = 0, total = 0;
        total++;
        int n1 = 4; int[][] prereqs1 = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        int[] got1 = solveQ4(n1, prereqs1);
        boolean p1 = (got1.length == 4 && got1[0] == 0 && got1[3] == 3); if (p1) passed++;
        System.out.println("[TEST 1] numCourses = 4, prereqs = [[1,0],[2,0],[3,1],[3,2]]");
        System.out.println("         Got Order: " + Arrays.toString(got1));
        System.out.println("         Verdict:   " + (p1 ? ">> PASS <<" : "!! FAIL !!"));
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
