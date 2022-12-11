package com.example.assessment2app1isidalkentcarino

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_home_page.*

class HomePage : AppCompatActivity() {

    val dropdownlist1= arrayOf("Apple", "Pen", "Pen-Pineapple")
    val dropdownlist2= arrayOf("Pineapple", "Pen", "Apple-Pen")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        val adapter=ArrayAdapter(this, android.R.layout.simple_spinner_item, dropdownlist1)
        val adapter2=ArrayAdapter(this, android.R.layout.simple_spinner_item, dropdownlist2)


        var b1=findViewById(R.id.button) as Button


        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_item)


        elements1.adapter=adapter
        elements1.onItemSelectedListener=object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
            override fun onItemSelected(parent: AdapterView<*>?,view: View?,position: Int,id: Long)
            {
                if(elements1.selectedItemPosition==0)
                {
                    textView.setText(" " + elements1.selectedItem)

                }
                if(elements1.selectedItemPosition==1)
                {
                    textView.setText(" " + elements1.selectedItem)

                }
            }
        }

        elements2.adapter=adapter2
        elements2.onItemSelectedListener=object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
            override fun onItemSelected(parent: AdapterView<*>?,view: View?,position: Int,id: Long)
            {
                if(elements2.selectedItemPosition==0)
                {
                    textView2.setText(" " + elements2.selectedItem)

                }
                if(elements2.selectedItemPosition==1)
                {
                    textView2.setText(" " + elements2.selectedItem)

                }
            }
        }

        b1.setOnClickListener{
            if(elements1.selectedItemPosition==0 && elements2.selectedItemPosition==0)
            {
                textView3.setText("Apple-Pineapple")
            }
            if(elements1.selectedItemPosition==0 && elements2.selectedItemPosition==1)
            {
                textView3.setText("Apple-Pen")
            }
            if(elements1.selectedItemPosition==0 && elements2.selectedItemPosition==2)
            {
                textView3.setText("Apple-Apple-Pen")
            }
            if(elements1.selectedItemPosition==1 && elements2.selectedItemPosition==0)
            {
                textView3.setText("Pen-Pineapple")
            }
            if(elements1.selectedItemPosition==1 && elements2.selectedItemPosition==1)
            {
                textView3.setText("Long Pen")
            }
            if(elements1.selectedItemPosition==1 && elements2.selectedItemPosition==2)
            {
                textView3.setText("Pen-Apple-Pen")
            }
            if(elements1.selectedItemPosition==2 && elements2.selectedItemPosition==0)
            {
                textView3.setText("Apple-Pen-Apple")
            }
            if(elements1.selectedItemPosition==2 && elements2.selectedItemPosition==1)
            {
                textView3.setText("Apple-Pen-Pen")
            }
            if(elements1.selectedItemPosition==2 && elements2.selectedItemPosition==2)
            {
                textView3.setText("Pen-Pineapple-Apple-Pen")
            }

        }
    }
}