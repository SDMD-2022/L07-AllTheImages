package au.edu.swin.sdmd.l07_alltheimages

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Location(val name: String, val author: String,
                    val latitude: Float, val longitude: Float,
                    val visited: Boolean = false,
                    val image: Int = android.R.drawable.picture_frame): Parcelable {
}