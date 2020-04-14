package com.example.eezylife

import android.app.Application
import com.example.eezylife.modelfactory.MainViewModelFactory
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule
import org.kodein.di.generic.bind
import org.kodein.di.generic.provider

class EezyLifeApplication : Application(), KodeinAware{

    override val kodein = Kodein.lazy {
        import(androidXModule(this@EezyLifeApplication))
        bind() from provider { MainViewModelFactory() }
    }
}