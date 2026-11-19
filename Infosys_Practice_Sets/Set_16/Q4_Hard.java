/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) IN-PERSON CODING ASSESSMENT
 * SET 16 | QUESTION 4 &bull; Hard (12 Cases)
 * Q4 (Hard – 12 Cases): RPG Hero Monster Battle with Shield Trigger (Infosys SP Special)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * A hero has initial power $P$. There are $N$ monsters. Monster $i$ requires power at least $Req[i]$ to be defeated. Defeating monster $i$ grants bonus power $Bonus[i]$. However, if the hero's power reaches or exceeds threshold $K$, all remaining monsters activate an energy shield requiring hero to spend $Cost[i]$ from a fixed stamina pool $S$. Find the maximum monsters the hero can defeat.
 *
 * [CONSTRAINTS]
 * $1 \le N \le 1000$, $1 \le P, K \le 10^9$, $1 \le S \le 2000$.
 *
 * [SAMPLE INPUT / OUTPUT]
 * Sample Input: None
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
 *       java Q4_Hard
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q4_Hard {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Target Complexity: O(N) Time, O(1) Space
    // =========================================================================
    public static int solveHeroMonsters(long P, long K, int S, int[] req, int[] bonus, int[] cost) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return 0;
    }

    // =========================================================================
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("INFOSYS EXAM PRACTICE: SET 16 - QUESTION 4");
        System.out.println("Q4 (Hard – 12 Cases): RPG Hero Monster Battle with Shield Trigger (Infosys SP Special)");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  Sample Input: None");

        System.out.println("\n[INSTRUCTIONS]");
        System.out.println("  1. Implement your logic in the empty method above.");
        System.out.println("  2. Recompile and run to test your solution.");
        System.out.println("  3. Target: 100% bug-free on all hidden edge cases.");
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
