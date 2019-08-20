package br.com.brunoaguiar.roomwordsample

import android.app.Application
import br.com.brunoaguiar.roomwordsample.di.dbModule
import br.com.brunoaguiar.roomwordsample.di.repositoryModule
import br.com.brunoaguiar.roomwordsample.di.uiModule
import br.com.brunoaguiar.roomwordsample.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            // declare used Android context
            androidContext(this@MyApplication)

            // declare modules
            modules(
                listOf(
                    viewModelModule,
                    uiModule,
                    dbModule,
                    repositoryModule
                )
            )
        }
    }
}