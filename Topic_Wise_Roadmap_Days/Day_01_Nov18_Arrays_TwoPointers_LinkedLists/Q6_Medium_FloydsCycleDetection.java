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
 *       java -cp . Q6_Medium_FloydsCycleDetection
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
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 1 (18 Nov): Arrays, String Basics, Two Pointers & Linked Lists");
        System.out.println("PROBLEM: Floyd's Cycle Start Node [Medium]");
        System.out.println("==================================================");

        int passed = 0, total = 0;
        total++;
        ListNode n1 = new ListNode(3); ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0); ListNode n4 = new ListNode(-4);
        n1.next = n2; n2.next = n3; n3.next = n4; n4.next = n2;
        ListNode got1 = detectCycle(n1);
        boolean p1 = (got1 != null && got1.val == 2);
        if (p1) passed++;
        System.out.println("[TEST 1] List: [3 -> 2 -> 0 -> -4 -> (node 2)]");
        System.out.println("         Expected Node: 2 | Got: " + (got1 != null ? got1.val : "null"));
        System.out.println("         Verdict:       " + (p1 ? ">> PASS <<" : "!! FAIL !!"));
        total++;
        ListNode a = new ListNode(1);
        ListNode got2 = detectCycle(a);
        boolean p2 = (got2 == null);
        if (p2) passed++;
        System.out.println("[TEST 2] List: [1] (No cycle)");
        System.out.println("         Expected Node: null | Got: " + (got2 != null ? got2.val : "null"));
        System.out.println("         Verdict:       " + (p2 ? ">> PASS <<" : "!! FAIL !!"));
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
