package com.example.dutchessmeetsrex

import java.util.*

data class Game(val id: UUID = UUID.randomUUID(),
                val gameName: String = "",
                val gameLevel: String = "",
                val isLocked: Boolean = false,
                val challenges: Set<Challenges> = setOf<Challenges>(),
                val gameLayout: String = " ",
                val gameRules: String = " "
)





