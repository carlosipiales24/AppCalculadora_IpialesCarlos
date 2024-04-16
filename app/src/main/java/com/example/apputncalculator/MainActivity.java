package com.example.apputncalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView lblResultado;
    EditText txtNumero1;
    EditText txtNumero2;
    Button btnSuma;
    Button btnResta;
    Button btnMultiplicacion;
    Button btnDivision;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        txtNumero1=findViewById(R.id.txtNumero1);
        txtNumero2=findViewById(R.id.txtNumero2);
        btnSuma=findViewById(R.id.btnSuma);
        btnResta=findViewById(R.id.btnResta);
        btnMultiplicacion=findViewById(R.id.btnMultiplicacion);
        btnDivision=findViewById(R.id.btnDivision);
        lblResultado=findViewById(R.id.lblResultado);

    }

    public void suma(View v){
    int num1=Integer.parseInt(txtNumero1.getText().toString());
    int num2=Integer.parseInt(txtNumero2.getText().toString());
    int resultado=num1+num2;
    lblResultado.setText(String.valueOf(resultado));
    }
    public void resta(View v){
        int num1=Integer.parseInt(txtNumero1.getText().toString());
        int num2=Integer.parseInt(txtNumero2.getText().toString());
        int resultado=num1-num2;
        lblResultado.setText(String.valueOf(resultado));
    }
    public void multiplicacion(View v){
        int num1=Integer.parseInt(txtNumero1.getText().toString());
        int num2=Integer.parseInt(txtNumero2.getText().toString());
        int resultado=num1*num2;
        lblResultado.setText(String.valueOf(resultado));
    }

    public void division(View v){
        int num1=Integer.parseInt(txtNumero1.getText().toString());
        int num2=Integer.parseInt(txtNumero2.getText().toString());
        if(num2==0) {
            lblResultado.setText("Indefinido");
        } else {
            int resultado=num1/num2;
            lblResultado.setText(String.valueOf(resultado));
        }

    }
}