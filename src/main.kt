import com.sun.tools.javac.Main

//Rodrigo Garoz 18102

val mainList: ArrayList<Listas> = ArrayList()
var wantsToContinue: Boolean = true
var ingreso: String = ""
var ingreso2: String = ""
var newListName: String = ""
var newTaskName: String = ""
var selectOption: Int = 0
var printCounter: Int = 1
var presentList: Listas = mainList[selectOption - 1]
//var

fun menu1():String{
    return """
        Menu:
        1. Crear lista de tareas
        2.Salir
        Qué desea hacer?
    """.trimIndent()
}

fun menu2():String{
    return """Menu:
        |1. Crear lista de tareas
        |2. Ver todas las listas de tareas
        |3. Seleccionar una lista de tareas
        |4. Salir
        |Qué desea hacer?
    """.trimMargin()
}

fun menu3(nameTask: Listas):String{
    return """Menu:
        |1. Deseleccionar ${nameTask.name}
        |2. Agregar una tarea
        |3. Completar una tarea
        |4. Ver todas las tareas en esta lista
        |5. Salir
    """.trimMargin()
}

fun main(args: Array<String>){
    do {
        if (mainList.count() == 0){
            println(menu1())
            ingreso = readLine()!!
            when(ingreso){
                "1" -> {
                    println("Qué nombre desea darle a su nueva lista?")
                    newListName = readLine()!!
                    var newTaskList: ArrayList<Task> = ArrayList()
                    var newList = Listas(
                            name = newListName,
                            tasks = newTaskList
                    )
                    mainList.add(newList)
                }
                "2" -> {
                    wantsToContinue = false
                }
            }
        }
        else{
            println(menu2())
            ingreso = readLine()!!
            when(ingreso){
                "1" -> {
                    println("Qué nombre desea darle a su nueva lista?")
                    newListName = readLine()!!
                    var newTaskList: ArrayList<Task> = ArrayList()
                    var newList = Listas(
                            name = newListName,
                            tasks = newTaskList
                    )
                    mainList.add(newList)
                }
                //regresar a hacer bonito
                "2" -> {
                    for (i in mainList) {
                        println("${printCounter} ${i.name}")
                        printCounter += 1
                    }
                    printCounter = 1
                }
                "3" ->{
                    for (i in mainList) {
                        println("${printCounter} ${i.name}")
                        printCounter += 1
                    }
                    printCounter = 1
                    println("Qué lista desea seleccionar?")
                    selectOption = readLine()!!.toInt()
                    println("Eligió la opción $presentList")
                    println(menu3(presentList))
                    ingreso2 = readLine()!!
                    when(ingreso2){
                        "1" ->{
                        }
                        "2" ->{
                            println("Qué nombre desea dar a la nueva tarea?")
                            newTaskName = readLine()!!
                            var newTask:Task = Task(
                                    name = newTaskName
                            )
                            presentList.addTask(newTask)
                            println("Tarea agredada")
                        }
                        "3" ->{
                            for (i in presentList.tasks) {
                                println("$printCounter ${i.name}")
                                printCounter += 1
                            }
                            printCounter = 1
                            println("Ingrese el número de la tarea a completar")

                        }
                    }
                }
                "4" ->{
                    wantsToContinue = false
                }
            }
        }
    }while (wantsToContinue)
}