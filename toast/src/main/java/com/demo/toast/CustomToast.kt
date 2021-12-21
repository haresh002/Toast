package com.demo.toast

import android.content.Context
import android.widget.Toast

class CustomToast {

    companion object{

        fun plus(a:Int,b:Int):Int
        {
            return a+b;
        }

        fun showToast(context:Context,str:String)
        {
            Toast.makeText(context,str,Toast.LENGTH_SHORT).show();
        }
    }
}