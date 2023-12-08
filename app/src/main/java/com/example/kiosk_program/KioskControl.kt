package com.example.kiosk_program

class KioskControl {

    var drinkList = ArrayList<Drink>()
    var foodList = ArrayList<Food>()

    fun Start() {
        println("*****별다방에 오신것을 환영합니다.*****")
        println("메뉴를 선택 하세요.\n")
        println("[별다방 메뉴]")
        println("1.음료")
        println("2.푸드")
        println("0.종료")
        print(": ")
        var input = readLine()!!.toInt()

        when(input) {
            1 -> DrinkMenu(drinkList)
            2 -> FoodMenu(foodList)
        }
    }
    fun DrinkMenu(list:ArrayList<Drink>) {
        println()
        if (list.size == 0) println("음료가 준비되지 않았습니다.")
        else {
            println("[음료 메뉴]")
            for (i in list.indices) {
                println("${i + 1}.${list[i].name}  |W ${list[i].price}| ${list[i].explain}")
            }
            println("0.뒤로 가기")
            print(": ")
            var input = readLine()!!.toInt()
            when (input) {
                0 -> Start()
                1 -> println("${list[0].name}를 주문하였습니다.")
                2 -> println("${list[1].name}를 주문하였습니다.")
                3 -> println("${list[2].name}를 주문하였습니다.")
            }
        }
    }

    fun FoodMenu(list:ArrayList<Food>) {
        println()
        if (list.size == 0) println("식품이 준비되지 않았습니다.")
        else {
            println("[식품 메뉴]")
            for (i in list.indices) {
                println("${i + 1}.${list[i].name}   |W ${list[i].price}| ${list[i].explain}")
            }
            println("0.뒤로 가기")
            print(": ")
            var input = readLine()!!.toInt()
            when (input) {
                0 -> Start()
                1 -> println("${list[0].name}를 주문하였습니다.")
                2 -> println("${list[1].name}를 주문하였습니다.")
            }
        }
    }
}