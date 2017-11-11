package com.app.jd.oxcom.activities;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.app.jd.oxcom.R;
import com.app.jd.oxcom.databinding.ActivityLogInBinding;

public class LoginActivity extends BaseActivity {
    ActivityLogInBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_log_in);

        binding.buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToActivity(GuiaEfectosAdversosActivity.class);
            }
        });
    }
}
