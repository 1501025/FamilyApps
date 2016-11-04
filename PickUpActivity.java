package jp.ac.asojuku.st.familyapps;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.Random;

import jp.ac.asojuku.st.familyapps.R;

public class PickUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cards_layout);
        Button btnSend = (Button) this.findViewById(R.id.button);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup rgPlace = (RadioGroup) findViewById(R.id.rg_place);
                int checkedId = rgPlace.getCheckedRadioButtonId();
                String strPlace = ((RadioButton) findViewById(checkedId)).getText().toString();
                EditText edit01 = (EditText) findViewById(R.id.editText);
                String title = edit01.getText().toString();
                Resources res = getResources();
                Random rnd = new Random();
                int ran = rnd.nextInt(2);
                Uri uri;

                if (ran==1) {
                    uri  = Uri.parse("mailto:" + res.getString(R.string.mail_to).toString());
                }else if(ran==2){
                    uri  = Uri.parse("mailto:" + res.getString(R.string.mail_to2).toString());
                }
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.putExtra(Intent.EXTRA_SUBJECT, title);
                intent.putExtra(Intent.EXTRA_TEXT, strPlace + "ルーレット");
                startActivity(intent);
            }
        });
    }
}
