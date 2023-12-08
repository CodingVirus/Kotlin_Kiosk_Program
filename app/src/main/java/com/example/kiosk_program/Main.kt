package com.example.kiosk_program

import com.example.kiosk_program.menus.Burger
import com.example.kiosk_program.menus.Drink
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.*

suspend fun main() {
	while (true) {
		// category
		val categories = getCategories().await()

		println("아래 메뉴판을 보시고 카테고리의 번호를 입력해주세요.")
		println("[ Category ]")
		categories.forEach {
			println("${it.id}. ${it.categoryName} : ${it.desc}")
		}
		println("0. 키오스크 종료")

		val categoryNumber = getInputNumber(categories.size)

		if (categoryNumber == 0) return println("키오스크를 종료합니다.")

		// menu
		val menus = getMenus(categoryNumber).await()

		println("원하는 메뉴의 번호를 입력해주세요.")
		categories.find { it.id == categoryNumber }?.let {
			println("[ ${it.categoryName} ]")
		}
		menus.forEach {
			println("${it.id}. ${it.name} : ₩${it.price.toDouble() / 1000} : ${it.desc}")
		}
		println("0. 뒤로가기")

		val menuId = getInputNumber(menus.size)

		if (menuId != 0) {
			val menu = menus.find { it.id == menuId }

			menu?.displayInfo()
			return
		}
	}
}

fun getInputNumber(max: Int): Int {
	while (true) {
		val input = readln().toIntOrNull()

		if (input is Int && input in 0..max) {
			return input
		} else {
			println("올바를 숫자를 입력해주세요.")
		}
	}
}

fun getCategories(): Deferred<List<Category>> {
	GlobalScope.launch {
		repeat(6) {
			println("카테고리 불러오는중...")
			delay(500)
		}
	}

	return CoroutineScope(Dispatchers.IO).async {
		val typeToken = object : TypeToken<List<Category>>() {}.type
		delay(3000)

		Gson().fromJson(Category.CATEGORIESDATA, typeToken)
	}
}

fun getMenus(categoryNumber: Int): Deferred<List<Menu>> {
	GlobalScope.launch {
		repeat(4) {
			println("메뉴 불러오는중...")
			delay(500)
		}
	}

	return CoroutineScope(Dispatchers.IO).async {
		delay(2000)
		when (categoryNumber) {
			1 -> {
				val typeToken = object : TypeToken<List<Burger>>() {}.type
				Gson().fromJson(Burger.BURGERSDATA, typeToken)
			}

			2 -> {
				val typeToken = object : TypeToken<List<Drink>>() {}.type
				Gson().fromJson(Drink.DRINKSDATA, typeToken)
			}

			else -> listOf()
		}
	}
}