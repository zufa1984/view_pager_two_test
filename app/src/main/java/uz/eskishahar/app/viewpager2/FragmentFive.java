package uz.eskishahar.app.viewpager2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class FragmentFive extends Fragment {

    private boolean zoomOut;

    public FragmentFive() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.activity_fragment, container, false);

        final ImageSlider imageSlider = (ImageSlider) view.findViewById(R.id.slider);
        final List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.mosque_4_0,"General View",ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.mosque_4_1,"Khonakoh",ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.mosque_4_2,"Welcom",ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.mosque_4_3,"Mesmerizing dome",ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.mosque_4_4,"Good night",ScaleTypes.CENTER_CROP));
        imageSlider.setImageList(slideModels,ScaleTypes.CENTER_CROP);


        return view;
    }
}
