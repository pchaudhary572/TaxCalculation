package com.example.taxcalculation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText monthlySalary;
    private TextView anualSalary, taxAmount;
    private Button taxCal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        monthlySalary = findViewById(R.id.mSalary);
        anualSalary = findViewById(R.id.aSalaryID);
        taxAmount = findViewById(R.id.taxID);
        taxCal = findViewById(R.id.calID);

        taxCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Validate() == true) {
                    double mSalary;
                    mSalary = Float.parseFloat(monthlySalary.getText().toString());
                    TAX tax = new TAX(mSalary);
                    anualSalary.setText(Double.toString(tax.getAnualSalary()));
                    taxAmount.setText(Double.toString(tax.taxCalculate()));
                }
            }
        });
    }
    public Boolean Validate() {
        if (TextUtils.isEmpty(monthlySalary.getText())) {
            monthlySalary.requestFocus();
            monthlySalary.setError("Please Enter Monthly Salary");
            return false;
        }
        return true;
    }
}
