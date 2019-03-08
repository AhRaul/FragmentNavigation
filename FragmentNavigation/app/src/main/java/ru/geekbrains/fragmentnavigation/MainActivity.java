package ru.geekbrains.fragmentnavigation;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements MainNavigator {

    private MainFragment   mainFragment;
    private SecondFragment secondFragment;
    private ThridFragment thirdFargment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainFragment   = new MainFragment();
        secondFragment = new SecondFragment();
        thirdFargment = new ThridFragment();

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        // добавить фрагмент
        fragmentTransaction.add(R.id.fragment_container, mainFragment);
        // закрыть транзакцию
        fragmentTransaction.commit();
    }

    @Override
    public void startSecondFragment(String shape) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.remove(mainFragment);

        // добавить фрагмент
        fragmentTransaction.add(R.id.fragment_container, secondFragment);
        fragmentTransaction.addToBackStack("");

        // закрыть транзакцию
        fragmentTransaction.commit();

        secondFragment.setShape(shape);
    }

    @Override
    public void startThirdFragment(String shape) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.remove(mainFragment);

        // добавить фрагмент
        fragmentTransaction.add(R.id.fragment_container, thirdFargment);
        fragmentTransaction.addToBackStack("");

        // закрыть транзакцию
        fragmentTransaction.commit();

        thirdFargment.setShape(shape);
    }
}
