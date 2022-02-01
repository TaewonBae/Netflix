package netflix.netflix.Database;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import netflix.netflix.KoreaContentsActivity;
import netflix.netflix.R;


class RecyclerViewHolder1 extends RecyclerView.ViewHolder {

    public ImageView Netflix_image;

    public RecyclerViewHolder1(final View itemView) {
        super(itemView);
        Netflix_image = (ImageView) itemView.findViewById(R.id.home1_recycler_image);

    }
}

public class RecyclerViewAdapter1 extends RecyclerView.Adapter<RecyclerViewHolder1> {

    public Context context;
    public static List<Netflix_DB_list> netflixList;


    public RecyclerViewAdapter1(Context context, List<Netflix_DB_list> netflixList) {
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
    public RecyclerViewHolder1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from((parent.getContext()));
        View itemView = inflater.inflate(R.layout.home1_recyclerview, parent, false);

        return new RecyclerViewHolder1(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerViewHolder1 holder, int position) {


        holder.Netflix_image.setImageBitmap(netflixList.get(position).getNetflix_image());

        holder.Netflix_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Exercise_youtube 버튼을 클릭하면 KoreaContentsActivity로 화면전환이 된다.
                Intent intent = new Intent(context, KoreaContentsActivity.class);
                intent.putExtra("position", position);
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
