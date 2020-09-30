package com.company.p1multicontador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.company.p1multicontador.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    int contadorTotal;
    int contador1;
    int contador2;
    int contador3;
    int contador4;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.suma1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador1++;
                contadorTotal++;
                binding.contador1.setText(String.valueOf(contador1));
                binding.contadorGeneral.setText(String.valueOf(contadorTotal));
            }
        });

        binding.suma2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador2++;
                contadorTotal++;
                binding.contador2.setText(String.valueOf(contador2));
                binding.contadorGeneral.setText(String.valueOf(contadorTotal));
            }
        });

        binding.suma3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador3++;
                contadorTotal++;
                binding.contador3.setText(String.valueOf(contador3));
                binding.contadorGeneral.setText(String.valueOf(contadorTotal));
            }
        });

        binding.suma4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador4++;
                contadorTotal++;
                binding.contador4.setText(String.valueOf(contador4));
                binding.contadorGeneral.setText(String.valueOf(contadorTotal));
            }
        });

        binding.resetTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contadorTotal = 0;
                contador1 = 0;
                contador2 = 0;
                contador3 = 0;
                contador4 = 0;
                binding.contadorGeneral.setText(String.valueOf(contadorTotal));
                binding.contador1.setText(String.valueOf(contador1));
                binding.contador2.setText(String.valueOf(contador2));
                binding.contador3.setText(String.valueOf(contador3));
                binding.contador4.setText(String.valueOf(contador4));
            }
        });

        binding.reset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contadorTotal = contadorTotal - contador1;
                contador1 = 0;
                binding.contador1.setText(String.valueOf(contador1));
                binding.contadorGeneral.setText(String.valueOf(contadorTotal));
            }
        });

        binding.reset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contadorTotal = contadorTotal - contador2;
                contador2 = 0;
                binding.contador2.setText(String.valueOf(contador2));
                binding.contadorGeneral.setText(String.valueOf(contadorTotal));
            }
        });

        binding.reset3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contadorTotal = contadorTotal - contador3;
                contador3 = 0;
                binding.contador3.setText(String.valueOf(contador3));
                binding.contadorGeneral.setText(String.valueOf(contadorTotal));
            }
        });

        binding.reset4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contadorTotal = contadorTotal - contador4;
                contador4 = 0;
                binding.contador4.setText(String.valueOf(contador4));
                binding.contadorGeneral.setText(String.valueOf(contadorTotal));
            }
        });

    }
}