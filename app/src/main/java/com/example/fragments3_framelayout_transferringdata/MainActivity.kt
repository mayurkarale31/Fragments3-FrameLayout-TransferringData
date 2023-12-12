package com.example.fragments3_framelayout_transferringdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var questionFragment: QuestionFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initViews()

        questionFragment = supportFragmentManager.findFragmentById(R.id.questionFragment) as QuestionFragment
    }

    fun setSelectedOption(selectedOption : String){
        questionFragment.selectedOption = selectedOption
    }
    private fun initViews(){
        setContentView(R.layout.activity_main)
    }
}