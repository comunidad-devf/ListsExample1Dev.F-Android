package f.dev.listsexample1devf_android;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by sati on 08/07/2015.
 */
public class MyAdapterRecyclerView extends RecyclerView.Adapter<MyAdapterRecyclerView.ViewHolder> {

    private List<GuestModel> guestModels;
    private LayoutInflater inflater;

    public MyAdapterRecyclerView(Context context, List<GuestModel> guestModels) {
        this.guestModels = guestModels;
        inflater = LayoutInflater.from(context);

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View viewItem = inflater.inflate(R.layout.item_guest, parent, false);
        ViewHolder viewHolder = new ViewHolder(viewItem);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.setData(guestModels.get(position));

    }

    @Override
    public int getItemCount() {
        return guestModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @Bind(R.id.textViewNamgGuest)
        TextView myTeextView;

        @Bind(R.id.imageViewGuest)
        CircleImageView myCircleImageView;

        public ViewHolder(View viewItem) {
            super(viewItem);
            ButterKnife.bind(this, viewItem);
        }


        public void setData(GuestModel guestModel) {
            myTeextView.setText(guestModel.getIdName());
            myCircleImageView.setImageResource(guestModel.getIdImage());
        }

    }

}
