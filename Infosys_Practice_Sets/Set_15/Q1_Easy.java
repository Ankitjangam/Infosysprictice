/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) IN-PERSON CODING ASSESSMENT
 * SET 15 | QUESTION 1 &bull; Easy (12 Cases)
 * Q1 (Easy - 12 Cases): Data Feed Intersection (Intersection of Two Linked Lists)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Find node where two singly linked lists merge in $O(M + N)$ time and $O(1)$ space.
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
 *       javac Q1_Easy.java
 *       java -cp . Q1_Easy
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

public class Q1_Easy {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static ListNode solveQ1(ListNode a, ListNode b) {
        // >>> WRITE YOUR SOLUTION HERE <<<
        return null;
    }

    // =========================================================================
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("INFOSYS EXAM PRACTICE: SET 15 - QUESTION 1");
        System.out.println("Q1 (Easy - 12 Cases): Data Feed Intersection (Intersection of Two Linked Lists)");
        System.out.println("==================================================");
        int passed = 0, total = 0; total++;
        ListNode comm = new ListNode(8); comm.next = new ListNode(4); comm.next.next = new ListNode(5);
        ListNode l1 = new ListNode(4); l1.next = new ListNode(1); l1.next.next = comm;
        ListNode l2 = new ListNode(5); l2.next = new ListNode(6); l2.next.next = new ListNode(1); l2.next.next.next = comm;
        ListNode got = solveQ1(l1, l2);
        boolean p1 = (got != null && got.val == 8); if (p1) passed++;
        System.out.println("[TEST 1] Intersecting at node with value 8");
        System.out.println("         Expected: Node 8 | Got: " + (got != null ? got.val : "null"));
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

    private static ListNode buildList(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        ListNode dummy = new ListNode(0), curr = dummy;
        for (int x : arr) { curr.next = new ListNode(x); curr = curr.next; }
        return dummy.next;
    }
    private static List<Integer> toList(ListNode head) {
        List<Integer> res = new ArrayList<>();
        while (head != null) { res.add(head.val); head = head.next; }
        return res;
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
