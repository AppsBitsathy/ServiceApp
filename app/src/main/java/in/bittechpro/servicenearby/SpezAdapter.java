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

public class SpezAdapter extends ArrayAdapter<Integer> {
        private Activity context;

        // Keep all Images in array
        private Integer[] spez_icon;
        private String [] spez_name;

        // Constructor
        SpezAdapter(Activity c,Integer[] spez_icon,String[] spez_name){
            super(c, R.layout.adapter_search, spez_icon);
            this.spez_icon = spez_icon;
            this.spez_name = spez_name;
            this.context = c;
        }

        @NonNull
        public View getView(final int position, View view, @NonNull final ViewGroup parent) {
            LayoutInflater inflater = context.getLayoutInflater();

            @SuppressLint("ViewHolder") View spez = inflater.inflate(R.layout.adapter_search, null, true);

            ImageView spez_img = spez.findViewById(R.id.img_spez);
            TextView spez_txt = spez.findViewById(R.id.txt_spez_name);
            CardView spez_card = spez.findViewById(R.id.card_spez);

            spez_img.setImageResource(spez_icon[position]);
            spez_txt.setText(spez_name[position]);
            spez_card.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context,ResultActivity.class);
                    intent.putExtra("SPEZ_ID",position);
                    context.startActivity(intent);
                }
            });


            return spez;
        }
}

