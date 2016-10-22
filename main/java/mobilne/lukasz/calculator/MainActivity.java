package mobilne.lukasz.calculator;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btnCalc1, R.id.btnCalc2, R.id.btnAboutMe})
    public void DisplayActivity(Button btn) {

        int iRID = (int)((Button)findViewById(btn.getId())).getId();

        switch(iRID){
            case R.id.btnCalc1:
                startActivity(new Intent(MainActivity.this, Calc1Activity.class));
                break;
            case R.id.btnCalc2:
                startActivity(new Intent(MainActivity.this, Calc2Activity.class));
                break;
            case R.id.btnAboutMe:
                startActivity(new Intent(MainActivity.this, PopUp.class));
                break;
            default:
                setContentView(R.layout.activity_main);
        }
    }
}