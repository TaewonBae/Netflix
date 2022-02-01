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

import netflix.netflix.Home2YouTubeActivity;
import netflix.netflix.R;

class RecyclerViewHolderMenu3 extends RecyclerView.ViewHolder {

    public TextView Netflix_number;
    public ImageView Netflix_image;
    public TextView Netflix_name;
    public TextView Netflix_des;
    public TextView Netflix_tag1;
    public TextView Netflix_tag2;
    public TextView Netflix_tag3;
    public TextView Netflix_tag4;
    public TextView Netflix_tag5;

    public RecyclerViewHolderMenu3(final View itemView) {
        super(itemView);
        Netflix_number =  (TextView) itemView.findViewById(R.id.home2_menu3_number);;
        Netflix_image = (ImageView) itemView.findViewById(R.id.home2_menu3_image);
        Netflix_name = (TextView) itemView.findViewById(R.id.home2_menu3_name);
        Netflix_des = (TextView) itemView.findViewById(R.id.home2_menu3_des);
        Netflix_tag1 = (TextView) itemView.findViewById(R.id.home2_menu3_tag1);
        Netflix_tag2 = (TextView) itemView.findViewById(R.id.home2_menu3_tag2);
        Netflix_tag3 = (TextView) itemView.findViewById(R.id.home2_menu3_tag3);
        Netflix_tag4 = (TextView) itemView.findViewById(R.id.home2_menu3_tag4);
        Netflix_tag5 = (TextView) itemView.findViewById(R.id.home2_menu3_tag5);


    }
}

public class RecyclerViewAdapterMenu3 extends RecyclerView.Adapter<RecyclerViewHolderMenu3> {

    public Context context;
    public static List<Netflix_DB_list> netflixList;


    public RecyclerViewAdapterMenu3(Context context, List<Netflix_DB_list> netflixList) {
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
    public RecyclerViewHolderMenu3 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from((parent.getContext()));
        View itemView = inflater.inflate(R.layout.home2_recyclerview_menu3, parent, false);

        return new RecyclerViewHolderMenu3(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerViewHolderMenu3 holder, int position) {


        holder.Netflix_image.setImageBitmap(netflixList.get(position).getNetflix_image());
        holder.Netflix_number.setText(netflixList.get(position).getNetflix_text1());
        holder.Netflix_name.setText(netflixList.get(position).getNetflix_text2());
        holder.Netflix_des.setText(netflixList.get(position).getNetflix_text3());
        holder.Netflix_tag1.setText(netflixList.get(position).getNetflix_text4());
        holder.Netflix_tag2.setText(netflixList.get(position).getNetflix_text5());
        holder.Netflix_tag3.setText(netflixList.get(position).getNetflix_text6());
        holder.Netflix_tag4.setText(netflixList.get(position).getNetflix_text7());
        holder.Netflix_tag5.setText(netflixList.get(position).getNetflix_text8());




        holder.Netflix_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Exercise_youtube 버튼을 클릭하면 KoreaContentsActivity로 화면전환이 된다.
                Intent intent = new Intent(context, Home2YouTubeActivity.class);
                intent.putExtra("home2_position3", position);
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