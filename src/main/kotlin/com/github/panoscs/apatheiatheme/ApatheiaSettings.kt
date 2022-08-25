package com.github.panoscs.apatheiatheme

import com.intellij.openapi.components.PersistentStateComponent
import com.intellij.openapi.components.State
import com.intellij.openapi.components.Storage
import com.intellij.openapi.components.service

@State(
    name = "Apatheia",
    storages = [Storage("apatheia-theme.xml")]
)
class ApatheiaSettings : PersistentStateComponent<ApatheiaState> {

    companion object {
        val instance: ApatheiaSettings
            get() = service()
    }

    private var state = ApatheiaState()

    override fun getState(): ApatheiaState {
        return state
    }

    override fun loadState(state: ApatheiaState) {
        this.state = state
    }
}

