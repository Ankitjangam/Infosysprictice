/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 6 (23 Nov): Heaps & Priority Queues
 * DIFFICULTY: Hard | PROBLEM: Merge K Sorted Lists via Min-Heap
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Merge `k` sorted linked lists and return it as one sorted list.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * k <= 10^4, total nodes <= 10^5.
 *
 * [SAMPLE INPUT / OUTPUT]
 * lists = [[1,4,5],[1,3,4],[2,6]] | Expected: [1, 1, 2, 3, 4, 4, 5, 6]
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Insert head of each list into PriorityQueue comparing node.val. Complexity: O(N log K).
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q3_Hard_MergeKSortedLists.java
 *       java Q3_Hard_MergeKSortedLists
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

public class Q3_Hard_MergeKSortedLists {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static ListNode mergeKLists(ListNode[] lists) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return null;
    }

    // =========================================================================
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 6 (23 Nov): Heaps & Priority Queues");
        System.out.println("PROBLEM: Merge K Sorted Lists via Min-Heap [Hard]");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  lists = [[1,4,5],[1,3,4],[2,6]] | Expected: [1, 1, 2, 3, 4, 4, 5, 6]");

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
