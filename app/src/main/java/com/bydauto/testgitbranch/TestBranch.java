package com.bydauto.testgitbranch;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by byd_tw on 2017/8/14.
 */

public class TestBranch extends Fragment{
    private static final String TAG = "TestBranch";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }
    //dev1增加onAttach方法
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }
}
