package com.example.testwn.ui.coins_list.view_holder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testwn.R
import com.example.testwn.model.Coin
import com.example.testwn.ui.coins_list.OnCoinsListListener
import com.example.testwn.utils.loadImageWithGlide
import kotlinx.android.synthetic.main.coins_view_item.view.*
import kotlinx.android.synthetic.main.coins_view_item.view.coinIcon
import kotlinx.android.synthetic.main.coins_view_item.view.coinName

class CoinsListViewHolder(
    itemView: View,
    private val listener: OnCoinsListListener
) : RecyclerView.ViewHolder(itemView) {

    fun bindItem(coin: Coin?) {

        itemView.coinName.text = coin?.name
        itemView.coinDescription.text = coin?.description
        itemView.coinIcon.loadImageWithGlide(coin?.iconUrl)

        itemView.setOnClickListener {
            listener.onClicked(coin)
        }
    }

    companion object {
        fun create(
            parent: ViewGroup,
            listener: OnCoinsListListener
        ): CoinsListViewHolder {
            val view =
                LayoutInflater.from(parent.context).inflate(R.layout.coins_view_item, parent, false)
            return CoinsListViewHolder(
                view, listener
            )
        }
    }
}