class Task(
        var name: String ="",
        var completed: Boolean = false
)
        {
            fun completeTask(){
                completed = true
            }
            fun discompleteTasl(){
                completed = false
            }
        }