package jp.ac.asojuku.st.familyapps;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import jp.ac.asojuku.st.familyapps.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.cardList);

        recyclerView.setHasFixedSize(true);
        LinearLayoutManager llManager = new LinearLayoutManager(this);
        //縦スクロール
        llManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llManager);

        ArrayList<jp.ac.asojuku.st.familyapps.Data> anbayasi = new ArrayList<jp.ac.asojuku.st.familyapps.Data>();
        for (int i = 0; i < jp.ac.asojuku.st.familyapps.MyData.commentArray.length; i++) {
            anbayasi.add(new jp.ac.asojuku.st.familyapps.Data(
                    jp.ac.asojuku.st.familyapps.MyData.numberArray[i],
                    jp.ac.asojuku.st.familyapps.MyData.additionArray[i],
                    jp.ac.asojuku.st.familyapps.MyData.commentArray[i]
            ));
        }

        RecyclerView.Adapter adapter = new jp.ac.asojuku.st.familyapps.Adapter(anbayasi);
        recyclerView.setAdapter(adapter);
        recyclerView.smoothScrollToPosition(anbayasi.size() - 1);

    }
}
