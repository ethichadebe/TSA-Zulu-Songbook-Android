package com.example.tsazulusongbook.model

import java.io.Serializable

data class Song (
    val group: String,
    val number: Int,
    val title: String,
    val bandTunes: List<String> = listOf(),
    val englishSongNumber: String,
    val verses: List<String> = listOf(),
    val chorus: String,
): Serializable