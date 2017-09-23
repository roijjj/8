package com.bignerdranch.android.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by cody on 9/22/2017.
 */

public class Crime {


    private UUID mId;
    public UUID getId() {
        return mId;
    }
    private String mTitle;
    private Date mDate;

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    private boolean mSolved;
    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }
}
