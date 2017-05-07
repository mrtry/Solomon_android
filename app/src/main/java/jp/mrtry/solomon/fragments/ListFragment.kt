package jp.mrtry.solomon.fragments

import android.support.v4.app.Fragment
import android.os.Bundle
import android.support.v4.view.ViewCompat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import jp.mrtry.solomon.R
import kotlinx.android.synthetic.main.fragment_list.*

/**
 * A placeholder fragment containing a simple view.
 */
class ListFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater!!.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val list = ArrayList<String>()
        list.add("test1")
        list.add("test2")
        list.add("test3")
        list.add("test4")
        list.add("test5")
        list.add("test6")
        list.add("test7")
        list.add("test8")
        list.add("test9")
        list.add("test10")
        list.add("test11")
        list.add("test12")
        list.add("test13")
        list.add("test14")
        list.add("test15")
        list.add("test16")
        list.add("test17")
        list.add("test18")
        list.add("test19")
        list.add("test20")

        val adapter = ArrayAdapter<String>(getActivity().getApplicationContext(), android.R.layout.simple_expandable_list_item_1, list)
        fileList.setAdapter(adapter)
        ViewCompat.setNestedScrollingEnabled(fileList, true);
    }
}
