package espol.edu.ec.amst_l1_Bodero_espolservicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnsidweb;
    Button btnacademco;
    Button btnubeb;
    Button btnbvinculos;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsidweb = findViewById(R.id.btnSidweb);
        btnsidweb.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(getApplicationContext(),sidweb.class);
                startActivity(intent);
            }
        });

        btnacademco = findViewById(R.id.btnAcademico);
        btnacademco.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(getApplicationContext(),academico.class);
                startActivity(intent);
            }
        });

        btnubeb = findViewById(R.id.btnUbeb);
        btnubeb.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(getApplicationContext(),ubeb.class);
                startActivity(intent);
            }
        });

        btnbvinculos = findViewById(R.id.btnViculos);
        btnbvinculos.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(getApplicationContext(),vinculos.class);
                startActivity(intent);
            }
        });

    }
}
