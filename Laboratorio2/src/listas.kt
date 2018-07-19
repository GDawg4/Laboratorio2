class Listas(
        var name: String = "",
        val tasks: ArrayList<Task> = ArrayList()
){
    fun addTask(newTask: Task){
        tasks.add(newTask)
    }

    override fun toString(): String {
        return name
    }
}