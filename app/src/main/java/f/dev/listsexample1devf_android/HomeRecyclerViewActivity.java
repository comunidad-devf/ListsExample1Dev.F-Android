package f.dev.listsexample1devf_android;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class HomeRecyclerViewActivity extends AppCompatActivity {


    @Bind(R.id.recyclerView)
    RecyclerView recyclerView;


    private static final String[] desAlumnos = {"Fernanda", "Salvador", "Emilio", "Angel", "Gerrardo", "Sebastian"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_home);

        ButterKnife.bind(this);

        setupRecyclerView();
    }

    private void setupRecyclerView() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);

        MyAdapterRecyclerView myAdapterRecyclerView = new MyAdapterRecyclerView(this, createGuests());
        recyclerView.setAdapter(myAdapterRecyclerView);

    }


    private static List<GuestModel> createGuests() {

        int[] nameGuests = {R.string.name_guest_1, R.string.name_guest_2, R.string.name_guest_3, R.string.name_guest_4};
        int[] imageGuets = {R.drawable.guest_1, R.drawable.guest_2, R.drawable.guest_3, R.drawable.guest_4};

        List<GuestModel> guestModels = new ArrayList<>();


        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < nameGuests.length; j++) {
                guestModels.add(new GuestModel(imageGuets[j], nameGuests[j]));
            }
        }


        return guestModels;
    }





}
