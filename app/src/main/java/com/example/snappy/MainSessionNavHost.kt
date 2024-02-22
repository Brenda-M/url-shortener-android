package com.example.snappy

import WebFragment
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import dev.hotwire.turbo.config.TurboPathConfiguration
import dev.hotwire.turbo.session.TurboSessionNavHostFragment
import kotlin.reflect.KClass



class MainSessionNavHost : TurboSessionNavHostFragment() {
    override val sessionName = "main"

    override var startLocation = "http://10.0.2.2:3000"

    override val registeredActivities: List<KClass<out AppCompatActivity>>
        get() = listOf(
        )

    override val registeredFragments: List<KClass<out Fragment>>
        get() = listOf(
            WebFragment::class
        )

    override val pathConfigurationLocation: TurboPathConfiguration.Location
        get() = TurboPathConfiguration.Location(
            assetFilePath = "json/configuration.json",
            remoteFileUrl = "https://turbo.hotwired.dev/demo/configurations/android-v1.json"
        )
}
