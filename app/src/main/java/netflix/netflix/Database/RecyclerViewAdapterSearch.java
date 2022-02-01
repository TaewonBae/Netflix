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

import netflix.netflix.Home3YouTubeActivity;
import netflix.netflix.R;

class RecyclerViewHolderSearch extends RecyclerView.ViewHolder {

    public ImageView Netflix_image;
    public TextView Netflix_name;
    public ImageView Netflix_play;
    public RecyclerViewHolderSearch(final View itemView) {
        super(itemView);
        Netflix_image = (ImageView) itemView.findViewById(R.id.home3_image);
        Netflix_name = (TextView) itemView.findViewById(R.id.home3_name);
        Netflix_play = (ImageView) itemView.findViewById(R.id.home3_play);
    }
}

public class RecyclerViewAdapterSearch extends RecyclerView.Adapter<RecyclerViewHolderSearch> {

    public Context context;
    public static List<Netflix_DB_list> netflixList;


    public RecyclerViewAdapterSearch(Context context, List<Netflix_DB_list> netflixList) {
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
    public RecyclerViewHolderSearch onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from((parent.getContext()));
        View itemView = inflater.inflate(R.layout.home3_recyclerview, parent, false);

        return new RecyclerViewHolderSearch(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerViewHolderSearch holder, int position) {


        holder.Netflix_image.setImageBitmap(netflixList.get(position).getNetflix_image());
        holder.Netflix_name.setText(netflixList.get(position).getNetflix_name());
        holder.Netflix_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Exercise_youtube 버튼을 클릭하면 KoreaContentsActivity로 화면전환이 된다.
                Intent intent = new Intent(context, Home3YouTubeActivity.class);
                intent.putExtra("home3_position", position);
                context.startActivity(intent);
                ((Activity) getContext()).overridePendingTransition(R.anim.enter_from_down, R.anim.nothing);//화면전환 애니메이션 (context 세팅해줘야됨)
            }
        });
        holder.Netflix_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Exercise_youtube 버튼을 클릭하면 KoreaContentsActivity로 화면전환이 된다.
                Intent intent = new Intent(context, Home3YouTubeActivity.class);
                intent.putExtra("home3_position", position);
                context.startActivity(intent);
                ((Activity) getContext()).overridePendingTransition(R.anim.enter_from_down, R.anim.nothing);//화면전환 애니메이션 (context 세팅해줘야됨)
            }
        });
    }

    @Override
    public int getItemCount() {
        return netflixList.size();
    }
}
