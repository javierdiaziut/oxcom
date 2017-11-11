package com.app.jd.oxcom.activities;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.widget.ArrayAdapter;

import com.app.jd.oxcom.R;
import com.app.jd.oxcom.adapters.ListGuiaESAdapter;
import com.app.jd.oxcom.databinding.ActivityGuiaEfectosAdversosBinding;

import java.util.ArrayList;

public class GuiaEfectosAdversosActivity extends BaseActivity {

    ActivityGuiaEfectosAdversosBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_guia_efectos_adversos);
        binding.includedAppBarTitle.textViewTitle.setText(getString(R.string.title_guia_efectos_adversos));
        String[] values = new String[] { "Oncología", "Virología", "Inflamación",
                "Enfermedades Metabólicas", "Sistema nervioso central" };
        ListGuiaESAdapter mListGuiaESAdapter = new ListGuiaESAdapter(this, R.layout.item_guia_es,values);
        binding.listGuiaEfectosAdversos.setAdapter(mListGuiaESAdapter);


        binding.tabs.addTab(binding.tabs.newTab().setText("Tab 1"));
        binding.tabs.addTab(binding.tabs.newTab().setText("Tab 2"));
        binding.tabs.addTab(binding.tabs.newTab().setText("Tab 3"));
        binding.tabs.setTabGravity(TabLayout.GRAVITY_FILL);
    }



}
