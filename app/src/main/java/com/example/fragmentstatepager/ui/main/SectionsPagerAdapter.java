package com.example.fragmentstatepager.ui.main;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class SectionsPagerAdapter extends FragmentStatePagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }


    /*
    * return object
    * */
    @Override
    public Fragment getItem(int position) {

        Fragment fragment = new ObjFragment();
        Bundle args = new Bundle();
        args.putInt(ObjFragment.ARG_OBJECT, position+1);
        fragment.setArguments(args);
        return fragment;
    }


    /*
    * set page title of tab*/
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return "Object " + (position + 1);
    }


    /*set summ of tabs*/
    @Override
    public int getCount() {
        return 5;
    }


}