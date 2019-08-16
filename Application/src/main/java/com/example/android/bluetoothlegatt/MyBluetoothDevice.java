package com.example.android.bluetoothlegatt;

import android.bluetooth.BluetoothDevice;

/**
 * Created by G on 2019/8/14.
 */

public class MyBluetoothDevice {

    private BluetoothDevice bluetoothDevice;
    private int Rssi;

    public MyBluetoothDevice(BluetoothDevice bluetoothDevice, int rssi) {
        this.bluetoothDevice = bluetoothDevice;
        Rssi = rssi;
    }

    public BluetoothDevice getBluetoothDevice() {
        return bluetoothDevice;
    }

    public void setBluetoothDevice(BluetoothDevice bluetoothDevice) {
        this.bluetoothDevice = bluetoothDevice;
    }

    public int getRssi() {
        return Rssi;
    }

    public void setRssi(int rssi) {
        Rssi = rssi;
    }
}
