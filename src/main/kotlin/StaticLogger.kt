@Suppress("UNUSED_PARAMETER", "UseExpressionBody", "MemberVisibilityCanBePrivate")
class StaticLogger {
    object Instance
    {
        fun write(text: String) {
            throw Exception("Not working yet...!")
        }
    }


}
