package navigationcomponentturtorialcom.example.mvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import navigationcomponentturtorialcom.example.mvvm.model.Number
import navigationcomponentturtorialcom.example.mvvm.model.NumberRepository

class NumberViewModel: ViewModel() {
    private lateinit var numberRepository: NumberRepository

    init {
        numberRepository = NumberRepository()
    }
//    val numberRepository by lazy {
//        NumberRepository()
//    }

    val currentNumber: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }

    fun updateNumber() {
        var number = numberRepository.getNumber()
        number++
        currentNumber.value = number
        numberRepository.updateNumber(currentNumber.value!!)
    }
}