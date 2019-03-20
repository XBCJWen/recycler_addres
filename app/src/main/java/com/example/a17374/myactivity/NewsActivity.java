package com.example.a17374.myactivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.bigkoo.pickerview.builder.OptionsPickerBuilder;
import com.bigkoo.pickerview.listener.OnOptionsSelectListener;
import com.bigkoo.pickerview.view.OptionsPickerView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NewsActivity extends AppCompatActivity implements View.OnClickListener {


    private ImageButton mImgbtn1;
    private ImageButton mImgbtn2;
    private ImageButton mImgbtn3;
    private ImageButton mImgbtn4;
    private LinearLayout mLayout2;
    private LinearLayout mLayout3;
    private LinearLayout mLayout4;
    private ListView mLayout1;
    private LinearLayout mLayout;
    private ImageView mImg1;
    private Button mBtnAddres;
    //  省
    private List<ShengBean> options1Items = new ArrayList<ShengBean>();
    //  市
    private ArrayList<ArrayList<String>> options2Items = new ArrayList<>();
    //  区
    private ArrayList<ArrayList<ArrayList<String>>> options3Items = new ArrayList<>();
    private TextView mTvAddres;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        initView();
    }


    private void initView() {


        mImgbtn1 = (ImageButton) findViewById(R.id.imgbtn_1);
        mImgbtn2 = (ImageButton) findViewById(R.id.imgbtn_2);
        mImgbtn3 = (ImageButton) findViewById(R.id.imgbtn_3);
        mImgbtn4 = (ImageButton) findViewById(R.id.imgbtn_4);
        mLayout = (LinearLayout) findViewById(R.id.layout);

        mImgbtn1.setOnClickListener(this);
        mImgbtn2.setOnClickListener(this);
        mImgbtn3.setOnClickListener(this);
        mImgbtn4.setOnClickListener(this);

        mLayout1 = (ListView) findViewById(R.id.layout_1);
        mLayout2 = (LinearLayout) findViewById(R.id.layout_2);
        mLayout3 = (LinearLayout) findViewById(R.id.layout_3);
        mLayout4 = (LinearLayout) findViewById(R.id.layout_4);

        mImg1 = (ImageView) findViewById(R.id.img_1);
        mImg1.setOnClickListener(this);
        mBtnAddres = (Button) findViewById(R.id.btn_addres);
        mBtnAddres.setOnClickListener(this);
        mTvAddres = (TextView) findViewById(R.id.tv_addres);
        mTvAddres.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imgbtn_1:
                mLayout.setVisibility(View.VISIBLE);
                mLayout2.setVisibility(View.INVISIBLE);
                mLayout3.setVisibility(View.INVISIBLE);
                mLayout4.setVisibility(View.INVISIBLE);


                List<Map<String, Object>> list = new ArrayList<>();
                Map<String, Object> map1 = new HashMap<>();
                map1.put("logo", R.mipmap.weixin);
                map1.put("title", "微信");
                map1.put("neirou", "聊天工具");
                list.add(map1);

                Map<String, Object> map2 = new HashMap<>();
                map2.put("logo", R.mipmap.yixin);
                map2.put("title", "易信");
                map2.put("neirou", "聊天工具");
                list.add(map2);

                Map<String, Object> map3 = new HashMap<>();
                map3.put("logo", R.mipmap.miliao);
                map3.put("title", "米聊");
                map3.put("neirou", "聊天工具");
                list.add(map3);

                map1.put("logo", R.mipmap.weixin);
                map1.put("title", "微信");
                map1.put("neirou", "聊天工具");
                list.add(map1);

                map2.put("logo", R.mipmap.yixin);
                map2.put("title", "易信");
                map2.put("neirou", "聊天工具");
                list.add(map2);

                map3.put("logo", R.mipmap.miliao);
                map3.put("title", "米聊");
                map3.put("neirou", "聊天工具");
                list.add(map3);
                map3.put("logo", R.mipmap.miliao);
                map3.put("title", "米聊");
                map3.put("neirou", "聊天工具");
                list.add(map3);
                map3.put("logo", R.mipmap.miliao);
                map3.put("title", "米聊");
                map3.put("neirou", "聊天工具");
                list.add(map3);
                map3.put("logo", R.mipmap.miliao);
                map3.put("title", "米聊");
                map3.put("neirou", "聊天工具");
                list.add(map3);
                map3.put("logo", R.mipmap.miliao);
                map3.put("title", "米聊");
                map3.put("neirou", "聊天工具");
                list.add(map3);

                SimpleAdapter simpleAdapter = new SimpleAdapter(getApplicationContext(), list, R.layout.li_text, new String[]{"logo", "title", "neirou"}, new int[]{R.id.img_title, R.id.tv_title, R.id.tv_neirou});
                mLayout1.setAdapter(simpleAdapter);
                break;
            case R.id.imgbtn_2:
                mLayout.setVisibility(View.INVISIBLE);
                mLayout2.setVisibility(View.VISIBLE);
                mLayout3.setVisibility(View.INVISIBLE);
                mLayout4.setVisibility(View.INVISIBLE);
                List<Fruit> fruits = new ArrayList<>();

                @SuppressLint("WrongViewCast") final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
                linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
                recyclerView.setLayoutManager(linearLayoutManager);
                FruitAdapter fruitAdapter = new FruitAdapter(fruits);
                recyclerView.setAdapter(fruitAdapter);

                recyclerView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "sdfasfasdf", Toast.LENGTH_SHORT).show();
                    }
                });

                for (int i = 0; i < 2; i++) {
                    Fruit fruit1 = new Fruit( R.mipmap.girl2, R.mipmap.girl3);
                    fruits.add(fruit1);
                    Fruit fruit12 = new Fruit( R.mipmap.girl5, R.mipmap.mm1);
                    fruits.add(fruit12);
                    Fruit fruit3 = new Fruit( R.mipmap.mm3, R.mipmap.mm4);
                    fruits.add(fruit3);
                }
                break;
            case R.id.imgbtn_3:
                mLayout.setVisibility(View.INVISIBLE);
                mLayout2.setVisibility(View.INVISIBLE);
                mLayout3.setVisibility(View.VISIBLE);
                mLayout4.setVisibility(View.INVISIBLE);
                List<Fruit2> fruit2s = new ArrayList<>();

                RecyclerView recyclerView1 = (RecyclerView) findViewById(R.id.recycler3);
                LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(this);
                linearLayoutManager1.setOrientation(linearLayoutManager1.HORIZONTAL);
                recyclerView1.setLayoutManager(linearLayoutManager1);
                Fruit2Adpter fruit2Adpter = new Fruit2Adpter(fruit2s);
                recyclerView1.setAdapter(fruit2Adpter);

                for (int j = 0; j < 2; j++) {
                    Fruit2 im1 = new Fruit2(R.mipmap.mm5);
                    fruit2s.add(im1);
                    Fruit2 im2 = new Fruit2(R.mipmap.mm4);
                    fruit2s.add(im2);
                    Fruit2 im3 = new Fruit2(R.mipmap.mm3);
                    fruit2s.add(im3);
                    Fruit2 im4 = new Fruit2(R.mipmap.mm2);
                    fruit2s.add(im4);
                    Fruit2 im5 = new Fruit2(R.mipmap.mm1);
                    fruit2s.add(im5);
                    Fruit2 im6 = new Fruit2(R.mipmap.girl1);
                    fruit2s.add(im6);
                    Fruit2 im7 = new Fruit2(R.mipmap.girl2);
                    fruit2s.add(im7);
                    Fruit2 im8 = new Fruit2(R.mipmap.girl3);
                    fruit2s.add(im8);
                    Fruit2 im9 = new Fruit2(R.mipmap.girl4);
                    fruit2s.add(im9);
                    Fruit2 im10 = new Fruit2(R.mipmap.girl5);
                    fruit2s.add(im10);
                    Fruit2 im11 = new Fruit2(R.mipmap.girl1);
                    fruit2s.add(im11);
                }


                break;
            case R.id.imgbtn_4:
                mLayout.setVisibility(View.INVISIBLE);
                mLayout2.setVisibility(View.INVISIBLE);
                mLayout3.setVisibility(View.INVISIBLE);
                mLayout4.setVisibility(View.VISIBLE);


                break;
            case R.id.btn_addres:
                parseData();
                showPickerView();
                break;

        }
    }

    private void parseData() {
        String jsonStr = new GetJsonDataUtil().getJson(this, "province.json");//获取assets目录下的json文件数据
//     数据解析
        Gson gson = new Gson();
        Type type = new TypeToken<List<ShengBean>>() {
        }.getType();
        List<ShengBean> shengList = gson.fromJson(jsonStr, type);
//     把解析后的数据组装成想要的list
        options1Items = shengList;
//     遍历省
        for (int i = 0; i < shengList.size(); i++) {
//         存放城市
            ArrayList<String> cityList = new ArrayList<>();
//         存放区
            ArrayList<ArrayList<String>> province_AreaList = new ArrayList<>();
//         遍历市
            for (int c = 0; c < shengList.get(i).city.size(); c++) {
//        拿到城市名称
                String cityName = shengList.get(i).city.get(c).name;
                cityList.add(cityName);

                ArrayList<String> city_AreaList = new ArrayList<>();//该城市的所有地区列表
                if (shengList.get(i).city.get(c).area == null || shengList.get(i).city.get(c).area.size() == 0) {
                    city_AreaList.add("");
                } else {
                    city_AreaList.addAll(shengList.get(i).city.get(c).area);
                }
                province_AreaList.add(city_AreaList);
            }
            /**
             * 添加城市数据
             */
            options2Items.add(cityList);
            /**
             * 添加地区数据
             */
            options3Items.add(province_AreaList);
        }

    }

    /**
     * 展示选择器
     */
    private void showPickerView() {// 弹出选择器

        OptionsPickerView pvOptions = new OptionsPickerBuilder(this, new OnOptionsSelectListener() {
            @Override
            public void onOptionsSelect(int options1, int options2, int options3, View v) {
                //返回的分别是三个级别的选中位置
                String tx = options1Items.get(options1).name +
                        options2Items.get(options1).get(options2) +
                        options3Items.get(options1).get(options2).get(options3);
                Toast.makeText(NewsActivity.this, tx, Toast.LENGTH_SHORT).show();
                mTvAddres.setText(tx);
            }
        })

                .setTitleText("城市选择")
                .setDividerColor(Color.BLACK)
                .setTextColorCenter(Color.BLACK) //设置选中项文字颜色
                .setContentTextSize(20)
                .build();

        /*pvOptions.setPicker(options1Items);//一级选择器
        pvOptions.setPicker(options1Items, options2Items);//二级选择器*/
        pvOptions.setPicker(options1Items, options2Items, options3Items);//三级选择器
        pvOptions.show();
    }


    class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.ViewHolder> {
        private List<Fruit> mFruitList;

        class ViewHolder extends RecyclerView.ViewHolder {
            View fruitView;
            ImageView Image1;
            ImageView Image2;

            @SuppressLint({"ResourceType", "WrongViewCast"})
            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                fruitView = itemView;
                Image1 = (ImageView) itemView.findViewById(R.id.re_image_1);
                Image2 = (ImageView) itemView.findViewById(R.id.re_image_2);

            }
        }


        public FruitAdapter(List<Fruit> fruitList) {
            mFruitList = fruitList;
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler, viewGroup, false);
            final ViewHolder holder = new ViewHolder(view);

            return holder;
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
            Fruit fruit = mFruitList.get(i);
            viewHolder.Image1.setImageResource(fruit.getImageId1());
            viewHolder.Image2.setImageResource(fruit.getImageId2());

        }

        @Override
        public int getItemCount() {
            return mFruitList.size();
        }
    }
}