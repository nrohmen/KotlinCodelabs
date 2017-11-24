package com.nrohmen.kotlinconf.model

class Vote(
    var sessionId: String? = null,
    var rating: Int? = 0 // -1 is negative, 0 is so-so, 1 is positive
)