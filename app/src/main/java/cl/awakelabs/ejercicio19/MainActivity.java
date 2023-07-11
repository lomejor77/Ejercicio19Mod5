package cl.awakelabs.ejercicio19;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Toast;

import cl.awakelabs.ejercicio19.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements ViewPresenter{
    private ActivityMainBinding binding;
    private Presenter presentar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        presentar = new Presenter(this);
        binding.etPass.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2) {
                presentar.evalPass(s.toString());

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }
    @Override
    public void verDebil() {

        Toast.makeText(this, "Contraseña debil", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void verMedia() {
        binding.etPass.setBackgroundColor(Color.RED);
        Toast.makeText(this, "Contraseña Media", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void verFuerte() {
        Toast.makeText(this, "Contraseña Fuerte", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void mostrarError() {

    }
}