package com.example.myapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;

import android.widget.Toast;

import com.example.myapplication.databinding.ActivitySubscriptoinBinding;


public class SubscriptoinActivity extends AppCompatActivity {

    ActivitySubscriptoinBinding binding;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySubscriptoinBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();




                binding.constraintLayoutYearly.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (binding.checkbox1.isChecked()) {
                            binding.checkbox1.setChecked(false);
                            binding.backgroundYear.setVisibility(View.INVISIBLE);
                            binding.detailYearly.setVisibility(View.INVISIBLE);


                        } else {
                            binding.checkbox1.setChecked(true);
                            binding.backgroundYear.setVisibility(View.VISIBLE);
                            binding.detailYearly.setVisibility(View.VISIBLE);
                            binding.detailMonthly.setVisibility(View.INVISIBLE);
                            binding.detailWeekly.setVisibility(View.INVISIBLE);

                            binding.backgroundMonthly.setVisibility(View.INVISIBLE);
                            binding.checkbox2.setChecked(false);

                            binding.backgroundweekly.setVisibility(View.INVISIBLE);
                            binding.checkbox3.setChecked(false);


                        }


                    }
                });


                binding.constraintLayoutMonthly.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (binding.checkbox2.isChecked()) {
                            binding.checkbox2
                                    .setChecked(false);
                            binding.backgroundMonthly.setVisibility(View.INVISIBLE);
                            binding.detailMonthly.setVisibility(View.INVISIBLE);

                        } else {
                            binding.checkbox2.setChecked(true);
                            binding.backgroundMonthly.setVisibility(View.VISIBLE);
                            binding.detailMonthly.setVisibility(View.VISIBLE);
                            binding.detailYearly.setVisibility(View.INVISIBLE);
                            binding.detailWeekly.setVisibility(View.INVISIBLE);


                            binding.backgroundYear.setVisibility(View.INVISIBLE);
                            binding.checkbox1.setChecked(false);

                            binding.backgroundweekly.setVisibility(View.INVISIBLE);
                            binding.checkbox3.setChecked(false);
                        }

                    }
                });


                binding.constraintLayoutweekly.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (binding.checkbox3.isChecked()) {
                            binding.checkbox3.setChecked(false);
                            binding.backgroundweekly.setVisibility(View.INVISIBLE);
                            binding.detailWeekly.setVisibility(View.INVISIBLE);

                        } else {
                            binding.checkbox3.setChecked(true);
                            binding.backgroundweekly.setVisibility(View.VISIBLE);
                            binding.detailWeekly.setVisibility(View.VISIBLE);

                            binding.detailMonthly.setVisibility(View.INVISIBLE);
                            binding.detailYearly.setVisibility(View.INVISIBLE);
                            binding.backgroundMonthly.setVisibility(View.INVISIBLE);
                            binding.checkbox2.setChecked(false);

                            binding.backgroundYear.setVisibility(View.INVISIBLE);
                            binding.checkbox1.setChecked(false);
                        }

                    }
                });







                binding.btnSubscribe.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(SubscriptoinActivity.this, "you have subscribe the package", Toast.LENGTH_SHORT).show();
                    }
                });



        }




    public void ChechkBoxYear(View view) {
        if (binding.checkbox1.isChecked()) {

            binding.checkbox1.setChecked(true);
            binding.backgroundYear.setVisibility(View.VISIBLE);
            binding.detailYearly.setVisibility(View.VISIBLE);
            binding.detailMonthly.setVisibility(View.INVISIBLE);
            binding.detailWeekly.setVisibility(View.INVISIBLE);

            binding.backgroundMonthly.setVisibility(View.INVISIBLE);
            binding.checkbox2.setChecked(false);

            binding.backgroundweekly.setVisibility(View.INVISIBLE);
            binding.checkbox3.setChecked(false);


        } else {
            binding.checkbox1.setChecked(false);
            binding.backgroundYear.setVisibility(View.INVISIBLE);
            binding.detailYearly.setVisibility(View.INVISIBLE);

            binding.detailMonthly.setVisibility(View.INVISIBLE);
            binding.detailWeekly.setVisibility(View.INVISIBLE);

            binding.backgroundMonthly.setVisibility(View.INVISIBLE);
            binding.checkbox2.setChecked(false);

            binding.backgroundweekly.setVisibility(View.INVISIBLE);
            binding.checkbox3.setChecked(false);
            ;

        }
    }

    public void CheckBoxMonthly(View view) {

        if (binding.checkbox2.isChecked()) {

            binding.checkbox2.setChecked(true);
            binding.backgroundMonthly.setVisibility(View.VISIBLE);
            binding.detailMonthly.setVisibility(View.VISIBLE);

            binding.detailWeekly.setVisibility(View.INVISIBLE);
            binding.backgroundYear.setVisibility(View.INVISIBLE);
            binding.checkbox1.setChecked(false);
            binding.backgroundweekly.setVisibility(View.INVISIBLE);
            binding.checkbox3.setChecked(false);


        } else {
            binding.checkbox2.setChecked(false);
            binding.backgroundMonthly.setVisibility(View.INVISIBLE);
            binding.detailMonthly.setVisibility(View.INVISIBLE);
            binding.detailYearly.setVisibility(View.INVISIBLE);
            binding.detailWeekly.setVisibility(View.INVISIBLE);


            binding.backgroundYear.setVisibility(View.INVISIBLE);
            binding.checkbox1.setChecked(false);

            binding.backgroundweekly.setVisibility(View.INVISIBLE);
            binding.checkbox3.setChecked(false);

        }
    }

    public void ChechkBoxWeekly(View view) {

        if (binding.checkbox3.isChecked()) {

            binding.checkbox3.setChecked(true);
            binding.backgroundweekly.setVisibility(View.VISIBLE);
            binding.detailWeekly.setVisibility(View.VISIBLE);

            binding.detailMonthly.setVisibility(View.INVISIBLE);
            binding.detailYearly.setVisibility(View.INVISIBLE);
            binding.backgroundMonthly.setVisibility(View.INVISIBLE);
            binding.checkbox2.setChecked(false);

            binding.backgroundYear.setVisibility(View.INVISIBLE);
            binding.checkbox1.setChecked(false);
        } else {


            binding.checkbox3.setChecked(false);
            binding.backgroundweekly.setVisibility(View.INVISIBLE);
            binding.detailWeekly.setVisibility(View.INVISIBLE);

            binding.detailMonthly.setVisibility(View.INVISIBLE);
            binding.detailYearly.setVisibility(View.INVISIBLE);
            binding.backgroundMonthly.setVisibility(View.INVISIBLE);
            binding.checkbox2.setChecked(false);

            binding.backgroundYear.setVisibility(View.INVISIBLE);
            binding.checkbox1.setChecked(false);
        }
    }
}