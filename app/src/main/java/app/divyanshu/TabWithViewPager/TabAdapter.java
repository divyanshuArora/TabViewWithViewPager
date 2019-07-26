package app.divyanshu.TabWithViewPager;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class TabAdapter extends FragmentPagerAdapter {

    Context context;
    int toolTabs;
    ArrayList<Fragment> listFragment=new ArrayList<>();

    public TabAdapter(FragmentManager fm, Context context, int toolTabs, ArrayList<Fragment> list) {
        super(fm);
        this.context = context;
        this.toolTabs = toolTabs;
        this.listFragment=list;
    }

    @Override
    public Fragment getItem(int i)
    {
        return listFragment.get(i);
    }

    @Override
    public int getCount() {
        return toolTabs;
    }
}
