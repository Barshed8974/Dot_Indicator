package com.example.viewpager;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FragmentAdapter extends FragmentStateAdapter {

    public FragmentAdapter(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return FragmentA.newInstance("First Fragment");
            case 1:
                return FragmentB.newInstance("Second Fragment");
            case 2:
                return FragmentC.newInstance("Third Fragment");
            case 3:
                return FragmentC.newInstance("Fourth Fragment");
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}