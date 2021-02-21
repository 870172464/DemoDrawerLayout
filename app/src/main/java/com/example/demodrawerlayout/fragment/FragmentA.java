package com.example.demodrawerlayout.fragment;

import android.widget.TextView;

import com.example.demodrawerlayout.R;

public class FragmentA extends BaseFragment {

    @Override
    protected int getLayoutId() {
        return R.layout.fragment;
    }

    @Override
    protected void initView() {
        TextView mTvFragment = findViewById(R.id.mTvFragment);
        mTvFragment.setText(getClass().getSimpleName());
    }
}
