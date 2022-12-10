package com.example.garudaconnectivity.usb;


import android.content.Context;

public class UsbSerial {

    private Context context;
    private int boundRate;
    private byte delimiter;

    private UsbSerial(UsbBuilder usbBuilder) {
        this.context = usbBuilder.context;
        this.boundRate = usbBuilder.boundRate;
        this.delimiter = usbBuilder.delimiter;
    }


    public static final class UsbBuilder {

        private Context context;
        private int boundRate = 9600;
        private byte delimiter = '\n';

        public UsbBuilder(Context context) {
            this.context = context;
        }

        public UsbBuilder setBoundRate(int boundRate) {
            this.boundRate = boundRate;
            return this;
        }

        public UsbBuilder setDelimiter(byte delimiter) {
            this.delimiter = delimiter;
            return this;
        }

        public UsbSerial build() {
            return new UsbSerial(this);
        }

    }


}
