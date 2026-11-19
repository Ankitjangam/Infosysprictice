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
 *       java Q1_Medium_MeetingRoomsII
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
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 6 (23 Nov): Heaps & Priority Queues");
        System.out.println("PROBLEM: Meeting Rooms II (Min Conference Rooms) [Medium]");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  intervals = [[0,30],[5,10],[15,20]] | Expected: 2");

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
