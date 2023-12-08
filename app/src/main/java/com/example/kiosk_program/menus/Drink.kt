package com.example.kiosk_program.menus

import com.example.kiosk_program.Menu

data class Drink(
	override val id: Int,
	override val price: Int,
	override val name: String,
	override val desc: String
) : Menu {
	override fun displayInfo() {
		println("[Drinks] $name 의 가격은 ₩ ${price.toDouble() / 100} 입니다.")
	}

	// 외부 서버에서 json 형식의 데이터를 받아온다고 가정
	companion object {
		const val DRINKSDATA =
			"[{\"id\":1,\"name\":\"Cola\",\"price\":3000,\"desc\":\"콜라임\"},{\"id\":2,\"name\":\"Zero Cola\",\"price\":3000,\"desc\":\"제로콜라임\"},{\"id\":3,\"name\":\"Cider\",\"price\":2800,\"desc\":\"사이다임\"},{\"id\":4,\"name\":\"Zero Cider\",\"price\":3000,\"desc\":\"제로 사이다임\"},{\"id\":5,\"name\":\"Lemon Ade\",\"price\":5000,\"desc\":\"과일은 비싸서 5천원\"}]"
	}
}