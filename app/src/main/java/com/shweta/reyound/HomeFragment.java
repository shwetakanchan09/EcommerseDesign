package com.shweta.reyound;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.shweta.reyound.activity.AccesoriesActivity;
import com.shweta.reyound.activity.KidsActivity;
import com.shweta.reyound.activity.MenActivity2;
import com.shweta.reyound.activity.WomenActivity2;
import com.shweta.reyound.adapter.AccCategoriesAdapter;
import com.shweta.reyound.adapter.DealsOfAdapter;
import com.shweta.reyound.adapter.HomeCategoriesAdapter;
import com.shweta.reyound.adapter.KidsCategoriesAdapter;
import com.shweta.reyound.adapter.MenCategoriesAdapter;
import com.shweta.reyound.adapter.TrendingAdapter;
import com.shweta.reyound.adapter.WomenCategoriesAdapter;
import com.shweta.reyound.adapter.BannerSliderAdapter;
import com.shweta.reyound.adapter.HomeCategoryAdapter;
import com.shweta.reyound.adapter.HomeCategoryAdapter1;
import com.shweta.reyound.adapter.HomeCategoryAdapter2;
import com.shweta.reyound.adapter.HomeCategoryAdapter3;
import com.shweta.reyound.adapter.HomeDecoreAdapter;
import com.shweta.reyound.adapter.NewArrivalAdapter;
import com.shweta.reyound.adapter.PriceStoreAdapter;
import com.shweta.reyound.di.module.AccCategoriesModel;
import com.shweta.reyound.di.module.DealsOfDayModel;
import com.shweta.reyound.di.module.HomeCategoriesModel;
import com.shweta.reyound.di.module.KidsCategoriesModel;
import com.shweta.reyound.di.module.MenCategoriesModel;
import com.shweta.reyound.di.module.TrendingModel;
import com.shweta.reyound.di.module.WomenCategoriesModel;
import com.shweta.reyound.di.module.BannerSliderModel;
import com.shweta.reyound.di.module.HomeData;
import com.shweta.reyound.di.module.HomeData1;
import com.shweta.reyound.di.module.HomeData2;
import com.shweta.reyound.di.module.HomeData3;
import com.shweta.reyound.di.module.HomeDecorModel;
import com.shweta.reyound.di.module.NewArrivalModel;
import com.shweta.reyound.di.module.PriceStoreModel;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private static final String TAG = "AnimationStarter";
    ObjectAnimator textColorAnim;
    View view;
    Animation animTogether;

    private Handler sliderHandler = new Handler();

    // ImageView imgMen,imgWomen,imgKids,imgBeauty,imgAcc;
    Intent intent;
    Context mContext;
    String title, message;

    RecyclerView recyclerView;
    List<HomeModel> itemList;


    //banner sliderview
    BannerSliderAdapter adapterr;
    //banner sliderview
    DealsOfAdapter adapterr1;


    private ArrayList<HomeData> recyclerDataArrayList;
    private ArrayList<HomeData1> recyclerDataArrayList1;
    private ArrayList<HomeData2> recyclerDataArrayList2;
    private ArrayList<HomeData3> recyclerDataArrayList3;

    //price store
    PriceStoreAdapter priceStoreAdapter;
    List<PriceStoreModel> priceStoreModelList = new ArrayList<>();

    //Home Decor
    HomeDecoreAdapter homeDecoreAdapter;
    List<HomeDecorModel> homeDecorModelList = new ArrayList<>();

    //New Arrival
    NewArrivalAdapter newArrivalAdapter;
    List<NewArrivalModel> newArrivalModelList = new ArrayList<>();

    //All Category(women)
    WomenCategoriesAdapter womenCategoriesAdapter;
    List<WomenCategoriesModel> womenCategoriesModelList = new ArrayList<>();

    //All Category(men)
    MenCategoriesAdapter menCategoriesAdapter;
    List<MenCategoriesModel> menCategoriesModelList = new ArrayList<>();

    //All Category(kids)
    KidsCategoriesAdapter kidsCategoriesAdapter;
    List<KidsCategoriesModel> kidsCategoriesModelList = new ArrayList<>();

    //All Category(Accessories)
    AccCategoriesAdapter accCategoriesAdapter;
    List<AccCategoriesModel> accCategoriesModelList = new ArrayList<>();

    //All Category(home)
    HomeCategoriesAdapter homeCategoriesAdapter;
    List<HomeCategoriesModel> homeCategoriesModelList = new ArrayList<>();

    //Trending list
    List<TrendingModel> trendingModelList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        mContext = getActivity();

        final ImageView imgMen = (ImageView) v.findViewById(R.id.imgMen);
        final ImageView imgWomen = (ImageView) v.findViewById(R.id.imgWmen);
        final ImageView imgKids = (ImageView) v.findViewById(R.id.imgGirl);
        final ImageView imgBeauty = (ImageView) v.findViewById(R.id.imgBeauty);
        final ImageView imgAcc = (ImageView) v.findViewById(R.id.imgAcc);
        final ImageView imgHom = (ImageView) v.findViewById(R.id.imgHom);
        final SliderView sv_banner = (SliderView) v.findViewById(R.id.sv_banner);
        //final SliderView sv_banner1 = (SliderView) v.findViewById(R.id.sv_banner1);

        final RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.r_Categories);
        final RecyclerView recyclerView1 = (RecyclerView) v.findViewById(R.id.r_Categories1);
        final RecyclerView recyclerView2 = (RecyclerView) v.findViewById(R.id.r_Categories2);
        final RecyclerView recyclerView3 = (RecyclerView) v.findViewById(R.id.r_Categories3);
        final RelativeLayout relativeLayout = (RelativeLayout) v.findViewById(R.id.r_back);
        final RecyclerView rv_pricestorelist = (RecyclerView) v.findViewById(R.id.rv_pricestorelist);
        final RecyclerView rv_home_decor_list = (RecyclerView) v.findViewById(R.id.rv_home_decor_list);
        final RecyclerView rv_new_arrival_list = (RecyclerView) v.findViewById(R.id.rv_new_arrival_list);
        final RecyclerView rv_Women = (RecyclerView) v.findViewById(R.id.rv_Women);
        final RecyclerView rv_Men = (RecyclerView) v.findViewById(R.id.rv_Men);
        final RecyclerView rv_Acc = (RecyclerView) v.findViewById(R.id.rv_Acc);
        final RecyclerView rv_Kid = (RecyclerView) v.findViewById(R.id.rv_Kids);
        final RecyclerView rv_Home = (RecyclerView) v.findViewById(R.id.rv_home);
        final RecyclerView rv_Trending = (RecyclerView) v.findViewById(R.id.rv_trending);
        final TextView zoomin = (TextView) v.findViewById(R.id.zoomIntext);
        final TextView zoomout = (TextView) v.findViewById(R.id.zoomOutext);
        final TextView blinkText = (TextView) v.findViewById(R.id.blinktext);
        animTogether = AnimationUtils.loadAnimation(mContext, R.anim.together);

        // Find the ImageView to display the GIF
        ImageView ivGif = (ImageView) v.findViewById(R.id.ivGif);
        // Display the GIF (from raw resource) into the ImageView
        Glide.with(this).load(R.drawable.gif1).into(ivGif);
        // OR even download from the network
        // Glide.with(this).load("https://i.imgur.com/l9lffwf.gif").asGif().into(imageView);


        textColorAnim = ObjectAnimator.ofInt(blinkText, "textColor", Color.RED, Color.BLUE);
        textColorAnim.setDuration(500);
        textColorAnim.setEvaluator(new ArgbEvaluator());
        textColorAnim.setRepeatCount(ValueAnimator.INFINITE);
        textColorAnim.setRepeatMode(ValueAnimator.REVERSE);
        textColorAnim.start();

       /* animTogether = AnimationUtils.loadAnimation(getContext(),
                R.anim.together);
        animTogether.setAnimationListener((Animation.AnimationListener) getContext());
        zoomin.startAnimation(animTogether);

*/

        if ( zoomin.isShown() && zoomout.isShown()) {
            zoomin.setVisibility(View.VISIBLE);
            zoomout.setVisibility(View.GONE);
            Animation animZoomIn = AnimationUtils.loadAnimation(mContext,R.anim.zoom_in);
            zoomin.startAnimation(animZoomIn);

        }else {
            zoomin.setVisibility(View.GONE);
            zoomout.setVisibility(View.VISIBLE);
            Animation animZoomOut = AnimationUtils.loadAnimation(mContext,R.anim.zoom_out);
            zoomout.startAnimation(animZoomOut);

        }
        //Banner Slider view
        ArrayList<BannerSliderModel> bannerSliderModelArrayList = new ArrayList<>();
        bannerSliderModelArrayList.add(new BannerSliderModel("https://reyound.com/wp-content/uploads/2021/04/MCD-CHS-PRTS-WH-MLXL_1.jpg"));
        bannerSliderModelArrayList.add(new BannerSliderModel("https://reyound.com/wp-content/uploads/2021/05/JG-CR-TP-LBL-MLXL_1.jpg"));
        bannerSliderModelArrayList.add(new BannerSliderModel("https://reyound.com/wp-content/uploads/2021/05/KC-WB-PR9_1.jpg"));
        bannerSliderModelArrayList.add(new BannerSliderModel("https://reyound.com/wp-content/uploads/2021/04/EXP-CFS-PRTS-BK-ML_1.jpg"));
        bannerSliderModelArrayList.add(new BannerSliderModel("https://reyound.com/wp-content/uploads/2021/05/JG-CT-TP-YL-MLXL_1.jpg"));
        bannerSliderModelArrayList.add(new BannerSliderModel("https://reyound.com/wp-content/uploads/2021/05/FV-RG-CB-T1_1.jpg"));

        BannerSliderAdapter adapterr = new BannerSliderAdapter(mContext, bannerSliderModelArrayList);
        sv_banner.setAutoCycleDirection(SliderView.LAYOUT_DIRECTION_LTR);
        sv_banner.setSliderAdapter(adapterr);
        sv_banner.setScrollTimeInSec(3);
        sv_banner.setAutoCycle(true);
        sv_banner.startAutoCycle();

        //Banner Slider view
        ArrayList<DealsOfDayModel> dealsOfDayModelArrayList = new ArrayList<>();
        dealsOfDayModelArrayList.add(new DealsOfDayModel("https://reyound.com/wp-content/uploads/2021/04/MCD-CHS-PRTS-WH-MLXL_1.jpg"));
        dealsOfDayModelArrayList.add(new DealsOfDayModel("https://reyound.com/wp-content/uploads/2021/05/JG-CR-TP-LBL-MLXL_1.jpg"));
        dealsOfDayModelArrayList.add(new DealsOfDayModel("https://reyound.com/wp-content/uploads/2021/05/KC-WB-PR9_1.jpg"));
        dealsOfDayModelArrayList.add(new DealsOfDayModel("https://reyound.com/wp-content/uploads/2021/04/EXP-CFS-PRTS-BK-ML_1.jpg"));
        dealsOfDayModelArrayList.add(new DealsOfDayModel("https://reyound.com/wp-content/uploads/2021/05/JG-CT-TP-YL-MLXL_1.jpg"));
        dealsOfDayModelArrayList.add(new DealsOfDayModel("https://reyound.com/wp-content/uploads/2021/05/FV-RG-CB-T1_1.jpg"));

       /* DealsOfAdapter adapterr1 = new DealsOfAdapter(mContext, dealsOfDayModelArrayList);
        sv_banner1.setAutoCycleDirection(SliderView.LAYOUT_DIRECTION_LTR);
        sv_banner1.setSliderAdapter(adapterr1);
        sv_banner1.setScrollTimeInSec(3);
        sv_banner1.setAutoCycle(true);
        sv_banner1.startAutoCycle();*/

        //pricestore recyclerview
        RecyclerView.LayoutManager pricestore_manager = new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false);
        rv_pricestorelist.setLayoutManager(pricestore_manager);
        priceStoreAdapter = new PriceStoreAdapter(mContext, priceStoreModelList);
        rv_pricestorelist.setItemAnimator(new DefaultItemAnimator());
        rv_pricestorelist.setAdapter(priceStoreAdapter);

        priceStoreList();


        recyclerDataArrayList = new ArrayList<>();
        recyclerDataArrayList.add(new HomeData("Tops", R.drawable.wom14));
        recyclerDataArrayList.add(new HomeData("Casual Shirts", R.drawable.casual10));
        recyclerDataArrayList.add(new HomeData("Saree", R.drawable.saree1));
        recyclerDataArrayList.add(new HomeData("Kids", R.drawable.fashion1));
        recyclerDataArrayList.add(new HomeData("InnerWear", R.drawable.inner));
        recyclerDataArrayList.add(new HomeData("Accessory", R.drawable.wacces));
        recyclerDataArrayList.add(new HomeData("Home", R.drawable.home));
        recyclerDataArrayList.add(new HomeData("Makeup", R.drawable.make1));
        recyclerDataArrayList.add(new HomeData("Jwellary", R.drawable.jwellary));


        HomeCategoryAdapter adapter = new HomeCategoryAdapter(recyclerDataArrayList, getContext());
        GridLayoutManager layoutManager = new GridLayoutManager(getContext(), 3);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        recyclerDataArrayList1 = new ArrayList<>();
        recyclerDataArrayList1.add(new HomeData1("Casual Shirts", R.drawable.casual10));
        recyclerDataArrayList1.add(new HomeData1("Saree", R.drawable.saree1));
        recyclerDataArrayList1.add(new HomeData1("Kids", R.drawable.fashion1));
        recyclerDataArrayList1.add(new HomeData1("Denim", R.drawable.tr4));
        recyclerDataArrayList1.add(new HomeData1("InnerWear", R.drawable.inner));
        recyclerDataArrayList1.add(new HomeData1("Footwear", R.drawable.mfoot));
        recyclerDataArrayList1.add(new HomeData1("Home", R.drawable.home));
        recyclerDataArrayList1.add(new HomeData1("Makeup", R.drawable.make1));
        recyclerDataArrayList1.add(new HomeData1("Fragrances", R.drawable.frag4));
        recyclerDataArrayList1.add(new HomeData1("Winter Care", R.drawable.winter));
        recyclerDataArrayList1.add(new HomeData1("Top Wear", R.drawable.wom6));
        recyclerDataArrayList1.add(new HomeData1("Men's Fashion", R.drawable.mfashion));

        HomeCategoryAdapter1 adapter1 = new HomeCategoryAdapter1(recyclerDataArrayList1, getContext());
        GridLayoutManager layoutManager1 = new GridLayoutManager(getContext(), 4);
        recyclerView1.setLayoutManager(layoutManager1);
        recyclerView1.setAdapter(adapter1);

        recyclerDataArrayList2 = new ArrayList<>();
        recyclerDataArrayList2.add(new HomeData2("Home", R.drawable.home));
        recyclerDataArrayList2.add(new HomeData2("Ethic Wear", R.drawable.methic));
        recyclerDataArrayList2.add(new HomeData2("Formal", R.drawable.mformal));
        recyclerDataArrayList2.add(new HomeData2("Western Wear", R.drawable.mwestern));

        HomeCategoryAdapter2 adapter2 = new HomeCategoryAdapter2(recyclerDataArrayList2, getContext());
        GridLayoutManager layoutManager2 = new GridLayoutManager(getContext(), 2);
        recyclerView2.setLayoutManager(layoutManager2);
        recyclerView2.setAdapter(adapter2);

