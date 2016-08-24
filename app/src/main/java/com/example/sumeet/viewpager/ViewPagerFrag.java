package com.example.sumeet.viewpager;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by sumeet on 8/24/16.
 */
public class ViewPagerFrag extends Fragment {
    ImageView mImage;
    private int position;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = this.getArguments();
        position = bundle.getInt("position");


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.frag_view_pager, container, false);
        mImage = (ImageView) rootView.findViewById(R.id.imageView_pager);
        Resources resources = getActivity().getResources();
        if(position%2 == 0){
            mImage.setImageBitmap(
                    Utility.decodeSampledBitmapFromResource(resources, R.drawable.suhail1, 100, 100));
        }
        else
            mImage.setImageBitmap(
                    Utility.decodeSampledBitmapFromResource(resources, R.drawable.suhail2, 100, 100));
        return rootView;
    }

    public static ViewPagerFrag newInstance(@NonNull int position) {
        Bundle args = new Bundle();
        ViewPagerFrag fragment = new ViewPagerFrag();
        args.putInt("position", position);
        fragment.setArguments(args);
        return fragment;
    }




}
