package f.dev.listsexample1devf_android;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by sati on 06/07/2015.
 */
public class MyAdapter extends ArrayAdapter<GuestModel> {

    List<GuestModel> guestModels;


    private LayoutInflater inflater;

    @Bind(R.id.textViewNamgGuest)
    TextView myTeextView;

    @Bind(R.id.imageViewGuest)
    CircleImageView myCircleImageView;



    public MyAdapter(Context context, int resource, List<GuestModel> guestModels) {
        super(context, resource, guestModels);

        this.guestModels = guestModels;

        inflater = LayoutInflater.from(context);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View viewItem = inflater.inflate(R.layout.item_guest, parent, false);
        ButterKnife.bind(this, viewItem);

        setData(guestModels.get(position));

        return viewItem;
    }


    private void setData (GuestModel guestModel)
    {
        myTeextView.setText(guestModel.getIdName());
        myCircleImageView.setImageResource(guestModel.getIdImage());
    }






}
