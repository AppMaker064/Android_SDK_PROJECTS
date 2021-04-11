package com.appmaker.calculator;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;

import org.mariuszgromada.math.mxparser.Expression;

@SuppressLint("Assert")
public class MainActivity extends AppCompatActivity {
    private EditText display;
    private EditText answer;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.display);
        answer = findViewById(R.id.answer);

        display.setShowSoftInputOnFocus(false);
        answer.setShowSoftInputOnFocus(false);
    }

    private void updateText(String strToAdd){
        String oldStr = display.getText().toString();

        int cursorPos = display.getSelectionStart();
        String leftStr = oldStr.substring(0, cursorPos);
        String rightStr = oldStr.substring(cursorPos);

        display.setText(String.format("%s%s%s", leftStr, strToAdd, rightStr));
        display.setSelection(cursorPos + strToAdd.length());
    }

    public void zeroBTNPush(View view) {
        updateText(getResources().getString(R.string.zeroText));
        String userExp = display.getText().toString();

        userExp = userExp.replaceAll(getResources().getString(R.string.divideText), "/");
        userExp = userExp.replaceAll(getResources().getString(R.string.multiplyText), "*");
        userExp = userExp.replaceAll(getResources().getString(R.string.piText), "pi");

        Expression exp = new Expression(userExp);
        String result = String.valueOf(exp.calculate());

        answer.setText(result);
        answer.setSelection(result.length());
    }

    public void oneBTNPush(View view) {
        updateText(getResources().getString(R.string.oneText));
        String userExp = display.getText().toString();

        userExp = userExp.replaceAll(getResources().getString(R.string.divideText), "/");
        userExp = userExp.replaceAll(getResources().getString(R.string.multiplyText), "*");
        userExp = userExp.replaceAll(getResources().getString(R.string.piText), "pi");

        Expression exp = new Expression(userExp);
        String result = String.valueOf(exp.calculate());

        answer.setText(result);
        answer.setSelection(result.length());
    }

    public void twoBTNPush(View view) {
        updateText(getResources().getString(R.string.twoText));
        String userExp = display.getText().toString();

        userExp = userExp.replaceAll(getResources().getString(R.string.divideText), "/");
        userExp = userExp.replaceAll(getResources().getString(R.string.multiplyText), "*");
        userExp = userExp.replaceAll(getResources().getString(R.string.piText), "pi");

        Expression exp = new Expression(userExp);
        String result = String.valueOf(exp.calculate());

        answer.setText(result);
        answer.setSelection(result.length());
    }

    public void threeBTNPush(View view) {
        updateText(getResources().getString(R.string.threeText));
        String userExp = display.getText().toString();

        userExp = userExp.replaceAll(getResources().getString(R.string.divideText), "/");
        userExp = userExp.replaceAll(getResources().getString(R.string.multiplyText), "*");
        userExp = userExp.replaceAll(getResources().getString(R.string.piText), "pi");

        Expression exp = new Expression(userExp);
        String result = String.valueOf(exp.calculate());

        answer.setText(result);
        answer.setSelection(result.length());
    }

    public void fourBTNPush(View view) {
        updateText(getResources().getString(R.string.fourText));
        String userExp = display.getText().toString();

        userExp = userExp.replaceAll(getResources().getString(R.string.divideText), "/");
        userExp = userExp.replaceAll(getResources().getString(R.string.multiplyText), "*");
        userExp = userExp.replaceAll(getResources().getString(R.string.piText), "pi");

        Expression exp = new Expression(userExp);
        String result = String.valueOf(exp.calculate());

        answer.setText(result);
        answer.setSelection(result.length());
    }

    public void fiveBTNPush(View view) {
        updateText(getResources().getString(R.string.fiveText));
        String userExp = display.getText().toString();

        userExp = userExp.replaceAll(getResources().getString(R.string.divideText), "/");
        userExp = userExp.replaceAll(getResources().getString(R.string.multiplyText), "*");
        userExp = userExp.replaceAll(getResources().getString(R.string.piText), "pi");

        Expression exp = new Expression(userExp);
        String result = String.valueOf(exp.calculate());

        answer.setText(result);
        answer.setSelection(result.length());
    }

    public void sixBTNPush(View view) {
        updateText(getResources().getString(R.string.sixText));
        String userExp = display.getText().toString();

        userExp = userExp.replaceAll(getResources().getString(R.string.divideText), "/");
        userExp = userExp.replaceAll(getResources().getString(R.string.multiplyText), "*");
        userExp = userExp.replaceAll(getResources().getString(R.string.piText), "pi");

        Expression exp = new Expression(userExp);
        String result = String.valueOf(exp.calculate());

        answer.setText(result);
        answer.setSelection(result.length());
    }

    public void sevenBTNPush(View view) {
        updateText(getResources().getString(R.string.sevenText));
        String userExp = display.getText().toString();

        userExp = userExp.replaceAll(getResources().getString(R.string.divideText), "/");
        userExp = userExp.replaceAll(getResources().getString(R.string.multiplyText), "*");
        userExp = userExp.replaceAll(getResources().getString(R.string.piText), "pi");

        Expression exp = new Expression(userExp);
        String result = String.valueOf(exp.calculate());

        answer.setText(result);
        answer.setSelection(result.length());
    }

    public void eightBTNPush(View view) {
        updateText(getResources().getString(R.string.eightText));
        String userExp = display.getText().toString();

        userExp = userExp.replaceAll(getResources().getString(R.string.divideText), "/");
        userExp = userExp.replaceAll(getResources().getString(R.string.multiplyText), "*");
        userExp = userExp.replaceAll(getResources().getString(R.string.piText), "pi");

        Expression exp = new Expression(userExp);
        String result = String.valueOf(exp.calculate());

        answer.setText(result);
        answer.setSelection(result.length());
    }

    public void nineBTNPush(View view) {
        updateText(getResources().getString(R.string.nineText));
        String userExp = display.getText().toString();

        userExp = userExp.replaceAll(getResources().getString(R.string.divideText), "/");
        userExp = userExp.replaceAll(getResources().getString(R.string.multiplyText), "*");
        userExp = userExp.replaceAll(getResources().getString(R.string.piText), "pi");

        Expression exp = new Expression(userExp);
        String result = String.valueOf(exp.calculate());

        answer.setText(result);
        answer.setSelection(result.length());
    }



    public void clearBTNPush(View view) {
        display.setText("");
        answer.setText("");
    }

    public void parenthesesOpenBTNPush(View view) {
        updateText(getResources().getString(R.string.parenthesesOpenText));
    }

    public void parenthesesCloseBTNPush(View view) {
        updateText(getResources().getString(R.string.parenthesesCloseText));
        String userExp = display.getText().toString();

        userExp = userExp.replaceAll(getResources().getString(R.string.divideText), "/");
        userExp = userExp.replaceAll(getResources().getString(R.string.multiplyText), "*");
        userExp = userExp.replaceAll(getResources().getString(R.string.piText), "pi");

        Expression exp = new Expression(userExp);
        String result = String.valueOf(exp.calculate());

        answer.setText(result);
        answer.setSelection(result.length());
    }

    public void divideBTNPush(View view) {
        updateText(getResources().getString(R.string.divideText));
    }

    public void multiplyBTNPush(View view) {
        updateText(getResources().getString(R.string.multiplyText));
    }

    public void addBTNPush(View view) {
        updateText(getResources().getString(R.string.addText));
    }

    public void subtractBTNPush(View view) {
        updateText(getResources().getString(R.string.subtractText));
    }

    public void decimalBTNPush(View view) {
        updateText(getResources().getString(R.string.decimalText));
    }

    public void exponentBTNPush(View view) {
        updateText(getResources().getString(R.string.exponentText));
    }

    public void plusminusBTNPush(View view) {
        updateText("(-");
    }

    public void percentBTNPush(View view) {
        updateText(getResources().getString(R.string.percentText));
        String userExp = display.getText().toString();

        userExp = userExp.replaceAll(getResources().getString(R.string.divideText), "/");
        userExp = userExp.replaceAll(getResources().getString(R.string.multiplyText), "*");
        userExp = userExp.replaceAll(getResources().getString(R.string.piText), "pi");

        Expression exp = new Expression(userExp);
        String result = String.valueOf(exp.calculate());

        answer.setText(result);
        answer.setSelection(result.length());
    }

    public void backspaceBTNPush(View view) {
        int cursorPos = display.getSelectionStart();
        int textLen = display.getText().length();

        if(cursorPos != 0 && textLen != 0){
            SpannableStringBuilder selection = (SpannableStringBuilder) display.getText();
            selection.replace(cursorPos-1, cursorPos, "");
            display.setText(selection);
            display.setSelection(cursorPos-1);
            answer.setText("");

            String userExp = display.getText().toString();

            userExp = userExp.replaceAll(getResources().getString(R.string.divideText), "/");
            userExp = userExp.replaceAll(getResources().getString(R.string.multiplyText), "*");
            userExp = userExp.replaceAll(getResources().getString(R.string.piText), "pi");
            userExp = userExp.replaceAll("", "0");

            Expression exp = new Expression(userExp);
            String result = String.valueOf(exp.calculate());

            answer.setText(result);
            answer.setSelection(result.length());
        }
    }
    public void equalsBTNPush(View view){
        String userExp = display.getText().toString();

        userExp = userExp.replaceAll(getResources().getString(R.string.divideText), "/");
        userExp = userExp.replaceAll(getResources().getString(R.string.multiplyText), "*");
        userExp = userExp.replaceAll(getResources().getString(R.string.piText), "pi");

        Expression exp = new Expression(userExp);
        String result = String.valueOf(exp.calculate());

        answer.setText(result);
        answer.setSelection(result.length());
    }

    public void piBTNPush(View view){
        updateText("π×");
    }
}
