package com.shivam.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import net.objecthunter.exp4j.ExpressionBuilder



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }





    fun fun0(view: View) { textNum.append("0") }
    fun fun1(view: View) { textNum.append("1") }
    fun fun2(view: View) { textNum.append("2") }
    fun fun3(view: View) { textNum.append("3") }
    fun fun4(view: View) { textNum.append("4") }
    fun fun5(view: View) { textNum.append("5") }
    fun fun6(view: View) { textNum.append("6") }
    fun fun7(view: View) { textNum.append("7") }
    fun fun8(view: View) { textNum.append("8") }
    fun fun9(view: View) { textNum.append("9") }
    fun funDot(view: View) { textNum.append(".") }

    fun funClear(view: View) {
        textNum.text=""
        textRes.text=""
    }
    fun funBackSpace(view: View) { textNum.toString().substring(0,textNum.toString().length-1) }

    fun funSub(view: View) { textNum.append("-") }
    fun funAdd(view: View) { textNum.append("+") }
    fun funDivide(view: View) { textNum.append("/") }
    fun funMultiply(view: View) { textNum.append("*") }
    fun funPercent(view: View) { textNum.append("%") }
    fun funEquals(view: View) {
        val text = textNum.text.toString() //to string
        val eval = ExpressionBuilder(text).build()
        val res =eval.evaluate()
        textRes.text = res.toString()
    }
}