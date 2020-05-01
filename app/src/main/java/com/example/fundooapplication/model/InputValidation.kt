package com.example.fundooapplication.model

import android.app.Activity
import android.content.Context
import android.util.Patterns
import android.view.View
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import com.google.android.material.textfield.TextInputLayout


class InputValidation {

    private var context: Context? = null

    // function for Inputvalidation
    fun InputValidation(context: Context?) {
        this.context = context
    }

    //function if edittext is filled or not
    fun isInputEditTextFilled(editText: EditText, textInputLayout: TextInputLayout, message: String?): Boolean {
        val value = editText.text.toString().trim { it <= ' ' }
        if (value.isEmpty()) {
            textInputLayout.error = message
            hideKeyboardFrom(editText)
            return false
        } else {
            textInputLayout.isErrorEnabled = false
        }
        return true
    }

    // function for input in  edittext for  email
    fun isInputEditTextEmail(editText: EditText, textInputLayout: TextInputLayout, message: String?): Boolean {
        val value = editText.text.toString().trim { it <= ' ' }
        if (value.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(value).matches()) {
            textInputLayout.error = message
            hideKeyboardFrom(editText)
            return false
        } else {
            textInputLayout.isErrorEnabled = false
        }
        return true
    }
    // function if input in edittext matches or not
    fun isInputEditTextMatches(editText1: EditText, editText2: EditText, textInputLayout: TextInputLayout, message: String?): Boolean {
        val value1 = editText1.text.toString().trim { it <= ' ' }
        val value2 = editText2.text.toString().trim { it <= ' ' }
        if (!value1.contentEquals(value2)) {
            textInputLayout.error = message
            hideKeyboardFrom(editText2)
            return false
        } else {
            textInputLayout.isErrorEnabled = false
        }
        return true
    }


    private fun hideKeyboardFrom(view: View) {
        val imm: InputMethodManager =
            context?.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(
            view.getWindowToken(),
            WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN
        )
    }
}