package com.example.finalproject

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.finalproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    } // end of onCreate
// ************************ end of onCreate method ************************

    fun calculate (view: View) {
        // Variables needed to do the calculation
        val yearlySalary = binding.annualSalary.text
        val creditCard = binding.creditCardInput.text
        val studentLoan = binding.studentLoanInput.text
        val carLoan = binding.carLoanInput.text
        val personalLoan = binding.personalLoanInput.text
        val recurringDebt = binding.recurringPaymentsInput.text
        val totalCalc = creditCard.toString().toDouble() + studentLoan.toString().toDouble() +
                carLoan.toString().toDouble() + personalLoan.toString().toDouble() + recurringDebt.toString().toDouble()
        val total =  100 * ((totalCalc * 12) / (yearlySalary.toString().toDouble()))
        val output =  "Your Debt to Income Ratio is " + total.toString() + "%"

        var intent = Intent(this, MainActivity2::class.java)

        intent.putExtra("total", output.toString())
        startActivity(intent)
    } // end of calculate

    fun helpScreen (view: View) {


        var intent1 = Intent(this, helpActivity::class.java)


        startActivity(intent1)
    } // end of helpScreen

    fun settingsScreen (view: View) {
        val sMessage = "No settings yet"

        var intent2 = Intent(this, settingsActivity::class.java)
        intent2.putExtra("message2",sMessage.toString())
        startActivity(intent2)
    } // end of settingsScreen

}