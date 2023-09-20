package com.example.project3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class StartFragment : Fragment() {

    private lateinit var tvQuestionCount: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_start, container, false)

        tvQuestionCount = view.findViewById(R.id.tv_question_count)
        val btnDecrease: Button = view.findViewById(R.id.btn_decrease)
        val btnIncrease: Button = view.findViewById(R.id.btn_increase)

        btnDecrease.setOnClickListener { decreaseQuestionCount() }
        btnIncrease.setOnClickListener { increaseQuestionCount() }

        return view
    }

    private fun decreaseQuestionCount() {
        val count = tvQuestionCount.text.toString().toInt()
        if (count > 1) {
            tvQuestionCount.text = (count - 1).toString()
        }
    }

    private fun increaseQuestionCount() {
        val count = tvQuestionCount.text.toString().toInt()
        tvQuestionCount.text = (count + 1).toString()
    }
}
