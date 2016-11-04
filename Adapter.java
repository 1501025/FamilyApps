package jp.ac.asojuku.st.familyapps;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

import jp.ac.asojuku.st.familyapps.R;

/**
 * Created by matsunagatakuya on 2016/10/07.
 */
public class Adapter extends RecyclerView.Adapter<ViewHolder> {
    private ArrayList<Data> rouletteDataSet;

    public Adapter(ArrayList<Data> roulette) {

        this.rouletteDataSet = roulette;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int listPosition) {

        holder.textViewNumber.setText(rouletteDataSet.get(listPosition).getNumber()+ "本");
        holder.textViewComment.setText(rouletteDataSet.get(listPosition).getComment());
        holder.base.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"おまけ" +
                    rouletteDataSet.get(listPosition).getAddition() + "本",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return 0;
    }

}
