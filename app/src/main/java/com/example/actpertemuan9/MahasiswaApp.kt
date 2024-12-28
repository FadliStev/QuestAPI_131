package com.example.actpertemuan9

import android.app.Application
import com.example.actpertemuan9.dependenciesinjection.AppContainer
import com.example.actpertemuan9.dependenciesinjection.MahasiswaContainer

class MahasiswaApp:Application() {

    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = MahasiswaContainer()
    }
}