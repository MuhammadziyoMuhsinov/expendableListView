package com.zora.bora.sora.futebol.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.zora.bora.sora.futebol.R

class ExpandAdapter3(private val context: Context) : BaseExpandableListAdapter() {

    override fun getGroupCount(): Int {
        return 3
    }

    override fun getChildrenCount(groupPosition: Int): Int {
        if (groupPosition == 2) {
            return 4
        } else {
            return 1
        }

    }

    override fun getGroup(groupPosition: Int): Any {
        return 0
    }

    override fun getChild(groupPosition: Int, childPosition: Int): Any {
        return 0
    }

    override fun getGroupId(groupPosition: Int): Long {
        return groupPosition.toLong()
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return childPosition.toLong()
    }

    override fun hasStableIds(): Boolean {
        return false
    }

    override fun getGroupView(
        groupPosition: Int,
        isExpanded: Boolean,
        convertView: View?,
        parent: ViewGroup?,
    ): View {
        var view = convertView
        if (view == null) {
            val inflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = inflater.inflate(R.layout.item_parent, parent, false)
        }


        val txt = view!!.findViewById<TextView>(R.id.txt)
        when (groupPosition) {
            0 -> {
                txt.text = "RESULTADO DO JOGO"
            }
            1 -> {
                txt.text = "CHANCE DUPLA (TEMPO REGULAMENTAR"
            }
            2 -> {
                txt.text = "TOTAL DE GOLS"
            }

        }


        val expandIcon = view.findViewById<ImageView>(R.id.expandIcon)
        if (isExpanded) {
            expandIcon.setImageResource(R.drawable.ic_expand_less)
        } else {
            expandIcon.setImageResource(R.drawable.ic_expand_more)
        }

        return view
    }

    override fun getChildView(
        groupPosition: Int,
        childPosition: Int,
        isLastChild: Boolean,
        convertView: View?,
        parent: ViewGroup?,
    ): View {
        var view = convertView

        if (view == null) {
            val inflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = inflater.inflate(R.layout.item_child, parent, false)
        }


        val txt1 = view!!.findViewById<TextView>(R.id.txt1)
        val txt2 = view.findViewById<TextView>(R.id.txt2)
        val txt3 = view.findViewById<TextView>(R.id.txt3)
        val txt4 = view.findViewById<TextView>(R.id.txt4)
        val txt5 = view.findViewById<TextView>(R.id.txt5)
        val txt6 = view.findViewById<TextView>(R.id.txt6)
        val line = view.findViewById<LinearLayout>(R.id.line)

        when (groupPosition) {
            0 -> {
                line.visibility  = View.VISIBLE
                txt1!!.text = "Casa"
                txt3!!.text = "Empato"
                txt5!!.text = "Fora"

                txt2!!.text = "1.61"
                txt4!!.text = "3.63"
                txt6!!.text = "5.30"
            }
            1 -> {
                line.visibility  = View.VISIBLE
                txt1!!.text = "1x"
                txt3!!.text = "12"
                txt5!!.text = "x2"


                txt2!!.text = "1.15"
                txt4!!.text = "1.26"
                txt6!!.text = "2.22"


            }
            2 -> {
                line.visibility  = View.GONE
                when (childPosition) {
                    0 -> {
                        txt1.text = "Mais de (2)"
                        txt3.text = "Menos de (2)"


                        txt2.text = "1.37"

                        txt4.text = "2.95"
                    }
                    1 -> {
                        txt1.text = "Mais de (2.5)"
                        txt3.text = "Menos de (2.5)"


                        txt2.text = "1.77"

                        txt4.text = "1.97"
                    }
                    2 -> {
                        txt1.text = "Mais de (3)"
                        txt3.text = "Menos de (3)"


                        txt2.text = "2.30"

                        txt4.text = "1.57"
                    }
                    3->{
                        txt1.text = "Mais de (3.5)"
                        txt3.text = "Menos de (3.5)"


                        txt2.text = "2.90"

                        txt4.text = "1.38"
                    }


                }

            }

        }









        return view
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return true
    }
}