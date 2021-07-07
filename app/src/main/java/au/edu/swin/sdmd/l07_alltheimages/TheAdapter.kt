package au.edu.swin.sdmd.l07_alltheimages

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TheAdapter(private val data: List<Location>,
                 private val listener: (Location) -> Unit) : RecyclerView.Adapter<TheAdapter.TheHolder>()  {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TheAdapter.TheHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater
            .inflate(R.layout.layout_row, parent, false) as View
        return TheHolder(view)
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: TheAdapter.TheHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
    }

    inner class TheHolder(private val v: View) : RecyclerView.ViewHolder(v) {
        private val name: TextView = v.findViewById(R.id.textView)

        fun bind(item: Location) {
            name.text = item.name
            v.setOnClickListener { listener(item) }
        }

    }

}
