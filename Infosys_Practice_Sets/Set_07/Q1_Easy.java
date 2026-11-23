/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) IN-PERSON CODING ASSESSMENT
 * SET 07 | QUESTION 1 &bull; Easy (12 Cases)
 * Q1 (Easy - 12 Cases): In-Place Signal Inversion (Reverse Singly Linked List)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Reverse a singly linked list in-place in $O(N)$ time and $O(1)$ extra space.
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
    public static ListNode solveQ1(ListNode head) {
        // >>> WRITE YOUR SOLUTION HERE <<<
        return null;
    }

    // =========================================================================
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("INFOSYS EXAM PRACTICE: SET 07 - QUESTION 1");
        System.out.println("Q1 (Easy - 12 Cases): In-Place Signal Inversion (Reverse Singly Linked List)");
        System.out.println("==================================================");
        int passed = 0, total = 0; total++;
        ListNode in1 = buildList(new int[]{1, 2, 3, 4, 5});
        ListNode got1 = solveQ1(in1);
        List<Integer> gotList = toList(got1);
        List<Integer> expList = Arrays.asList(5, 4, 3, 2, 1);
        boolean p1 = Objects.equals(gotList, expList); if (p1) passed++;
        System.out.println("[TEST 1] In: [1 -> 2 -> 3 -> 4 -> 5]");
        System.out.println("         Expected: " + expList + " | Got: " + gotList);
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
