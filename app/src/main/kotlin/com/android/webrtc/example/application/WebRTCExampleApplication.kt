package com.android.webrtc.example.application

import android.app.Application
import android.content.Context
import com.android.webrtc.example.ioc.ServiceLocator

class WebRTCExampleApplication : Application() {
    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        ServiceLocator.initWithContext(base)
    }
}