package in.bittechpro.servicenearby;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class SpezAdapter extends BaseAdapter {
        private Context mContext;

        // Keep all Images in array
        private Integer[] mThumbIds = {
                R.drawable.search_icon, R.drawable.search_icon,
                R.drawable.search_icon,R.drawable.search_icon,
                R.drawable.search_icon, R.drawable.search_icon,
                R.drawable.search_icon,R.drawable.search_icon,
                R.drawable.search_icon, R.drawable.search_icon,
                R.drawable.search_icon,R.drawable.search_icon,
                R.drawable.search_icon, R.drawable.search_icon,
                R.drawable.search_icon,R.drawable.search_icon,
                R.drawable.search_icon, R.drawable.search_icon,
                R.drawable.search_icon,R.drawable.search_icon,
                R.drawable.search_icon, R.drawable.search_icon,
                R.drawable.search_icon,R.drawable.search_icon,
                R.drawable.search_icon, R.drawable.search_icon,
                R.drawable.search_icon,R.drawable.search_icon,
                R.drawable.search_icon, R.drawable.search_icon,
                R.drawable.search_icon,R.drawable.search_icon,
        };

        // Constructor
        public SpezAdapter(Context c){
            mContext = c;
        }

        @Override
        public int getCount() {
            return mThumbIds.length;
        }

        @Override
        public Object getItem(int position) {
            return mThumbIds[position];
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView = new ImageView(mContext);
            imageView.setImageResource(mThumbIds[position]);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setLayoutParams(new GridView.LayoutParams(70, 70));
            return imageView;
        }
}