//recent view
        recyclerDataArrayList3 = new ArrayList<>();
        recyclerDataArrayList3.add(new HomeData3("Materneety", R.drawable.materneety));
        recyclerDataArrayList3.add(new HomeData3("Toys", R.drawable.toys1));
        recyclerDataArrayList3.add(new HomeData3("Ethic Wear", R.drawable.ethic1));
        recyclerDataArrayList3.add(new HomeData3("Skin Care", R.drawable.womens));

        HomeCategoryAdapter3 adapter3 = new HomeCategoryAdapter3(recyclerDataArrayList3, getContext());
        GridLayoutManager layoutManager3 = new GridLayoutManager(getContext(), 2);
        recyclerView3.setLayoutManager(layoutManager3);
        recyclerView3.setAdapter(adapter3);

        //Home Decor recyclerview
        RecyclerView.LayoutManager homedecore_manager = new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false);
        rv_home_decor_list.setLayoutManager(homedecore_manager);
        homeDecoreAdapter = new HomeDecoreAdapter(mContext, homeDecorModelList);
        rv_home_decor_list.setItemAnimator(new DefaultItemAnimator());
        rv_home_decor_list.setAdapter(homeDecoreAdapter);

        homeDecorList();

        //Home Decor recyclerview
        RecyclerView.LayoutManager newarrival_manager = new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false);
        rv_new_arrival_list.setLayoutManager(newarrival_manager);
        newArrivalAdapter = new NewArrivalAdapter(mContext, newArrivalModelList);
        rv_new_arrival_list.setItemAnimator(new DefaultItemAnimator());
        rv_new_arrival_list.setAdapter(newArrivalAdapter);

        newArrivalList();

        //womenCategory recyclerview
        RecyclerView.LayoutManager womenCategory_manager = new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false);
        rv_Women.setLayoutManager(womenCategory_manager);
        womenCategoriesAdapter = new WomenCategoriesAdapter(mContext, womenCategoriesModelList);
        rv_Women.setItemAnimator(new DefaultItemAnimator());
        rv_Women.setAdapter(womenCategoriesAdapter);

        womenCategoryList();

        //MenCategory recyclerview
        RecyclerView.LayoutManager menCategory_manager = new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false);
        rv_Men.setLayoutManager(menCategory_manager);
        menCategoriesAdapter = new MenCategoriesAdapter(mContext, menCategoriesModelList);
        rv_Men.setItemAnimator(new DefaultItemAnimator());
        rv_Men.setAdapter(menCategoriesAdapter);

        menCategoryList();

        //KidCategory recyclerview
        RecyclerView.LayoutManager kidCategory_manager = new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false);
        rv_Kid.setLayoutManager(kidCategory_manager);
        kidsCategoriesAdapter = new KidsCategoriesAdapter(mContext, kidsCategoriesModelList);
        rv_Kid.setItemAnimator(new DefaultItemAnimator());
        rv_Kid.setAdapter(kidsCategoriesAdapter);

        kidCategoryList();

        //AccessoryCategory recyclerview
        RecyclerView.LayoutManager accCategory_manager = new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false);
        rv_Acc.setLayoutManager(accCategory_manager);
        accCategoriesAdapter = new AccCategoriesAdapter(mContext, accCategoriesModelList);
        rv_Acc.setItemAnimator(new DefaultItemAnimator());
        rv_Acc.setAdapter(accCategoriesAdapter);

        accessoryCategoryList();

        //HomeCategory recyclerview
        RecyclerView.LayoutManager homeCategory_manager = new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false);
        rv_Home.setLayoutManager(homeCategory_manager);
        homeCategoriesAdapter = new HomeCategoriesAdapter(mContext, homeCategoriesModelList);
        rv_Home.setItemAnimator(new DefaultItemAnimator());
        rv_Home.setAdapter(homeCategoriesAdapter);

        homeCategoryList();

        //Trending list
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContext, LinearLayoutManager.VERTICAL, false);
        rv_Trending.setLayoutManager(linearLayoutManager);
        rv_Trending.setItemAnimator(new DefaultItemAnimator());
        TrendingAdapter trendingAdapter = new TrendingAdapter(mContext, trendingModelList);
        rv_Trending.setAdapter(trendingAdapter);

        trendingModelList.add(new TrendingModel("₹ 22500", "Sofa set", 5, R.drawable.home7));
        trendingModelList.add(new TrendingModel("₹ 1000", "Baby Health Care", 3, R.drawable.health));
        trendingModelList.add(new TrendingModel("₹ 500", "Fancy Jacket", 4, R.drawable.mwestern));
        trendingModelList.add(new TrendingModel("₹ 1500", "mask set", 5, R.drawable.maskm));
        trendingModelList.add(new TrendingModel("₹ 800", "Women Health Care", 4, R.drawable.women));
        trendingModelList.add(new TrendingModel("₹ 450", "Face Makeup Kit", 4, R.drawable.make10));
        trendingModelList.add(new TrendingModel("₹ 2000", "Women Bag", 5, R.drawable.acc));


        //trendingList();

        imgMen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(), MenActivity2.class);
                startActivity(intent);
            }
        });

        imgWomen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(), WomenActivity2.class);
                startActivity(intent);
            }
        });

        imgKids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(), KidsActivity.class);
                startActivity(intent);
            }
        });

        imgBeauty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(), AccesoriesActivity.class);
                startActivity(intent);
            }
        });

        imgAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(), AccesoriesActivity.class);
                startActivity(intent);
            }
        });

        return v;

    }

    private void priceStoreList() {
        priceStoreModelList.add(new PriceStoreModel("Under \n₹ 199"));
        priceStoreModelList.add(new PriceStoreModel("Under \n₹ 299"));
        priceStoreModelList.add(new PriceStoreModel("Under \n₹ 399"));
        priceStoreModelList.add(new PriceStoreModel("Under \n₹ 499"));
        priceStoreModelList.add(new PriceStoreModel("Under \n₹ 599"));
        priceStoreModelList.add(new PriceStoreModel("Under \n₹ 699"));
    }

    private void homeDecorList() {
        homeDecorModelList.add(new HomeDecorModel(R.drawable.home7, "BEDDING\n Upto 50% OFF"));
        homeDecorModelList.add(new HomeDecorModel(R.drawable.home2, "DINNING\n Upto 70% OFF"));
        homeDecorModelList.add(new HomeDecorModel(R.drawable.home8, "CUSHION & CURTAINS "));
        homeDecorModelList.add(new HomeDecorModel(R.drawable.home4, "KITCHEN & HOME APPLIANCES"));
        homeDecorModelList.add(new HomeDecorModel(R.drawable.home5, "BATHROOM NEEDS"));
        homeDecorModelList.add(new HomeDecorModel(R.drawable.home9, "SOFA & FURNITURE"));
    }

    private void newArrivalList() {
        newArrivalModelList.add(new NewArrivalModel(R.drawable.winter, "WINTER CARE"));
        newArrivalModelList.add(new NewArrivalModel(R.drawable.ethic, "BRIDE SPECIAL"));
        newArrivalModelList.add(new NewArrivalModel(R.drawable.make9, "BEAUTY"));
        newArrivalModelList.add(new NewArrivalModel(R.drawable.wbag, "ACCESSORIES"));
        newArrivalModelList.add(new NewArrivalModel(R.drawable.home8, "HOME NEED"));
        newArrivalModelList.add(new NewArrivalModel(R.drawable.ethic1, "MENS & WOMEN"));
        newArrivalModelList.add(new NewArrivalModel(R.drawable.kids2, "ALL ABOUT KIDS"));
    }

    private void womenCategoryList() {
        womenCategoriesModelList.add(new WomenCategoriesModel(R.drawable.saree, "Ethnic Wear"));
        womenCategoriesModelList.add(new WomenCategoriesModel(R.drawable.wom4, "Western Wear"));
        womenCategoriesModelList.add(new WomenCategoriesModel(R.drawable.wfoot, "Footwear"));
        womenCategoriesModelList.add(new WomenCategoriesModel(R.drawable.inner, "lingerie & Sleepwear"));
        womenCategoriesModelList.add(new WomenCategoriesModel(R.drawable.beauty, "Beauty & Care"));
        womenCategoriesModelList.add(new WomenCategoriesModel(R.drawable.jwellary, "Jewellery"));
        womenCategoriesModelList.add(new WomenCategoriesModel(R.drawable.wacces, "Women's Accessories"));

    }

    private void menCategoryList() {
        menCategoriesModelList.add(new MenCategoriesModel(R.drawable.men8, "Topwear"));
        menCategoriesModelList.add(new MenCategoriesModel(R.drawable.jeans4, "Bottomwear"));
        menCategoriesModelList.add(new MenCategoriesModel(R.drawable.mfoot, "Footwear"));
        menCategoriesModelList.add(new MenCategoriesModel(R.drawable.msports, "Innerwear"));
        menCategoriesModelList.add(new MenCategoriesModel(R.drawable.groom, "Men's Groming"));
        menCategoriesModelList.add(new MenCategoriesModel(R.drawable.mfashion, "Men's Accessories"));

    }

    private void kidCategoryList() {
        kidsCategoriesModelList.add(new KidsCategoriesModel(R.drawable.birthday, "Clothing"));
        kidsCategoriesModelList.add(new KidsCategoriesModel(R.drawable.footwear, "Footwear"));
        kidsCategoriesModelList.add(new KidsCategoriesModel(R.drawable.bath2, "Baby Care"));
        kidsCategoriesModelList.add(new KidsCategoriesModel(R.drawable.baby_acce, "Kids Accessories"));
        kidsCategoriesModelList.add(new KidsCategoriesModel(R.drawable.diapering, "Diapering"));
        kidsCategoriesModelList.add(new KidsCategoriesModel(R.drawable.toys, "Toys"));
        kidsCategoriesModelList.add(new KidsCategoriesModel(R.drawable.gear, "Gear & Activities"));


    }

    private void accessoryCategoryList() {
        accCategoriesModelList.add(new AccCategoriesModel(R.drawable.clutches, "Sling Bag"));
        accCategoriesModelList.add(new AccCategoriesModel(R.drawable.mbag, "Office Bag"));
        accCategoriesModelList.add(new AccCategoriesModel(R.drawable.wbag, "wallets"));
        accCategoriesModelList.add(new AccCategoriesModel(R.drawable.mwbag, "All Accessories"));
        accCategoriesModelList.add(new AccCategoriesModel(R.drawable.luggege, "Laggages"));
        accCategoriesModelList.add(new AccCategoriesModel(R.drawable.sports_bag, "Sports Bag"));

    }

    private void homeCategoryList() {
        homeCategoriesModelList.add(new HomeCategoriesModel(R.drawable.home4, "Bed & Furniture"));
        homeCategoriesModelList.add(new HomeCategoriesModel(R.drawable.home3, "Kitchen & Table"));
        homeCategoriesModelList.add(new HomeCategoriesModel(R.drawable.home8, "Home Lighting"));
        homeCategoriesModelList.add(new HomeCategoriesModel(R.drawable.sofa, "Home Décor"));

    }


}



