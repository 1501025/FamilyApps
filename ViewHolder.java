package jp.ac.asojuku.st.familyapps;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import jp.ac.asojuku.st.familyapps.R;

/**
 * Created by matsunagatakuya on 2016/10/07.
 */
public class ViewHolder extends RecyclerView.ViewHolder {

    View base;
    TextView textViewNumber;
    TextView textViewComment;

    public ViewHolder(View v) {
        super(v);
        this.base = v;
        this.textViewNumber = (TextView) v.findViewById(R.id.number);
        this.textViewComment = (TextView) v.findViewById(R.id.comment);
    }
}
