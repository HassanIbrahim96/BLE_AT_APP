package com.example.android.bluetoothlegatt;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class InstructionsActivity extends Activity {
    TextView datasheet_link;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);
        datasheet_link = findViewById(R.id.datasheetTextView);
        datasheet_link.setMovementMethod(LinkMovementMethod.getInstance());
        datasheet_link.setText(Html.fromHtml("<a href=\"https://lmgtfy.com/?q=hm+10+datasheet\">Datasheet</a>"));
    }
}
