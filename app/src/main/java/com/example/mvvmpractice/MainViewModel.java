package com.example.mvvmpractice;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    // MutableLiveData는 값의 변동이 있을때, LiveData는 그냥 단순히 set만 해서 변동이 없는경우 사용
    public MutableLiveData<Integer> counter = new MutableLiveData<>();

    public MainViewModel() {
        counter.setValue(0);
    }
    public void increase() {
        counter.setValue(counter.getValue() + 1);
    }
    public void decrease() {
        counter.setValue(counter.getValue() - 1);
    }
}
