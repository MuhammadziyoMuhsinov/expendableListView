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

class ExpandAdapter5(private val context: Context) : BaseExpandableListAdapter() {

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

                txt2!!.text = "1.42"
                txt4!!.text = "4.30"
                txt6!!.text = "6.80"
            }
            1 -> {
                line.visibility  = View.VISIBLE
                txt1!!.text = "1x"
                txt3!!.text = "12"
                txt5!!.text = "x2"


                txt2!!.text = "1.10"
                txt4!!.text = "1.20"
                txt6!!.text = "2.73"


            }
            2 -> {
                line.visibility  = View.GONE
                when (childPosition) {
                    0 -> {
                        txt1.text = "Mais de (2)"
                        txt3.text = "Menos de (2)"


                        txt2.text = "1.40"

                        txt4.text = "2.80"
                    }
                    1 -> {
                        txt1.text = "Mais de (2.5)"
                        txt3.text = "Menos de (2.5)"


                        txt2.text = "1.82"

                        txt4.text = "1.92"
                    }
                    2 -> {
                        txt1.text = "Mais de (3)"
                        txt3.text = "Menos de (3)"


                        txt2.text = "2.42"

                        txt4.text = "1.52"
                    }
                    3->{
                        txt1.text = "Mais de (3.5)"
                        txt3.text = "Menos de (3.5)"


                        txt2.text = "3.0"

                        txt4.text = "1.35"
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