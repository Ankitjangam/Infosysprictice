/**
 * =============================================================================
 * INFOSYS SPECIALIST PROGRAMMER (SP) TOPIC-WISE ROADMAP
 * DAY 8 (25 Nov): Graphs, BFS/DFS, DSU & Shortest Paths
 * DIFFICULTY: Hard | PROBLEM: Course Schedule II (Kahn's Algorithm)
 * =============================================================================
 *
 * [PROBLEM DESCRIPTION]
 * Return ordering of courses you should take to finish all courses.
 *
 * [CONSTRAINTS & HARDWARE TARGET]
 * 1 <= numCourses <= 2000.
 *
 * [SAMPLE INPUT / OUTPUT]
 * numCourses = 4, prerequisites = [[1,0],[2,0],[3,1],[3,2]] | Expected: [0, 2, 1, 3]
 *
 * [INFOSYS EXAM WARNING / HARDWARE TRAP]
 * Compute in-degrees. Enqueue all 0 in-degree nodes. If output size < numCourses, cycle exists.
 *
 * =============================================================================
 * HOW TO TEST IN NOTEPAD:
 * 1. Implement your solution in the empty method below.
 * 2. Save the file.
 * 3. Open Command Prompt in this folder and compile & run:
 *       javac Q3_Hard_CourseScheduleIITopoSort.java
 *       java Q3_Hard_CourseScheduleIITopoSort
 * =============================================================================
 */

import java.util.*;
import java.io.*;


public class Q3_Hard_CourseScheduleIITopoSort {

    // =========================================================================
    // TODO: WRITE YOUR OPTIMAL LOGIC IN THIS METHOD
    // Pure strict practice: Implement your solution from scratch.
    // =========================================================================
    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        // >>> WRITE YOUR SOLUTION HERE <<<

        return new int[0];
    }

    // =========================================================================
    // BUILT-IN TEST RUNNER (Executes automatically when you run this file)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("DAY 8 (25 Nov): Graphs, BFS/DFS, DSU & Shortest Paths");
        System.out.println("PROBLEM: Course Schedule II (Kahn's Algorithm) [Hard]");
        System.out.println("==================================================");

        System.out.println("\n[SAMPLE DETAILS]");
        System.out.println("  numCourses = 4, prerequisites = [[1,0],[2,0],[3,1],[3,2]] | Expected: [0, 2, 1, 3]");

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
