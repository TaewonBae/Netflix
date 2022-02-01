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
import netflix.netflix.KoreaContentsYoutubeActivity2;
import netflix.netflix.R;

class RecyclerViewHolderDrama2 extends RecyclerView.ViewHolder {

    public ImageView Netflix_sub_image;
    public TextView Netflix_subtitle;
    public TextView Netflix_time;
    public TextView Netflix_des;
    public RecyclerViewHolderDrama2(final View itemView) {
        super(itemView);
        Netflix_sub_image = (ImageView) itemView.findViewById(R.id.sub_image);
        Netflix_subtitle = (TextView) itemView.findViewById(R.id.subtitle);
        Netflix_time = (TextView) itemView.findViewById(R.id.time);
        Netflix_des = (TextView) itemView.findViewById(R.id.des);
    }
}

public class RecyclerViewAdapterDrama2 extends RecyclerView.Adapter<RecyclerViewHolderDrama2> {

    public Context context;
    public static List<Netflix_DB_list> netflixList;


    public RecyclerViewAdapterDrama2(Context context, List<Netflix_DB_list> netflixList) {
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
    public RecyclerViewHolderDrama2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from((parent.getContext()));
        View itemView = inflater.inflate(R.layout.home1_recyclerview_drama, parent, false);

        return new RecyclerViewHolderDrama2(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerViewHolderDrama2 holder, int position) {


        holder.Netflix_sub_image.setImageBitmap(netflixList.get(position).getNetflix_image());
        holder.Netflix_subtitle.setText(netflixList.get(position).getNetflix_text1());
        holder.Netflix_time.setText(netflixList.get(position).getNetflix_text2());
        holder.Netflix_des.setText(netflixList.get(position).getNetflix_text3());

        holder.Netflix_sub_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Exercise_youtube 버튼을 클릭하면 KoreaContentsActivity로 화면전환이 된다.
                Intent intent = new Intent(context, KoreaContentsYoutubeActivity2.class);
                intent.putExtra("position_youtube", position);
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
