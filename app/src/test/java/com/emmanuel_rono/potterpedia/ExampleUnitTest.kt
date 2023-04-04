package com.emmanuel_rono.potterpedia

import org.junit.Test

import org.junit.Assert.*
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class HarryPotterApiTest {

    private val api =harryList(ApplicationProvider.getApplicationContext())

    @Test
    fun testGetCharacters() {
        runBlocking {
            val characters = api.getCharacters()

            // Ensure the API returns a list of characters
            assertEquals(true, characters.isNotEmpty())

            // Ensure each character has a name
            characters.forEach { character ->
                assertEquals(true, character.name.isNotBlank())
            }
        }
    }
}