package com.app.jd.oxcom.activities;



import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import com.app.jd.oxcom.R;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Thread.sleep;

/**
 * Created by j.k.c.b.
 * in my workspace on 9/6/17 at 11:01 PM.
 */

public class BaseActivity extends AppCompatActivity {

    AlertDialog progressDialog;


    /**
     * This function create and display the activity represented by cls
     *
     * @param cls class of the Activity that will be displayed
     */
    public void navigateToActivity(Class<?> cls) {
        Intent intent = new Intent(getApplicationContext(), cls);
        startActivity(intent);
    }


    /**
     * This function create and display the activity represented by cls
     *
     * @param activity  class of the Activity that will be displayed
     * @param extraData String extra parameter that will be sent to the Activity that will be displayed
     */
    public void navigateToActivityPassingVars(Class<?> activity, HashMap<String, String> extraData) {
        Intent intent = new Intent(getApplicationContext(), activity);
        for (Map.Entry<String, String> entry : extraData.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            intent.putExtra(key, value);
        }
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }



    public void showDialog() {
        if(progressDialog == null || !progressDialog.isShowing()){
            AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);

            LayoutInflater inflater = this.getLayoutInflater();
            View dialogView = inflater.inflate(R.layout.progress_bar, null);
            dialogBuilder.setView(dialogView);
            progressDialog = dialogBuilder.create();
            progressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            progressDialog.setCancelable(false);
            progressDialog.setCanceledOnTouchOutside(false);
            progressDialog.show();
        }
    }

    public void dismissDialog() {
        if(progressDialog != null && progressDialog.isShowing()){
            try {
                progressDialog.dismiss();
            }catch (Exception e){}
        }
    }

    public void showDismissDialog(){
        if(progressDialog == null || !progressDialog.isShowing()){
            showDialog();
        }else{
            dismissDialog();
        }
    }


}
