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





    fun fun0(view: View) { textNum.text=textNum.text.toString()+"0" }
    fun fun1(view: View) { textNum.text=textNum.text.toString()+"1" }
    fun fun2(view: View) { textNum.text=textNum.text.toString()+"2" }
    fun fun3(view: View) { textNum.text=textNum.text.toString()+"3" }
    fun fun4(view: View) { textNum.text=textNum.text.toString()+"4" }
    fun fun5(view: View) { textNum.text=textNum.text.toString()+"5" }
    fun fun6(view: View) { textNum.text=textNum.text.toString()+"6" }
    fun fun7(view: View) { textNum.text=textNum.text.toString()+"7" }
    fun fun8(view: View) { textNum.text=textNum.text.toString()+"8" }
    fun fun9(view: View) { textNum.text=textNum.text.toString()+"9" }
    fun funDot(view: View) { textNum.text=textNum.text.toString()+"." }

    fun funClear(view: View) {
        textNum.text=""
        textRes.text=""
    }
    fun funBackSpace(view: View) {
        val text = textNum.text.toString()
        if(text.isNotEmpty()) {
            textNum.text = text.substring(0,text.length-1)
        }

    }

    fun funSub(view: View) { textNum.text=textNum.text.toString()+"-" }
    fun funAdd(view: View) { textNum.text=textNum.text.toString()+"+" }
    fun funDivide(view: View) { textNum.text=textNum.text.toString()+"/" }
    fun funMultiply(view: View) { textNum.text=textNum.text.toString()+"*" }
    fun funPercent(view: View) { textNum.text=textNum.text.toString()+"%" }
    fun funEquals(view: View) {
        val text = textNum.text.toString() //to string
        val eval = ExpressionBuilder(text).build()
        val res =eval.evaluate()
        textRes.text = res.toString()
    }
}