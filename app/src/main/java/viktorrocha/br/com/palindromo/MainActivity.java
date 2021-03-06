package viktorrocha.br.com.palindromo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import viktorrocha.br.com.palindromo.domain.Palindromo;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



        @Override
        protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btVerificar = (Button) findViewById(R.id.bt_verificar);
        btVerificar.setOnClickListener((View.OnClickListener) this);
    }

        @Override
        public void onClick (View view){
        EditText etPalindromo = (EditText) findViewById(R.id.et_palindromo);
        TextView tvResposta = (TextView) findViewById(R.id.tv_resposta);
            Palindromo palindromo = new Palindromo(etPalindromo.getText().toString());
            String resposta;

            if (palindromo.ehPalindromo()){
                resposta = "É um palindromo";
            } else {
                resposta = "NÃO é um palindromo";
            }
            resposta = palindromo.getConteudo()+resposta;
            tvResposta.setText(resposta);

        }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}


