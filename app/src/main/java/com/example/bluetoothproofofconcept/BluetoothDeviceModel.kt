package com.example.bluetoothproofofconcept

data class BluetoothDeviceModel(override var name: String, override val address: String, override  val paired: Boolean) : Device