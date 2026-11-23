/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 6 (23 Nov): Heaps & Priority Queues
 * DIFFICULTY: Medium | PROBLEM: Meeting Rooms II (Min Conference Rooms)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Find minimum number of conference rooms required for all overlapping meetings.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * 1 <= intervals.length <= 10^4.
 *
 * [SAMPLE INPUT / OUTPUT]
 * intervals = [[0,30],[5,10],[15,20]] | Expected: 2
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Sort by start time. Use Min-Heap of end times. If new start >= min end, reuse room.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q1_Medium_MeetingRoomsII.java
 *       java -cp . Q1_Medium_MeetingRoomsII
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q1_Medium_MeetingRoomsII {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static int minMeetingRooms(int[][] intervals) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return 0;
    }

    // =========================================================================
    // BUILT-IN AUTOMATED TEST RUNNER (Calls your method and verifies verdict)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 6 (23 Nov): Heaps & Priority Queues");
        System.out.println("PROBLEM: Meeting Rooms II (Min Conference Rooms) [Medium]");
        System.out.println("==================================================");

        int passed = 0, total = 0;
        total++;
        int[][] in1 = {{0, 30}, {5, 10}, {15, 20}}; int exp1 = 2;
        int got1 = minMeetingRooms(in1);
        boolean p1 = (got1 == exp1);
        if (p1) passed++;
        System.out.println("[TEST 1] intervals = [[0,30],[5,10],[15,20]]");
        System.out.println("         Expected: " + exp1 + " | Got: " + got1);
        System.out.println("         Verdict:  " + (p1 ? ">> PASS <<" : "!! FAIL !!"));
        total++;
        int[][] in2 = {{7, 10}, {2, 4}}; int exp2 = 1;
        int got2 = minMeetingRooms(in2);
        boolean p2 = (got2 == exp2);
        if (p2) passed++;
        System.out.println("[TEST 2] intervals = [[7,10],[2,4]]");
        System.out.println("         Expected: " + exp2 + " | Got: " + got2);
        System.out.println("         Verdict:  " + (p2 ? ">> PASS <<" : "!! FAIL !!"));
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
