package sprint_1.task_08

class Product(
    val id: Int,
    val name: String,
    val category: Category
) {

    override fun equals(other: Any?): Boolean {
        if(other !is Product) {
            return false
        }
        return other.id == id
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }
}