package netflix.netflix.Database;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import netflix.netflix.R;

class RecyclerViewHolderGame extends RecyclerView.ViewHolder {

    public ImageView Netflix_game_image;
    public TextView Netflix_game_name;
    public TextView Netflix_game_category;
    public RecyclerViewHolderGame(final View itemView) {
        super(itemView);
        Netflix_game_image = (ImageView) itemView.findViewById(R.id.game_image);
        Netflix_game_name = (TextView) itemView.findViewById(R.id.game_name);
        Netflix_game_category = (TextView) itemView.findViewById(R.id.game_category);
    }
}

public class RecyclerViewAdapterGame extends RecyclerView.Adapter<RecyclerViewHolderGame> {

    public Context context;
    public static List<Netflix_DB_list> netflixList;


    public RecyclerViewAdapterGame(Context context, List<Netflix_DB_list> netflixList) {
        this.context = context;
        this.netflixList = netflixList;
        mContext = context;//context추가
    }
    //context 관련
    private Context mContext;
    private Context getContext() {
        return mContext;
    }
    @NonNull
    @Override
    public RecyclerViewHolderGame onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from((parent.getContext()));
        View itemView = inflater.inflate(R.layout.home1_recyclerview_game, parent, false);

        return new RecyclerViewHolderGame(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerViewHolderGame holder, int position) {


        holder.Netflix_game_image.setImageBitmap(netflixList.get(position).getNetflix_image());
        holder.Netflix_game_name.setText(netflixList.get(position).getNetflix_text1());
        holder.Netflix_game_category.setText(netflixList.get(position).getNetflix_text2());
    }

    @Override
    public int getItemCount() {
        return netflixList.size();
    }
}