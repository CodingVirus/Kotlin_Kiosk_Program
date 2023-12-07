package com.example.kiosk_program

fun main() {
    var drinkList = ArrayList<Drink>()
    drinkList.add(CaffeAmericano())
    drinkList.add(CafeLatte())
    drinkList.add(CaffeMocha())

    var foodList = ArrayList<Food>()
    foodList.add(BaconCheeseToast())
    foodList.add(ClassicScone())

    var test = KioskControl()
    test.drinkList = drinkList
    test.foodList = foodList
    test.Start()
    //Start()
}

