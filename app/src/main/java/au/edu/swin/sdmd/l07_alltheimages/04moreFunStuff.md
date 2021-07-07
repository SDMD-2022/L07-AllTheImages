# More fun stuff

At the moment we've set up a classic list. This is all very nice, however we'd probably like it to be more interactive.

Handling clicks can be done in a few different ways. One approach is to assign it in the onBindViewHolder function, as seen in https://antonioleiva.com/recyclerview-listener/.
However this is not the most elegant approach, and one needs to be wary of creating objects on every bind call.

The more flexible way is to attach the listener in the view holder. The ViewHolder will need to be declared as an inner class so it can access the listener passed from the activity.