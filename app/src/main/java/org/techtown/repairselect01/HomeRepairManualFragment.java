package org.techtown.repairselect01;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.zip.Inflater;

public class HomeRepairManualFragment extends Fragment {
    private static Typeface typeface;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.home_repair_manual_fragment, container, false);

        String[] list_menu = { "1. 집을 오래 잘 쓰기 위해 적정한 수선, 교체가 필요합니다", "2. 다양한 주택 유형", "3. 노후주택이 처한 곤란",
                "4. 집수리에도 순서가 있어요", "5. 집의 문제를 진단해요", "6. 견적서 작성 방법", "7. 계약시 유의사항", "8. 공정표를 만듭니다",
                "9. 누수진단과 방수 공사", "10. 에너지 진단과 단열공사", "11. 창호공사", "12. 집 사용설명서" };

        ListView listView = (ListView) rootView.findViewById(R.id.listView);

        if(typeface == null) {
            typeface = Typeface.createFromAsset(getActivity().getAssets(),
                    "fonts/font_main.ttf");
        }
        setGlobalFont(rootView);


        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                list_menu
        );

        listView.setAdapter(listViewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), ManualTextActivity.class);
                intent.putExtra("index", i);
                startActivity(intent);
            }
        });

        return rootView;
    }
    private void setGlobalFont(View view) {
        if(view != null) {
            if(view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup)view;
                int vgCnt = viewGroup.getChildCount();
                for(int i = 0; i<vgCnt; i++) {
                    View v = viewGroup.getChildAt(i);
                    if(v instanceof TextView) {
                        ((TextView) v).setTypeface(typeface);
                    }
                    setGlobalFont(v);
                }
            }
        }
    }
}
