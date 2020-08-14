package layout

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hello.Activity
import com.example.hello.R
import kotlinx.android.synthetic.main.row_name_item.view.*


class CoursesRecyclerViewAdapter(val CoursesList: List<Activity>) :
    RecyclerView.Adapter<CoursesRecyclerViewAdapter.NamesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_name_item, parent, false)
        return NamesViewHolder(itemView)
    }
    override fun getItemCount(): Int {
        return CoursesList.size
    }
    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        holder.rowView.tvCourses.text = CoursesList[position]
    }
    class NamesViewHolder(val rowView: View) : RecyclerView.ViewHolder(rowView)
}