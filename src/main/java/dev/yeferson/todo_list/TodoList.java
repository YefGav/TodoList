package dev.yeferson.todo_list;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<TodoItem> items;

    //Constructor
    public TodoList() {
        items = new ArrayList<>();
    }
    
    // Methods
    // Add item to the list
    public void addItem(TodoItem item) {
        items.add(item);
    }

    // Remove item from the list
    public void removeItem(int index) {

        if ( index >0 && index < items.size() ) {
            items.remove(index);
            
        }
    }

    // Method to Change position up of item in the list

    public void moveItemUp(int index) {
        if (index >0 && index < items.size()){
            TodoItem item = items.remove(index);
            items.add(index - 1, item);
        }
    }

    // Method to Change position down of item in the list

    public void moveItemDown( int index) {
        if (index >0 && index < items.size()){
            TodoItem item = items.remove(index);
            items.add(index + 1, item);
        }
    }

    // Method to get the list of items

    public List<TodoItem> getItems() {
        return items;
    }
}
