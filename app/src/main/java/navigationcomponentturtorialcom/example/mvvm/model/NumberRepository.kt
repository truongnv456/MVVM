package navigationcomponentturtorialcom.example.mvvm.model

class NumberRepository {
    private lateinit var number: Number

    init {
        number = Number()
    }

    fun getNumber(): Int {
        return number.value
    }

    fun updateNumber(value: Int) {
        number.value = value
    }
}