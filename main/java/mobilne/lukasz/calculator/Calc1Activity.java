package mobilne.lukasz.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.view.ViewGroup.LayoutParams;
import java.lang.String;

import org.w3c.dom.Text;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Calc1Activity extends AppCompatActivity {

    String sStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc1);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn0, R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5,
            R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9, R.id.btnPlus,
            R.id.btnMinus,R.id.btnTimes, R.id.btnDivided, R.id.btnEqual, R.id.btnDot})
    public void funQ(Button button){

        TextView t = (TextView)findViewById(R.id.textView);
        sStr = (String)t.getText();

        String s = (String)((Button)findViewById(button.getId())).getText();

        t.setText(sStr + s);
    }

    @OnClick({R.id.clear})
    public void funKasuj(Button button){

        TextView t = (TextView)findViewById(R.id.textView);
        sStr = (String)t.getText();

        int i = button.getId();

        t.setText("");
    }
}
