package com.example.mvvmpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.example.mvvmpractice.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        //데이터가 변경되면 감지해서 리프레쉬 해줌줌
       binding.setLifecycleOwner(this);

        MainViewModel viewModel = new ViewModelProvider(this).get(MainViewModel.class);

        binding.setViewModel(viewModel);
    }
}
