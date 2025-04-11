package model

data class Task(
    val id: Int = 0,
    val title: String,
    val description: String
) {
    // Bạn có thể thêm hàm, ví dụ để mô tả ngắn về task.
    fun getSummary(): String {
        return "$title: $description"
    }
}
