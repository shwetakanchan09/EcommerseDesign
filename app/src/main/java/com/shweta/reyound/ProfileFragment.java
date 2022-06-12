package com.shweta.reyound;

import android.content.Intent;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.shweta.reyound.activity.AboutActivity;
import com.shweta.reyound.activity.AddressBookActivity;
import com.shweta.reyound.activity.CareerActivity;
import com.shweta.reyound.activity.CommunicationActivity;
import com.shweta.reyound.activity.ContactUsActivity;
import com.shweta.reyound.activity.CreditActivity;
import com.shweta.reyound.activity.GiftCardActivity;
import com.shweta.reyound.activity.HelpActivity;
import com.shweta.reyound.activity.OrderHistoryActivity;
import com.shweta.reyound.activity.PaymentsActivity;
import com.shweta.reyound.activity.PrivacyActivity;
import com.shweta.reyound.activity.Profile;
import com.shweta.reyound.activity.ReturnProcessActivity;
import com.shweta.reyound.activity.ReviewActivity;
import com.shweta.reyound.activity.RewardActivity;
import com.shweta.reyound.activity.SettingActivity;
import com.shweta.reyound.activity.ShippingActivity;
import com.shweta.reyound.activity.TermsAndConditionActivity;
import com.shweta.reyound.activity.WriteToUsActivity;

public class ProfileFragment extends Fragment {

    Intent intent;
    int i=0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_profile,container,false);

        final LinearLayout linearLayout = (LinearLayout) v.findViewById(R.id.ll_Name);
        final LinearLayout llHistory = (LinearLayout) v.findViewById(R.id.ll_history);
        final LinearLayout llAddress = (LinearLayout) v.findViewById(R.id.ll_Address);
        final LinearLayout llpay = (LinearLayout) v.findViewById(R.id.ll_pay);
        final LinearLayout llCredit = (LinearLayout) v.findViewById(R.id.ll_Credit);
        final LinearLayout llCommunication = (LinearLayout) v.findViewById(R.id.ll_Communication);
        final LinearLayout llReview = (LinearLayout) v.findViewById(R.id.ll_Review);
        final LinearLayout llReward = (LinearLayout) v.findViewById(R.id.ll_Reward);
       // final ConstraintLayout llMore = (ConstraintLayout) v.findViewById(R.id.con_More);
        final ConstraintLayout llHelp = (ConstraintLayout) v.findViewById(R.id.con_Help);
        final ConstraintLayout llAbout = (ConstraintLayout) v.findViewById(R.id.con_About);
        final LinearLayout llContactUs = (LinearLayout) v.findViewById(R.id.ll_ContactUs);
        final LinearLayout llGift = (LinearLayout) v.findViewById(R.id.ll_Gift);
        final LinearLayout llWriteUs = (LinearLayout) v.findViewById(R.id.ll_writeUs);
        final LinearLayout llCareer = (LinearLayout) v.findViewById(R.id.ll_Career);
        final LinearLayout ll_About = (LinearLayout) v.findViewById(R.id.ll_About);
        final LinearLayout ll_Privacy = (LinearLayout) v.findViewById(R.id.ll_Privacy);
        final LinearLayout llTerms = (LinearLayout) v.findViewById(R.id.ll_Terms);
        final LinearLayout llShiping = (LinearLayout) v.findViewById(R.id.ll_Shipping);
        final LinearLayout llReturn = (LinearLayout) v.findViewById(R.id.ll_Return);
        final LinearLayout llHelpCenter = (LinearLayout) v.findViewById(R.id.ll_HelpCenter);
        final ImageView imgSetting = (ImageView) v.findViewById(R.id.imgSetting);


        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(), Profile.class);
                startActivity(intent);
            }
        });

        llHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(), OrderHistoryActivity.class);
                startActivity(intent);
            }
        });

        llAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(), AddressBookActivity.class);
                startActivity(intent);

            }
        });

        llpay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(), PaymentsActivity.class);
                startActivity(intent);
            }
        });

        llCredit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(), CreditActivity.class);
                startActivity(intent);
            }
        });

        llCommunication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(), CommunicationActivity.class);
                startActivity(intent);
            }
        });

        llReward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(), RewardActivity.class);
                startActivity(intent);
            }
        });

        llReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(), ReviewActivity.class);
                startActivity(intent);
            }
        });


        llHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (llShiping.isShown() && llReturn.isShown() && llHelpCenter.isShown()) {

                    llShiping.setVisibility(View.GONE);
                    llReturn.setVisibility(View.GONE);
                    llHelpCenter.setVisibility(View.GONE);

                } else {

                    llShiping.setVisibility(View.VISIBLE);
                    llReturn.setVisibility(View.VISIBLE);
                    llHelpCenter.setVisibility(View.VISIBLE);
                }
            }
        });

        llAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (llWriteUs.isShown() && llCareer.isShown() && ll_About.isShown() && ll_Privacy.isShown() && llTerms.isShown()) {

                    llWriteUs.setVisibility(View.GONE);
                    llCareer.setVisibility(View.GONE);
                    ll_About.setVisibility(View.GONE);
                    ll_Privacy.setVisibility(View.GONE);
                    llTerms.setVisibility(View.GONE);
                }else {
                    llWriteUs.setVisibility(View.VISIBLE);
                    llCareer.setVisibility(View.VISIBLE);
                    ll_About.setVisibility(View.VISIBLE);
                    ll_Privacy.setVisibility(View.VISIBLE);
                    llTerms.setVisibility(View.VISIBLE);

                }
            }
        });

        llWriteUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(getActivity(), WriteToUsActivity.class);
                startActivity(intent);

            }
        });


        llHelpCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(getActivity(), HelpActivity.class);
                startActivity(intent);

            }
        });


        ll_About.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(getActivity(), AboutActivity.class);
                startActivity(intent);

            }
        });

        llCareer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(getActivity(), CareerActivity.class);
                startActivity(intent);

            }
        });

        llTerms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(getActivity(), TermsAndConditionActivity.class);
                startActivity(intent);

            }
        });

       llShiping.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               intent = new Intent(getActivity(), ShippingActivity.class);
               startActivity(intent);

           }
       });

       llReturn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               intent = new Intent(getActivity(), ReturnProcessActivity.class);
               startActivity(intent);

           }
       });

    /*   llTerms.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               intent = new Intent(getActivity(), TermsAndConditionActivity.class);
               startActivity(intent);
           }
       });*/

        ll_Privacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(getActivity(), PrivacyActivity.class);
                startActivity(intent);

            }
        });

        llContactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(), ContactUsActivity.class);
                startActivity(intent);
            }
        });

        llGift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(), GiftCardActivity.class);
                startActivity(intent);
            }
        });

        imgSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(), SettingActivity.class);
                startActivity(intent);
            }
        });


        return  v;
    }
}