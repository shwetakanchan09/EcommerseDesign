package com.shweta.reyound.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.shweta.reyound.R;
import com.shweta.reyound.adapter.BasketImageAdapter;
import com.shweta.reyound.adapter.FeaturedItemAdapter;
import com.shweta.reyound.adapter.HomeDecoreAdapter;
import com.shweta.reyound.adapter.MayLikeAdapter;
import com.shweta.reyound.adapter.UseCoinPayLessAdapter;
import com.shweta.reyound.di.module.Basket_Image_Model;
import com.shweta.reyound.di.module.FeaturedItemModel;
import com.shweta.reyound.di.module.HomeCategoriesModel;
import com.shweta.reyound.di.module.HomeDecorModel;
import com.shweta.reyound.di.module.MayLikeModel;
import com.shweta.reyound.di.module.UseCoinPayLessModel;
import com.viewpagerindicator.CirclePageIndicator;

import java.util.ArrayList;
import java.util.List;

public class AddBasketActivity extends AppCompatActivity {

    TextView txtOverview;
    TextView txtRating;
    Intent intent;
    Button btnAddBasket;
    ImageView backbtn;
    RecyclerView rv_you_may_like,rv_featured_item,rv_use_coin;


    private static ViewPager mPager;
    private static int currentPage = 0;
    private static int NUM_PAGES = 0;
    private ArrayList<Basket_Image_Model> imageModelArrayList;

    private int[] myImageList = new int[]{R.drawable.men8, R.drawable.men8,
            R.drawable.men8,R.drawable.men8
            ,R.drawable.men8,R.drawable.men8};

    //You May Like
    MayLikeAdapter mayLikeAdapter;
    List<MayLikeModel> mayLikeModelList = new ArrayList<>();

    //Featured Item you may like
    FeaturedItemAdapter featuredItemAdapter;
    List<FeaturedItemModel> featuredItemModelList = new ArrayList<>();

