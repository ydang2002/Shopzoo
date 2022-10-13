package com.android.shoppingzoo.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.shoppingzoo.Fragment.HomeFragment;
import com.android.shoppingzoo.Model.Utils;
import com.android.shoppingzoo.R;

public class SearchFiltersActivity extends AppCompatActivity implements View.OnClickListener {
    TextView clearFilters;
    LinearLayout categoryBaby, categoryKid, categoryMen, categoryWomen;
    LinearLayout brandNike, brandAddidas, brandLevis, brandJordan;
    LinearLayout sizeRegular, sizePlus, sizeJunior, sizeTall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_filters);
        Utils.statusBarColor(SearchFiltersActivity.this);

        initAll();

        clearFilters.setOnClickListener(this);

        categoryBaby.setOnClickListener(this);
        categoryKid.setOnClickListener(this);
        categoryMen.setOnClickListener(this);
        categoryWomen.setOnClickListener(this);

        brandNike.setOnClickListener(this);
        brandAddidas.setOnClickListener(this);
        brandLevis.setOnClickListener(this);
        brandJordan.setOnClickListener(this);

        sizeRegular.setOnClickListener(this);
        sizePlus.setOnClickListener(this);
        sizeJunior.setOnClickListener(this);
        sizeTall.setOnClickListener(this);

    }

    private void initAll() {
        clearFilters = findViewById(R.id.id_clear_btn);
        categoryBaby = findViewById(R.id.cat_baby);
        categoryKid = findViewById(R.id.cat_kids);
        categoryMen = findViewById(R.id.cat_men);
        categoryWomen = findViewById(R.id.cat_wemen);

        brandNike = findViewById(R.id.brand_nike);
        brandAddidas = findViewById(R.id.brand_addidas);
        brandLevis = findViewById(R.id.brand_levis);
        brandJordan = findViewById(R.id.brand_jordan);

        sizeRegular = findViewById(R.id.size_regular);
        sizePlus = findViewById(R.id.size_plus);
        sizeJunior = findViewById(R.id.size_junior);
        sizeTall = findViewById(R.id.size_tall);
    }

    public void goBack(View view) {
        finish();
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        switch (id) {
            case R.id.cat_baby:
                HomeFragment.category = "Baby";
                HomeFragment.isCategorySeleted = true;
                HomeFragment.isFiltersApplied = true;
                finish();
                break;
            case R.id.cat_kids:
                HomeFragment.category = "Kids";
                HomeFragment.isCategorySeleted = true;
                HomeFragment.isFiltersApplied = true;
                finish();
                break;
            case R.id.cat_men:
                HomeFragment.category = "Men";
                HomeFragment.isCategorySeleted = true;
                HomeFragment.isFiltersApplied = true;
                finish();
                break;
            case R.id.cat_wemen:
                HomeFragment.category = "Women";
                HomeFragment.isCategorySeleted = true;
                HomeFragment.isFiltersApplied = true;
                finish();
                break;
            case R.id.brand_nike:
                HomeFragment.brand = "Nike";
                HomeFragment.isBrandSeleted = true;
                HomeFragment.isFiltersApplied = true;
                finish();
                break;
            case R.id.brand_addidas:
                HomeFragment.brand = "Adidas";
                HomeFragment.isBrandSeleted = true;
                HomeFragment.isFiltersApplied = true;
                finish();
                break;
            case R.id.brand_levis:
                HomeFragment.brand = "Levi’s";
                HomeFragment.isBrandSeleted = true;
                HomeFragment.isFiltersApplied = true;
                finish();
                break;
            case R.id.brand_jordan:
                HomeFragment.brand = "Jordan";
                HomeFragment.isBrandSeleted = true;
                HomeFragment.isFiltersApplied = true;
                finish();
                break;
            case R.id.size_regular:
                HomeFragment.sizeType = "Regular";
                HomeFragment.issizeTypeSeleted = true;
                HomeFragment.isFiltersApplied = true;
                finish();
            case R.id.size_plus:
                HomeFragment.sizeType = "Plus";
                HomeFragment.issizeTypeSeleted = true;
                HomeFragment.isFiltersApplied = true;
                finish();
            case R.id.size_junior:
                HomeFragment.sizeType = "Juniors";
                HomeFragment.issizeTypeSeleted = true;
                HomeFragment.isFiltersApplied = true;
                finish();
            case R.id.size_tall:
                HomeFragment.sizeType = "Tall";
                HomeFragment.issizeTypeSeleted = true;
                HomeFragment.isFiltersApplied = true;
                finish();
                break;
            case R.id.id_clear_btn:
                HomeFragment.clearClicked();
                finish();
                break;
        }
    }
}