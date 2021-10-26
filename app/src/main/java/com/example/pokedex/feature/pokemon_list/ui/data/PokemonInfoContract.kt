package com.example.pokedex.feature.pokemon_list.ui.data

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.activity.result.contract.ActivityResultContract
import com.example.pokedex.data.Pokemon
import com.example.pokedex.feature.pokemon_list.ui.screens.PokemonInfoActivity

class PokemonInfoContract: ActivityResultContract<Pokemon, Pokemon?> (){

    companion object {
        const val Input = "pokemon_info_contract_input"
        const val Output = "pokemon_info_contract_output"
    }

    override fun createIntent(context: Context, input: Pokemon?) = Intent(context, PokemonInfoActivity::class.java).apply {
        putExtra(Input,input)
    }

    override fun parseResult(resultCode: Int, intent: Intent?): Pokemon? {
        if(resultCode != Activity.RESULT_OK) return null

        return intent?.getParcelableExtra(Output)
    }

}