    //Use coin get dis
    UseCoinPayLessAdapter useCoinPayLessAdapter;
    List<UseCoinPayLessModel> useCoinPayLessModelList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_basket);

        txtOverview = findViewById(R.id.txtOverview);
        txtRating = findViewById(R.id.txtReviews);
        btnAddBasket = findViewById(R.id.txtAddBasket);
        rv_you_may_like = findViewById(R.id.rv_may_like);
        rv_featured_item = findViewById(R.id.rv_featured_item);
        rv_use_coin = findViewById(R.id.rv_use_coin);

        backbtn = findViewById(R.id.back_btn);


        imageModelArrayList = new ArrayList<>();
        imageModelArrayList = populateList();

        init();
    }
    private ArrayList<Basket_Image_Model> populateList(){

        ArrayList<Basket_Image_Model> list = new ArrayList<>();

        for(int i = 0; i < 6; i++){
            Basket_Image_Model imageModel = new Basket_Image_Model();
            imageModel.setImage_drawable(myImageList[i]);
            list.add(imageModel);
        }

        return list;
    }

    private void init() {

        mPager = (ViewPager) findViewById(R.id.pager);
        mPager.setAdapter(new BasketImageAdapter(AddBasketActivity.this,imageModelArrayList));

        CirclePageIndicator indicator = (CirclePageIndicator)
                findViewById(R.id.indicator);

        indicator.setViewPager(mPager);

        final float density = getResources().getDisplayMetrics().density;

//Set circle indicator radius
        indicator.setRadius(5 * density);

        NUM_PAGES =imageModelArrayList.size();

           /* // Auto start of viewpager
            final Handler handler = new Handler();
            final Runnable Update = new Runnable() {
                public void run() {
                    if (currentPage == NUM_PAGES) {
                        currentPage = 0;
                    }
                    mPager.setCurrentItem(currentPage++, true);
                }
            };
            Timer swipeTimer = new Timer();
            swipeTimer.schedule(new TimerTask() {
                @Override
                public void run() {
                    handler.post(Update);
                }
            }, 3000, 3000);
*/
        // Pager listener over indicator
        indicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                currentPage = position;

            }

            @Override
            public void onPageScrolled(int pos, float arg1, int arg2) {

            }

            @Override
            public void onPageScrollStateChanged(int pos) {

            }
        });

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        txtRating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), RatingProductActivity.class);
                startActivity(intent);
            }
        });

        txtOverview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        intent = new Intent(getApplicationContext(), OverviewActivity.class);
                        startActivity(intent);
                    }
                });

        btnAddBasket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), BasketActivity.class);
                startActivity(intent);
            }
        });


        //You May Also Like
        RecyclerView.LayoutManager youmaylike_manager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rv_you_may_like.setLayoutManager(youmaylike_manager);
        mayLikeAdapter = new MayLikeAdapter(this, mayLikeModelList);
        rv_you_may_like.setItemAnimator(new DefaultItemAnimator());
        rv_you_may_like.setAdapter(mayLikeAdapter);

        mayLikeList();

        //Featured item
        RecyclerView.LayoutManager featured_item_manager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rv_featured_item.setLayoutManager(featured_item_manager);
        featuredItemAdapter = new FeaturedItemAdapter(this, featuredItemModelList);
        rv_featured_item.setItemAnimator(new DefaultItemAnimator());
        rv_featured_item.setAdapter(featuredItemAdapter);

        featuredItemList();

        //Use coin pay less
        RecyclerView.LayoutManager use_coin_manager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rv_use_coin.setLayoutManager(use_coin_manager);
        useCoinPayLessAdapter = new UseCoinPayLessAdapter(this, useCoinPayLessModelList);
        rv_use_coin.setItemAnimator(new DefaultItemAnimator());
        rv_use_coin.setAdapter(useCoinPayLessAdapter);

        useCoinPayLessList();

    }
    private void mayLikeList() {
        mayLikeModelList.add(new MayLikeModel(R.drawable.men11,"US. POLO ASSN.Men","₹ 500","₹ 1000","50% OFF" ));
        mayLikeModelList.add(new MayLikeModel(R.drawable.men10,"KAPPA Solid Crew Neck","₹ 200","₹ 400","50% OFF" ));
        mayLikeModelList.add(new MayLikeModel(R.drawable.men1,"BEING HUMAN","₹ 599","₹1199","50% OFF" ));
        mayLikeModelList.add(new MayLikeModel(R.drawable.men6,"ALLEN SOLLY","₹ 999","₹ 1999","50% OFF" ));
        mayLikeModelList.add(new MayLikeModel(R.drawable.men8,"US. POLO ASSN.Men","₹ 500","₹ 1000","50% OFF" ));
        mayLikeModelList.add(new MayLikeModel(R.drawable.men3,"PUMA Printed","₹ 699","₹ 1399","50% OFF" ));
        mayLikeModelList.add(new MayLikeModel(R.drawable.men9,"ADDIDAS.Men","₹ 1500","₹ 3000","50% OFF" ));

    }
    private void featuredItemList() {
        featuredItemModelList.add(new FeaturedItemModel(R.drawable.men11, "₹ 699", "US. POLO ASSN.Men","122"));
        featuredItemModelList.add(new FeaturedItemModel(R.drawable.men4, "₹ 799", "ALLEN SOLLY","23"));
        featuredItemModelList.add(new FeaturedItemModel(R.drawable.wom2, "₹ 749", "JUNIPER","122"));
        featuredItemModelList.add(new FeaturedItemModel(R.drawable.wom8, "₹ 749", "ZINK LONDON","22"));
        featuredItemModelList.add(new FeaturedItemModel(R.drawable.men4, "₹ 524", "MISS CHASE","56"));
        featuredItemModelList.add(new FeaturedItemModel(R.drawable.wom15, "₹ 699", "LATIN QUARTERS","66"));
        featuredItemModelList.add(new FeaturedItemModel(R.drawable.wom7, "₹ 999", "ONLY","111"));
        featuredItemModelList.add(new FeaturedItemModel(R.drawable.wom3, "₹ 1,799", "INFUSE","77"));

    }

    private void useCoinPayLessList() {
        useCoinPayLessModelList.add(new UseCoinPayLessModel(R.drawable.jeans1, "Pepe Jeans", "₹ 499", "₹999", "50% OFF", "Or Pay ₹400", "90", "Regular Jeans"));
        useCoinPayLessModelList.add(new UseCoinPayLessModel(R.drawable.jeans4, "ONLY", "₹ 1,379", "₹ 3,699", "62% OFF", "Or Pay ₹1,200", "127", "Skinny Women Blue Jeans"));
        useCoinPayLessModelList.add(new UseCoinPayLessModel(R.drawable.jeans3, "Pepe Jeans", "₹ 12,299", "₹3,499", "62% OFF", "Or Pay ₹1,229", "70", "Skinny Women Blue Jeans"));
        useCoinPayLessModelList.add(new UseCoinPayLessModel(R.drawable.jeans5, "VERO MODA", "₹ 12,299", "₹3,499", "62% OFF", "Or Pay ₹1,229", "90", "Skinny Women Blue Jeans"));
        useCoinPayLessModelList.add(new UseCoinPayLessModel(R.drawable.jeans6, "ONLY", "₹ 1,099", "2,999", "63% OFF", "Or Pay ₹1,039", "60", "Skinny Women Blue Jeans"));
        useCoinPayLessModelList.add(new UseCoinPayLessModel(R.drawable.jeans7, "LEVI'S", "₹ 699", "₹1,999", "65% OFF", "Or Pay ₹1,229", "70", "Skinny Women Blue Jeans"));
        useCoinPayLessModelList.add(new UseCoinPayLessModel(R.drawable.jeans9, "U.S. POLO ASSN.", "₹ 899", "₹2,499", "64% OFF", "Or Pay ₹849", "50", "Skinny Women Blue Jeans"));




    }
    }