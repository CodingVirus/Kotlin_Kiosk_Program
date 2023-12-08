package com.example.kiosk_program.menus

import com.example.kiosk_program.Menu

data class Burger(
	override val id: Int,
	override val price: Int,
	override val name: String,
	override val desc: String
) : Menu {
	override fun displayInfo() {
		println("[Burger] $name 의 가격은 ₩ ${price.toDouble() / 1000} 입니다.")
	}

	// 외부 서버에서 json 형식의 데이터를 받아온다고 가정
	companion object {
		const val BURGERSDATA =
			"[{\"id\":1,\"name\":\"ShackBurger\",\"price\":6900,\"desc\":\"토마토, 양상추, 쉑소스가 토핑된 치즈버거\"},{\"id\":2,\"name\":\"SmokeShack\",\"price\":8900,\"desc\":\"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거\"},{\"id\":3,\"name\":\"Shroom Burger\",\"price\":9400,\"desc\":\"몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거\"},{\"id\":4,\"name\":\"Cheeseburger\",\"price\":6900,\"desc\":\"포테이토 번과 비프패티, 치즈가 토핑된 치즈버거\"},{\"id\":5,\"name\":\"Hamburger\",\"price\":5400,\"desc\":\"비프패티를 기반으로 야채가 들어간 기본버거\"}]"
	}
}