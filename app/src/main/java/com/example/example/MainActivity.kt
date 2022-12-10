package com.example.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.garudaconnectivity.usb.UsbSerial

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val usbSerial = UsbSerial.UsbBuilder(this)
            .setBoundRate(9500)
            .setDelimiter('\n'.code.toByte())
            .build()


    }
}