package navigationcomponentturtorialcom.example.mvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import navigationcomponentturtorialcom.example.mvvm.R
import navigationcomponentturtorialcom.example.mvvm.viewmodel.NumberViewModel

class MainActivity : AppCompatActivity() {
    lateinit var viewModel: NumberViewModel
    lateinit var tvNumber: TextView
    lateinit var btnAdd: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvNumber = findViewById(R.id.tvNumber)
        btnAdd = findViewById(R.id.btnAdd)
        viewModel = ViewModelProvider(this).get(NumberViewModel::class.java)

        viewModel.currentNumber.observe(this, Observer {
            tvNumber.text = it.toString()
        })

        btnAdd.setOnClickListener{
            viewModel.updateNumber()
        }

    }
}