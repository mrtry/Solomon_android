package jp.mrtry.solomon.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import jp.mrtry.solomon.R
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_viewer.*


class ViewerFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view = inflater!!.inflate(R.layout.fragment_viewer, container, false)

        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        markdown_view.setMarkDownText("# Hello World\nThis is a simple markdown")

        super.onViewCreated(view, savedInstanceState)
    }
}
