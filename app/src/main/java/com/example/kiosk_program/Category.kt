package com.example.kiosk_program

data class Category(
	val id: Int,
	val categoryName: String,
	val desc: String
) {

	// 외부 서버에서 json 형식의 데이터를 받아온다고 가정
	companion object {
		const val CATEGORIESDATA =
			"[{\"id\":1,\"categoryName\":\"Burgers\",\"desc\":\"앵거스 비프 통살을 다져만든 버거\"},{\"id\":2,\"categoryName\":\"Drinks\",\"desc\":\"매장에서 직접 만드는 음료\"}]"
	}
}