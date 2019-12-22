package com.sourcey.materiallogindemo;

import android.app.ProgressDialog;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ChangePasswordCategoryActivity extends AppCompatActivity {

    boolean editOrNot;

    @BindView(R.id.input_now_identification) EditText _NowIdentificationText;
    @BindView(R.id.input_new_password) EditText _NewPasswordText;
    @BindView(R.id.input_confirm_password) EditText _ConfirmPasswordText;
    @BindView(R.id.btn_change_password) Button _ChangePasswordButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password_category);
        ButterKnife.bind(this);

        _ChangePasswordButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                edit();
            }
        });
    }

    public void edit(){
        if (!validate()) {
            onEditFailed();
            return;
        }

        _ChangePasswordButton.setEnabled(false);

        final ProgressDialog progressDialog = new ProgressDialog(ChangePasswordCategoryActivity.this,
                R.style.AppTheme_Dark_Dialog);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Authenticating...");
        progressDialog.show();

        String nowIdentification = _NowIdentificationText.getText().toString();
        String newPassword = _NewPasswordText.getText().toString();
        String confirmPassword = _ConfirmPasswordText.getText().toString();

        // TODO: Implement your own authentication logic here.

        if (newPassword.equals(confirmPassword)){
            SQLiteOpenHelper TestDBHelper = new DatabaseHelper(this);
            try {
                SQLiteDatabase db = TestDBHelper.getWritableDatabase();
                Cursor cursor =db.rawQuery("SELECT * FROM users WHERE identification=? ", new String[]{nowIdentification});
                if(cursor!=null){
                    if(cursor.getCount()>0){
                        ContentValues userValues=new ContentValues();
                        userValues.put("password",newPassword);
                        db.update("users",userValues,"identification=?",new String[] {nowIdentification});
                        editOrNot=true;
                        cursor.close();
                    } else{
                        editOrNot=false;
                        cursor.close();
                    }
                }
                db.close();
            } catch (SQLException e) {
                Toast toast = Toast.makeText(this, "Database unavailable", Toast.LENGTH_SHORT);
                toast.show();
            }
        }

        new android.os.Handler().postDelayed(
                new Runnable() {
                    public void run() {
                        // On complete call either onLoginSuccess or onLoginFailed
                        if(editOrNot){
                            onEditSuccess();
                        }else{
                            onEditFailed();
                            progressDialog.dismiss();
                        }
                    }
                }, 3000);

    }

    public void onEditSuccess() {
        _ChangePasswordButton.setEnabled(true);
        Toast toast = Toast.makeText(this, "Password Change Success", Toast.LENGTH_LONG);
        toast.show();
        finish();
    }

    public void onEditFailed() {
        Toast.makeText(getBaseContext(), "Edit failed", Toast.LENGTH_LONG).show();
        _ChangePasswordButton.setEnabled(true);
    }

    public boolean validate() {
        boolean valid = true;

        String NowIdentification=_NowIdentificationText.getText().toString();
        String NewPassword = _NewPasswordText.getText().toString();
        String ConfirmPassword = _ConfirmPasswordText.getText().toString();

        if (NowIdentification.isEmpty()){
            _NowIdentificationText.setError("enter current identification");
            valid = false;
        } else {
            _NowIdentificationText.setError(null);
        }

        if (NewPassword.isEmpty()){
            _NewPasswordText.setError("enter a new password");
            valid = false;
        } else {
            _NewPasswordText.setError(null);
        }

        if (ConfirmPassword.isEmpty()) {
            _ConfirmPasswordText.setError("enter a confirmed password");
            valid = false;
        } else {
            _ConfirmPasswordText.setError(null);
        }

        return valid;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_custom, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.home) {
            Intent i=new Intent(this,MainActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
        }
        else if (id==R.id.logout){
            GlobalVariable gv=(GlobalVariable)getApplicationContext();
            gv.setLoginToken(false);
            Intent i=new Intent(this,MainActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }

}
