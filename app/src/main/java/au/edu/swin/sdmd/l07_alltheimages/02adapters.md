# The RecyclerView adapter

As we saw with the basic list example, we need an adapter to connect the view and the data.

We saw the the basic list view does not enforce use of patterns such as ViewHolder that would improve performance of lists.

RecyclerView does enforce this, and its adapter has some required methods as a result.
```
onCreateViewHolder(parent, viewType): ViewHolder
getItemCount: Int
onBindViewHolder(holder, position)
```

To give you an idea of the process, here's a diagram based on BNR Chapter 9.

If you have PlantUML installed, place your cursor inside the following text and click on the PlantUML button on the right-hand side of the screen.

@startuml
participant RecyclerView
participant Adapter
RecyclerView -> Adapter : onCreateViewHolder()
note left: I need a ViewHolder
Adapter -> RecyclerView : ViewHolder
note right: Ok. Inflate view, create new holder, pass it back.
RecyclerView -> Adapter : onBindViewHolder(ViewHolder, 0)
note left: I need data at index 0 to be shown in this ViewHolder
note right: Ok. Gets data at position 0, set values of views.
@enduml
