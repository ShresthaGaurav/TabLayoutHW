package com.shresthagaurav.tablayouthw.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.shresthagaurav.tablayouthw.R;
import com.shresthagaurav.tablayouthw.adpter.ContactsAdapters;

import java.util.ArrayList;
import java.util.List;

import model.Contacts;

public class HomeFragment extends Fragment {
    private RecyclerView recyclerView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView=root.findViewById(R.id.recyclerView);
        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add(new Contacts("gaurav Shrestha","9854632014",R.drawable.bhuwan));
        contactsList.add(new Contacts("Ram","98954454",R.drawable.noimage));
        contactsList.add(new Contacts("Nari","989846546",R.drawable.dahayang));
        contactsList.add(new Contacts("Krishna","9898466",R.drawable.saugat));
        contactsList.add(new Contacts("BABA","98985446",R.drawable.bhuwan));
        contactsList.add(new Contacts("KAKA","989854466",R.drawable.saugat));
        contactsList.add(new Contacts("OM","9898545466",R.drawable.dahayang));
        contactsList.add(new Contacts("TVS","989846546",R.drawable.noimage));
        contactsList.add(new Contacts("Hari","9898545466",R.drawable.noimage));
        contactsList.add(new Contacts("Shree","989844566",R.drawable.dahayang));
        contactsList.add(new Contacts("raja","989846546",R.drawable.noimage));
        contactsList.add(new Contacts("Krishna","989008466",R.drawable.noimage));
        contactsList.add(new Contacts("Ram","989846600",R.drawable.dahayang));
        ContactsAdapters contactsAdapter = new ContactsAdapters(getActivity(),contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return root;
    }
}