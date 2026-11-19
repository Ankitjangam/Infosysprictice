/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 1 (18 Nov): Arrays, String Basics, Two Pointers & Linked Lists
 * DIFFICULTY: Medium | PROBLEM: Floyd's Cycle Start Node
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Given head of a linked list, return the node where the cycle begins, or null if no cycle.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * Number of nodes <= 10^5. Do not modify linked list nodes.
 *
 * [SAMPLE INPUT / OUTPUT]
 * head = [3, 2, 0, -4] (pos = 1) | Expected: Node with value 2
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Phase 1: fast=2x, slow=1x until collision. Phase 2: reset slow=head, move both 1x until meeting point.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q6_Medium_FloydsCycleDetection.java
 *       java Q6_Medium_FloydsCycleDetection
 * =============================================================================
 */

import java.util.*;
import java.io.*;


// Helper Linked List Node
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; next = null; }
}

public class Q6_Medium_FloydsCycleDetection {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static ListNode detectCycle(ListNode head) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return null;
    }

    // =========================================================================
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 1 (18 Nov): Arrays, String Basics, Two Pointers & Linked Lists");
        System.out.println("PROBLEM: Floyd's Cycle Start Node [Medium]");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  head = [3, 2, 0, -4] (pos = 1) | Expected: Node with value 2");

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
