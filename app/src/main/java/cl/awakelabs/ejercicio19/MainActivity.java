package cl.awakelabs.ejercicio19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import cl.awakelabs.ejercicio19.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //construccion del modelo

    }
}