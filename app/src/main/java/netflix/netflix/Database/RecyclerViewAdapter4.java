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

class RecyclerViewHolder4 extends RecyclerView.ViewHolder{
    public ImageView Netflix_image;

    public RecyclerViewHolder4(final View itemView){
        super(itemView);
        Netflix_image = (ImageView) itemView.findViewById(R.id.home1_recycler_image);

    }
}

public class RecyclerViewAdapter4 extends RecyclerView.Adapter<RecyclerViewHolder4> {

    public Context context;
    public static List<Netflix_DB_list> netflixList;

    public RecyclerViewAdapter4(Context context, List<Netflix_DB_list> netflixList) {
        this.context = context;
        this.netflixList = netflixList;
    }


    @NonNull
    @Override
    public RecyclerViewHolder4 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from((parent.getContext()));
        View itemView = inflater.inflate(R.layout.home1_recyclerview, parent, false);

        return new RecyclerViewHolder4(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerViewHolder4 holder, int position) {
        holder.Netflix_image.setImageBitmap(netflixList.get(position).getNetflix_image());

    }

    @Override
    public int getItemCount() {
        return netflixList.size();
    }
}