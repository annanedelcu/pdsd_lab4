package ro.pub.cs.systems.pdsd.lab04.contactsmanager;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
 
public class FragmentAdditionalDetails extends Fragment {
 
  @Override
  public View onCreateView(LayoutInflater layoutInflater, ViewGroup container, Bundle state) {
    return layoutInflater.inflate(R.layout.fragment_additional_details, container, false);
  }
 
}