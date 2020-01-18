package ketank.bloodbank.Activity;

import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import com.astuetz.PagerSlidingTabStrip;

import ketank.bloodbank.Adapters.StockAdapter;
import ketank.bloodbank.R;

public class BankMainActivity extends AppCompatActivity {
    ViewPager viewPager;
    PagerSlidingTabStrip tabsStrip;
    FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_main);

        viewPager= (ViewPager) findViewById(R.id.viewpager);
        tabsStrip = (PagerSlidingTabStrip) findViewById(R.id.tabs);

        tabsStrip.setShouldExpand(true);

        StockAdapter adapter = new StockAdapter(getSupportFragmentManager());

        viewPager.setAdapter(adapter);

        tabsStrip.setViewPager(viewPager);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });








    }



}
