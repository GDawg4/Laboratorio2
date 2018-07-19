class Task(
        var name: String ="",
        var completed: Boolean = false
)
        {
            fun completeTask(){
                completed = !completed
            }

            override fun toString(): String {
                return """$name (${if (completed){"completada)"}else{"no completada)"
                }}"""
            }
        }