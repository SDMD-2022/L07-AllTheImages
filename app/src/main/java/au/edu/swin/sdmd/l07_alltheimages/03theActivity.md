# Setting it up

You'll note that we need a layout manager this time around -- we didn't need that for a ListView.

This needs to be set in the activity. We're using a LinearLayoutManager that shows a list; for photos or a grid you'd want a GridLayoutManager.

```
linearLayoutManager = LinearLayoutManager(this)
listView.layoutManager = linearLayoutManager
```

You'll also need a custom row layout, similar to the previous project.