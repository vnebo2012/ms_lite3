package com.lite.my.masterok;
import android.os.Build;
import android.os.Bundle;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.RequiresApi;
import android.text.Html;
import android.text.Spannable;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class WebMoneyActivity extends Activity {

    EditText etCopy;
    EditText etPaste;
    EditText etPasteCoerceText;
    RadioButton rbText;
    RadioButton rbHtml;
    ClipboardManager mClipboard;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_money);

        etCopy = (EditText) findViewById(R.id.etCopy);
     //   etPaste = (EditText) findViewById(R.id.etPaste);
    //    etPasteCoerceText = (EditText) findViewById(R.id.etPasteCoerceText);
        etCopy.setText(Html.fromHtml(getString(R.string.tvHtml)));
       // rbText = (RadioButton) findViewById(R.id.rbText);
       // rbHtml = (RadioButton) findViewById(R.id.rbHtml);
        mClipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
       // mClipboard.addPrimaryClipChangedListener(mPrimaryChangeListener);
    }



    // Нажатие кнопки "Copy"
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void copyHtml(View view) {
        String htmlText = getHtmltxt(etCopy);
        String plainText = getOnlyText(etCopy);
        mClipboard.setPrimaryClip(ClipData.newHtmlText("HTMLText", plainText,
                htmlText));
        Intent a = new Intent(this,Start_Activity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
    }


    /**
     * This method gets the EditText object and returns the HTML text. It can be
     * called only with EditTexts having spannable object with the HTML text.
     *
     * @param editText
     * @return
     */
    private String getHtmltxt(EditText editText) {
        // get the spannable object from EditText
        Spannable spannable = (Spannable) editText.getText();
        // return the HTML text from spannable object.
        return Html.toHtml(spannable);
    }

    /**
     * This method takes the EditText object which has spannable object with
     * HTML text and returns the simple text without HTML tags.
     *
     * @param editText
     * @return
     */
    private String getOnlyText(EditText editText) {
        return editText.getText().toString();
    }

   // @Override
    //public boolean onCreateOptionsMenu(Menu menu) {
     //   getMenuInflater().inflate(R.menu.activity_main, menu);
    //    return true;
   // }
}
