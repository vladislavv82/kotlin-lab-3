import java.util.*

fun main(){

    val Mark = Person(Fio("Mark  Mark"),15, "men", Passport("6020","384455"))

    val Jon  = Person(Fio("Jon Arbuckle"),30, "men", Passport("6017","834255"))

    val Alex = Person(Fio("Alex"),20, "men", Passport("6079","342795"),
        listOf(Duty("developer",3, 50000, "Руководитель проекта")).toMutableList()
    )
    println(Jon)

    println("Нажмите 1 что бы добавить обязанность")
    val scanner = Scanner(System.`in`)
    val x = scanner.nextInt()

    when (x){
        1 -> Jon.addDuty(Duty("Хозяин кота Гарфилда",3, 50000, "Любить, кормить и никогда не обижать"))
    }
    println("Добавили обязанность: $Jon")

    println("Нажмите 2 что бы удалить обязанность")
    val y = scanner.nextInt()
    when (y){
        2 -> Jon.deleteDuty("Хозяин кота Гарфилда")
    }
    println("Удалили обязанность: $Jon")
    println("Остальные работники: \n $Mark \n $Alex ")

    val sc = Scanner(System.`in`)
    println("Хотите добавить нового работника? \n 1 - da, 2 - net")
    val z = sc.nextInt()
    when (z){
        1 -> println("Добавление нового работника:")
        2 -> sc.close()
    }

    println("Введите ФИО")
    var FIO = sc.toString()
    println("Введите возраст")
    var AGE = sc.nextInt()
    println("Введите пол")
    var SEX = sc.toString()
    println("Введите серию паспорта (не более 4 цифр)")
    var SERIES  = sc.toString()
    println("Введите номер паспорта (не более 6 цифр)")
    var NUMBER  = sc.toString()

     val Person = Person(Fio(FIO),AGE,SEX,Passport(SERIES,NUMBER))
    println("Создан новый работник: \n $Person")
}