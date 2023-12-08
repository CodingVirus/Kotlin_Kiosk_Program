package com.example.kiosk

fun main(){
    println("[SHAKESHACK MENU]\n")
    println("1. Burgers        | 앵거스 비프 통살을 다져만든 버거\n")
    println("2. Frozen Custard | 매장에서 신선하게 만드는 아이스크림\n")
    println("3. Drinks         | 매장에서 직접 만드는 음료\n")
    println("4. Beer           | 뉴욕 브루클린 브루어리에서 양조한 맥주\n")
    println("0. 종료           | 프로그램 종료\n")
    var num = readLine()!!.toInt()
    println("${num}")
    if(num == 1){
        burgers()
    }
    else if(num == 2){
        Frozen()
    }
    else if(num == 3){
        Drinks()
    }
    else if (num == 4){
        Beer()
    }
    else if (num == 0){
        println("프로그램을 종료합니다.")
    }
    else{
        println("숫자를 다시 입력해주세요.")
        main()
    }

}

fun burgers(){

    println("[Burgers MENU]\n")
    println("1. ShackBurger    | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거\n")
    println("2. SmokeShack     | W 6.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거\n")
    println("3. Shroom Burger  | W 6.9 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거\n")
    println("4. Cheese Burger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거\n")
    println("5. HamBurger      | W 6.9 | 비프패티를 기반으로 야채가 들어간 기본버거\n")
    println("0. 뒤로가기        | 뒤로가기\n")
    var bgNum = readLine()!!.toInt()
    println("${bgNum}")
    if(bgNum == 0){
        main()
    }
}

fun Frozen(){
    println("[Custard MENU]\n")
    println("1. Shakes             | W 5.9 | 바닐라, 초콜렛, 솔티드 캬라멜, 블랙 & 화이트, 스트로베리, 피넛버터, 커피\n")
    println("2. Shake of the Week  | W 6.5 | 특별한 커스터드 플레이버\n")
    println("3. Red Bean Shake     | W 6.5 | 신선한 커스터드와 함께 우유와 레드빈이 블렌딩 된 시즈널 쉐이크\n")
    println("4. Floats             | W 5.9 | 루트 비어, 퍼플 카우, 크림시클\n")
    println("5. Cup & Cone         | W 4.9 | 바닐라, 초콜렛, Flavor of the Week\n")
    println("6. Shack Attack       | W 6.2 | 진한 초콜릿 커스터드에 퍼지 소스와 세 가지 초콜릿 토핑\n")
    println("0. 뒤로가기            | 뒤로가기\n")
    var fnum = readLine()!!.toInt()
    println("${fnum}")
    if(fnum == 0){
        main()
    }
}

fun Drinks(){
    println("[Drinks MENU]\n")
    println("1. Shack-made Lemonade   | W 3.9 | 매장에서 직접 만드는 상큼한 레몬에이드\n")
    println("2. Fresh Brewed Iced Tea | W 3.4 | 직접 유기농 홍차를 우려낸 아이스티\n")
    println("3. Fifty/Fifty           | W 3.5 | 레몬에이드와 아이스티의 만남\n")
    println("4. Fountain Soda         | W 2.7 | 코카콜라, 코카콜라 제로, 스프라이트, 환타(오렌지/그레이프)\n")
    println("5. Abita Root Beer       | W 4.4 | 청량감 있는 독특한 미국식 무알콜 탄산음료\n")
    println("6. Bottled Water         | W 1.0 | 지리산 암반대수층으로 만든 프리미엄 생수\n")
    println("0. 뒤로가기               | 뒤로가기\n")
    var drnum = readLine()!!.toInt()
    println("${drnum}")
    if(drnum == 0){
        main()
    }
}

fun Beer(){
    println("1. ShackMeister Ale   | W 9.8 | 뉴욕 브루클린 브루어리에서 특별히 양조한 에일 맥주\n")
    println("2. Magpie Brewing Co. | W 6.8 | pale Ale, Draft\n")
    println("0. 뒤로가기            | 뒤로가기\n")

    var benum = readLine()!!.toInt()
    println("${benum}")
    if(benum == 0){
        main()
    }

}