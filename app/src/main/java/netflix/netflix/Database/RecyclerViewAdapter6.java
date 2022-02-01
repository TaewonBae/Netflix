package netflix.netflix.Database;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import netflix.netflix.R;

class RecyclerViewHolder6 extends RecyclerView.ViewHolder{
    public ImageView Netflix_image;

    public RecyclerViewHolder6(final View itemView){
        super(itemView);
        Netflix_image = (ImageView) itemView.findViewById(R.id.home1_recycler_image6);

    }
}

public class RecyclerViewAdapter6 extends RecyclerView.Adapter<RecyclerViewHolder6> {

    public Context context;
    public static List<Netflix_DB_list> netflixList;

    public RecyclerViewAdapter6(Context context, List<Netflix_DB_list> netflixList) {
        this.context = context;
        this.netflixList = netflixList;
    }


    @NonNull
    @Override
    public RecyclerViewHolder6 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from((parent.getContext()));
        View itemView = inflater.inflate(R.layout.home1_recyclerview6, parent, false);

        return new RecyclerViewHolder6(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerViewHolder6 holder, int position) {
        holder.Netflix_image.setImageBitmap(netflixList.get(position).getNetflix_image());

    }

    @Override
    public int getItemCount() {
        return netflixList.size();
    }
}
