package com.example.githubactions

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class AddServiceTest {

    @Test
    fun add() {
        val addService = AddService()

        assertEquals(4, addService.add(2, 2))
    }
}