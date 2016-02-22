package app.android.com.example.android.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        ArrayList<String> listForecast = new ArrayList<String>(Arrays.asList("Today - Sunny - 86/33","Tomorrow - Cloudy 50/80","Wednesday - Cloudy 50/80","Thursday - Cloudy 50/80","Friday - Cloudy 50/80","Saturday - Cloudy 50/80" ));
        ArrayAdapter<String> forecastAdapter = new ArrayAdapter(
                //This fragment parent activiy
                getActivity(),
                //item view layout
                R.layout.list_item_forecast,
                //Element to fill with string forecast
                R.id.list_item_forecast_textview,
                //List of string forecast
                listForecast);


        ListView listViewForecast = (ListView) rootView.findViewById(R.id.listView_forecast);
        listViewForecast.setAdapter(forecastAdapter);

        return rootView;
    }


}
