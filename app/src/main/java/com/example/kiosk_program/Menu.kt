package com.example.kiosk_program

interface Menu {
	val id: Int
	val price: Int
	val name: String
	val desc: String
	fun displayInfo()
}