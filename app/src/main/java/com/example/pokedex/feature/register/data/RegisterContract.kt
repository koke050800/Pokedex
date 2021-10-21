package com.example.pokedex.feature.register.data

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.activity.result.contract.ActivityResultContract
import com.example.pokedex.feature.register.ui.screens.RegisterScreenActivity
/*
class RegisterContract: ActivityResultContract<String?, Int?>() {

    companion object {
        const val Input = "register_contract_input"
        const val Output = "register_contract_output"
    }

    override fun createIntent(context: Context, input: String?) = Intent(context, RegisterScreenActivity::class.java).apply{
        putExtra(Input,input)
    }

    override fun parseResult(resultCode: Int, intent: Intent?): Int? {
        if(resultCode != Activity.RESULT_OK) return null

        return intent?.getParcelableExtra(Output)
    }


}*/