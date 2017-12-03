package exercise.simpleapp.com.exercise2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class LogInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_loginin)
    public void goToAddUser() {
        Log.d("startLogin", "startLogin");
        startActivity(new Intent(LogInActivity.this, AddUserActivity.class));
    }
}
