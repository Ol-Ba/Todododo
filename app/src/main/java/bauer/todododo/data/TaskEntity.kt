package bauer.todododo.data
import androidx.room.*
import java.time.LocalDate

@Entity(
    tableName = "tasks"
)
data class TaskEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val title: String,
    val taskCreationDate: LocalDate = LocalDate.now(),
    val isCompleted: Boolean = false
)
