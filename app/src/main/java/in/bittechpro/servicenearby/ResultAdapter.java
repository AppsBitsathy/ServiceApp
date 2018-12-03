package in.bittechpro.servicenearby;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultAdapter extends ArrayAdapter<String> {

    private Activity context;
    private Integer[] d_img;
    private String [] d_name;
    private String [] d_spez;
    private String [] d_loc;

    ResultAdapter(Activity c,Integer[] d_img,String[] d_name,String[] d_spez,String[] d_loc){
        super(c, R.layout.adapter_result, d_name);
        this.context = c;
        this.d_img = d_img;
        this.d_name = d_name;
        this.d_spez = d_spez;
        this.d_loc = d_loc;
    }

    @NonNull
    public View getView(final int position, View view, @NonNull final ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        @SuppressLint("ViewHolder") View spez = inflater.inflate(R.layout.adapter_result, null, true);

        TextView txt_d_name = spez.findViewById(R.id.txt_d_name);
        TextView txt_d_loc = spez.findViewById(R.id.txt_d_loc);
        TextView txt_d_spez = spez.findViewById(R.id.txt_d_spez);
        ImageView img_d = spez.findViewById(R.id.img_d);
        CardView cardResult = spez.findViewById(R.id.card_result);

        txt_d_name.setText(d_name[position]);
        txt_d_loc.setText(d_loc[position]);
        txt_d_spez.setText(d_spez[position]);
        img_d.setImageResource(d_img[position]);
        cardResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,DetailActivity.class);
                intent.putExtra("D_ID",position);
                context.startActivity(intent);
            }
        });



        return spez;
    }
}

