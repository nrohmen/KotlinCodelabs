package com.nrohmen.kotlinconf.ui

interface NavigationManager {
    fun showSessionList()
    fun showSessionDetails(sessionId: String)
}