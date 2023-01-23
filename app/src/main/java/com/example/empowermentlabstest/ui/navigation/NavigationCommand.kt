package com.example.empowermentlabstest.ui.navigation

import android.os.Bundle
import androidx.navigation.NavOptionsBuilder

interface NavigationCommand {
    val args: Bundle?
    val navBuilder: NavOptionsBuilder.() -> Unit
}
