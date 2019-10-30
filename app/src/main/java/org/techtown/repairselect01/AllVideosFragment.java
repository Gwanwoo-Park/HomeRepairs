package org.techtown.repairselect01;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class AllVideosFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.home_repair_manual_fragment, container, false);

        String[] list_menu = { "알기쉬운 집수리(개요)", "집수리 준비과정(개요)", "집사용설명서(개요)", "전기와 에너지(전기)",
                "신재생에너지(전기)", "태양광발전설치와 전기(전기)", "구조일반사항(구조)", "균열원인(구조)", "균열사례 및 보수(구조)",
                "방수의 종류와 특징(방수)", "방수의 시공방법(방수)", "방수 사례와 해결(방수)", "단열은 꼭 해야 하는가?(단열)",
                "열의 이동경로 전도 대류 복사(단열)", "열전도율 열관류율 열저항(단열)", "단열재 종류별 특징(단열)", "목재의 종류와 특성(목공)",
                "자재구입과 안전수칙(목공)", "목재의 가공(목공)", "페인트 종류(페인트)", "페인트 공구(페인트)", "실린더 문손잡이 교체(DIY)",
                "레버 문손잡이 교체(DIY)", "싱크대 경첩(DIY)", "싱크대 배수관(DIY)", "세면대 배관(DIY)", "세면대 수전(DIY)", "세면대 교체(DIY)",
                "모니터 받침대(DIY)", "벽선반(DIY)", "화장실 변기(DIY)", "화장실 샤워 수전(DIY)", "화장실 타일(DIY)", "작은 타일 & 큰 타일(타일)",
                "줄눈(타일)", "바닥타일(타일)", "목재 실습:집성목으로 상자 만들기(목공)", "싱크대(페인트-밑작업)", "타일(페인트-밑작업)",
                "방문(페인트-밑작업)", "샷시(페인트-밑작업)", "현관문(페인트-밑작업)", "싱크대(페인트-프라이머)", "타일(페인트-프라이머)",
                "방문(페인트-프라이머)",  "샷시(페인트-프라이머)", "현관문(페인트-프라이머)", "싱크대(페인트-칠하기)", "타일(페인트-칠하기)",
                "방문(페인트-칠하기)", "샷시(페인트-칠하기)", "현관문(페인트-칠하기)", "천장(페인트-칠하기)", "벽지_한 색(1color)_하늘색(페인트-칠하기)",
                "벽지_두 색(2color)_분홍색+흰색(페인트-칠하기)", "수공구 소개 및 사용법(공구-절단공구)", "절단공구 소개 및 사용법-원형톱,직쏘우?(공구-절단공구)",
                "각도절단기 소개 및 실습(공구-절단공구)", "테이블쏘우 소개 및 실습(공구-절단공구)", "컷쏘우 소개 및 사용법(공구-절단공구)",
                "그라인더 소개 및 사용법?(공구-그라인더)", "그라인더 결합품 소개(공구-그라인더)", "그라인더 결합(공구-그라인더)", "그라인더 실습(공구-그라인더)",
                "에어공구 규격 별 종류와 소개(공구-에어공구)", "대형에어공구 소개(공구-에어공구)", "석고보드를 이용한 에어공구 사용?(공구-에어공구)",
                "전동공구 및 결합 비트 소개?(공구-체결공구)", "전동 공구 실습(공구-체결공구)", "전동드릴 석고보드 앵커결합(공구-체결공구)",
                "햄머드릴 콘크리드 앵커 설치(공구-체결공구)" };


        ListView listView = (ListView) rootView.findViewById(R.id.listView);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                list_menu
        );

        listView.setAdapter(listViewAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), MovieActivity.class);
                intent.putExtra("name", "동영상");
                intent.putExtra("index", i);
                startActivity(intent);
            }
        });

        return rootView;
    }

}
