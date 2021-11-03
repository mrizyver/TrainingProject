package com.project.training.leetcode

import org.junit.Assert.*
import org.junit.Test

private const val DELTA = 1e-15

class MedianOfTwoSortedArraysTest {

    @Test
    fun test4to4() {
        assertEquals(
            (3 + 4) / 2.0,
            findMedianSortedArrays(
                intArrayOf(1, 3, 5, 8),
                intArrayOf(1, 3, 4, 5)
            ),
            DELTA
        )
    }

    @Test
    fun test2to1() {
        assertEquals(
            2.0,
            findMedianSortedArrays(
                intArrayOf(1, 3),
                intArrayOf(2)
            ),
            DELTA
        )
    }
}