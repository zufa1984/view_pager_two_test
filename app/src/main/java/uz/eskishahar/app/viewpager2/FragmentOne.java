package uz.eskishahar.app.viewpager2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.interfaces.ItemClickListener;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class FragmentOne extends Fragment {



    public FragmentOne() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.activity_fragment, container, false);

        final ImageSlider imageSlider = (ImageSlider) view.findViewById(R.id.slider);
        final List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.mosque,"New day",ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.mosque_1,"Khonakoh",ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.mosque_2,"Wash room",ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.mosque_3,"General view",ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.mosque_4,"Khonakoh",ScaleTypes.CENTER_CROP));
        imageSlider.setImageList(slideModels,ScaleTypes.CENTER_CROP);


        return view;
    }
}
