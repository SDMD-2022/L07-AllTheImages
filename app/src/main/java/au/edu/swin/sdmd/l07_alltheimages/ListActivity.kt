package au.edu.swin.sdmd.l07_alltheimages

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView

class ListActivity : AppCompatActivity() {
    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        listView = findViewById(R.id.listView)
        val data = initData()

        val adapter = ListAdapter(this, data)
        listView.adapter = adapter
    }

    private fun initData(): List<Location> {
        val data = mutableListOf<Location>()
        data.add(Location("Glenferrie Station", "Ada May Plante",
            -37.821539f, 145.036473f, image = R.drawable.station))
        data.add(Location("Swinburne College", "unknown",
            -37.822036f, 145.038875f, image = R.drawable.college))
        data.add(Location("Theatre", "unknown",
            -37.819927f, 145.035722f, image = R.drawable.theatre))
        data.add(Location("Catholic Church", "unknown",
            -37.822435f, 145.035231f))
        data.add(Location("Corner shops", "unknown",
            -37.822520f, 145.035483f))
        data.add(Location("Town Hall", "unknown",
            -37.822821f, 145.035992f))
        data.add(Location("Anglican Church", "unknown",
            -37.823361f, 145.039576f))
        data.add(Location("Hawthorn Hotel", "unknown",
            -37.823027f, 145.039909f))
        data.add(Location("House", "unknown",
            -37.823576f, 145.042800f))
        data.add(Location("Glenferrie Hotel ", "unknown",
            -37.822604f, 145.034480f))
        data.add(Location("Auburn Rd", "unknown",
            -37.823692f, 145.044769f))
        data.add(Location("Hawthorn Station", "unknown",
            -37.821946f, 145.023194f))
        data.add(Location("Office building", "unknown",
            -37.822170f, 145.029600f))
        return data
    }
}

class ListAdapter(private val context: Context,
                  private val data: List<Location>) : BaseAdapter() {
    private val inflater: LayoutInflater
            = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        // Firstly, the default code for generating rows
        val rowView = inflater.inflate(R.layout.layout_row, parent, false)
        val name: TextView = rowView.findViewById(R.id.textView)

        val item = getItem(position) as Location
        name.text = item.name

        return rowView

        // Secondly, using ViewHolder so as to not be constantly creating new rows

        /* val view: View
        val holder: ViewHolder

        if (convertView == null) {
            view = inflater.inflate(R.layout.layout_row, parent, false)

            holder = ViewHolder()
            holder.name = view.findViewById(R.id.textView) as TextView

            view.tag = holder
        } else {
            view = convertView
            holder = convertView.tag as ViewHolder
            // for education purposes only
            val example = view.findViewById<TextView>(R.id.textView)
            Log.i("CONVERT", example.text.toString())
        }

        val item = getItem(position) as Location
        holder.name.text = item.name
        return view */
    }

    override fun getItem(position: Int): Any {
        return data[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return data.size
    }

    private class ViewHolder {
        lateinit var name: TextView
    }
}
